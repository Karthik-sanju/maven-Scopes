package samplewebapp3;

public class Demo {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(Exception e){
			System.err.println(e);
			
		}
	}

}
