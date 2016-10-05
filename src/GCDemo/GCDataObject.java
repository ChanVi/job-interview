package GCDemo;

public class GCDataObject {
	byte[] bytes = null;

	public GCDataObject(int i) {
		this.bytes = new byte[i*1024*1024];
	}
	
}
