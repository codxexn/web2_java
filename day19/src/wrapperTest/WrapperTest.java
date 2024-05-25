package wrapperTest;

public class WrapperTest {
   public static void main(String[] args) {
      //boxing
      int number = 10;
      
      Integer numInt = new Integer(10);
      Integer numInt2 = Integer.valueOf(3);
      System.out.println(number);
      System.out.println(numInt2);
      Double numDou = Double.valueOf(5);
      
      //unboxing
      int number1 = numInt.intValue();
      double number2 = numDou.doubleValue();
      System.out.println(number1);
      System.out.println(number2);
      
      //auto boxing
      Integer numInt3 = 50;
      
      //auto unboxing
      int number3 = numInt3;
      System.out.println(number3);
      
      
   }
}