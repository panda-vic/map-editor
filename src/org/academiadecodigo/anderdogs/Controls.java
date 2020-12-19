package org.academiadecodigo.anderdogs;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Controls implements KeyboardHandler {
    private Keyboard keyboard;
    private Painter painter;
    private Grid grid;



    public void init(){

        keyboard = new Keyboard(this);

        KeyboardEvent rightPressed = new KeyboardEvent();
        rightPressed.setKey(KeyboardEvent.KEY_RIGHT);
        rightPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent leftPressed = new KeyboardEvent();
        leftPressed.setKey(KeyboardEvent.KEY_LEFT);
        leftPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent upPressed = new KeyboardEvent();
        upPressed.setKey(KeyboardEvent.KEY_UP);
        upPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent downPressed = new KeyboardEvent();
        downPressed.setKey(KeyboardEvent.KEY_DOWN);
        downPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent fillPressed = new KeyboardEvent();
        fillPressed.setKey(KeyboardEvent.KEY_SPACE);
        fillPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent clearPressed = new KeyboardEvent();
        clearPressed.setKey(KeyboardEvent.KEY_C);
        clearPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent savedPressed = new KeyboardEvent();
        savedPressed.setKey(KeyboardEvent.KEY_S);
        savedPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent loadPressed = new KeyboardEvent();
        loadPressed.setKey(KeyboardEvent.KEY_L);
        loadPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent exitPressed = new KeyboardEvent();
       exitPressed.setKey(KeyboardEvent.KEY_E);
        exitPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(rightPressed);
        keyboard.addEventListener(leftPressed);
        keyboard.addEventListener(upPressed);
        keyboard.addEventListener(downPressed);
        keyboard.addEventListener(fillPressed);
        keyboard.addEventListener(clearPressed);
        keyboard.addEventListener(savedPressed);
        keyboard.addEventListener(loadPressed);
        keyboard.addEventListener(exitPressed);


    }

    public void setPainter(Painter painter){
        this.painter=painter;
    }
    public void setGrid(Grid grid){
        this.grid=grid;
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if(keyboardEvent.getKey() == KeyboardEvent.KEY_RIGHT){
            painter.moveRight();
        }
        else if(keyboardEvent.getKey() == KeyboardEvent.KEY_LEFT){
            painter.moveLeft();
        }
        else if(keyboardEvent.getKey() == KeyboardEvent.KEY_UP) {
            painter.moveUp();
        }
        else if(keyboardEvent.getKey() == KeyboardEvent.KEY_DOWN) {
            painter.moveDown();
        }
        else if(keyboardEvent.getKey() == KeyboardEvent.KEY_SPACE) {
            painter.fill();
        }
        else if(keyboardEvent.getKey() == KeyboardEvent.KEY_C) {
            grid.clear();
        }
        else if(keyboardEvent.getKey() == KeyboardEvent.KEY_S) {
            grid.save();
        }
        else if(keyboardEvent.getKey() == KeyboardEvent.KEY_L) {
            grid.load();
        }
        else if(keyboardEvent.getKey() == KeyboardEvent.KEY_E) {
            System.exit(0);
        }

    }


    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }


}
