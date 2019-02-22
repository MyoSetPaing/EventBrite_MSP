package com.myosetpaing.eventbrite.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myosetpaing.eventbrite.R;
import com.myosetpaing.eventbrite.delegates.EventDelegate;
import com.myosetpaing.eventbrite.views.holder.EventListViewHolder;

public class EventListRecyclerViewAdapter extends RecyclerView.Adapter {

    private EventDelegate eventDelegate;

    public EventListRecyclerViewAdapter(EventDelegate eventDelegate) {
        this.eventDelegate = eventDelegate;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        LayoutInflater layoutInflater=LayoutInflater.from(viewGroup.getContext());
        View itemView=layoutInflater.inflate(R.layout.view_event_list_item,viewGroup,false);
        return new EventListViewHolder(itemView,eventDelegate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
