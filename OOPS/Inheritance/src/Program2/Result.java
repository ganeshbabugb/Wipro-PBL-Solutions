package Program2;

class Person
{
	protected String name;
	public Person(String name)
    {
		this.name = name;
	}
	public String getName()
    {
		return name;
	}
	public String toString()
    {
		return "Person [name=" + name + "]";
	}
}

class Employee extends Person
{
	private double annualSalary;
	private int yearOfJoining;
	private String nationalInsuranceNo;

	public Employee(String name, double annualSalary, int yearOfJoining, String nationalInsuranceNo)
    {
		super(name);
		this.annualSalary = annualSalary;
		this.yearOfJoining = yearOfJoining;
		this.nationalInsuranceNo = nationalInsuranceNo;
	}

	public double getAnnualSalary()
    {
		return annualSalary;
	}

	public int getYearOfJoining()
    {
		return yearOfJoining;
	}

	public String getNationalInsuranceNo()
    {
		return nationalInsuranceNo;
	}

	public String getName()
    {
		return name;
	}

	public String toString()
    {
		return "Employee [annualSalary=" + annualSalary + ", yearOfJoining=" + yearOfJoining + ", nationalInsuranceNo="
				+ nationalInsuranceNo + ", name=" + name + "]";
	}
}

class Result
{
	public static void main(String args[])
    {
		Employee employee = new Employee("Parimalam", 50000, 2020, "251a2sd29ad");
		System.out.println(employee);
	}
}
