package org.academiadecodigo.anderdogs;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Painter extends Cell{

    private double x;//pixels
    private double y;//pixels
    private double width;
    private double height;
    private Painter painter;
    private int col;
    private int row;
    private Grid grid;


    public Painter (double x, double y, double width, double height){

        super(x,y,width,height);
        rectangle.fill();


    }

    public void setPainter(Painter painter){
        this.painter = painter;
    }

    public void moveRight() {
        if(col!=19) {
            rectangle.translate(30, 0);
            col++;
        }
    }

    public void moveLeft() {
        if (col!= 0) {
            rectangle.translate(-30, 0);
            col--;
        }
    }
    public void moveUp() {
        if(row!= 0) {
            rectangle.translate(0, -30);
            row--;
        }
    }
    public void moveDown() {
        if(row!=19) {
            rectangle.translate(0, 30);
            row++;
        }
    }

    public void fill(){
        grid.getCell(col, row).paint();

    }


    public void setGrid(Grid grid){
        this.grid=grid;
    }


}
