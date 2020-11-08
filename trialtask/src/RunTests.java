import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunTests {
	
	private static WebDriver driver;
	static String filename;
	//static Reporter rp;
	
	public static void main(String args[]) throws IOException /*throws IOException*/ {
		JUnitCore junit = new JUnitCore();
		//junit.addListener(new TextListener(System.out));	  

		System.out.println("wtfFFFFFFFFFFFFFFFFFFF???");
		junit.run(EsimeneTest.class, TeineTest.class);
		
		//junit.run(EsimeneTest.class);
		//junit.run(TeineTest.class);

		results();
		/*
		driver = new ChromeDriver();
		driver.get(filename);
		*/
		
		File htmlFile = new File(filename);
		Desktop.getDesktop().browse(htmlFile.toURI());
		
	}
	
	public static void resultReport(Result result) {
	    System.out.println("Finished. Result: Failures: " +
	      result.getFailureCount() + ". Ignored: " +
	      result.getIgnoreCount() + ". Tests run: " +
	      result.getRunCount() + ". Time: " +
	      result.getRunTime() + "ms.");
	}
	
	public static void results() {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss");  
		   LocalDateTime now = LocalDateTime.now();  
		
		   filename = "report-" + dtf.format(now) + ".html";
		
		File file = new File("hakkablooma.html");
		File file2 = new File(filename);
		file.renameTo(file2);
		
	}

}
