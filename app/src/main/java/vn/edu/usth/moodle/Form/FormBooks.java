package vn.edu.usth.moodle.Form;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import vn.edu.usth.moodle.R;

public class FormBooks extends AppCompatActivity {

    EditText UserName, UserEmail, UserPhone;
    AppCompatButton submit;

    RadioButton BorrowBook, RenewBook, ReturnBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_books);

        Button back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        UserName = findViewById(R.id.person_name);
        UserEmail = findViewById(R.id.person_email);
        UserPhone = findViewById(R.id.person_phone);


        BorrowBook = findViewById(R.id.borrow_book);
        RenewBook = findViewById(R.id.extend_book);
        ReturnBook = findViewById(R.id.return_book);

        submit = findViewById(R.id.submit_form);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = UserName.getText().toString();
                String email = UserEmail.getText().toString();
                String phone = UserPhone.getText().toString();


                if (name.isEmpty() || email.isEmpty() || phone.isEmpty()){
                    Toast.makeText(FormBooks.this, "Please fill all these blanks", Toast.LENGTH_SHORT).show();
                }

                if (BorrowBook.isChecked()){
                    Intent intent = new Intent(FormBooks.this, BorrowBooks.class);
                    startActivity(intent);
                }

                if (RenewBook.isChecked()){
                    Intent intent = new Intent(FormBooks.this, RenewBooks.class);
                    startActivity(intent);
                }

                if (ReturnBook.isChecked()){
                    Intent intent = new Intent(FormBooks.this, ReturnBooks.class);
                    startActivity(intent);
                }
            }
        });


    }
}