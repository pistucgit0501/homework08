package homework08;

import java.io.*;
import java.lang.String;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class FileOperation {
    boolean bool=false;
    public void FileMaker(String path,String fileName){
        File file=new File(path+"/"+fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(path+"/"+fileName);
    }
    public void FileMaker(String path,int fileNumber,String fileName,String kiter){
        for (int i = 0; i < fileNumber; i++) {


            try {
                File file = new File(path + "/" + fileName+i+kiter);
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(path+"/"+fileName);
    }
   public void fileMakerWithcontent(String path,String fileName,String kiter,String content){
        boolean bool =false;
        String allFile=fileName+"."+kiter;
        File file= new File(path+"/"+fileName+"."+kiter);
       try {
           bool=file.createNewFile();
       } catch (IOException e) {
           e.printStackTrace();
       }
       FileOutputStream out = null;
       try {
           out = new FileOutputStream(path+"/"+allFile);
           out.write(content.getBytes());


       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }
       catch (IOException e){
           e.getMessage();
       }
        finally {
           try {
               out.close();
           } catch (IOException e) {
               e.printStackTrace();
           }
       }


   }
    public void fileMakerWithcontent1(String path,String fileName,String kiter,String content, int fileNumber){
        boolean bool =false;
        for (int i = 0; i <fileNumber ; i++) {


            String allFile = fileName + i + "." + kiter;
            File file = new File(path + "/" + fileName + "." + kiter);
            try {
                bool = file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

            FileOutputStream out = null;
            try {
                out = new FileOutputStream(path + "/" + allFile);
                out.write(content.getBytes());


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.getMessage();
            } finally {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



    }
    public void printMatrxIntoFile(){
        int [][] array = new int[3][3];

        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = ((int)Math.random());
                System.out.println(array[i][j]);
            }
        }
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("/home/pistuc/Desktop/hetfo.txt"));
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {


                try {
                    bw.write(array[i][j] + ",");
                } catch (IOException e) {

                    e.printStackTrace();
                }
            }
            try {
                bw.write("\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
            try {
                bw.newLine();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            finally {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }




        }






