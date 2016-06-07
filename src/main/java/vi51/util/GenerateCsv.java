package vi51.util;

import java.io.FileWriter;
import java.io.IOException;

public class GenerateCsv
{
   
	public static void generateCsvFile(long[] v)
   {
	try
	{
	    FileWriter writer = new FileWriter("src/main/resources/test.csv");
		 
	    writer.append("Step");
	    writer.append(','); 
	    writer.append("Time");
		int i;	
	    for(i=0;i<ConstantContainer.TIME_TO_TEST;i++){
	    	writer.append('\n');
	    	writer.append(""+i);
	    	writer.append(',');
	    	writer.append(""+v[i]);
	    }
			
	    writer.flush();
	    writer.close();
	}
	catch(IOException e)
	{
	     e.printStackTrace();
	} 
    }
}
