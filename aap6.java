package add2;
class p{
	
	//instance variables(data or "state")
	String name;
	int age;
//class can contain
	//1. Data
	//2. methods
	void speak() {
	System.out.println("my name is:"+ name);
	}
		int calculateYearsToRetirement() {
			int yearsLeft= 65 - age;
			return yearsLeft;
		}
		int getAge() {
			
			return age;
		}
		String getName()
		{
			return name;
			
		}
	}
public class aap6{

	public static void main(String[] args) {
		
		p p1=new p();
		p1.name="bhavana ";
		p1.age=16;
		// call speak
		p1.speak();
		int years = p1.calculateYearsToRetirement();
		System.out.println("years till requirement"+years);
		int age= p1.getAge();
		String name= p1.getName();
		
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age);
		
		
	}

}
