package com.learn.io;

import java.io.*;

public class ReadTester {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line = br.readLine();
            while ( line != null){
                System.out.println(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        filereader();
//        inputstream();
    }

    private static void filereader() {
        try {
            FileReader fr = new FileReader("data.txt");
            int n = fr.read();
            while (n != -1){
                System.out.print((char)n);
                n = fr.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void inputstream() {
        File file = new File("data.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        try{
            InputStream is = new FileInputStream("data.txt");
            int n = is.read();
            while (n != -1){
                System.out.print((char)n);
                n = is.read();
            }
            System.out.println();
        }catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("message");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File open success.");
    }
}
