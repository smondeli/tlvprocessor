/**
 * 
 */
package tlvprocessor;

import java.util.ArrayList;

/**
 * @author Sreekanth Mondeli
 *
 */
public class TlvProcesorUtility {
	
	/**
	 * This method will prepare list of TLVs from given line.
	 * @param line	Each line from input
	 * @return		List of TLVs
	 */
	public ArrayList<String> getTlvList(String line){
		
		int tlvStartIndex = 0;
		int lineLength = line.length();
		ArrayList<String> tlvList = new ArrayList<String>();
		while (tlvStartIndex != lineLength){
			int tlvValueLengthStartIndex = tlvStartIndex+Tlv.TYPE_SIZE+1;
			int tlvValueLengthEndIndex = tlvValueLengthStartIndex+Tlv.LENGTH_SIZE;
			int tlvValueLength = Integer.parseInt(line.substring(tlvValueLengthStartIndex, tlvValueLengthEndIndex));
			int tlvEndIndex = tlvValueLengthEndIndex+tlvValueLength+1;
			tlvList.add(line.substring(tlvStartIndex, tlvEndIndex));
			tlvStartIndex = tlvEndIndex;
		}
		return tlvList;
	}
	
	/**
	 * This method will return processed TLV of unprocessed TLV
	 * @param unprocessedTlv	Unprocessed TLV
	 * @return					Processed TLV
	 */
	public String getProcessedTlv(String unprocessedTlv){
		
		String[] tlvTokens = unprocessedTlv.split("-");		
		Tlv tlv = new Tlv();
		tlv.setType(tlvTokens[0]);
		tlv.setLength(tlvTokens[1]);
		tlv.setValue(tlvTokens[2]);
		if (isValidType(tlv.getType())){
			Processor p = ProcessorFactory.getProcessor(tlv.getType());
			tlv.setValue(p.process(tlv.getValue()));
			return tlv.getType()+"-"+tlv.getValue();
		} else {
			return "Type not valid";
		}				
		
	}
	
	/**
	 * This method will validate type of TLV.
	 * @param type	Type of TLV processor.
	 * @return		This will return true if processor type is valid, otherwise return false.
	 */
	public boolean isValidType(String type){
		for (ProcessorType processorType : ProcessorType.values()){
			if (processorType.toString().equals(type)){
				return true;
			}
		}
		return false;		
	}

}
