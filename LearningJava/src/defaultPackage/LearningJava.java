package defaultPackage;

import java.io.*;
import java.util.*;

@SuppressWarnings("unused")
public class LearningJava {

	public static void main(String[] args) {
		Car car1 = new Car("Ford", "Mustang", "black", 2012);
		Car car2 = new Car("Audi", "A7", "red", 2018);
		Car car3 = new Car(car1);
		
		car1.copy(car2);
		System.out.println();
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
	}
	
}
