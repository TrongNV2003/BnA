package vn.edu.usth.moodle.NavBottom;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import vn.edu.usth.moodle.NavBottom.AccountFragmentInsider.ReportBook;
import vn.edu.usth.moodle.R;


public class AccountFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_nav_bottom_account, container, false);

        View report = view.findViewById(R.id.report_book);
        report.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ReportBook.class);
                startActivity(intent);
            }
        });
        return view;
    }
}