/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mavredakis.chess;

import com.mavredakis.chess.piece.King;
import com.mavredakis.chess.piece.Rook;
import com.mavredakis.chess.piece.Piece;
import com.mavredakis.chess.piece.Bishop;
import com.mavredakis.chess.piece.Queen;
import com.mavredakis.chess.piece.Pawn;
import com.mavredakis.chess.piece.Knight;

/**
 *
 * @author Mavredakis
 */
public class Board {
       
    private Piece[][] boardStatus = new Piece[8][8];
        
    public void init(){
       
        Rook r1 = new Rook(Color.BLACK, new Location("a8"), this);
        boardStatus[0][0] = r1;
        Knight n1 = new Knight(Color.BLACK, new Location("b8"), this);
        boardStatus[0][1] = n1;
        Bishop b1 = new Bishop(Color.BLACK, new Location("c8"), this);
        boardStatus[0][2] = b1;
        Queen q = new Queen(Color.BLACK, new Location("d8"), this);
        boardStatus[0][3] = q;
        King k = new King(Color.BLACK, new Location("e8"), this);
        boardStatus[0][4] = k;
        Bishop b2 = new Bishop(Color.BLACK, new Location("f8"), this);
        boardStatus[0][5] = b2;
        Knight n2 = new Knight(Color.BLACK, new Location("g8"), this);
        boardStatus[0][6] = n2;
        Rook r2 = new Rook(Color.BLACK, new Location("h8"), this);
        boardStatus[0][7] = r2;
        Pawn p1 = new Pawn(Color.BLACK, new Location("a7"), this);
        boardStatus[1][0] = p1;
        Pawn p2 = new Pawn(Color.BLACK, new Location("b7"), this);
        boardStatus[1][1] = p2;
        Pawn p3 = new Pawn(Color.BLACK, new Location("c7"), this);
        boardStatus[1][2] = p3;
        Pawn p4 = new Pawn(Color.BLACK, new Location("d7"), this);
        boardStatus[1][3] = p4;
        Pawn p5 = new Pawn(Color.BLACK, new Location("e7"), this);
        boardStatus[1][4] = p5;
        Pawn p6 = new Pawn(Color.BLACK, new Location("f7"), this);
        boardStatus[1][5] = p6;
        Pawn p7 = new Pawn(Color.BLACK, new Location("g7"), this);
        boardStatus[1][6] = p7;
        Pawn p8 = new Pawn(Color.BLACK, new Location("h7"), this);
        boardStatus[1][7] = p8;
        
        Rook R1 = new Rook(Color.WHITE, new Location("a1"), this);
        boardStatus[7][0] = R1;
        Knight N1 = new Knight(Color.WHITE, new Location("b1"), this);
        boardStatus[7][1] = N1;
        Bishop B1 = new Bishop(Color.WHITE, new Location("c1"), this);
        boardStatus[7][2] = B1;
        Queen Q = new Queen(Color.WHITE, new Location("d1"), this);
        boardStatus[7][3] = Q;
        King K = new King(Color.WHITE, new Location("e1"), this);
        boardStatus[7][4] = K;
        Bishop B2 = new Bishop(Color.WHITE, new Location("f1"), this);
        boardStatus[7][5] = B2;
        Knight N2 = new Knight(Color.WHITE, new Location("g1"), this);
        boardStatus[7][6] = N2;
        Rook R2 = new Rook(Color.WHITE, new Location("h1"), this);
        boardStatus[7][7] = R2;
        Pawn P1 = new Pawn(Color.WHITE, new Location("a2"), this);
        boardStatus[6][0] = P1;
        Pawn P2 = new Pawn(Color.WHITE, new Location("b2"), this);
        boardStatus[6][1] = P2;
        Pawn P3 = new Pawn(Color.WHITE, new Location("c2"), this);
        boardStatus[6][2] = P3;
        Pawn P4 = new Pawn(Color.WHITE, new Location("d2"), this);
        boardStatus[6][3] = P4;
        Pawn P5 = new Pawn(Color.WHITE, new Location("e2"), this);
        boardStatus[6][4] = P5;
        Pawn P6 = new Pawn(Color.WHITE, new Location("f2"), this);
        boardStatus[6][5] = P6;
        Pawn P7 = new Pawn(Color.WHITE, new Location("g2"), this);
        boardStatus[6][6] = P7;
        Pawn P8 = new Pawn(Color.WHITE, new Location("h2"), this);
        boardStatus[6][7] = P8;        
        
    }

    public Piece[][] getBoardStatus() {
        return boardStatus;
    }
    
    Piece getPieceAt(Location loc){        
        
        return boardStatus[loc.getRow()][loc.getCol()];        
    }       
}
