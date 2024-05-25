package synchronizationTest;

public class ThreadEx implements Runnable{

   //필드
   int number;
   
   //메소드
   @Override
   public void run() {
      // TODO Auto-generated method stub
      for(int i=0; i<30; i++) {
         com();
         try {
            Thread.sleep(500);
         } catch (InterruptedException e) {
            System.out.println("sleep~");
            break;
         }
      }
   }
   
   public synchronized void com() {
      number++;
      System.out.println("com + ");
      System.out.println("number : " + number);
      if(number > 9) {
         System.out.println("com이 number를 최대치로 올렸습니다");
         try {
            wait();
         } catch (InterruptedException e) {
            System.out.println("wait~");
         }
      }
      
   }
   
   public synchronized void user() {
      if(number == 0) {
         System.out.println("이미 number가 최소값입니다");
      }else {
         number--;
         System.out.println("user - ");
         System.out.println("number : " + number);
         notify();
      }
   }
   
}








