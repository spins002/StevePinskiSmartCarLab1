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
public class Camera implements SelfCheckCapable {
	
	private String lens;
	
	private int size;
	
	public Camera() {
		
	}
	
	public void realizeObject() {
		System.out.println("object realized");
		return;
		
	}
	
	public void takePicture() {
		System.out.println("picture taken");
		return;
		
	}
	
	public void takeVideo() {
		System.out.println("video taken");
		return;
		
	}
	
	public void record() {
		System.out.println("audio and sound recorded");
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
		return "My Camera";
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}


}
