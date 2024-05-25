package reviewAnonymous;

public class ControlMain {
   public static void main(String[] args) {
      
      Control heating = new Control() {
         
         @Override
         public void turnOn() {
            System.out.println("난방을 켭니다");
         }
         
         @Override
         public void turnOff() {
            System.out.println("난방을 끕니다");
         }
      };

      Control tv = new Control() {
         
         @Override
         public void turnOn() {
            System.out.println("tv를 켭니다");
         }
         
         @Override
         public void turnOff() {
            System.out.println("tv를 끕니다");
         }
      };
      
      System.out.println(heating);
      System.out.println(tv);
      heating.turnOn();
      heating.turnOff();
      tv.turnOn();
   }
}