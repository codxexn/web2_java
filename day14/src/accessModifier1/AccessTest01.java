package accessModifier1;

public class AccessTest01 {
   //필드
   public int publicVar = 1;
   int defaultVar = 2;
   protected int proVar = 3;
   private int priVar = 4;
      
   //메소드
   
   public void publicMethod() {
      System.out.println("public 메소드 호출");
   }
   
   void defaultMethod() {
      System.out.println("default 메소드 호출");
   }
   
   protected void proMethod() {
      System.out.println("protected 메소드 호출");
   }
   
   private void priMethod() {
      System.out.println("private 메소드 호출");
   }
   
}