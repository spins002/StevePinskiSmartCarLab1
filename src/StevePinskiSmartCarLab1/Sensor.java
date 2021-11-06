/**
 * 
 */
package StevePinskiSmartCarLab1;

/**
 * @author spins
 *
 */
public abstract class Sensor {
	
	private int size;
	
	private String material;
	
	public void measureDistance() {
		System.out.println("distance measured");
		return;
		
	}
	
	public void captureLocation() {
		System.out.println("location captured");
		return;
		
	}
	
	public void detectObject() {
		System.out.println("object detected");
		return;
		
	}
	
	public void sendData() {
		System.out.println("data sent");
		return;
			
	}
	

}
