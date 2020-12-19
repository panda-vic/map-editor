package org.academiadecodigo.anderdogs;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {

    private double x;
    private double y;
    private double width;
    private double height;
    protected Rectangle rectangle;
    private boolean painted;




    public Cell(double x, double y, double width, double height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        rectangle = new Rectangle(x,y,width,height);
        rectangle.draw();


    }

    public void paint(){
        if(!rectangle.isFilled()) {
            rectangle.setColor(Color.BLUE);
            rectangle.fill();
            painted=true;

        } else if (rectangle.isFilled()) {
            rectangle.draw();
            painted=false;

        }

    }

    public int isPainted(){
        if (painted){
            return 1;
        }
        return 0;
    }

}
