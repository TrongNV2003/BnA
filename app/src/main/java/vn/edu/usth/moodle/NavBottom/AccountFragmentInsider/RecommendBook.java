package vn.edu.usth.moodle.NavBottom.AccountFragmentInsider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import vn.edu.usth.moodle.R;

public class RecommendBook extends AppCompatActivity {

    Button back, send;
    EditText BookName, BookCategory, BookAuthor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend_book);

        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        BookName = findViewById(R.id.book_name);
        BookCategory = findViewById(R.id.book_category);
        BookAuthor = findViewById(R.id.book_author);
        send = findViewById(R.id.send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = BookName.getText().toString();
                String category = BookCategory.getText().toString();
                String author = BookAuthor.getText().toString();

                if (name.isEmpty() || category.isEmpty() || author.isEmpty()){
                    Toast.makeText(RecommendBook.this, "Please fill all these blanks", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}