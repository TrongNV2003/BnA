package vn.edu.usth.moodle.mainHome.BookDetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import vn.edu.usth.moodle.Form.BorrowBooks;
import vn.edu.usth.moodle.Form.FormBooks;
import vn.edu.usth.moodle.R;

public class BookDetails extends AppCompatActivity {

    Button back, borrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_details);

        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        borrow = findViewById(R.id.borrowBtn);
        borrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookDetails.this, FormBooks.class);
                startActivity(intent);
            }
        });
    }
}