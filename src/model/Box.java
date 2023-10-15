/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;

/**
 *
 * @author Estudiantes
 */
public class Box {
    
    // Attributes
    private int row;
    private int col;
    private String image;

    /**
     * Constructor.
     * @param row
     * @param col
     * @param image 
     */
    public Box(int row, int col, String image) {
        this.row = row;
        this.col = col;
        this.image = image; 
        
    }

    // Getters & Setters.
    
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    
}
