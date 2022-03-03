package Mazenet;

public class Restaurant {
	public void order(String dish) throws DishNotAvailable{
		double a = 0.2;
		if(a>0.5) {
			System.out.println("Found "+dish);
			}
		else {
			throw new DishNotAvailable("Not Found");
			}
		}
	public static void main(String[] args){
		try {
			Restaurant aa = new Restaurant();
			aa.order("Masala Dosa");
			}catch(DishNotAvailable e) {
				e.printStackTrace();
				}finally {
					System.out.println("Bye");
					}
		}
	}
