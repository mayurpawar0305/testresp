import java.util.Scanner;

public class DemoEmployee {
	
	public static void accept(Employee []e)
	{
		Scanner sc= new Scanner(System.in);
		int id;
		String name;
		int salary;
		
		for(int i=0;i<e.length;i++)
		{	System.out.println("Enter Employee Name ");
			name=sc.next();
			System.out.println("Enter Employee ID");
			id=sc.nextInt();
			System.out.println("Enter Employee Salary ");
			salary=sc.nextInt();
			e[i]=new Employee(name,id,salary);
			
		}
		
	}
	public static void display(Employee []e)
	{
		System.out.println("--------------");
		for (int i=0;i<e.length;i++)
		{
			System.out.println(e[i]);
		}
	}

	public static void sortEmployee(Employee []e)
	{	
		int i,j;
		Employee temp;
		for(i=0;i<e.length-1;i++)
		{
			for(j=0;j<e.length-1-i;j++)
			{
				if(e[j].getSalary()>e[j+1].getSalary())
				{
					temp=e[j];
					e[j]=e[j+1];
					e[j+1]=temp;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		Employee []e=new Employee[3];
		accept(e);
		display(e);
		sortEmployee(e);
		display(e);
		
		
		
	}

}
