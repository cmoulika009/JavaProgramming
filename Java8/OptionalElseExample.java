import java.util.Optional;
import java.util.Random;

public class OptionalElseExample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = Optional.of("baeldung")
				  .orElse(getRandomName());
		System.out.println("Name:"+name);
		
		name = Optional.of("baeldung")
				  .orElseGet(()->getRandomName());
		System.out.println("Name2:"+name);
	}
	public static String getRandomName() {
		System.out.println("getRandomName() method - start");

	    Random random = new Random();
	    int index = random.nextInt(5);
	    System.out.println(index);
	    System.out.println("getRandomName() method - end");
	    return "M";
		
	}

}
