/**
 * 
 */
package StevePinskiSmartCarLab1;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author spins
 *
 */
public class CommandCenter implements SelfCheckCapable {
	
	private Battery providesPower;
	private Camera createsImages;
	private Display mainDisplay;
	private Engine powersVehicle;
	private Sensor sensors;
	private GPSSensor gps;
	private LightSensor sensesLight;
	private LowBatterySensor sensesBatteryLevel;
	private ObjectSensor sensesObjects;
	
	
	public CommandCenter() {
		providesPower = new Battery();
		createsImages = new Camera();
		mainDisplay = new Display();
		powersVehicle = new Engine();
		gps = new GPSSensor();
		sensesObjects = new ObjectSensor();
		sensesBatteryLevel = new LowBatterySensor();
		sensesLight = new LightSensor();
		
		
		
		
	}
	
	
	private int size;
	
	public void toggleMainComponents() {
		System.out.println("components toggled");
		return;
	}
	
	public void read() {
		System.out.println("read command");
		return;
		
	}
	
	public void write() {
		System.out.println("write command");
		return;
		
	}
	
	public void commandDisplay() {
		System.out.println("control display");
		return;
		
	}
	
	public void commandCamera() {
		System.out.println("see camera");
		return;
		
	}
	
	public void commandSensor() {
		System.out.println("read sensor");
		return;
		
	}
	
	public void commandEngine() {
		System.out.println("tell engine");
		return;
		
	}
	
	public void showCameraFront() {
		System.out.println("front camera");
		return;
		
	}
	
	public void showCameraBack() {
		System.out.println("back camera");
		return;
		
	}
	
	public void showCameraOther() {
		System.out.println("right or left camera");
		return;
		
	}
	
	public void turnLeft() {
		System.out.println("left turn");
		return;
		
	}
	
	public void turnRight() {
		System.out.println("right turn");
		return;
		
	}
	
	public void goForward() {
		System.out.println("move forward");
		return;
		
	}
	
	public void goBack() {
		System.out.println("move back");
		return;
		
	}

	public void turnOnLight() {
		System.out.println("lights on");
		return;
		
	}
	
	public void turnOffLight() {
		System.out.println("lights off");
		return;
		
	}
	
	public void pushToStartCar() {
		System.out.println("start car");
		return;
		
	}
	
	public void initiateAutoDrive() {
		System.out.println("autodrive initiated");
		return;
		
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CommandCenter myCommandCenter = new CommandCenter();
		myCommandCenter.runSelfCheck();
		// TODO Auto-generated method stub

	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "My Command Center";
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
