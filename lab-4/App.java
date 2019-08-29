import java.io.File;

public class App{
	public static void main (String[]args){
		
		File r = new File("C:\\Users\\CSE-337\\Desktop");
		String filenames[] = r.list();
		long filesizes = r.length();
		for (String filename:filenames)
		{
			System.out.println("File Name: "+ filename );
			
			
		}
		
		
	}
	
	
}