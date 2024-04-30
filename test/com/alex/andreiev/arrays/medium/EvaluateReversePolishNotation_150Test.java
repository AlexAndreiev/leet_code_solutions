package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvaluateReversePolishNotation_150Test {

    @Test
    void evalRPN() {
        var target = new EvaluateReversePolishNotation_150();
        assertEquals(9, target.evalRPN(new String[]{"2","1","+","3","*"}));
        assertEquals(6, target.evalRPN(new String[]{"4","13","5","/","+"}));
        assertEquals(22, target.evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
}