package javaTest;

public enum EnumTest {

	None(0),
	SnapChat(0x01);//bit 1 阅后即焚群
	
	private int value;
	private EnumTest(int value) {
		// TODO Auto-generated constructor stub
		this.value = value;
	}
	
	public int intValue() {
		// TODO Auto-generated method stub
		return this.value;
	}
}
