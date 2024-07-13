/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mavredakis.chess.piece;

import com.mavredakis.chess.Board;
import com.mavredakis.chess.Color;
import com.mavredakis.chess.Location;

/**
 *
 * @author Mavredakis
 */
public class Bishop extends Piece{
    private Location pieceLocation;    
    private Board pieceBoard;
    
    public Bishop(Color pieceColor, Location pieceLocation, Board pieceBoard) {
        super(pieceColor, pieceLocation, pieceBoard);
    }
     
    public String toString(){
        if (pieceColor == Color.BLACK)
            return "b"; 
        else
            return "B";
    }      
    
    @Override
    public boolean isValidMove(Location newLoc, Location oldLoc, Piece piece) {
        if (((piece.getPieceLocation().getRow() - newLoc.getRow()) % 2 == 0) && ((piece.getPieceLocation().getCol() - newLoc.getCol()) % 2 == 0)  ){
            return true;
        }        
        else if (piece.getPieceLocation().getCol() - newLoc.getCol() == 1 && piece.getPieceLocation().getRow() - newLoc.getRow() == 1){
          return true;   
        }
        else
            return false;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
