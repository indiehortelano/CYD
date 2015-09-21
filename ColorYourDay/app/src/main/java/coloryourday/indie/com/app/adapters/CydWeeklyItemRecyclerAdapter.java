package coloryourday.indie.com.app.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import coloryourday.indie.com.app.R;
import coloryourday.indie.com.app.base.BaseRecyclerAdapter;
import coloryourday.indie.com.app.base.RecyclerViewable;
import coloryourday.indie.com.app.interfaces.OnRecyclerItemClickListener;
import coloryourday.indie.com.app.viewholders.WeeklyCalendarViewHolder;

/**
 * Created by ihortelano on 7/15/15.
 */
public abstract class CydWeeklyItemRecyclerAdapter<RecyclerViewable> extends BaseRecyclerAdapter implements OnRecyclerItemClickListener {

    public CydWeeklyItemRecyclerAdapter(ArrayList<RecyclerViewable> myDataset, Context context) {
        super(myDataset, context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflate the view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.weekly_layout, parent, false);

        // set the view's size, margins, paddings and layout parameters
        WeeklyCalendarViewHolder vh = new WeeklyCalendarViewHolder(v, this);
        return vh;
    }


}
