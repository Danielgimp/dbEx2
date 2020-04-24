package dbEx2;

public class Doctor {
	long doctor_id;
	String doctor_type;
	String doctor_name;
	double salary;
	
	Doctor()
	{
		this.doctor_id=111;
		this.doctor_type="Family Doctor";
		this.doctor_name="John Marley";
		this.salary=25000;
		
	}
	
	Doctor(long id,String doctor_type,String doctor_name,double salary)
	{
		this.doctor_id=id;
		this.doctor_type=doctor_type;
		this.doctor_name=doctor_name;
		this.salary=salary;
	}

}
