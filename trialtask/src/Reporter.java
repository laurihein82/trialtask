import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Reporter {
	
	public FileWriter report;
	public BufferedWriter bw;

	public Reporter() {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now));  
		
		//String filename = "report-" + java.time.LocalDate.now() /*+ "-" + java.time.LocalTime.now()*/ + ".txt";
		   //String filename = "report-" + dtf.format(now) + ".txt";
		 
		try {
	        report = new FileWriter("hakkablooma.html", true);
	        //FileWriter report = new FileWriter("tra.txt");
	        bw = new BufferedWriter(report);
	        //bw.write("<html><body>");
	        //bw.newLine();
	        //bw.write("miks ma pean siia midagi kirjutama?");
	        bw.close();
	        //System.out.println("Successfully wrote to the file (konstruktor)");
	      } catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	}
	
	public void add(String input) {
		
		try {
			FileWriter fw = new FileWriter("hakkablooma.html", true);
			    bw = new BufferedWriter(fw);
			    
			    PrintWriter out = new PrintWriter(bw);
			    out.println("<li>" + input + "</li>");
			    out.close();
			    bw.close();
			    /*
			    bw.write(input);
		        bw.newLine();
			    */
			    
			} catch (IOException e) {
			    //exception handling left as an exercise for the reader
			}

	}
	
	public void addSimple(String input) {
		
		try {
			FileWriter fw = new FileWriter("hakkablooma.html", true);
			    bw = new BufferedWriter(fw);
			    
			    PrintWriter out = new PrintWriter(bw);
			    out.println(input);
			    out.close();
			    bw.close();
			    /*
			    bw.write(input);
		        bw.newLine();
			    */
			    
			} catch (IOException e) {
			    //exception handling left as an exercise for the reader
			}

	}
}
