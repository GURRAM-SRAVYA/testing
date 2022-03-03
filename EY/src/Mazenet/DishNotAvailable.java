package Mazenet;

public class DishNotAvailable extends Exception{
	public DishNotAvailable() {
		super();
		}
	public DishNotAvailable(String str) {
		super(str);
		}
	@Override
	public String getMessage() {
		return super.getMessage();
		}
	@Override
	public String toString() {
		return super.toString();
		}
	}