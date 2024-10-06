/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author dondull
 */
public class FSA {

    public static boolean checkStr(String s) {
                    boolean state = false;

        if (s.length() < 1 || s.charAt(0) != 'a') {
            return false;
            
            
            
        } else {
          //  boolean state = false;

            for (int i = 2; i < s.length(); i++) {
              
                if (s.charAt(s.length() - 1) != 'z') {
                    return false;
                    
                    
                } 
                else {
//                    if (s.charAt(1) >= 'a' && s.charAt(1) <= 'y') state = true ;
//                            else return false;
                    if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) == 'z') state = true;
                    if (s.charAt(i)!= 'z' && s.charAt(i) <= 'a' && s.charAt(i) >= 'z') state = false;        
                    }
                
                }

            }
        
       return state;
           
        }
    
    public static void main(String[] args) {
        String s= "zbbbzzzuzffyyz";
        System.out.println(checkStr(s));
    }
    }
    


    
    


        
    

