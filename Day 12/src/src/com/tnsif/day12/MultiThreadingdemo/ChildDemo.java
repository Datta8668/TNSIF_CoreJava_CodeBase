package src.com.tnsif.day12.MultiThreadingdemo;
//	child class
public class ChildDemo {

	public static void main(String[] args) {
		
		ChildThread c = new ChildThread (10, "Hello");
		ChildThread c1 = new ChildThread (10, "Rajesh");
		
		c.start();
		c1.start();
		System.out.println("End of the Program");
	}
}
