package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers= {new SmsLogger(),new EmailLogger(),new DatabaseLogger()};
		CustomerManager customerManager=new CustomerManager(loggers);
		
		Customer ozer=new Customer(1,"�zer","�nal");
		customerManager.add(ozer);
		

	}

}
