package d.com.alticeacademy.android_basico_practica_3;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        DisplayMetrics metrics = new DisplayMetrics();
//        getWindowManager().getDefaultDisplay().getMetrics(metrics);
//        int width = metrics.widthPixels; // ancho absoluto en pixels
//        int height = metrics.heightPixels; // alto absoluto en pixels
//
//        float density = getResources().getDisplayMetrics().densityDpi;
        int width = this.getResources().getConfiguration().screenWidthDp;
        int height = this.getResources().getConfiguration().screenHeightDp;
        Log.i("ancho : ", String.valueOf(width));
        Log.i("altura : ", String.valueOf(height));
//        Log.i("density : ", String.valueOf(density));
    }
}
