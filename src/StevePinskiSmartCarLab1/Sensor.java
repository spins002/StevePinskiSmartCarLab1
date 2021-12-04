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
public abstract class Sensor implements SelfCheckCapable {
	
	private int size;
	
	private String material;

		
	public void sendData() {
		System.out.println("data sent");
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
		return "My Sensors";
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}


}
