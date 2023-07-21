package col3;

//import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;
//import java.util.stream.*;

public class Sample {
	public static void main(String[] args) {
		ArrayList<String>names = new ArrayList<>();
		names.add("Rajash");
		names.add("Suresh");
		names.add("Ram");
		names.add("Raju");
		names.add("Kamli");
		
//		names.stream().filter(x->x.startsWith("R")).forEach(x->System.out.println(x));
		
	List<String> name=names.stream().filter(x->x.startsWith("R")).collect(Collectors.toList());
//	System.out.println(name);
	
	Set<String> namh=names.stream().filter(x->x.startsWith("R")).collect(Collectors.toSet());
//	System.out.println(namh);
	
	Long c = names.stream().filter(x->x.startsWith("R")).count();
	System.out.println(c);
		
	}

}
