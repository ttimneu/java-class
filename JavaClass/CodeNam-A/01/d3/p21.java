package d3;

public class p21 {

	public static void main(String[] args) {
		for(int i=0;i<10;i++)
		{
			if(i%3==0)
			{
				continue;
			}
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for(int i=0;i<100;i++)
		{
			if(i%2== 0)
			{
				continue;
			}
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for(int i=0;i<100;i++)
		{
			if(i%2!= 0||i==0)
			{
				continue;
			}
			System.out.print(i+" ");
		}
		
	}

}
