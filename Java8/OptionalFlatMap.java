import java.util.Optional;

public class OptionalFlatMap {

	public static void main(String[] args) {

		Optional<String> optional1 = Optional.of("Hello Java 8");
		Optional<Optional<String>> optional2 = Optional.of(optional1);

		System.out.println("Optional2 value : " + optional2);
		
		Optional<String> output = optional1.map(String::toLowerCase);
		System.out.println("Map output value : " + output);
		
		output = optional2.flatMap(value -> value.map(String::toLowerCase));
		System.out.println("output value : " + output);
	}
}
