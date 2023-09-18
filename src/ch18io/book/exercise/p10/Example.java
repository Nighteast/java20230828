package ch18io.book.exercise.p10;

public class Example {
    public static void main(String[] args) {
//        try {
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//            System.out.println("원본 파일 경로를 입력해 주세요.");
//            String orgPath = br.readLine();
//
//            System.out.println("복사 파일 경로를 입력해 주세요.");
//            String copyPath = br.readLine();
//
//            File file = new File(orgPath);
//            InputStream is = new FileInputStream(orgPath);
//            BufferedInputStream bis = new BufferedInputStream(is);
//            OutputStream os = new FileOutputStream(copyPath);
//            BufferedOutputStream bos = new BufferedOutputStream(os);
//
//            System.out.printf("%1$s: %2$s%n", "원본 파일 경로", orgPath);
//            System.out.printf("%1$s: %2$s%n", "복사 파일 경로", copyPath);
//
//            byte[] buf = new byte[1024];
//            int len = 0;
//
//            if (file.isFile()) {
//                while ((len = bis.read(buf)) != -1) {
//                    bos.write(buf, 0, len);
//                }
//                System.out.printf("%s%n", "복사가 성공되었습니다.");
//            } else if (file.isDirectory()) {
//                file.mkdirs();
//            }
//            br.close();
//            is.close();
//            bis.close();
//            os.flush();
//            bos.flush();
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.printf("%s%n", "원본파일이 존재하지 않습니다.");
//        }
    }
}
