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
public class Display implements SelfCheckCapable {

	private double screen;
	
	private int size;
	
	private String color;
	
	public Display() {
		
	}
	
	public void touchCapability() {
		System.out.println("touch screen active");
		return;
		
	}
	
	public void voiceRecognition() {
		System.out.println("voice recognized");
		return;
		
	}
	
	public void listen() {
		System.out.println("listening to commands");
		return;
		
	}
	
	public void tellCommandCenter() {
		System.out.println("command center ready");
		return;
		
	}
	
	public void showNavigation() {
		System.out.println("show directions");
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
			return "My Display";
		}

		@Override
		public boolean runSelfCheck() {
			// TODO Auto-generated method stub
			return SelfCheckUtils.basicSelfCheckRunner(this);
		}
		
}
