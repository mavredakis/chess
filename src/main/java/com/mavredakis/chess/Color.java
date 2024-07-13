/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mavredakis.chess;

import java.util.Random;

/**
 *
 * @author Mavredakis
 */

public enum Color {
    BLACK, WHITE;    
    
    public Color nextColor() {
        return this == WHITE ? BLACK : WHITE;
    }
    
    //Mavredakis on 4.7.24
    public Color firstPlayer(){
        Random rand = new Random();
        
        int n = rand.nextInt(2);
        if (n + 1 == 1){
            System.out.println(n + 1);
            return Color.BLACK;
        }
        else{
            System.out.println(n + 1);
            return Color.WHITE;
        }
    }
}
