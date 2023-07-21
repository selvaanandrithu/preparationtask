package col3;

public class Employee {
	private String name;
	private String designation;
	private int salary;
	private int id;
	private String gender;
	private String project;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public Employee(String name, String designation, int salary, int id, String gender, String project) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.id = id;
		this.gender = gender;
		this.project = project;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", salary=" + salary + ", id=" + id
				+ ", gender=" + gender + ", project=" + project + "]";
	}
	

	
	
	

}
