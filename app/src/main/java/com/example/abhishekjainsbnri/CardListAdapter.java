package com.example.abhishekjainsbnri;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.abhishekjainsbnri.dataclass.AllDetail;

import androidx.annotation.NonNull;
import androidx.paging.PagedListAdapter;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.DiffUtil;

public class CardListAdapter  extends PagedListAdapter<AllDetail,CardViewHolder> {

    Context context;

    public CardListAdapter(Context context){
        super(DIFF_CALLBACK);

        this.context=context;
    }

    private static DiffUtil.ItemCallback<AllDetail> DIFF_CALLBACK = new DiffUtil.ItemCallback<AllDetail>() {
        @Override
        public boolean areItemsTheSame(@NonNull AllDetail oldItem, @NonNull AllDetail newItem) {

            return oldItem.getName().equals(newItem.getName());
        }

        @Override
        public boolean areContentsTheSame(@NonNull AllDetail oldItem, @NonNull AllDetail newItem) {
            return oldItem.equals(newItem);
        }
    };


    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(context).inflate(R.layout.card_view, parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {


        AllDetail allDetail= getItem(position);
        if (allDetail != null) {
            holder.name.setText(allDetail.getName());
            if(allDetail.getDescription()!=null&&!allDetail.getDescription().equals("")){
                holder.des.setText(allDetail.getDescription());
            }else{
                holder.des.setText("N.A.");
            }
            holder.open_count.setText(""+allDetail.getOpen_issues_count());
            if(allDetail.getLicense()!=null&&allDetail.getLicense().getName()!=null&&!allDetail.getLicense().getName().equals("")){
                holder.lic.setText(allDetail.getLicense().getName());
            }else{
                holder.lic.setText("N.A.");
            }
            holder.ad.setText(covertBoolean(allDetail.getPermissions().getAdmin()));
            holder.push.setText(covertBoolean(allDetail.getPermissions().getPush()));
            holder.pull.setText(covertBoolean(allDetail.getPermissions().getPull()));



        }else{
            Toast.makeText(context, "Item is null", Toast.LENGTH_LONG).show();
        }
    }

    private String covertBoolean(Boolean b) {
        return b?"Granted":"Denied";
    }


    @Override
    public int getItemCount() {
        return super.getItemCount();
    }
}
