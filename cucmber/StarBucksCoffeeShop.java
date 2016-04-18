package cucmber;

public class StarBucksCoffeeShop implements StarBucksCoffeeShopService {

	public StarBucksCoffeeShop() {
		System.out.println("===========================================");
	}

	private int numberOfCoffee;
	private int depositMoney;

	public void setNumberOfCoffee(int numberOfCoffee) {
		this.numberOfCoffee = numberOfCoffee;
		System.out.println(numberOfCoffee + " coffee(s) left in the machine");
	}

	public void setDepositMoney(int depositMoney) {
		this.depositMoney = depositMoney;
		System.out.println(depositMoney + " dollars money deposited");
	}

	public void pressCoffeeButton() throws Exception {
		if (depositMoney == 0) {
			System.out.println("Please deposit money in the machine");
		} else {
			System.out.println("Customer Deposited " + depositMoney + " dollars");
		}
	}

	public void serveCoffe() {
		if (depositMoney != 0) {
			if (numberOfCoffee != 0) {
				numberOfCoffee--;
				depositMoney--;
				System.out.println("I served a Coffee");
				System.out.println("There are " + numberOfCoffee + " lest in the macine");
			} else {
				System.out.println("Machine is out of coffees");
			}
		} else {
			System.out.println("Please deposit money to server the coffee");
		}

	}

	public int getNumberOfCoffeeLeftInMachine() {
		return numberOfCoffee;
	}

	public void refundmoney() {
		// TODO Auto-generated method stub
		System.out.println("Please pick your refund amount " + depositMoney);
	}

	public void selectNumberOfCoffee(int numberOfcoffees) {
		
	}

	public void serveNumberOfCoffee(int serverNumberOfCoffee) {
		// TODO Auto-generated method stub
		
	}
}
