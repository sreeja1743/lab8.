package lab8;
import java.io.*;

public class FileProgram {
	
	public static void main(String[] args)  throws IOException, InterruptedException{
		FileProgram fp = new FileProgram();
		File f1 = new File("C:\\Users\\Sreeja Mukku\\Desktop\\javafile\\DemoShort.txt");
		File f2 = new File("File2");
		File f = new CopyDataThread().CopyDataThreadToFile(f1, f2);
		fp.print(f1, f);
	}

	public void print(File f1, File f2) throws IOException {
		BufferedReader brA = new BufferedReader(new FileReader(f1));
		String lineA = "";
		
		System.out.println("Actual file:\n");
		
		while((lineA = brA.readLine())!=null) {
			System.out.println(lineA);
		}
		
		System.out.println("Copied file:\n");
		
		BufferedReader brC = new BufferedReader(new FileReader(f1));
		String lineB = "";
		
		while((lineB = brC.readLine())!=null) {
			System.out.println(lineB);
		}
		
	}

}
