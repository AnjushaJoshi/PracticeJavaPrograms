

 class Multithreading implements Runnable 
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Thread 1: "+i);
		}
		
	}
}
	 class Multithreading2 implements Runnable
	{
		public void run()
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Thread 2: "+i);
			}
		}
	}
		 class MyMultithreading
		{
			public static void main(String[] args) 
			{
				Multithreading m=new Multithreading(); 
				Multithreading2 m1=new Multithreading2();
				Thread t=new Thread(m);
				Thread t1=new Thread(m1);
				t.start();
				t1.start();
			}
		}
	
	


