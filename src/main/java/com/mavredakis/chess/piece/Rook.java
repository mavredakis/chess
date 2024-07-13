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
public class Rook extends Piece {
    private Location pieceLocation;
    
    private Board pieceBoard;
    
    public Rook(Color pieceColor, Location pieceLocation, Board pieceBoard) {
        super(pieceColor, pieceLocation, pieceBoard);
    }
     
    public String toString(){
        if (pieceColor == Color.BLACK)
            return "r"; //System.out.println("k");
        else
            return "R";
    }
   
    @Override
    public boolean isValidMove(Location newLoc, Location oldLoc, Piece piece) {
        if (piece.getPieceLocation().getCol() == newLoc.getCol() && piece.getPieceLocation().getRow() != newLoc.getRow()){
            return true;   
        }
        else
            return false;
       
    }
}
