package edu.university.leetcode.string.hard;

import java.util.ArrayList;
import java.util.List;

/**
 * CSV parser
 * Parse an escaped string into csvformat
 * Input: csvformat
 * IP Range to CIDR
 * John,Smith,john.smith@gmail.com,Los Angeles,1
 * Jane,Roberts,janer@msn.com,"San Francisco, CA",0
 * "Alexandra ""Alex""",Menendez,alex.menendez@gmail.com,Miami,1 """Alexandra Alex"""
 * Output: escaped string
 * John|Smith|john.smith@gmail.com|Los Angeles|1 Jane|Roberts|janer@msn.com|San Francisco, CA|0
 * Alexandra "Alex"|Menendez|alex.menendez@gmail.com|Miami|1 "Alexandra Alex"
 */
public class CsvParser {
    public String parse(String str) {
        List<String> result = new ArrayList<>();
        boolean inQuote = false;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (inQuote) {
                if (str.charAt(i) == '\"') {
                    if (i < str.length() - 1 && str.charAt(i + 1) == '\"') {
                        sb.append("\"");
                        i++;
                    } else {
                        inQuote = false;
                    }
                } else {
                    sb.append(str.charAt(i));
                }
            } else {
                if (str.charAt(i) == '\"') {
                    inQuote = true;
                } else if (str.charAt(i) == ',') {
                    result.add(sb.toString());
                    sb.setLength(0);
                } else {
                    sb.append(str.charAt(i));
                }
            }
        }
        if (sb.length() > 0) {
            result.add(sb.toString());
        }
        return String.join("|", result);
    }
    public static void main(String[] args) {
        CsvParser test = new CsvParser();
        System.out.println(test.parse("John,Smith,john.smith@gmail.com,Los Angeles,1 * Jane,Roberts,janer@msn.com,\"San Francisco, CA\",0 * \"Alexandra \"\"Alex\"\"\",Menendez,alex.menendez@gmail.com,Miami,1 \"\"\"Alexandra Alex\"\"\""));
    }
}
