package ykt.ne_bezdari.yacluster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }
    public void Register_complete (View v) {
        Intent Register_complete = new Intent(this, Main.class);
        startActivity(Register_complete);
        overridePendingTransition(0, 0);
    }
}