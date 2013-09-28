
public class Dog {
	private String bodyColor;
	private String eyeColor;
	private float height;																																										
	private float size;
	private float large;
	
	public void shakeTail(){
		System.out.println("Shaking tail...");
	}
	
	public void bark(){
		System.out.println("Uau uau uau...");
	}
	
	public void layDown(){
		System.out.println("Laying down...");
	}

	public void sit(){
		System.out.println("Sitting down...");
	}

	public String getBodyColor() {
		return bodyColor;
	}

	public void setBodyColor(String bodyColor) {
		this.bodyColor = bodyColor;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public float getLarge() {
		return large;
	}

	public void setLarge(float large) {
		this.large = large;
	}

}
