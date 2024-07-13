/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mavredakis.chess;

/**
 *
 * @author Mavredakis
 */
public class Location {
   
    private String loc;
    private int row, column;    
   
    

    public Location(String loc) {
        if (loc.length() == 2){
            String strRow = loc.replaceAll("[^\\d]", "");
            row = Integer.parseInt(strRow);
            char charColumn = loc.charAt(0);
            switch (charColumn){
                case 'a' -> column = 0; //7; //Mavredakis on 10.7.24
                case 'b' -> column = 1; //6;
                case 'c' -> column = 2; //5;
                case 'd' -> column = 3; //4;
                case 'e' -> column = 4; //3;
                case 'f' -> column = 5; //2;
                case 'g' -> column = 6; //1;
                case 'h' -> column = 7; //0;
                default -> System.out.println("Unknown");
            }    
       
        }
        else{
            System.out.println("loc " + loc);        
            System.out.println("TODO exception Check that String is in form letter number");
        }        
    }      
    
    public int getRow(){
     return row;
    }
    
    public int getCol(){
     return column;
    }  
    
}
