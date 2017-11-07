/**
 * 
 */
package tlvprocessor;

/**
 * @author Sreekanth Mondeli
 *
 */
public interface Processor {
	
	/**
	 * This method will process the value as per the processor type and return processed value.
	 * @param value	Unprocessed value
	 * @return		Processed value
	 */
	public String process(String value);

}
