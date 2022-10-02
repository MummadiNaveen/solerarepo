package hrmsapp.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@AllArgsConstructor
@Setter
@Getter
public class EmployeeNotFoundException extends Exception {
	private String msg;
}
