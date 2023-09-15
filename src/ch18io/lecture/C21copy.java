package ch18io.lecture;

import java.io.*;

public class C21copy {
    // BufferedInputStream
    // BufferedOutputStream
    // 그림 파일 복사하는 코드
    public static void main(String[] args) {
        String src = "C:/Temp/test.jpg";
        String des = "C:/Temp/test4.jpg";
        try (
                InputStream is = new FileInputStream(src);
                OutputStream os = new FileOutputStream(des);
                BufferedInputStream bis = new BufferedInputStream(is);
                BufferedOutputStream bos = new BufferedOutputStream(os)) {
            byte[] buf = new byte[1024];

            int len = 0;
            while ((len = bis.read(buf)) != -1) {
                bos.write(buf, 0, len);
            }

            bos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
