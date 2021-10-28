package com.xyk.longwaytest.solution;

import com.xyk.longwaycommon.util.StringUtils;

import java.util.*;

/**
 * @author xyk
 * @ClassName Solution
 * @CreateDate 2021/9/9
 * @Description
 */
public class Solution {

    public static void main(String[] args) {
        String s = "  hello world!  ";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.trim();
        int i = s.length() - 1, j = i;
        while (i > 0) {
            while (i > 0 && s.charAt(i) != ' ') i--;
            sb.append(s.substring(i + 1, j + 1) + " ");
            while (i > 0 && s.charAt(i) == ' ') i--;
            j = i;
        }
        return sb.toString().trim();
    }
}
