package coloryourday.indie.com.app.base;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import coloryourday.indie.com.app.interfaces.OnRecyclerItemClickListener;

/**
 * Created by pauljohnparreno on 6/23/15.
 */
public class BaseViewHolder extends RecyclerView.ViewHolder {

    public OnRecyclerItemClickListener mOnItemClickListener;

    public BaseViewHolder(View itemView, OnRecyclerItemClickListener onItemClickListener) {
        super(itemView);
        mOnItemClickListener = onItemClickListener;
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mOnItemClickListener.onItemClick(v, BaseViewHolder.this.getLayoutPosition());
            }
        });

    }
}
