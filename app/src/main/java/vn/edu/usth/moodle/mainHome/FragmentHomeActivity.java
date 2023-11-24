package vn.edu.usth.moodle.mainHome;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;

import vn.edu.usth.moodle.R;
import vn.edu.usth.moodle.Sidebar.NavFile.NavFileActivity;
import vn.edu.usth.moodle.SignInUp.LoginActivity;

public class FragmentHomeActivity extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_discovery, container, false);

        CardView book1 = view.findViewById(R.id.book1);
        book1.setOnClickListener(view1 -> {
            Intent intent = new Intent(getActivity(), ActivityHome.class);
            startActivity(intent);
        });
        return view;
    }
}
