import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Q31_FileRead_reverseWrite {

	public static void main(String[] args) throws IOException {
		
		File f = new File ("C:\\Users\\abhi_\\workspace_java\\JavaHackerton\\src\\sample.txt");
		File of = new File ("C:\\Users\\abhi_\\workspace_java\\JavaHackerton\\src\\sample2.txt");
		//checking the file exist
		if (f.exists()) {
			System.out.println("I found the file.");
		}
		
		try {
			
			FileReader fr = new FileReader(f);
			
			BufferedReader br = new BufferedReader(fr);
			//reading the string from file to a String array list 
			ArrayList<String> myFile = new ArrayList<String>();
			
			while (true) {
		
				String line = br.readLine();
				
				if (line != null) {
				//printing the liens from file to console
					System.out.println(line);
					
					myFile.add(line);
				} else
					break;
			}
			
			FileWriter fw = new FileWriter(of);
			BufferedWriter bw = new BufferedWriter(fw);
			
			int n = myFile.size();
		//printing the Array list in reverse order in the file 	
			for (int i = n-1 ; i >=0 ; i--) {
				bw.write(myFile.get(i));
				bw.write("\n");
			}
			
			bw.close();
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		}

	}

}
