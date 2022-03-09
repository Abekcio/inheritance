package inheritance;

public class Main {

	public static void main(String[] args) {
	
		IndividualCustomer ahmet=new IndividualCustomer();
		ahmet.customerNumber="12345";
		
		CorporateCustomer hepsiburada= new CorporateCustomer();
		hepsiburada.customerNumber="78910";
		
		CustomerManager customerManager=new CustomerManager();
		customerManager.add(hepsiburada);
		customerManager.add(ahmet);
		Customer[] customers = { ahmet, hepsiburada};
		
		customerManager.addMultiple(customers);
		
	
	}

}
