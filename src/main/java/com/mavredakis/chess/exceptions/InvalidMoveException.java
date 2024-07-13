/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mavredakis.chess.exceptions;

/**
 *
 * @author benutzer
 */
public class InvalidMoveException extends RuntimeException{
    public InvalidMoveException(String message) {
	        super(message);
    }
}
