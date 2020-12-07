package com.learn.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class WriteTester {
    public static void main(String[] args) throws IOException {
        File testDir = new File("C:\\Users\\raku\\Desktop\\learn\\test");
        testDir.mkdir();
        FileWriter fw = new FileWriter("C:\\Users\\raku\\Desktop\\learn\\test\\output.txt");
        fw.write("ABC");
        fw.write("123");
        fw.flush();
        fw.close();
    }
}
