package ykt.ne_bezdari.yacluster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void Login (View v) {
        Intent Login = new Intent(this, Main.class);
        startActivity(Login);
        overridePendingTransition(0, 0);
    }
    public void Register (View v) {
        Intent Login = new Intent(this, Registration.class);
        startActivity(Login);
        overridePendingTransition(0, 0);
    }
}