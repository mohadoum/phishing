package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Paths;

public class Model {
	
	public static int request(String url)
	{
		try {
				/*retrieving dynamically the path of the model.py file in this directory*/
				String pathInExecution = Model.class.getProtectionDomain().getCodeSource().getLocation().getPath();
				String baseProject = pathInExecution.substring(1, pathInExecution.indexOf("eclipse-workspace")+"eclipse-workspace".length());
				String pathModel = Paths.get(baseProject,"PhishingWebsiteDetection","WebContent","META-INF", "model","model.py").toString();
				System.out.println(pathModel);
				
				/* Executing python model using shell or cmd*/
				Process p = Runtime.getRuntime().exec("python "+ pathModel);
				p.waitFor();
			 	BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

			 	// read the output from the command
	            String s = "";
	            String val;
	            while((val = stdInput.readLine()) != null)
	            {
	            	s = val;
	            }
	          
	            if(s!= null && s != "")
	            	return Integer.parseInt(s);
	            
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// read any errors from the attempted command
        return -2;
	}
}
