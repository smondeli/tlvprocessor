/**
 * 
 */
package tlvprocessor;

/**
 * @author Sreekanth Mondeli
 *
 */
public class Tlv {
	
	//Set size of type and length in TLV
	public static final int TYPE_SIZE = 6;
	public static final int LENGTH_SIZE = 4;
	
	private String type;
	private String length;
	private String value;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
