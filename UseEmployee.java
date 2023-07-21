package col3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee("Selva","hr",20000,101,"male","java");
		Employee e2 = new Employee("Anand","hr",30000,102,"male","java");
		Employee e3 = new Employee("kamali","developer",40000,107,"female","python");
		Employee e4 = new Employee("raju","developer",50000,106,"male","java");
		Employee e5 = new Employee("kasi","hr",20000,109,"female","java");
		Employee e6 = new Employee("losy","hr",20000,104,"female","java");
		
		ArrayList<Employee>emps=new ArrayList<>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);
		emps.add(e6);
		
//	List<Employee>fem=emps.stream().filter(x->x.getGender().equals("female")).collect(Collectors.toList());
//	fem.forEach(x->System.out.println(x));
//	List<Employee>mhr=emps.stream().filter(x->x.getGender().equals("male")&&x.getDesignation().equals("hr")).collect(Collectors.toList());
//	mhr.forEach(x->System.out.println(x));
	
//	List<String> li= emps.stream().filter(x->x.getGender().equals("female")).map(y->y.getName()).collect(Collectors.toList());
//	li.forEach(f->System.out.println(f));
	
//	Map<Integer,Employee>malemp=emps.stream().filter(x->x.getGender().equals("male")).collect(Collectors.toMap(j->j.getId(),y->y));
//	malemp.values().forEach(x->System.out.println(x));
//	malemp.keySet().forEach(x->System.out.println(malemp.get(x)));
	
	HashMap<Integer,Employee>hsp=new HashMap<>();
	hsp.put(e1.getId(), e1);
	hsp.put(e2.getId(), e2);
	hsp.put(e3.getId(), e3);
	hsp.put(e4.getId(), e4);
	hsp.put(e5.getId(), e5);
	hsp.put(e6.getId(), e6);
	
//	hashmap to list...
	List<Employee>bb=hsp.values().stream().filter(x->x.getName().startsWith("A")).collect(Collectors.toList());
	bb.forEach(x->System.out.println(x));
	
//	List<Employee>fg=hsp.values().stream().filter(x->x.getGender().equals("male")&&x.getDesignation().equals("hr")).collect(Collectors.toList());
	
//	fg.forEach(x->System.out.println(x));
	
	//list to map.....
	Map<Integer,Employee>fg=emps.stream().filter(x->x.getGender().equals("male")&&x.getDesignation().equals("hr")).collect(Collectors.
			toMap(x->x.getId(),y->y));
//		fg.values().forEach(x->System.out.println(x));
	// hashmap to map....
//Map<Integer,Employee>fg=hsp.values().stream().filter(x->x.getGender().equals("male")&&x.getDesignation().equals("hr")).collect(Collectors.
//	toMap(x->x.getId(),y->y));
	
//	fg.values().forEach(x->System.out.println(x));
//	fg.keySet().forEach(x->System.out.println(hsp.get(x)));
     long c = emps.stream().filter(x->x.getGender().equals("male")&&x.getDesignation().equals("hr")).map(y->y.getName()).count();
//	System.out.println(c);
     
     
//     .peek(m -> m.setSalary(m.getSalary() - 999))
//     List<Employee>dgs=emps.stream().filter(x->x.getDesignation().equals("hr")) .peek(m -> m.setSalary(m.getSalary() - 999)).collect(Collectors.toList());
//     dgs.forEach(x->System.out.println(x));
 
	}
	

}
