package at.fhooe.mc.android;

import android.app.Application;
import android.test.ApplicationTestCase;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
		Log.d("New line!", "Git Test");
    }

    public void thisIsANewMethod() {
	Log.d("New line!", "In Methode.");
	int variable = 5;
    }
	
	public void AnotherNewMethod() {
	Log.d("New Method!", "In Methode.");
    }
}