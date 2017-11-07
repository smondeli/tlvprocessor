/**
 * 
 */
package tlvprocessor;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * @author Sreekanth Mondeli
 *
 */
public class Main {
	
	/**
	 * Print processed TLV on STDOUT.
	 * You should modify this method if your output is other than STDOUT.
	 * @param procesedTlv	Processed TLV which should be printed on output.
	 */
	public static void printProcessedTlv(String procesedTlv){
		System.out.println(procesedTlv);		
	}
	
	/**
	 * This method will process given input line
	 * @param line	Line from input which has to be processed.
	 */
	public static void processTlv(String line){		
		TlvProcesorUtility tlvProcesorUtility = new TlvProcesorUtility();
		ArrayList<String> tlvList = tlvProcesorUtility.getTlvList(line);
		ListIterator<String> tlvListIterator = tlvList.listIterator();
		while (tlvListIterator.hasNext()){
			String procesedTlv = tlvProcesorUtility.getProcessedTlv(tlvListIterator.next());
			printProcessedTlv(procesedTlv);
		}		
	}
		
	/**
	 * This is main method of TLV processor which read data from STDIN.
	 * This method will call processTlv() method for each line in input.
	 * You should modify this method if your input is other than STDIN. 
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {				
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			processTlv(scanner.next());
		}		
		scanner.close();
	}
	
}
