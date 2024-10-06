/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.HashMap;

/**
 *
 * @author dondull
 */
public class stringCon {
 


public static  String convert(String input) {
        StringBuilder output = new StringBuilder();
        
        HashMap<Character, Character> transitionMap = new HashMap<>();
        // Initialize the transition map for lowercase to uppercase
        for (char c = 'a'; c <= 'z'; c++) {
            transitionMap.put(c, (char) (c - 32)); // Convert to uppercase
        }
        
        
        for (char c : input.toCharArray()) {
            if (transitionMap.containsKey(c)) {
                output.append(transitionMap.get(c));
            } else {
                output.append(c); // Keep character unchanged if it's not a lowercase letter
            }
        }
        return output.toString();
    }

    public static void main(String[] args) {
        String inputString = "hello1world";
        String outputString = convert(inputString);

        System.out.println("Input: " + inputString + " -> Output: " + outputString); 
    }




}






