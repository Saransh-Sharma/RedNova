package saransh1337.rednova;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount=0;
    private TextView mShowCount;

    //todo 01: orientation change resets counter - fix this
    //todo 02: landscape layout needs to be made. The current one cuts the counter on some screens
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MainActivity", "Red nova here !");
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);

    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT);
        mCount=0;
        if(mShowCount!=null) {
            mShowCount.setText(Integer.toString(mCount));
        }
        toast.show();
    }

    public void countUp(View view) {


        mCount++;
        if(mShowCount!=null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}
