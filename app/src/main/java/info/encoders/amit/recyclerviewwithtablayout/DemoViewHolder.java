package info.encoders.amit.recyclerviewwithtablayout;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Admin on 13-09-2017.
 */

public abstract class DemoViewHolder extends RecyclerView.ViewHolder {


    public TextView title;


    public DemoViewHolder(View view) {
        super(view);


        this.title = (TextView) view.findViewById(R.id.cardTitle);

    }





}
