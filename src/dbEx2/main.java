package dbEx2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dbConn Conn=new dbConn();
		Doctor doc=new Doctor();
		Doctor docArr[]=new Doctor[] {doc};		
		dbConn.createDoctorTable(docArr);
		
		
		
	}

}
