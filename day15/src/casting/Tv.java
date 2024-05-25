package casting;

public class Tv {
   //필드
   int vol;
   int ch;
   boolean power;
   
   //메소드
   void chUp() {
	   ch++;
      System.out.println("채널을 올립니다");
   }
   
   void chDown() {
	   ch--;
      System.out.println("채널을 내립니다");
   }
   
   void volUp() {
	   vol++;
      System.out.println("볼륨을 올립니다");
   }
   
   void volDown() {
	   vol--;
      System.out.println("볼륨을 내립니다");
   }
   
   void powerOnOff() {
      if(!power) {
    	  power = true;
         System.out.println("Tv전원 켰습니다");
      } else {
    	  power = false;
         System.out.println("Tv전원 껐습니다");
      }
   }
}