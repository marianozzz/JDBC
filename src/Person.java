
public class Person {
	
	private String name;
	private String lastname;
	private Integer age;
	
	public Person (String name, String lastname, Integer age)
	{
		this.setName(name);
		this.setLastname(lastname);
		this.setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String toString() 
	{
		return this.name+", "+
			   this.lastname+", Edad: "+
			   this.age;
	}

}
