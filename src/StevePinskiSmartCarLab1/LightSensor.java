/**
 * 
 */
package StevePinskiSmartCarLab1;

/**
 * @author spins
 *
 */
public class LightSensor extends Sensor {

	@Override
	public void measureDistance() {
		// TODO Auto-generated method stub
		super.measureDistance();
	}

	@Override
	public void captureLocation() {
		// TODO Auto-generated method stub
		super.captureLocation();
	}

	@Override
	public void detectObject() {
		// TODO Auto-generated method stub
		super.detectObject();
	}

	@Override
	public void sendData() {
		// TODO Auto-generated method stub
		super.sendData();
	}

	public void identifyLight() {
		System.out.println("light identified");
		return;
		
	}
	
	public void identifyDarkness() {
		System.out.println("darkness identified");
		return;
		
	}
	
	public void tellCommandCenterTurnOnLight() {
		System.out.println("light on");
		return;
		
	}
	
	public void tellCommandCenterTurnOffLight() {
		System.out.println("light off");
		return;
		
	}
	
}
