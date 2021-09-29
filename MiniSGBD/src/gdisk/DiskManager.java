package gdisk;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;

public class DiskManager {
	public PageId AllocPage() {
		PageId NewID = new PageId();
		NewID.setFileIdx(0);
		NewID.setPageIdx(0);
		return null;
	}
	public void ReadPage(PageId page, ByteBuffer buff) {
		String filepath = dbparams.DBPath + "\\f"+page.getFileIdx()+".txt";
		try {
			RandomAccessFile file = new RandomAccessFile(filepath, "r");
			file.seek(dbparams.pageSize * page.getPageIdx());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void Writepage(PageId page, ByteBuffer buff) {
		String filepath = dbparams.DBPath + "\\f"+page.getFileIdx()+".txt";
		try {
			RandomAccessFile file = new RandomAccessFile(filepath, "r");
			file.seek(dbparams.pageSize * page.getPageIdx());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
