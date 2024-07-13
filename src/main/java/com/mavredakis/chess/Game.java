/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mavredakis.chess;

import com.mavredakis.chess.exceptions.InvalidLocationException;
import com.mavredakis.chess.exceptions.InvalidMoveException;
import com.mavredakis.chess.piece.Piece;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Mavredakis
 */
public class Game { 
    
    private Board board = new Board();
    private Color startingColor = Color.BLACK;
    
    public void play(){
        
        //----------------------------------------------------------
        System.out.println("Hello Chess players!");
        System.out.println("Type :h for help");
        System.out.println();
        board.init();
        
        Piece[][] boardStatus = board.getBoardStatus();
        System.out.println("abcdefgh");
        System.out.println("========");
        for (int i = 0; i < boardStatus.length; ++i) {
          
          for (int j = 0; j < boardStatus[i].length; ++j) {
              
              if (boardStatus[i][j] == null)
                System.out.print("-");
              else
                System.out.print(boardStatus[i][j]);
              if (j == 7)
                System.out.println();
          }
        }
                
        Scanner sc = new Scanner(System.in);
        String s = null;
        String regex = "\\w\\d\\w\\d";
        String fileName;
        
        startingColor = startingColor.firstPlayer();
        System.out.println("Player with " + startingColor + " starts");
        do
        {                
            s = sc.next();
            switch (s){
                case ":h" -> printHelp();
                case ":s" -> {System.out.println("Type file name "); fileName = sc.next(); saveGame(boardStatus, fileName);}
                //case ":o" -> {System.out.println("Type file name to open"); fileName = sc.next(); boardStatus = openGame(fileName);}
                case ":x" -> s = "Exit";           
                
            }
            if (s.matches(regex)) {
                String[] sParts = s.split("(?<=\\G.{2})"); 
                String from_ = sParts[0]; 
                String to_ = sParts[1]; 
                try{
                    Location newLoc = new Location(sParts[1]);
                    Location oldLoc = new Location(sParts[0]);
                    Piece pieceToMove = board.getPieceAt(oldLoc);
                    
                    Piece destinationPiece = board.getPieceAt(newLoc);
                    
                    try{
                        if (pieceToMove.isValidMove(newLoc, oldLoc, pieceToMove)){
                            
                            if(destinationPiece == null) {

                                boardStatus[Integer.parseInt(to_.substring( 1))][returnCol(to_.substring(0, 1))] = board.getPieceAt(oldLoc);//(newLoc);
                                boardStatus[Integer.parseInt(from_.substring( 1))][returnCol(from_.substring(0, 1))] = null;

                            }
                            else if( (destinationPiece.getPieceColor() != pieceToMove.getPieceColor()) ){                        

                                boardStatus[Integer.parseInt(to_.substring( 1))][returnCol(to_.substring(0, 1))] = board.getPieceAt(newLoc);
                                boardStatus[Integer.parseInt(from_.substring( 1))][returnCol(from_.substring(0, 1))] = null;

                            }
                            startingColor = startingColor.nextColor();
                        }
                    }catch (InvalidMoveException ie) {
                        System.out.println("Caught the exception: " + ie.getMessage());
                    }                   
                }
                catch(InvalidLocationException ie){
                    System.out.println("Invalid location(s)");
                }
                
                System.out.println(); 
                
                for (int row = 0; row < boardStatus.length; row++) {
                    for (int col = 0; col < boardStatus[row].length; col++) {    
                        
                        if (boardStatus[row][col] == null)
                            System.out.print("-");
                        else
                            System.out.print(boardStatus[row][col]);
                        if (col == 7)
                            System.out.println();
                    }
                }
                
                System.out.println();
                System.out.println("Now plays " + startingColor);
                System.out.println();                
            }
            else{
                
            }                        
        }
        while (!s.equals("Exit")); 
        //----------------------------------------------------------
    }
    
    private void handleMove(String moveString){
    
    }
    
    private void saveGame(Piece[][] gameStatus, String fileName){
        
        try{
            PrintWriter out = new PrintWriter(fileName + ".txt");
            
            for (int row = 0; row < gameStatus.length; row++) {
                    for (int col = 0; col < gameStatus[row].length; col++) {    
                        if (gameStatus[row][col] == null)
                            out.print("-");                            
                        else
                            out.print(gameStatus[row][col]);                            
                        if (col == 7)
                            out.println();                        
                    }
            }           
            out.close();
        }catch (IOException e){
            System.out.println("Error during reading/writing");
        }
        
    }    
    
    
    
    
    
    private void printHelp(){
        System.out.println("Give new position of your piece in format like e2e4. :s to save, :x to exit");
    }
    
    
    private int returnCol(String column){
        
        switch (column){
                case "a" -> {return 0;} 
                case "b" -> {return 1;} 
                case "c" -> {return 2;} 
                case "d" -> {return 3;} 
                case "e" -> {return 4;} 
                case "f" -> {return 5;} 
                case "g" -> {return 6;} 
                case "h" -> {return 7;} 
                default -> System.out.println("Error");
        }
        System.out.println(column);
        return -1;
    }
    
    private char convertToLetter (int col){
        switch (col){
            case 0 -> {return 'a';}
            case 1 -> {return 'b';}
            case 2 -> {return 'c';}
            case 3 -> {return 'd';}
            case 4 -> {return 'e';}
            case 5 -> {return 'f';}
            case 6 -> {return 'g';}
            case 7 -> {return 'h';}
        }
        return '-';
    }
}
