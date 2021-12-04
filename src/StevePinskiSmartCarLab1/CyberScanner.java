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
public class CyberScanner implements SelfCheckCapable {

	
	public CyberScanner() {
		
	}
	
	public void scanNetwork() {
		System.out.println("Scanning Network");
		return;
	}
	
	public void detectIntruder() {
		System.out.println("Searching For Intruders");
		return;
	
	}
	
	public void alertIfIntruderFound() {
		System.out.println("Intruder Found!");
		return;
		
	}
	
	public void clearSystemGo() {
		System.out.println("Safe To Start Auto Features");
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
		return "My Cyber Scanner";
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}


}

