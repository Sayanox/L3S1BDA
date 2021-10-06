package gdisk;

import java.nio.ByteBuffer;

public class Frame {
	private ByteBuffer buffer;
	private int PageId;
	private int pin_count;
	private boolean flag_dirty;
	public ByteBuffer getBuffer() {
		return buffer;
	}
	public void setBuffer(ByteBuffer buffer) {
		this.buffer = buffer;
	}
	public int getPageId() {
		return PageId;
	}
	public void setPageId(int pageId) {
		PageId = pageId;
	}
	public int getPin_count() {
		return pin_count;
	}
	public void setPin_count(int pin_count) {
		this.pin_count = pin_count;
	}
	public boolean isFlag_dirty() {
		return flag_dirty;
	}
	public void setFlag_dirty(boolean flag_dirty) {
		this.flag_dirty = flag_dirty;
	}

}
