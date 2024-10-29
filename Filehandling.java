/*

File Handling:-

      Create file exe	
*/

import java.io.*;
class CreateFile {
	
	public static void main(String[] args) throws IOException {

		File f=new File("C:\\Users\\HP\\Desktop\\RS.txt");
			
			if(f.createNewFile())
			{
				System.out.println("File Successfully crerated");
			}

			else
			{
				System.out.println("File already exist");
			}			
        }

}
