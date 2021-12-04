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
public class Engine implements SelfCheckCapable {
	
	private int size;
	
	private int quantity;
	
	private String intake;
	
	public Engine() {
		
	}
	
	public void turnOn() {
		System.out.println("engine on");
		return;
		
	}
	
	public void turnOff() {
		System.out.println("engine off");
		return;
		
	}
	
	public void accelerate() {
		System.out.println("give power to wheels");
		return;
		
	}
	
	public void regenBrake() {
		System.out.println("power transfer/save mode");
		return;
		
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "My Engine";
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

	
}
