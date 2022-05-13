import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner joiner = new StringJoiner(",");
		System.out.println(joiner.toString());

		joiner = new StringJoiner(",", "(", ")");
		System.out.println(joiner.toString());

		StringJoiner rgbJoiner = new StringJoiner(",", "(", ")");
		StringJoiner cmybJoiner = new StringJoiner("-", "(", ")");

		rgbJoiner.add("Red").add("Green").add("Blue");
		cmybJoiner.add("Cyan").add("Magenta").add("Yellow").add("Black");

		System.out.println(rgbJoiner.toString());
		System.out.println(cmybJoiner.toString());
		rgbJoiner.merge(cmybJoiner);
		System.out.println(rgbJoiner.toString());

		List<String> rgbList = Arrays.asList("Red", "Green", "Blue");
	    String commaSeparatedRGB = rgbList.stream()
	      .map(color -> color.toString())
	      .collect(Collectors.joining(","));
	    System.out.println(commaSeparatedRGB.toString());
	}

}
