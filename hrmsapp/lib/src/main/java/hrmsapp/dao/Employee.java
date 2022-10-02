package hrmsapp.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Employee  implements Comparable<Employee>{
	private Integer id;
	private String name;
	private Double salary;
	
	private Address address;

	@Override
	public int compareTo(Employee o) {
	if(this.getId().equals(o.getId())) {
		return 0;
	}else if(this.getId() < o.getId()) {
		return 1;
	}else {
		return -1;
	}
		
	}

}
