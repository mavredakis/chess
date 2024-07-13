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
public class King extends Piece{
    
    private Location pieceLocation;    
    private Board pieceBoard;
    
    public King(Color pieceColor, Location pieceLocation, Board pieceBoard) {
        super(pieceColor, pieceLocation, pieceBoard);
    }
     
    public String toString(){
        if (pieceColor == Color.BLACK)
            return "k"; //System.out.println("k");
        else
            return "K";
    }  
   
    @Override
    public boolean isValidMove(Location newLoc, Location oldLoc, Piece piece) {
        if ((piece.getPieceLocation().getRow() == newLoc.getRow() + 1) ||  (piece.getPieceLocation().getRow() == newLoc.getRow() - 1)){
            return true;
        }
        
        else if (piece.getPieceLocation().getCol() == newLoc.getCol() +1 || piece.getPieceLocation().getCol() == newLoc.getCol() - 1){
          return true;   
        }
        else
            return false;
        
    }
}
