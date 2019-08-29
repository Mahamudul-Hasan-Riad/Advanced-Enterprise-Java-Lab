import java.util.Scanner;
public class App1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name = s.next();
		System.out.println("Enter Your Age");
		int age = s.nextInt();
		System.out.println("Enter Your BG");
		String bg = s.next();
		
		System.out.println("Your Name: "+ name+"\n"+"Your Age: " +age+"\n"+"Blood Group: "+bg);

	}

}
