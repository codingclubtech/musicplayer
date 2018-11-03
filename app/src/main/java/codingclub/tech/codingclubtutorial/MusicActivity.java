package codingclub.tech.codingclubtutorial;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MusicActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Show this layout that i am passing to you
        setContentView(R.layout.activity_main_music);
    }
}
