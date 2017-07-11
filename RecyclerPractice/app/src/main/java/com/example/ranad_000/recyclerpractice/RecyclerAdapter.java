package com.example.ranad_000.recyclerpractice;



//import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ranad_000 on 7/11/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{

    private String[] titles = {"Chest Workout",
            "Arm Workout",
            "Leg Workout",
            "Shoulder Workout",
            "Core Workout",
            "Body Weight Workout",
            "Crossfit Workout",
            "Coming Soon"};

    private String[] details = {"Click for a chest workout guide",
            "Click for a arm workout guide", "Click for a leg workout guide",
            "Click for a shoulder workout guide", "Click for a core workout guide",
            "Click for a body weight workout guide", "Click for a crossfit workout guide",
            "Comming Soon"};

    private int[] images = { R.drawable.octocat,
            R.drawable.octocat,
            R.drawable.octocat,
            R.drawable.octocat,
            R.drawable.octocat,
            R.drawable.octocat,
            R.drawable.octocat,
            R.drawable.octocat };

    class ViewHolder extends RecyclerView.ViewHolder{

        public int currentItem;
        public ImageView itemImage;
        public TextView itemTitle;
        public TextView itemDetail;

        public ViewHolder(View itemView) {
            super(itemView);
            itemImage = (ImageView)itemView.findViewById(R.id.item_image);
            itemTitle = (TextView)itemView.findViewById(R.id.item_title);
            itemDetail =
                    (TextView)itemView.findViewById(R.id.item_detail);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    int position = getAdapterPosition();
/*
                    Snackbar.make(v, "Click detected on item " + position,
                            Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
*/
                }
            });
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cardlayout, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.itemTitle.setText(titles[i]);
        viewHolder.itemDetail.setText(details[i]);
        viewHolder.itemImage.setImageResource(images[i]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}