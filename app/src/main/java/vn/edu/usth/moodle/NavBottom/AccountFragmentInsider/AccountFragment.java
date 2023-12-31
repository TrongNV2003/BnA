package vn.edu.usth.moodle.NavBottom.AccountFragmentInsider;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import vn.edu.usth.moodle.Form.FormBooks;
import vn.edu.usth.moodle.R;


public class AccountFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_nav_bottom_account, container, false);

        View recommend = view.findViewById(R.id.recommend_book);
        recommend.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RecommendBook.class);
                startActivity(intent);
            }
        });


        Button borrow = view.findViewById(R.id.borrow_detail);
        borrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BorrowStatus.class);
                startActivity(intent);
            }
        });


        return view;
    }
}