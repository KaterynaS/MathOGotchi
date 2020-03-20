package tech.kateiana.mathogotchi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toolbar;

public class MathogotchiMainActivity extends ToolbarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathogotchi_main);
    }

    @Override
    public int getMenuResourceID() {
        return 0;
    }

}
