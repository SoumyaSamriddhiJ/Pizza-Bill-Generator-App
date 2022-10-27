
public class Main {

	public static void main(String[] args) {
		//Pizza basePizza = new Pizza(true);
	//	basePizza.addExtraToppings();
		//basePizza.addExtraCheese();
       //basePizza.takeAway();
     //   basePizza.getBill();

		DeluxPizza dp = new DeluxPizza(true);
	//dp.addExtraCheese();
	//dp.addExtraToppings();//these two won't work since we have created super class.
		dp.takeAway();
		dp.getBill();

	}

}
