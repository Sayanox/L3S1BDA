package CODE;

import java.util.*;
import java.nio.ByteBuffer;

public class Record {
	private RelationInfo relInfo;
	private List<String> values;
	
	public Record(RelationInfo rI) {
		
	}
	
	public void writeToBuffer(ByteBuffer buff, int position) {
		buff.position(position);
		buff.mark();
		for (String s : values) {
			//buff.put(s); // convert string to byte !
		}
		buff.rewind();
		
		
	}
	
	public void readFromBuffer(ByteBuffer buff, int position) {
		for (String s : values) {
			buff.get(position);
		}
	}

}