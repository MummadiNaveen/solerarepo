package hrmsapp.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@AllArgsConstructor
@Setter
@Getter
public class AllreadyExixstedException extends Exception {
	private String msg;
}
