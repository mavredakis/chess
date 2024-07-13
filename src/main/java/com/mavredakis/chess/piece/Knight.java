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
public class Knight extends Piece {
    private Location pieceLocation;
    
    private Board pieceBoard;
    
    
    public Knight(Color pieceColor, Location pieceLocation, Board pieceBoard) {
        super(pieceColor, pieceLocation, pieceBoard);
    }   
 
    public String toString(){
        //System.out.println(pieceColor);
        if (pieceColor == Color.BLACK)
            return "n"; //System.out.println("k");
        else
            return "N";
    }

    @Override
    public boolean isValidMove(Location newLoc, Location oldLoc, Piece piece) {
        if ((Math.abs(piece.getPieceLocation().getCol() - newLoc.getCol()) == 1) && (Math.abs(piece.getPieceLocation().getRow() - newLoc.getRow()) == 2)  ){
            return true;
        }        
        else if ((Math.abs(piece.getPieceLocation().getCol() - newLoc.getCol()) == 2) && (Math.abs(piece.getPieceLocation().getRow() - newLoc.getRow()) == 1)  ){
          return true;   
        }
        
        else
            return false;
        
    }
}
