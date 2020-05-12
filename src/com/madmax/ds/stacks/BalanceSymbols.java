package com.madmax.ds.stacks;

import java.util.Stack;

public class BalanceSymbols {

    public static boolean isBalanced(String balanceMe) {
        boolean flag = false;
        Stack<Character> bstk = new Stack<>();
        for (int i = 0; i < balanceMe.length(); i++) {
            if (balanceMe.charAt(i) == '}') {
                if (!bstk.isEmpty() && bstk.peek() == '{') {
                    bstk.pop();
                } else {
                    return flag;
                }

            } else if (balanceMe.charAt(i) == ')') {
                if (!bstk.isEmpty() && bstk.peek() == '(') {
                    bstk.pop();

                } else {
                    return flag;
                }
            } else {
                bstk.push(balanceMe.charAt(i));
            }
        }

        if (bstk.isEmpty()) {
            flag = true;
        }

        return flag;
    }

    public static void main(String[] args) {
        String s = "({jfdsjfsd})]";
       System.out.println(isBalanced(s));

    }

}