package com.myosetpaing.eventbrite.activities;

import android.support.design.bottomappbar.BottomAppBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import com.myosetpaing.eventbrite.R;
import com.myosetpaing.eventbrite.adapters.EventListRecyclerViewAdapter;
import com.myosetpaing.eventbrite.delegates.EventDelegate;

public class MainActivity extends AppCompatActivity implements EventDelegate {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

       /* BottomAppBar bab = findViewById(R.id.bab);
        bab.replaceMenu(R.menu.menu_main);

*/
        RecyclerView recyclerView=findViewById(R.id.rv_event_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL, false));
        EventListRecyclerViewAdapter adapter=new EventListRecyclerViewAdapter(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onTapEventsItem() {

    }
}
