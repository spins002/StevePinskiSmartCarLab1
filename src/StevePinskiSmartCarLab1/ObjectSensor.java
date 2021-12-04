/**
 * 
 */
package StevePinskiSmartCarLab1;

/**
 * @author spins
 *
 */
public class ObjectSensor extends Sensor {


	public ObjectSensor() {
		
	}
	
	@Override
	public void sendData() {
		// TODO Auto-generated method stub
		super.sendData();
	}

	public void measureDistance() {
		System.out.println("distance measured");
		return;
	}
	
	public void detectObject() {
		System.out.println("object detected");
		return;
		
	}
	
}
