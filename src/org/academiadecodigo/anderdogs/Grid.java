package org.academiadecodigo.anderdogs;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Iterator;

public class Grid {

    private Cell [][] cells;
    private int cols;
    private int rows;
    private Cell cell;
    private FileWriter writer;
    private FileReader reader;
    private BufferedReader bReader;
    private BufferedWriter bWriter;
    private String saved;
    private File file;


    public Grid (int cols,int rows){
        this.cols=cols;
        this.rows=rows;
        cells = new Cell[cols][rows];
        for(int i=0; i<cols; i++){
            int c = i*30+10;
            for (int j=0; j<rows;j++){
                int r = j*30+10;
                cells[i][j] = new Cell(c,r,30,30);

            }
        }

    }

    public Cell getCell(int col,int row){
        return cells[col][row];
    }

    public void clear(){
        for(int i=0; i<cols; i++){
            for(int j=0; j<rows; j++){
                if(cells[i][j].rectangle.isFilled()){
                    cells[i][j].rectangle.draw();
                }
            }
        }
        
    }

    public void save(){
        for(int i=0; i<cols; i++) {
            for (int j = 0; j < rows; j++) {
               saved += cells[i][j].isPainted();
               try {
                   file = new File("/Users/panda/Documents/BootCamp/myrepo/myrepo/poopPants/saved/saved.txt");
                   if (!file.exists()) {
                       file.createNewFile();
                   }
                   writer = new FileWriter(file.getAbsoluteFile());
                   bWriter= new BufferedWriter(writer);
                   bWriter.write(saved);
                   bWriter.close();
                   System.out.println("done");
               } catch(IOException e){
                   e.printStackTrace();
               }
            }
        }
    }

    public void load() {
        try {
            if (file.exists()) {
                reader = new FileReader(file);
                bReader = new BufferedReader(reader);
                cells = new Cell[cols][rows];

                String line ="";
                for (int i=0; i<cols; i++){
                    for(int j=0; j<rows; j++) {
                        line = bReader.readLine();
                        //cells[i][j];
                    }
                }
                String result ="";

                while ((line = bReader.readLine()) != null){
                    result += line + "\n";
                }

                bReader.close();


            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
