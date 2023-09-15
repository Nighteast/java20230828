package ch18io.lecture;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C08read {
    public static void main(String[] args) {
        String file = "C:/Temp/out3.txt";
        try (InputStream is = new FileInputStream(file)) {
            byte[] arr = new byte[3];

            //16byte
            int read = is.read(arr);//3
            int read1 = is.read(arr);//3
            int read2 = is.read(arr);//3
            int read3 = is.read(arr);//3
            int read4 = is.read(arr);//3
            int read5 = is.read(arr);//1
            int read6 = is.read(arr);//-1

            System.out.println("read = " + read);
            System.out.println("read1 = " + read1);
            System.out.println("read2 = " + read2);
            System.out.println("read3 = " + read3);
            System.out.println("read4 = " + read4);
            System.out.println("read5 = " + read5);
            System.out.println("read6 = " + read6);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
