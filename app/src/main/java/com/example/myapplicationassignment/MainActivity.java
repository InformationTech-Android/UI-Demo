package com.example.myapplicationassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView list;

    String[] maintitle1 ={
            "IND vs AUS","IND vs NZ",
            "IND vs PAK","IND vs WI",
            "IND vs ENG",
    };

    String[] maintitle2 ={
            "Alice","Varun",
            "Geeta","Aman",
            "Puneet",
    };
    String[] maintitle3 ={
            "1","2",
            "4","3",
            "3",
    };
    String[] maintitle4 ={
            "2","2",
            "3","4",
            "5",
    };

    Integer[] imgid={
            R.drawable.man,R.drawable.man,
            R.drawable.girl,R.drawable.man,
            R.drawable.girl,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyListAdapter adapter=new MyListAdapter(this, maintitle1, maintitle2,maintitle3,maintitle4,imgid);
        list=(ListView)findViewById(R.id.listView);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub
                if(position == 0) {
                    //code specific to first list item
                    Toast.makeText(getApplicationContext(),"First",Toast.LENGTH_SHORT).show();
                }

                else if(position == 1) {
                    //code specific to 2nd list item
                    Toast.makeText(getApplicationContext(),"Second ",Toast.LENGTH_SHORT).show();
                }

                else if(position == 2) {

                    Toast.makeText(getApplicationContext(),"Third",Toast.LENGTH_SHORT).show();
                }
                else if(position == 3) {

                    Toast.makeText(getApplicationContext()," Forth",Toast.LENGTH_SHORT).show();
                }
                else if(position == 4) {

                    Toast.makeText(getApplicationContext(),"Fifth ",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}