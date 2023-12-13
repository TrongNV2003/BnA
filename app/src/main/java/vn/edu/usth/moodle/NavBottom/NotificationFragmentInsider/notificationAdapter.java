package vn.edu.usth.moodle.NavBottom.NotificationFragmentInsider;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import vn.edu.usth.moodle.R;

public class notificationAdapter extends BaseAdapter {

    private Activity activity;
    private String[] items;

    public notificationAdapter(Activity activity, String[] items){
        this.activity = activity;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = activity.getLayoutInflater();
        view = inflater.inflate(R.layout.list_notification,null);
        TextView tvItem = (TextView)view.findViewById(R.id.list_noti);
        tvItem.setText(items[i]);

        return view;
    }
}