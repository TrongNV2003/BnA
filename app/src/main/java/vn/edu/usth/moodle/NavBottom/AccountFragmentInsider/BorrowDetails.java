package vn.edu.usth.moodle.NavBottom.AccountFragmentInsider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import vn.edu.usth.moodle.R;
import vn.edu.usth.moodle.mainHome.tvAdapter;

public class BorrowDetails extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_borrow_details);

        Button back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        String[] items = {"Borrowing", "Returned", "Returned","Borrowing"};
        listView = findViewById(R.id.list_borrow_view);
        borrowAdapter adapter = new borrowAdapter(BorrowDetails.this,items);
        listView.setAdapter(adapter);

    }
}