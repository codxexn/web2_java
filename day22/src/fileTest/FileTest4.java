package fileTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTest4 {
	public static void main(String[] args) throws IOException {
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("test3.txt")));
//		// 덮어쓰기
//		bw.write("\ntest");	// 줄바꿈 1. \n
//		bw.newLine(); // 줄바꿈 2. .newLine();
//		bw.write("12월 11일입니다.");
//		bw.close();
//		System.out.println("test3.txt 수정 완료");
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("test3.txt")));
			String line = null;
			// readLine은 한줄씩 가지고 오지만 개행문자 \n은 가지고 오지 않는다.
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
