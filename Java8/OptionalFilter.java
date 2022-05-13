import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class OptionalFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> countries = Arrays.asList("USA", "UK", "AUS");
		Optional<List<String>> countriesOptional = Optional.of(countries);
		Predicate<List<String>> listPredicate = list -> list.stream().filter(name -> name.startsWith("U")).count() > 0;

		Optional listOpional = countriesOptional.filter(listPredicate);
		System.out.println("List Optional filter() : " + listOpional);
	}

}
