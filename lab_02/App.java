package lab_02;

public class App {

	public static void main(String[] args) {
		Student riad = new Student();
		riad.setStdId(151382337);
		riad.setStdname("Md Riad Mia");
		riad.setCgpa(3.0);
		System.out.println(riad);
		
		Student mahamudul = new Student();
		mahamudul.setStdId(151382338);
		mahamudul.setStdname("Mahamudul Hasan");
		mahamudul.setCgpa(2.50);
		System.out.println(mahamudul);

	}

}
