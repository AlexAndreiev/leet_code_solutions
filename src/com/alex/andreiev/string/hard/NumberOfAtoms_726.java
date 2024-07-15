package com.alex.andreiev.string.hard;

/*
Given a string formula representing a chemical formula, return the count of each atom.
The atomic element always starts with an uppercase character, then zero or more lowercase letters, representing the name.
One or more digits representing that element's count may follow if the count is greater than 1.
If the count is 1, no digits will follow.
    For example, "H2O" and "H2O2" are possible, but "H1O2" is impossible.

Two formulas are concatenated together to produce another formula.
    For example, "H2O2He3Mg4" is also a formula.

A formula placed in parentheses, and a count (optionally added) is also a formula.
    For example, "(H2O2)" and "(H2O2)3" are formulas.

Return the count of all elements as a string in the following form: the first name (in sorted order),
followed by its count (if that count is more than 1), followed by the second name (in sorted order),
followed by its count (if that count is more than 1), and so on.
The test cases are generated so that all the values in the output fit in a 32-bit integer.

Example 1:
Input: formula = "H2O"
Output: "H2O"
Explanation: The count of elements are {'H': 2, 'O': 1}.

Example 2:
Input: formula = "Mg(OH)2"
Output: "H2MgO2"
Explanation: The count of elements are {'H': 2, 'Mg': 1, 'O': 2}.

Example 3:
Input: formula = "K4(ON(SO3)2)2"
Output: "K4N2O14S4"
Explanation: The count of elements are {'K': 4, 'N': 2, 'O': 14, 'S': 4}.

Constraints:
    1 <= formula.length <= 1000
    formula consists of English letters, digits, '(', and ')'.
    formula is always valid.

Hint 1
To parse formula[i:], when we see a `'('`, we will parse recursively whatever is inside the brackets
(up to the correct closing ending bracket) and add it to our count,
multiplying by the following multiplicity if there is one.
Otherwise, we should see an uppercase character: we will parse the rest of the letters to get the name,
and add that (plus the multiplicity if there is one.)
 */

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class NumberOfAtoms_726 {

    // Reverse Scanning with Regex
    public String countOfAtoms(String formula) {
        // Every element of matcher will be a quintuple
        var matcher = Pattern.compile(
                "([A-Z][a-z]*)(\\d*)|(\\()|(\\))(\\d*)"
        ).matcher(formula);
        var list = new ArrayList<String[]>();
        while (matcher.find()) {
            list.add(
                    new String[] {
                            matcher.group(1),
                            matcher.group(2),
                            matcher.group(3),
                            matcher.group(4),
                            matcher.group(5),
                    }
            );
        }
        Collections.reverse(list);

        // Map to store the count of atoms
        var finalMap = new HashMap<String, Integer>();

        // Stack to keep track of the nested multiplicities
        var stack = new Stack<Integer>();
        stack.push(1);

        // Current Multiplicity
        var runningMul = 1;

        // Parse the formula
        for (var quintuple : list) {
            String atom = quintuple[0];
            String count = quintuple[1];
            String left = quintuple[2];
            String right = quintuple[3];
            String multiplier = quintuple[4];

            // If atom, add it to the final map
            if (atom != null) {
                var cnt = count.length() > 0 ? Integer.parseInt(count) : 1;
                finalMap.put(
                        atom,
                        finalMap.getOrDefault(atom, 0) + cnt * runningMul
                );
            }
            // If the right parenthesis, multiply the runningMul
            else if (right != null) {
                int currMultiplier = multiplier.length() > 0
                        ? Integer.parseInt(multiplier)
                        : 1;
                runningMul *= currMultiplier;
                stack.push(currMultiplier);
            }
            // If left parenthesis, divide the runningMul
            else if (left != null) {
                runningMul /= stack.pop();
            }
        }

        // Sort the final map
        var sortedMap = new TreeMap<>(finalMap);

        // Generate the answer string
        var ans = new StringBuilder();
        for (var atom : sortedMap.keySet()) {
            ans.append(atom);
            if (sortedMap.get(atom) > 1) {
                ans.append(sortedMap.get(atom));
            }
        }

        return ans.toString();
    }

    // preprocessing
//    public String countOfAtoms(String formula) {
//        // For every index, store the valid multiplier
//        var muls = new int[formula.length()];
//        int runningMul = 1;
//
//        // Stack to take care of nested formula
//        var stack = new Stack<Integer>();
//        stack.push(1);
//
//        // Preprocess the formula and extract all multipliers
//        var index = formula.length() - 1;
//        StringBuilder currNumber = new StringBuilder();
//        while (index >= 0) {
//            if (Character.isDigit(formula.charAt(index))) {
//                currNumber.insert(0, formula.charAt(index));
//            }
//            // If we encountered a letter, then the scanned
//            // number was count and not a multiplier. Discard it.
//            else if (Character.isAlphabetic(formula.charAt(index))) {
//                currNumber = new StringBuilder();
//            }
//            // If we encounter a right parenthesis, then the
//            // scanned number was multiplier. Store it.
//            else if (formula.charAt(index) == ')') {
//                var currMultiplier = !currNumber.isEmpty()
//                        ? Integer.parseInt(currNumber.toString())
//                        : 1;
//                runningMul *= currMultiplier;
//                stack.push(currMultiplier);
//                currNumber = new StringBuilder();
//            }
//            // If we encounter a left parenthesis, then the
//            // most recent multiplier will cease to exist.
//            else if (formula.charAt(index) == '(') {
//                runningMul /= stack.pop();
//                currNumber = new StringBuilder();
//            }
//
//            // For every index, store the valid multiplier
//            muls[index] = runningMul;
//            index--;
//        }
//
//        // Map to store the count of atoms
//        var finalMap = new HashMap<String, Integer>();
//
//        // Traverse left to right in the formula
//        index = 0;
//        while (index < formula.length()) {
//            // If UPPER CASE LETTER, extract the entire atom
//            if (Character.isUpperCase(formula.charAt(index))) {
//                StringBuilder currAtom = new StringBuilder();
//                currAtom.append(formula.charAt(index));
//                StringBuilder currCount = new StringBuilder();
//                index++;
//                while (
//                        index < formula.length() &&
//                                Character.isLowerCase(formula.charAt(index))
//                ) {
//                    currAtom.append(formula.charAt(index));
//                    index++;
//                }
//
//                // Extract the count
//                while (
//                        index < formula.length() &&
//                                Character.isDigit(formula.charAt(index))
//                ) {
//                    currCount.append(formula.charAt(index));
//                    index++;
//                }
//
//                // Update the final map
//                var count = currCount.length() > 0
//                        ? Integer.parseInt(currCount.toString())
//                        : 1;
//                finalMap.put(
//                        currAtom.toString(),
//                        finalMap.getOrDefault(currAtom.toString(), 0) +
//                                count * muls[index - 1]
//                );
//            } else {
//                index++;
//            }
//        }
//
//        // Sort the final map
//        var sortedMap = new TreeMap<>(finalMap);
//
//        // Generate the answer string
//        var ans = new StringBuilder();
//        for (var atom : sortedMap.keySet()) {
//            ans.append(atom);
//            if (sortedMap.get(atom) > 1) {
//                ans.append(sortedMap.get(atom));
//            }
//        }
//
//        return ans.toString();
//    }

    // reverse scanning
//    public String countOfAtoms(String formula) {
//        // For multipliers
//        var runningMul = 1;
//        var stack = new Stack<Integer>();
//        stack.push(1);
//
//        // Map to store the count of atoms
//        var finalMap = new HashMap<String, Integer>();
//
//        // Strings to take care of current atom and count
//        var currAtom = new StringBuilder();
//        var currCount = new StringBuilder();
//
//        // Index to traverse the formula in reverse
//        int index = formula.length() - 1;
//
//        // Parse the formula
//        while (index >= 0) {
//            // If digit, update the count
//            if (Character.isDigit(formula.charAt(index))) {
//                currCount.insert(0, formula.charAt(index));
//            }
//            // If a lowercase letter, prepend to the currAtom
//            else if (Character.isLowerCase(formula.charAt(index))) {
//                currAtom.insert(0, formula.charAt(index));
//            }
//            // If UPPERCASE LETTER, update the finalMap
//            else if (Character.isUpperCase(formula.charAt(index))) {
//                currAtom.insert(0, formula.charAt(index));
//                int count = currCount.length() > 0
//                        ? Integer.parseInt(currCount.toString())
//                        : 1;
//                finalMap.put(
//                        currAtom.toString(),
//                        finalMap.getOrDefault(currAtom.toString(), 0) +
//                                count * runningMul
//                );
//
//                currAtom = new StringBuilder();
//                currCount = new StringBuilder();
//            }
//            // If the right parenthesis, the currCount if any
//            // will be considered as multiplier
//            else if (formula.charAt(index) == ')') {
//                var currMultiplier = currCount.length() > 0
//                        ? Integer.parseInt(currCount.toString())
//                        : 1;
//                stack.push(currMultiplier);
//                runningMul *= currMultiplier;
//                currCount = new StringBuilder();
//            }
//            // If left parenthesis, update the runningMul
//            else if (formula.charAt(index) == '(') {
//                runningMul /= stack.pop();
//            }
//
//            index--;
//        }
//
//        // Sort the final map
//        var sortedMap = new TreeMap<>(finalMap);
//
//        // Generate the answer string
//        var ans = new StringBuilder();
//        for (var atom : sortedMap.keySet()) {
//            ans.append(atom);
//            if (sortedMap.get(atom) > 1) {
//                ans.append(sortedMap.get(atom));
//            }
//        }
//
//        return ans.toString();
//    }

    // regular expression
//    public String countOfAtoms(String formula) {
//        // Regular expression to extract atom, count, (, ), multiplier
//        // Every element of parsed will be a quintuple
//        String regex = "([A-Z][a-z]*)(\\d*)|(\\()|(\\))(\\d*)";
//        var pattern = Pattern.compile(regex);
//        var matcher = pattern.matcher(formula);
//
//        // Stack to keep track of the atoms and their counts
//        var stack = new Stack<Map<String, Integer>>();
//        stack.push(new HashMap<>());
//
//        // Parse the formula
//        while (matcher.find()) {
//            String atom = matcher.group(1);
//            String count = matcher.group(2);
//            String left = matcher.group(3);
//            String right = matcher.group(4);
//            String multiplier = matcher.group(5);
//
//            // If atom, add it to the top hashmap
//            if (atom != null) {
//                stack
//                        .peek()
//                        .put(
//                                atom,
//                                stack.peek().getOrDefault(atom, 0) +
//                                        (count.isEmpty() ? 1 : Integer.parseInt(count))
//                        );
//            }
//            // If left parenthesis, insert a new hashmap to the stack
//            else if (left != null) {
//                stack.push(new HashMap<>());
//            }
//            // If right parenthesis, pop the top element from the stack
//            // Multiply the count with the attached multiplicity.
//            // Add the count to the current formula
//            else if (right != null) {
//                var currMap = stack.pop();
//                if (!multiplier.isEmpty()) {
//                    int mult = Integer.parseInt(multiplier);
//                    for (var atomName : currMap.keySet()) {
//                        currMap.put(atomName, currMap.get(atomName) * mult);
//                    }
//                }
//
//                for (var atomName : currMap.keySet()) {
//                    stack
//                            .peek()
//                            .put(
//                                    atomName,
//                                    stack.peek().getOrDefault(atomName, 0) +
//                                            currMap.get(atomName)
//                            );
//                }
//            }
//        }
//
//        // Sort the final map
//        var finalMap = new TreeMap<String, Integer>(stack.peek());
//
//        // Generate the answer string
//        StringBuilder ans = new StringBuilder();
//        for (var atom : finalMap.keySet()) {
//            ans.append(atom);
//            if (finalMap.get(atom) > 1) {
//                ans.append(finalMap.get(atom));
//            }
//        }
//
//        return ans.toString();
//    }


    // leet code solution

//    public String countOfAtoms(String formula) {
//        // Stack to keep track of the atoms and their counts
//        Stack<Map<String, Integer>> stack = new Stack<>();
//        stack.push(new HashMap<>());
//
//        // Index to keep track of the current character
//        var index = 0;
//
//        // Parse the formula
//        while (index < formula.length()) {
//            // If left parenthesis, insert a new hashmap to the stack. It will
//            // keep track of the atoms and their counts in the nested formula
//            if (formula.charAt(index) == '(') {
//                stack.push(new HashMap<>());
//                index++;
//            }
//            // If right parenthesis, pop the top element from the stack
//            // Multiply the count with the multiplicity of the nested formula
//            else if (formula.charAt(index) == ')') {
//                Map<String, Integer> currMap = stack.pop();
//                index++;
//                StringBuilder multiplier = new StringBuilder();
//                while (
//                        index < formula.length() &&
//                                Character.isDigit(formula.charAt(index))
//                ) {
//                    multiplier.append(formula.charAt(index));
//                    index++;
//                }
//                if (multiplier.length() > 0) {
//                    var mult = Integer.parseInt(multiplier.toString());
//                    for (var atom : currMap.keySet()) {
//                        currMap.put(atom, currMap.get(atom) * mult);
//                    }
//                }
//
//                for (var atom : currMap.keySet()) {
//                    stack
//                            .peek()
//                            .put(
//                                    atom,
//                                    stack.peek().getOrDefault(atom, 0) +
//                                            currMap.get(atom)
//                            );
//                }
//            }
//            // Otherwise, it must be a UPPERCASE LETTER. Extract the complete
//            // atom with frequency, and update the most recent hashmap
//            else {
//                var currAtom = new StringBuilder();
//                currAtom.append(formula.charAt(index));
//                index++;
//                while (
//                        index < formula.length() &&
//                                Character.isLowerCase(formula.charAt(index))
//                ) {
//                    currAtom.append(formula.charAt(index));
//                    index++;
//                }
//
//                var currCount = new StringBuilder();
//                while (
//                        index < formula.length() &&
//                                Character.isDigit(formula.charAt(index))
//                ) {
//                    currCount.append(formula.charAt(index));
//                    index++;
//                }
//
//                var count = currCount.length() > 0
//                        ? Integer.parseInt(currCount.toString())
//                        : 1;
//                stack
//                        .peek()
//                        .put(
//                                currAtom.toString(),
//                                stack.peek().getOrDefault(currAtom.toString(), 0) +
//                                        count
//                        );
//            }
//        }
//
//        // Sort the final map
//        var finalMap = new TreeMap<String, Integer>(stack.peek());
//
//        // Generate the answer string
//        var ans = new StringBuilder();
//        for (var atom : finalMap.keySet()) {
//            ans.append(atom);
//            if (finalMap.get(atom) > 1) {
//                ans.append(finalMap.get(atom));
//            }
//        }
//
//        return ans.toString();
//    }


    // my solution

    //    public String countOfAtoms(String formula) {
//        var map = new TreeMap<String, Integer>();
//        var stack = new Stack<String>();
//        var multiplierStack = new Stack<Integer>();
//        var sb = new StringBuilder();
//
//        // create a stack
//        for (var i = 0; i < formula.length(); i++) {
//            var ch = formula.charAt(i);
//            if (Character.isLetter(ch)) {
//                if (Character.isUpperCase(ch) && !sb.isEmpty()) {
//                    stack.push(sb.toString());
//                    sb.setLength(0);
//                }
//                sb.append(ch);
//            }
//            else if (Character.isDigit(ch)) {
//                if (!sb.isEmpty() && !Character.isDigit(sb.charAt(0))) {
//                    stack.push(sb.toString());
//                    sb.setLength(0);
//                }
//                sb.append(ch);
//            } else {
//                if (!sb.isEmpty()) {
//                    stack.push(sb.toString());
//                    sb.setLength(0);
//                }
//                stack.push(String.valueOf(ch));
//            }
//        }
//        if (!sb.isEmpty()) {
//            stack.push(sb.toString());
//        }
//
//        var curMultiplier = 1;
//        while (!stack.isEmpty()) {
//            var val = stack.pop();
//            if (Character.isDigit(val.charAt(0))) {
//                var next = stack.pop();
//                var count = Integer.parseInt(val);
//                if (next.equals(")")) {
//                    multiplierStack.push(curMultiplier);
//                    curMultiplier *= count;
//                } else {
//                    map.put(next, map.getOrDefault(next, 0) + curMultiplier * count);
//                }
//            } else if (val.equals("(")) {
//                curMultiplier = multiplierStack.isEmpty() ? 1 : multiplierStack.pop();
//            } else if (!val.equals(")")) {
//                map.put(val, map.getOrDefault(val, 0) + curMultiplier);
//            }
//        }
//
//        return map.entrySet().stream()
//                .map(e -> e.getKey() + (e.getValue() > 1 ? e.getValue().toString() : ""))
//                .collect(Collectors.joining());
//    }
}
