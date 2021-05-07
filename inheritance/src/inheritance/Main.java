package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer ozer=new IndividualCustomer();
		ozer.customerNumber="12345";
		
		CorporateCustomer hepsiBurada=new CorporateCustomer();
		hepsiBurada.customerNumber="78910";
		
		CustomerManager customerManager=new CustomerManager();
		//customerManager.add(hepsiBurada);
		//customerManager.add(ozer);
		
		Customer[] customers= {ozer,hepsiBurada};
		customerManager.addMultiple(customers);
		
	}

}
