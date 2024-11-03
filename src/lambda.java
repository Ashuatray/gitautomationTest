import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lambda {

	public static void main(String[] args) {
//		ArrayList<String> names = new ArrayList<String>();
//		names.add("Ashutosh sharma");
//		names.add("ashush");
//		names.add("mohjit");
//		names.add("dijjdfa");
//		names.add("bjnhag");
//		names.add("klzjfhihiu");
//		
		
//	1.	long count = names.stream().filter(s->s.toLowerCase().startsWith("a")).count();
//		System.out.println(count);
		// TODO Auto-generated method stub
		//print with the help of stream and the lambda operation
//		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
		
		// now the print only one output from the arrayList
		
//	2.	names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
		
// 	3.	code for print in uppercase using map stream as well length of the string is more than user limit ;
		
		
//		names.stream().filter(s->s.endsWith("a")  && s.length()>7).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	
//  4.    convert arrays into list and print sort and end with e character in uppercase	
		String[] names = {"Alice", "aBobe", "aie", "Diana", "Ethan"};
		List<String> name = Arrays.asList(names);
		//name.stream().filter(s->s.endsWith("e")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//name.stream().forEach(s->System.out.println(s));
		name.stream().filter(s->s.concat("s")).forEach(s->System.out.print(s));
	


	}

}