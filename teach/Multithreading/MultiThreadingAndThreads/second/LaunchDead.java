package Multithreading.MultiThreadingAndThreads.second;

public class LaunchDead
{

	public static void main(String[] args) 
	{
		Library lib=new Library();
		
		Thread t1=new Thread(lib);
		
		Thread t2=new Thread(lib);
		
		t1.setName("Student1");
		t2.setName("Student2");
		
		t1.start();
		t2.start();
		

	}

}
