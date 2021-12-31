package lambdapack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemoPractice {

	public static void streamExample() {
		List<String> stringList = Arrays.asList("Julekha", " ", "M", "MH", " ", "IN");

		/* Filter Example */
		List<String> filtered = stringList.stream().filter(string -> string.contains("a")).collect(Collectors.toList());
		System.out.println("Filtered String " + filtered);

		/* Map Example */
		List<Integer> number = Arrays.asList(5, 4, 3, 22, 22, 4, 8);
		List<Integer> sqaures = number.stream().map(y -> y * y).distinct().collect(Collectors.toList());
		System.out.println("Squares: " + sqaures);

		/* Sorted Example */
		List<String> nameList = Arrays.asList("Julekha", "Rohini", "Neeta", "Divya");
		List<String> sorted = nameList.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted Names: " + sorted);

		/* forEach Example */
		System.out.println("Foreach to find sqaures of numbers");
		number.stream().map(y -> y * y).distinct().forEach(System.out::println);

		/* Reduce Example */
		int evenSum = number.stream().filter(x -> x % 2 == 0).reduce(0, (res, i) -> res + i);
		System.out.println("Sum of Even Numbers in List: " + evenSum);

	}

	public static void main(String[] args) {
		streamExample();
	}

}