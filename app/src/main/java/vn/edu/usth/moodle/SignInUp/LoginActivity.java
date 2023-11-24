package vn.edu.usth.moodle.SignInUp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import vn.edu.usth.moodle.MainActivity;
import vn.edu.usth.moodle.R;

public class LoginActivity extends AppCompatActivity {

    EditText username, password;
    Button login, signup, google;
    FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.username1);
        password = findViewById(R.id.password1);
        signup = findViewById(R.id.signup1);
        login = findViewById(R.id.signin1);

        mAuth = FirebaseAuth.getInstance();

        login.setOnClickListener(view -> {
            String user = username.getText().toString();
            String pass = password.getText().toString();

            if(TextUtils.isEmpty(user) || TextUtils.isEmpty(pass))
                Toast.makeText(LoginActivity.this, "Required an account", Toast.LENGTH_SHORT).show();
            else{
                mAuth.signInWithEmailAndPassword(user, pass)
                        .addOnCompleteListener( new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(LoginActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                                    startActivity(intent);
                                    finish();
                                } else {
                                    // If sign in fails, display a message to the user.
                                    Toast.makeText(LoginActivity.this, "Password is incorrect.",
                                            Toast.LENGTH_SHORT).show();

                                }
                            }
                        });
            }
        });
        signup.setOnClickListener(view -> {
            Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
            startActivity(intent);
            finish();
        });

    }
}
