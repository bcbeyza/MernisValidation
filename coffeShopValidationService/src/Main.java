import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		
		BaseCustomerManager basecustomerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		basecustomerManager.save(new Customer(1,"Beyza Nur", "Çetiner",2000,"111111111"));
		
		
		BaseCustomerManager basecustomerManager2=new NeroCustomerManager(new MernisServiceAdapter());
		basecustomerManager2.save(new Customer(1,"Beyza", "Çetiner",2000,"222222222"));
		
		
		
		
		

	}

}
