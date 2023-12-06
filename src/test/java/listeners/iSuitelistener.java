package listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class iSuitelistener implements ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub

		System.out.println("Suite is started :" + suite.getName());

	}

	@Override
	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		
		System.out.println("Suite is ended");

	}

}
