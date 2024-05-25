package objectTest;

public class HashCodeTest {
   public static void main(String[] args) {
      NewUserEquals newUser = new NewUserEquals(1, "sun");
      NewUserEquals newUser1 = new NewUserEquals(1, "sun");
//      UserEquals user = new UserEquals(1, "sun");
      
//      System.out.println(user.hashCode());
      System.out.println(newUser.hashCode());
      System.out.println(newUser.equals(newUser1));
//      System.out.println(user.equals(newUser1));
   }
}