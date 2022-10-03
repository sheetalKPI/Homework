package Diamond;

public class SuperBird extends Bird{
   public static void main(String[] args)
	{
    SuperBird s = new SuperBird();
    s.fly();
    s.swim();
	}

@Override
void fly() {
System.out.println("yes");
	
}

@Override
void swim() {
	System.out.println("yes");
	
}
}