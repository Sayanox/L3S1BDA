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
		buff.put((byte)values);
		buff.rewind();
		
		
	}
	
	public void readFromBuffer(ByteBuffer buff, int position) {
		byte value = buff.get(position);
	}

}
