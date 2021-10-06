package gdisk;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;

public class DiskManager {
	public static PageId AllocPage() {
		if(dbparams.currPage == dbparams.pageSize) {
			dbparams.currPage = 1;
			dbparams.currFile++;
			//make a file
		}else {
			dbparams.currPage++;
		}
		PageId NewID = new PageId();
		NewID.setFileIdx(dbparams.currFile);
		NewID.setPageIdx(dbparams.currPage);
		return NewID;
	}
	public static void ReadPage(PageId page, ByteBuffer buff) {
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
	public static void Writepage(PageId page, ByteBuffer buff) {
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
