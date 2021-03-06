import java.util.Scanner;
class Student
{
	private String reg_no;
	private String name;
	private double internal;
	private double external;
	private double total;
	private char   grade;

	Student(String reg_no, String name, double internal, double external)
	{
		this.reg_no = reg_no;
		this.name = name;
		this.internal = internal;
		this.external = external;
		this.total = internal + external;
		this.grade = computeGrade(total);
		
	}

	private char computeGrade(double total)
	{
		if(total > 95.0)
		{
			return 'S';
		}
		else if(total > 90.0)
		{
			return 'A';
		}
		else if(total > 80.0)
		{
			return 'B';
		}
		else if(total > 70.0)
		{
			return 'C';
		}
		else if (total > 60.0)
		{
			return 'D';
		}
		else
		{
			return 'F';
		}
	}

	@Override
	public String toString()
	{
		return String.format("%-10s %-30s %-5s %-5s %-5s %s", reg_no, name, 
															  Double.toString(internal), 
															  Double.toString(external),
															  Double.toString(total),
															  String.valueOf(grade));
	}
}


class StudentDetails
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Student[] students = new Student[5];
		for(int i=0;i<5;i++)
		{
			students[i] = new Student(scanner.nextLine(),
									  scanner.nextLine(),
									  Double.parseDouble(scanner.nextLine()),
									  Double.parseDouble(scanner.nextLine()));
		}
		//Student student = new Student("14bit0180", "Saurabh", 39, 20);
		for(int i=0;i<5;i++)
			System.out.println(students[i]);
	}
}
