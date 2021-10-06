package gdisk;
import java.nio.ByteBuffer;
import java.io.IOException;
import java.io.RandomAccessFile;

public class BufferManager {
	
	 private static BufferManager instance;
	 private static Frame[] cases;
	    public String value;

	    private BufferManager(String value) {
	        // The following code emulates slow initialization.
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException ex) {
	            ex.printStackTrace();
	        }
	        this.value = value;
	    }

	    public static BufferManager getInstance(String value) {
	        if (instance == null) {
	            instance = new BufferManager(value);
	        }
	        return instance;
	    }
	
	public ByteBuffer GetPage(PageId pageId) {
		//faire un for qui regarde si une farme a cette page ouverte et ultiliser pour la suite
		cases[0].setPin_count(cases[0].getPin_count() + 1);
		DiskManager.ReadPage(pageId, cases[0].getBuffer());
		return cases[0].getBuffer();
	}
	public void FreePage (PageId pageId,boolean valdirty) throws IOException {
		cases[0].setFlag_dirty(valdirty);
		cases[0].setPin_count(cases[0].getPin_count() - 1);
		
	}
	public void FlushAll () {
		
	}

}
