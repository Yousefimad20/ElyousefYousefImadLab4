package samplecalculator.sample.com.toast_yousef;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonToast = (Button)findViewById(R.id.buttonToast);
        final Button SBbutton = (Button)findViewById(R.id.SBbutton);
        Button SBWAButton = (Button)findViewById(R.id.SBWAbutton);

        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String message = "TOAST!";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(getApplicationContext(), message, duration).show();
            }
        });
        SBbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View viewl = findViewById(R.id.ViewMe);
                String message = "Snackbar message";
                int duration = Snackbar.LENGTH_SHORT;

                showSnackbar(view, message, duration);
            }
        });

        SBWAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View viewl = findViewById(R.id.ViewMe);
                String message = "Snackbar message with action";
                int duration = Snackbar.LENGTH_SHORT;

                showSnackbarAct(viewl, message, duration);
            }
        });


    }
    public void showSnackbar(View viewl, String message, int duration)
    {
        Snackbar.make(viewl, message, duration).show();
    }

    public void showSnackbarAct(View viewl, String message, int duration)
    {
        final Snackbar snackbar = Snackbar.make(viewl, message, duration);
        snackbar.setAction("DISMISS", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                snackbar.dismiss();
            }
        });

        snackbar.show();
    }
}
