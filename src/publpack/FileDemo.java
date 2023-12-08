package publpack;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
public class FileDemo{
				
				
				
				void anydata() throws IOException
				{
				try{
								FileOutputStream any = new FileOutputStream("ar.txt");
								
								
				}
				catch(FileNotFoundException v ){
								System.out.println("file not found");
				}
				}

				
				public static void main (String[] args) throws IOException
				{
								
								FileDemo at = new FileDemo();
								at.anydata();
								
								System.out.println(System.getProperty("user.dir"));
								
				}
				
}