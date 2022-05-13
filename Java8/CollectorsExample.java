import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Moulika", "Subhash", "Kondeti");
		list.stream();
		System.out.println(list.toString());

		list.stream().collect(Collectors.toList());
		System.out.println(list.toString());

		Set<String> result = list.stream().collect(Collectors.toSet());
		System.out.println(result.toString());

		System.out.println(list.stream().collect(Collectors.joining(",")));
		
		Long result1 = (list.stream().collect(Collectors.counting()));
		System.out.println(result1);
	}

}
