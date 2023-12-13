package vn.edu.usth.moodle.NavBottom.NotificationFragmentInsider;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import vn.edu.usth.moodle.R;
import vn.edu.usth.moodle.mainHome.tvAdapter;


public class NotificationFragment extends Fragment {
    private ListView listView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_nav_bottom_notification, container, false);
        String[] items = {
                "You have been submitted your report to BnA",
                "Your request to borrow book 'Tet o lang dia nguc' is successful",
                "You have been returned book 'Tet o lang dia nguc' to BnA",
                "Several books are updated in our list, Explore now"};
        listView = (ListView)view.findViewById(R.id.list_notification_view);
        notificationAdapter adapter = new notificationAdapter(getActivity(),items);
        listView.setAdapter(adapter);

        return view;

    }
}