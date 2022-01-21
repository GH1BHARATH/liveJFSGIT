import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringMethods {
	public static void main(String[] args) {
		String multilineString = "God is great. \n \n   Music helps relax. \n \n           Water the Elixir of Life \nKavya is a computer scientist";
//	System.out.println(multilineString);

//	public Stream<String> lines()
//	Returns a stream of lines extracted from this string, separated by line terminators.
		Stream<String> lineStream = multilineString.lines();
		lineStream.forEach(line -> System.out.println("Line : " + line));

//	Stream<String> lineStream1 = multilineString.lines();
//	Stream<String> noBlankLinesStream =  lineStream1.filter(line -> !line.isBlank());
//	noBlankLinesStream.forEach(line -> System.out.println("Line : " + line));

//	Stream<String> lineStream1 = multilineString.lines();
//	Stream<String> noBlankLinesStream =  lineStream1.filter(line -> !line.isBlank());
//	Stream<String> strippedStream = noBlankLinesStream.map(line -> line.strip());
//	Stream<String> strippedStream = noBlankLinesStream.map(String::strip);
//	strippedStream.forEach(line -> System.out.println(">" + line));

//		Stream<String> lineStream1 = multilineString.lines();
//		Stream<String> noBlankLinesStream = lineStream1.filter(line -> !line.isBlank());
//		Stream<String> strippedStream = noBlankLinesStream.map(line -> line.strip());
//  	Stream<String> strippedStream = noBlankLinesStream.map(String::strip);
//		List<String> linesList = strippedStream.collect(Collectors.toList());
//		linesList.forEach(line -> System.out.println(">" + line));
		
		 "God is great. \n \n   Music helps relax. \n \n  Water the Elixir of Life \nKavya is a computer scientist".lines()
		 .filter(line -> !line.isBlank()).map(String::strip)
		 .collect(Collectors.toList()).forEach(jumboJet -> System.out.println(jumboJet));
	}
}
