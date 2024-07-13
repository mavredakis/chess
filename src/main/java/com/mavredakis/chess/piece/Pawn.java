/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mavredakis.chess.piece;

import com.mavredakis.chess.Board;
import com.mavredakis.chess.Color;
import com.mavredakis.chess.Location;
import com.mavredakis.chess.exceptions.InvalidMoveException;

/**
 *
 * @author Mavredakis
 */
public class Pawn extends Piece{
    private Location pieceLocation;
   
    private Board pieceBoard;
    
    public Pawn(Color pieceColor, Location pieceLocation, Board pieceBoard) {
        super(pieceColor, pieceLocation, pieceBoard);
    }
    
    
 
    public String toString(){
        //return color == Color.WHITE ? "P" : "p";
        if (pieceColor == Color.BLACK)
            return "p"; //System.out.println("k");
        else
            return "P";
    }    
  
    @Override
    public boolean isValidMove(Location newLoc, Location oldLoc, Piece piece) {
        
        if (piece.getPieceColor() == Color.BLACK){
            
            if ((oldLoc.getRow() /*piece.getPieceLocation().getRow()*/ +1 == newLoc.getRow() ) ||  ((oldLoc.getRow() + 2 /*piece.getPieceLocation().getRow()*/ == newLoc.getRow())&&(oldLoc.getRow() == 1))){
                
                return true;
            }
            else if ((oldLoc.getCol() /*piece.getPieceLocation().getCol()*/ + 1 == newLoc.getCol() || oldLoc.getCol() /*piece.getPieceLocation().getCol()*/ - 1 == newLoc.getCol() )&&(newLoc.getRow() != 0 || newLoc.getRow() != 1)){
                
                return true;   
            }
            else{
                
                return false;
            }
        }
        else{
            
            if ((oldLoc.getRow() - 1 == newLoc.getRow()) ||  ((oldLoc.getRow() - 2 == newLoc.getRow())&&(oldLoc.getRow() == 6))){
                
                return true;
            }

            else if (oldLoc.getCol() + 1 == newLoc.getCol() || oldLoc.getCol() - 1 == newLoc.getCol()&&(newLoc.getRow() != 6 || newLoc.getRow() != 7)){
                
                return true;   
            }
            else{
                
                return false;
            }
        }         
    }    
}
