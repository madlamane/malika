package revature;
import revarture.animal.Dog;
import revarture.math.Calculator;
/*class
 * what is a class?
 * Essentialy a blueprint of
 * 
 * */
 
public class MainDriver {
	public static void main(String[] args) {
		System.out.println("Welcome to my project :");
		
		
		int a =2;
		int b =4;
		int [] array= {1,2,3,4};
		Calculator myCalculator;
		
		Calculator a1= new Calculator();
		Calculator b1= new Calculator();
		myCalculator= new Calculator();
		
		int sumTotal= myCalculator.sum(a, b);
		System.out.println("The sum is :"+ sumTotal);
		
		int sum=myCalculator.betterSumMethod(array);
		
		System.out.println("The array is :"+ sum);
		
		
		Dog myDog = new Dog();
		myDog.bark();
		
		myDog.name = "Bobby";
		myDog.breed = "poodle";
		myDog.vaxxed = true;
		myDog.legs = 4;
		
		System.out.println(myDog.name);
		System.out.println(myDog.breed);
		System.out.println(myDog.vaxxed);
		System.out.println(myDog.legs);
		
		
		
		
		
	}

}
