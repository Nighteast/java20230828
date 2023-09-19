package ch19network.lecture;


import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
import java.io.PrintWriter;
        import java.net.Socket;

public class C09client {
    public static void main(String[] args) {
        try {
            // 서버에 연결 (서버 IP 주소와 포트 번호를 맞게 설정)
            Socket socket = new Socket("172.30.1.81", 7000);

            // 서버와 통신을 위한 입력 및 출력 스트림 생성
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            // 사용자 입력을 받기 위한 BufferedReader 생성
            BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("서버에 연결되었습니다. 메시지를 입력하세요 (끝내려면 'bye' 입력)");

            String userInput;
            while (true) {
                // 사용자 입력을 받아서 서버로 전송
                userInput = userInputReader.readLine();
                writer.println(userInput);

                // 서버로부터 응답을 받아서 출력
                String serverResponse = reader.readLine();
                System.out.println("서버: " + serverResponse);

                // 사용자가 "bye"를 입력하면 클라이언트 종료
                if ("bye".equalsIgnoreCase(userInput)) {
                    System.out.println("서버와의 연결을 종료합니다.");
                    break;
                }
            }

            // 자원을 해제하고 연결 종료
            socket.close();
            reader.close();
            writer.close();
            userInputReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
