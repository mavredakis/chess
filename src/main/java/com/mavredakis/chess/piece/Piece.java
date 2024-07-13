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
public abstract class Piece {
    protected Color pieceColor;
    private Location pieceLocation;
    private Board pieceBoard;

    public Piece(Color pieceColor, Location pieceLocation, Board pieceBoard) {
        this.pieceColor = pieceColor;
        this.pieceLocation = pieceLocation;
        this.pieceBoard = pieceBoard;
    }

    public Color getPieceColor() {
        return pieceColor;
    }  
           
    public Location getPieceLocation() {
        return pieceLocation;
    }
    
    
    public void setPieceLocation(Location pieceLocation) {
        this.pieceLocation = pieceLocation;
    }

    public Board getPieceBoard() {
        return pieceBoard;
    }
    
    public abstract boolean isValidMove(Location newLoc, Location oldLoc, Piece piece);

}
