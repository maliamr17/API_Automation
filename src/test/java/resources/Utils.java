package resources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import org.asynchttpclient.RequestBuilder;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Utils {

public static RequestSpecification requ;

	public RequestSpecification requestSpecification() throws IOException

	{

		if (requ==null) { // if condition added to given new file for very run of test case 	
		PrintStream logs=new PrintStream(new FileOutputStream("logsfile.txxt")); // This is used to print all logs and logsfile.text is no need to create it takes that as by defeault
		requ = new RequestSpecBuilder().setBaseUri(getGlobalValues("baseURI")).addQueryParam("key", "qaclick123")
				.addFilter(RequestLoggingFilter.logRequestTo(logs))        // used to add filters for all logs related to request as per above Print stream
				.addFilter(ResponseLoggingFilter.logResponseTo(logs))      // used to print all response logs
				.setContentType(ContentType.JSON).build();
				
			return requ;
		
		} else  { return requ;}
		

	}


public static String getGlobalValues(String key) throws IOException
		{
			Properties prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\API_BBD\\src\\test\\java\\resources\\globalVeriable.properties");
			prop.load(fis);
		
			return prop.getProperty(key);
			
			
		}




}
