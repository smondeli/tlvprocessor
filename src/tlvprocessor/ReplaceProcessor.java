/**
 * 
 */
package tlvprocessor;

/**
 * @author Sreekanth Mondeli
 *
 */
public class ReplaceProcessor implements Processor {
	
	//Assign the value with which you like to replace value in TLV
	String value = "THIS STRING";
	
	/* (non-Javadoc)
	 * @see tlvprocessor.Processor#process(java.lang.String)
	 */
	@Override
	public String process(String value) {
		return this.value;
	}

}
