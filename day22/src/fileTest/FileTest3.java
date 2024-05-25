package fileTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileTest3 {
	public static void main(String[] args) throws IOException {
		
//			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("test3.txt")));
//
//			bw.write("테스트3 입니다.\n");
//			bw.write("파일 입출력 테스트입니다.");
////			bw.flush(); // 버퍼를 비운다. -> 버퍼에 있는 데이터를 전송한다.
//			bw.close(); // 버퍼를 비우고 닫는다.
//			System.out.println("test3.txt 파일을 생성했습니다.");
		
		
			BufferedReader br = new BufferedReader(new FileReader(new File("test3.txt")));
			System.out.println(br.readLine());	// 한줄씩 읽어오고 버퍼에서는 지워주는 메소드
			System.out.println(br.readLine());
			System.out.println(br.readLine());	// 있는 거 다 읽어오고 비우면 null이 뜬다.
			
			
	}
}
