package vn.edu.usth.moodle.mainHome;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;

import vn.edu.usth.moodle.R;

import vn.edu.usth.moodle.SignInUp.LoginActivity;

public class FragmentHomeActivity extends Fragment {

    private ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_discovery, container, false);

        String[] items = {"Suggestion", "New Specialized Book", "Textbook","Sci-fi Book", "DICTIONARY"};
        listView = (ListView)view.findViewById(R.id.list_view);
        tvAdapter adapter = new tvAdapter(getActivity(),items);
        listView.setAdapter(adapter);

        return view;
    }
}
