package reviewLambda;

public class LamdbaTaskMain {
	
	
	public static void main(String[] args) {
		
		
		LambdaTask lt1 = new LambdaTask() {
			@Override
			public String method(int num) {
				 String result = num + " 은 양수 입니다.";
				return result;
			}
		};
		
		System.out.println(lt1.method(50));
		
		
		LambdaTask lt2 = (num) -> num + " 은 음수 입니다.";
		
		System.out.println(lt2.method(-125));
		
		LambdaTask lt3 = (num) -> {
			if(num > 0) {
				return num + " 은 양수 입니다.";
			} else {
				return num + " 은 음수 입니다.";
			}
		};
		
		System.out.println(lt3.method(-64654));
		
		
	}
}
