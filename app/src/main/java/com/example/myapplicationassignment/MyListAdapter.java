package com.example.myapplicationassignment;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListAdapter  extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] maintitle1;
    private final String[] maintitle2;
    private final String[] maintitle3;
    private final String[] maintitle4;
    private final Integer[] imgid;

    public MyListAdapter(Activity context, String[] maintitle, String[] maintitlee, String[] maintitleee, String[] maintitleeee, Integer[] imgid) {
        super(context, R.layout.list_items, maintitle);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.maintitle1=maintitle;
        this.maintitle2=maintitlee;
        this.maintitle3=maintitleee;
        this.maintitle4=maintitleeee;
        this.imgid=imgid;

    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.list_items, null,true);

        TextView titleText1 = (TextView) rowView.findViewById(R.id.title1);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView titleText2 = (TextView) rowView.findViewById(R.id.title2);
        TextView titleText3 = (TextView) rowView.findViewById(R.id.title3);
        TextView titleText4 = (TextView) rowView.findViewById(R.id.title4);


        titleText1.setText(maintitle1[position]);
        titleText2.setText(maintitle2[position]);
        titleText3.setText(maintitle3[position]);
        titleText4.setText(maintitle4[position]);
        imageView.setImageResource(imgid[position]);

        return rowView;

    };
}