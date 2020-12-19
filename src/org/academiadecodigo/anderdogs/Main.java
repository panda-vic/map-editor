package org.academiadecodigo.anderdogs;

public class Main {

    public static void main(String[] args) {



        Grid g1 = new Grid(20,20);
        Painter p1 = new Painter(10,10,30,30);
        Controls controls = new Controls();
        controls.setPainter(p1);
        controls.setGrid(g1);
        controls.init();
        p1.setGrid(g1);






    }
}
