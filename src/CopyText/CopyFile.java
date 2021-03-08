package CopyText;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
//        BufferedReader reader;
//        BufferedWriter writer;
//        Scanner scanner = null;
//        try{
//            scanner = new Scanner(new BufferedReader(new FileReader(".\\src\\reader.txt")));
//            writer = new BufferedWriter(new FileWriter("writer.txt"));
//            while(scanner.hasNextLine()){
//                writer.write(scanner.nextLine());
//            }
//            writer.close();
//        }catch (IOException e){
//            e.printStackTrace();
//        }finally {
//            if(scanner != null){
//                scanner.close();
//            }
//
//        }
        BufferedInputStream reader = null;
        BufferedOutputStream write = null;
        try{
            reader = new BufferedInputStream(new FileInputStream(".\\src\\reader.txt"));
            write = new BufferedOutputStream(new FileOutputStream("writer.txt"));
            int i;
            int count= 0;
            while((i = reader.read()) != -1){
                write.write((char) i);
                count++;
            }
            System.out.println(count);
            reader.close();
            write.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
