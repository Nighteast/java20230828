package ch18io.book.exercise.p07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example {
    public static void main(String[] args) throws Exception {
        String filePath = "src/ch18io/book/exercise/p07/Example.java";

        //BufferedReader.readLine
        //PrintStream.printf

        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);
            try (fr; br;) {
                int rowNumber = 0;
                String rowData = "";
                while (true) {
                    rowData = br.readLine();
                    rowNumber++;
                    if (rowData == null) break;
                    System.out.printf("%1$2d: %2$s%n", rowNumber, rowData);
                }
                br.close();
                fr.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
