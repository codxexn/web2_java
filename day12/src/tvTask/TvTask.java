package tvTask;

import java.util.Scanner;

public class TvTask {
	public static void main(String[] args) {
	
		String msg = "1. 전원버튼\n"+
				"2. 채널올리기\n" +
				"3. 채널내리기\n" +
				"입력 >> ";
		System.out.println(msg);
		
		//1) 입력클래스
		//2) 객체 생성
		//3) 입력될 값이 저장될 변수
		//4) while문 
		//5) 	입력메시지 출력
		//6)	입력받기
		//7) switch {
		//8)	case 1: 조건문(if~=> 전원끄기 메소드 호출 else => 전원켜기 메소드 호출)
		//9)	case 2: 조건문(if => 채널 channelUp()호출)
		//10)   case 3: 조건문(if => tv켜져있고 channel > 1 channelDown() 호출)
		//11)	default: 잘못입력되었습니다 끝
		
		Scanner sc = new Scanner(System.in);
		BasicTv bTv1 = new BasicTv("balck", 32, 500000);
		BasicTv bTv2 = new BasicTv();
		BasicTv bTv3 = new BasicTv("blue", 50, 1500000, 5);
		int choice = 0;
		
//		System.out.println(bTv2.channel);
		
		while(true) {
			System.out.println();
			System.out.println(msg);
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
//				if(bTv1.power) {
//					System.out.println("전원끄기!");
//					bTv1.powerOnOff();
//				}else {
//					System.out.println("전원켜기!");
//					bTv1.powerOnOff();
//				}
//				bTv1.powerOnOff();
				bTv2.powerOnOff();
				break;
			
			case 2:
				if(bTv1.power) {
					System.out.println("채널 : " + bTv1.channelUp());
				}
				break;
				
			case 3:
				if(bTv1.power && bTv1.channel > 1) {
					System.out.println("채널 : " + bTv1.channelDown());
				}
				break;
				
			default:
				System.out.println("잘못 입력하셨습니다");
				System.exit(0); //프로그램 종료
				break;
			}
		}
		
		//BasicTv  객체를 3개 생성
		// bTv1 초기값은 (balck, 32, 500000)
		// bTv2 초기값은 기본생성자로 호출
		// bTv3 초기값은 선택
		
		//1번 입력시 BasicTv클래스의 powerOnOff() 메소드를 호출하여 Tv전원 On/Off한다
		//켜졌을 경우 tv전원이 켜졌습니다 출력, 꺼졌을 경우 tv전원이 꺼졌습니다 출력
		
		//2번 입력시 tv전원이 켜져있을 경우, channelUp()메소드를 호출하여 tv 채널을 올린다
		//tv가 꺼져있을 경우엔 tv전원을 먼저 켜주세요 메시지 출력
		
		//3번 입력시 tv전원이 켜져있을 경우, channelDown()메소드를 호출하여 tv 채널을 내린다
		//tv가 꺼져있을 경우엔 tv전원을 먼저 켜주세요 메시지 출력
		
		//그외 번호 입력시 : 프로그램 종료
		
	}
}
