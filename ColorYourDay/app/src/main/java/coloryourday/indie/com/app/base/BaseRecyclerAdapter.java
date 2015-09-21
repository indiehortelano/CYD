package coloryourday.indie.com.app.base;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

import java.util.ArrayList;

public abstract class BaseRecyclerAdapter<RecyclerViewable> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    protected ArrayList<RecyclerViewable> mDataset;

    protected Context mContext;
    protected LayoutInflater inflater;

    // Provide a suitable constructor (depends on the kind of dataset)
    public BaseRecyclerAdapter(ArrayList<RecyclerViewable> myDataset, Context context) {
        mDataset = myDataset;
        mContext = context;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    public void add(int position, RecyclerViewable item) {
        mDataset.add(position, item);
        notifyItemInserted(position);
    }

    public void remove(String item) {
        int position = mDataset.indexOf(item);
        mDataset.remove(position);
        notifyItemRemoved(position);
    }




    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        RecyclerViewModel recyclerViewModel = (RecyclerViewModel) mDataset.get(position);

        recyclerViewModel.onBindViewHolder(holder, position, inflater);


    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }



}