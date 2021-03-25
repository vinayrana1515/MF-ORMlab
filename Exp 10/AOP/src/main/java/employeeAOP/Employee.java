package employeeAOP;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {
	private String name;	private int age;	private String address;	private int no_of_day_working;
	
	public Float cal_sal()
	{		float sal=no_of_day_working*3000;		
	return sal;	}

	public String getName() {		return name;	}

	public void setName(String name) {		this.name = name;	}

	public int getAge() {		return age;	}

	public void setAge(int age) {		this.age = age;	}

	public String getAddress() {		return address;	}

	public void setAddress(String address) {		this.address = address;	}

	public int getNo_of_day_working() {		return no_of_day_working;	}

	public void setNo_of_day_working(int no_of_day_working) {		this.no_of_day_working = no_of_day_working;	}
	}

