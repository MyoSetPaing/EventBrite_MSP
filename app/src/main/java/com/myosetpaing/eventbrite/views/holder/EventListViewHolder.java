package com.myosetpaing.eventbrite.views.holder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.myosetpaing.eventbrite.delegates.EventDelegate;

public class EventListViewHolder extends RecyclerView.ViewHolder {
    private EventDelegate eventDelegate;

    public EventListViewHolder(@NonNull View itemView, @NonNull EventDelegate eventDelegate) {
        super(itemView);
        this.eventDelegate =eventDelegate;

    }
}
