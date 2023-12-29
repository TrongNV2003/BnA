package vn.edu.usth.moodle.NavBottom.AccountFragmentInsider;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.graphics.Color;

import vn.edu.usth.moodle.R;

public class borrowAdapter extends BaseAdapter {

    private Activity activity;
    private String[] items;

    public borrowAdapter(Activity activity, String[] items){
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
        view = inflater.inflate(R.layout.list_book_status,null);
        TextView borrowItem = (TextView)view.findViewById(R.id.status);
        borrowItem.setText(items[i]);


        // Set text color based on status
        if ("Returned".equals(items[i])) {
            borrowItem.setTextColor(Color.RED);
        } else {
            // Set the default text color for other statuses
            borrowItem.setTextColor(Color.GREEN);
        }

        return view;

    }
}