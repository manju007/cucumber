package cucmber;

public interface StarBucksCoffeeShopService {

	public void setNumberOfCoffee(int numberOfCoffee);

	public void setDepositMoney(int depositMoney);

	public void pressCoffeeButton() throws Exception;

	public void serveCoffe();

	public int getNumberOfCoffeeLeftInMachine();

	public void refundmoney();
	
	public void selectNumberOfCoffee(int numberOfcoffees);
	
	public void serveNumberOfCoffee(int serverNumberOfCoffee);

}