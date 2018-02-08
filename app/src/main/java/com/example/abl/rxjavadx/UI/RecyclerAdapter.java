package com.example.abl.rxjavadx.UI;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.abl.rxjavadx.R;

import java.util.List;

/**
 * Created by ABL on 05.02.2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.CustomViewHolder>  {

    private List<Item> feedItemList;
    private Context mContext;
    private ClickListener onItemClickListener;

    public RecyclerAdapter(Context context, List<Item> feedItemList) {
        this.feedItemList = feedItemList;
        this.mContext = context;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, null);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        view.setLayoutParams(lp);

        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder customViewHolder, int i) {
        final Item feedItem = feedItemList.get(i);



        //Setting text view title
        customViewHolder.textView.setText((feedItem.getName()));
        customViewHolder.tx2.setText((feedItem.getSnippet().getResponsibility()));
        customViewHolder.tx3.setText(feedItem.getArea().getName());
        customViewHolder.tx4.setText((feedItem.getEmployer().getName()));

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickListener.onItemClick(feedItem);
            }
        };

        customViewHolder.textView.setOnClickListener(listener);
        customViewHolder.tx2.setOnClickListener(listener);
        customViewHolder.tx3.setOnClickListener(listener);
        customViewHolder.tx4.setOnClickListener(listener);
    }

    @Override
    public int getItemCount() {
        return (null != feedItemList ? feedItemList.size() : 0);
    }


    class CustomViewHolder extends RecyclerView.ViewHolder {

        protected TextView textView,tx2,tx3,tx4;

        public CustomViewHolder(View view) {
            super(view);

            this.textView = view.findViewById(R.id.text_repo_name);
            this.tx2 =  view.findViewById(R.id.text_repo_description);
            this.tx3 = view.findViewById(R.id.text_language);
            this.tx4 =  view.findViewById(R.id.text_stars);
        }
    }


    public ClickListener getOnItemClickListener() {
        return onItemClickListener;
    }

    public void setOnItemClickListener(ClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }


}
