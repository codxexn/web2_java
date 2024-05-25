package fileTest;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest2 {
	public static void main(String[] args) throws IOException {
		// 문자단위로 데이터를 스트림으로 전송함
		
		FileWriter fw = new FileWriter(new File("test2.txt"));
		

		// 문자열을 입력하면 알아서 문자단위로
		fw.write("안녕하세요");
		// 반드시 닫아줘야 함
		fw.close();
		System.out.println("test2.txt 파일을 만들었습니다.");
		
		FileReader fr = new FileReader(new File("test2.txt"));
		
		System.out.println((char)fr.read());
		
	}
}
