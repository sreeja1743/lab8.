package lab8;
import java.io.*;

public class CopyDataThread extends Thread {
	
    public File CopyDataThreadToFile(File f1, File f2) throws IOException {
       
    	BufferedReader br = new BufferedReader(new FileReader(f1));
    	String line = "";
    	 FileWriter f = new FileWriter(f2);
    	 BufferedWriter bw = new BufferedWriter(f);
    	while((line = br.readLine())!=null) {
    		bw.write(line,0,line.length());
    	}
    	return f2;
    }
    	 
	}

