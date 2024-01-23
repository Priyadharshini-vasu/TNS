class Employee 
{
	protected String name;
	protected double basesalary;

	public Employee(String name,double basesalary)
	{
		this.name=name;
		this.basesalary=basesalary;
	}

	public void calculateSalary()
	{
		System.out.println("Calculating salary for employee:" + name);
		double salary=basesalary;
		System.out.println("Base salary:" + basesalary);
		System.out.println("Total salary:" + salary);
	}
}
