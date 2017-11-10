package com.example.lenovo.theone;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.Toast;

/**
 * Created by Lenovo on 2017/11/10.
 */

public class Login extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Button btnLogin = (Button)findViewById(R.id.btn_login);
        Button btnCreate = (Button)findViewById(R.id.btn_create) ;
        public boolean OnClickListener(new View.OnClickListener() {
            public void onClick (View v){
                switch (v.getId()) {
                    case R.id.btn_login:
                        Intent intent = new Intent(Login.this, MainActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.btn_create:
                        Intent intent1 = new Intent(Login.this, SignUp.class);
                        startActivity(intent1);
                        break;
                    default:
                }
            }
            return tru
        });

    }
}
