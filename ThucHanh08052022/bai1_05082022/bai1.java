package bai1_05082022;

import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class MyFileWriter {
    protected String fileName;

    public MyFileWriter() {
        this.fileName = "dayso.txt";
    }

    public MyFileWriter(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void createFile() {
        double[] numberList = new double[10];
        for (int i = 0; i < numberList.length; i++) {
            numberList[i] = Math.random();
        }

        try {
            FileWriter outFile = new FileWriter("dayso.txt");
            for(double x : numberList) {
                outFile.write(Double.toString(x * 100) + "\n");
            }
            outFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyFileReader extends MyFileWriter{
    String fileName;
    public MyFileReader(String fileName) {
        this.fileName = fileName;
    }

    public MyFileReader() {
        this.fileName = "sapxep.txt";
    }

    public void readFile() {
        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader(getFileName())));
            Double[] numberList = new Double[10];
            
            for (int i = 0; i < numberList.length; i++) {
                String line = sc.nextLine().trim();
                numberList[i] = (Double.parseDouble(line));
            }

            Arrays.sort(numberList);

            FileWriter writer = new FileWriter("sapxep1.txt");
            for (Double x : numberList) {
                writer.write(Double.toString(x) + "\n");
            }

            Arrays.sort(numberList, Collections.reverseOrder());

            FileWriter writer2 = new FileWriter("sapxep2.txt");
            for (Double x : numberList) {
                writer2.write(Double.toString(x) + "\n");
            }
            
            writer.close();
            writer2.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class bai1 {
    public static void main(String[] args) {
        MyFileWriter myFileWriter = new MyFileWriter();
        myFileWriter.createFile();
        MyFileReader myFileReader = new MyFileReader();
        myFileReader.readFile();
    }    
}