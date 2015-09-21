package coloryourday.indie.com.app.viewholders;

import android.view.View;
import android.widget.TextView;

import coloryourday.indie.com.app.R;
import coloryourday.indie.com.app.base.BaseViewHolder;
import coloryourday.indie.com.app.interfaces.OnRecyclerItemClickListener;

/**
 * Created by ihortelano on 7/15/15.
 */
public class WeeklyCalendarViewHolder extends BaseViewHolder {

    public View mondayView;
    public View tuedayView;
    public View wednesdayView;
    public View thursdayView;
    public View fridayView;
    public View saturdayView;
    public View sundayView;

    public WeeklyCalendarViewHolder(View itemView, OnRecyclerItemClickListener onItemClickListener) {
        super(itemView, onItemClickListener);
        //this is the best place to define your views
        //weeklyText = (TextView) itemView.findViewById(R.id.textView);
        mondayView = itemView.findViewById(R.id.monday);
        tuedayView = itemView.findViewById(R.id.tuesday);
        wednesdayView = itemView.findViewById(R.id.wednesday);
        thursdayView = itemView.findViewById(R.id.thursday);
        fridayView = itemView.findViewById(R.id.friday);
        saturdayView = itemView.findViewById(R.id.saturday);
        sundayView = itemView.findViewById(R.id.sunday);
    }
}
