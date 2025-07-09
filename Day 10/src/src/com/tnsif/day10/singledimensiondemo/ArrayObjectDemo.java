package src.com.tnsif.day10.singledimensiondemo;

public class ArrayObjectDemo {

	public static void main(String[] args) {
		
		//Student s=new Student(0, null)
		Student [] arr;
		
		//declared memory for 5 object or type students
		
		arr=new Student[5];
		
		arr[0] = new Student(101, "Datta");
		arr[1] = new Student(102, "Aayan");
		arr[2] = new Student(103, "Rajesh");
		arr[3] = new Student(104, "Sahil");
		arr[4] = new Student(105, "Mahesh");
		//arr[5] = new Student(106, "Suraj");
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("Elemnts at"+ i+": "
		+arr[i].getRollNo()+"\t"+arr[i].getName());
		}

	}

}
