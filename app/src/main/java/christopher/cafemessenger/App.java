package christopher.cafemessenger;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by user on 15/08/15.
 */
public class App extends Application {

    @Override public void onCreate(){
        super.onCreate();

        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "Your-Application-ID", "Your-Client-Key");

    }
}
