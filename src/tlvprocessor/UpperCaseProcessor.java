/**
 * 
 */
package tlvprocessor;

/**
 * @author Sreekanth Mondeli
 *
 */
public class UpperCaseProcessor implements Processor {

	/* (non-Javadoc)
	 * @see tlvprocessor.Processor#process(java.lang.String)
	 */
	@Override
	public String process(String value) {
		return value.toUpperCase();
	}

}
