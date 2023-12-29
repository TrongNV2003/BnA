package vn.edu.usth.moodle.Form;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import vn.edu.usth.moodle.R;

public class ExtendBooks extends AppCompatActivity {

    AppCompatButton submit;

    EditText BookId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_extend_books);

        Button back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        BookId = findViewById(R.id.book_id);
        submit = findViewById(R.id.submit_form);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = BookId.getText().toString();


                if (id.isEmpty() ){
                    Toast.makeText(ExtendBooks.this, "Please fill all these blanks", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}