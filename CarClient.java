import java.util.ArrayList;
import java.util.Collections;


public class CarClient {
public static void main(String[]args) {
	
	
	ArrayList<Car>cars= new ArrayList<Car>();
		cars.add(new Car("Toyota", "Corolla",2018));
		cars.add(new Car("Toyota", "Camry",2019));
		cars.add(new Car("Kia", "Optima",2016));
		cars.add(new Car("Toyota", "Camry",2010));
		cars.add(new Car("Kia", "Soul",2015));
		
		for(int i=0; i<cars.size();i++) {
			System.out.println(cars.get(i));
		}
		System.out.println();
		
		for(int i=0; i<cars.size();i++) {
			Collections.sort(cars);
			System.out.println(cars.get(i));
			
		}
		
		
}

}
