package file.exceptions;

public class EvenNumberException extends Exception{
	@Override
	public String getMessage() {
		return "You can not input an even number";
	}
}
