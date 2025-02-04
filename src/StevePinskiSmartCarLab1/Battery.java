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
public class Battery implements SelfCheckCapable {

	private int size;
	
	private double capacity;
	
	public Battery() {
		
	}
	
	public void maxBatteryPercentage() {
		System.out.println("100%");
		return;
		
	}
	
	public void minBatteryPercentage() {
		System.out.println("0%");
		return;
		
	}
	
	public void givePower() {
		System.out.println("power supplied");
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
		return "My Battery";
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

	
}
