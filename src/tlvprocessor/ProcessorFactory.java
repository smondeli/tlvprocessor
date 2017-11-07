/**
 * 
 */
package tlvprocessor;

/**
 * @author Sreekanth Mondeli
 *
 */
public class ProcessorFactory {
	
	/**
	 * This is a factory method which will return Processor object for a given processor type.
	 * When ever we introduce new processor type, we should update this method to return object of newly added type.
	 * This will return null if processor doesn't exist for given processor type. 
	 * @param type 	Processor type
	 * @return		Processor object
	 */
	public static Processor getProcessor(String type){
		
		if (ProcessorType.UPPRCS.toString().equals(type))
			return new UpperCaseProcessor();
		else if (ProcessorType.REPLCE.toString().equals(type))
			return new ReplaceProcessor();
		else
			return null;
		}

}
