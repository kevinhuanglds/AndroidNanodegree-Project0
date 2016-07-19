package tw.com.ischool.myappportfolio;

import android.app.ActionBar;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Hide status bar
        if (Build.VERSION.SDK_INT < 16) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
        else {
            View decorView = getWindow().getDecorView();

            int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN ;
            decorView.setSystemUiVisibility(uiOptions);
        }


        setContentView(R.layout.activity_main);

    }

    View.OnClickListener showApp2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };

    protected void showApp(View v) {
        Button btn = (Button)v ;
        String msg = String.format("This button will launch my %s app!", btn.getText());
        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
    }
}
