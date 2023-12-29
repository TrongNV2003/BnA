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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import vn.edu.usth.moodle.R;

import vn.edu.usth.moodle.SignInUp.LoginActivity;
import vn.edu.usth.moodle.mainHome.RecentsData.RecentsData;
import vn.edu.usth.moodle.mainHome.RecentsData.ScienceBookData;
import vn.edu.usth.moodle.mainHome.RecentsData.SpecializedBookData;
import vn.edu.usth.moodle.mainHome.adapter.RecentsAdapter;
import vn.edu.usth.moodle.mainHome.adapter.ScienceBookAdapter;
import vn.edu.usth.moodle.mainHome.adapter.SpecializedBookAdapter;

public class FragmentHomeActivity extends Fragment {


    RecyclerView recentRecycler, specializedBookRecycler, scienceBookRecycler;
    RecentsAdapter recentsAdapter;

    SpecializedBookAdapter specializedBookAdapter;

    ScienceBookAdapter scienceBookAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_discovery, container, false);

// suggestion book
        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData("Tết ở làng địa ngục",R.drawable.tet_o_lang_dia_nguc));
        recentsDataList.add(new RecentsData("Luật tâm thức",R.drawable.bna_logo));
        recentsDataList.add(new RecentsData("Cha giàu, cha nghèo",R.drawable.tet_o_lang_dia_nguc));
        recentsDataList.add(new RecentsData("Đắc nhân tâm",R.drawable.tet_o_lang_dia_nguc));
        setRecentRecycler(recentsDataList, view);

// New specialized book
        List<SpecializedBookData> specializedBookDataList = new ArrayList<>();
        specializedBookDataList.add(new SpecializedBookData("Tết ở làng địa ngục",R.drawable.tet_o_lang_dia_nguc));
        specializedBookDataList.add(new SpecializedBookData("Luật tâm thức",R.drawable.bna_logo));
        specializedBookDataList.add(new SpecializedBookData("Cha giàu, cha nghèo",R.drawable.tet_o_lang_dia_nguc));
        specializedBookDataList.add(new SpecializedBookData("Đắc nhân tâm",R.drawable.tet_o_lang_dia_nguc));
        setSpecializedBookRecycler(specializedBookDataList, view);

// Science book
        List<ScienceBookData> scienceBookDataList = new ArrayList<>();
        scienceBookDataList.add(new ScienceBookData("Tết ở làng địa ngục",R.drawable.tet_o_lang_dia_nguc));
        scienceBookDataList.add(new ScienceBookData("Luật tâm thức",R.drawable.bna_logo));
        scienceBookDataList.add(new ScienceBookData("Cha giàu, cha nghèo",R.drawable.tet_o_lang_dia_nguc));
        scienceBookDataList.add(new ScienceBookData("Đắc nhân tâm",R.drawable.tet_o_lang_dia_nguc));
        setScienceBookRecycler(scienceBookDataList, view);

        return view;
    }

    private void setScienceBookRecycler(List<ScienceBookData> scienceBookDataList, View view) {
        scienceBookRecycler = view.findViewById(R.id.science_book_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);
        scienceBookRecycler.setLayoutManager(layoutManager);
        scienceBookAdapter = new ScienceBookAdapter(getContext(), scienceBookDataList);
        scienceBookRecycler.setAdapter(scienceBookAdapter);
    }

    private void setSpecializedBookRecycler(List<SpecializedBookData> specializedBookDataList, View view) {
        specializedBookRecycler = view.findViewById(R.id.specialized_book_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);
        specializedBookRecycler.setLayoutManager(layoutManager);
        specializedBookAdapter = new SpecializedBookAdapter(getContext(), specializedBookDataList);
        specializedBookRecycler.setAdapter(specializedBookAdapter);
    }

    private void setRecentRecycler(List<RecentsData> recentsDataList, View view) {
        recentRecycler = view.findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsAdapter = new RecentsAdapter(getContext(), recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);
    }
}
