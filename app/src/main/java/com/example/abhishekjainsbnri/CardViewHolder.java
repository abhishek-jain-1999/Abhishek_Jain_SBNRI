package com.example.abhishekjainsbnri;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CardViewHolder extends RecyclerView.ViewHolder {

    public TextView name,des,open_count,lic,ad,push,pull;

    public CardViewHolder(@NonNull View itemView) {
        super(itemView);
        name=(TextView) itemView.findViewById(R.id.name);
        des=(TextView) itemView.findViewById(R.id.des_view);
        open_count=(TextView) itemView.findViewById(R.id.c_view);
        lic=(TextView) itemView.findViewById(R.id.l_view);
        ad=(TextView) itemView.findViewById(R.id.ad_view);
        pull=(TextView) itemView.findViewById(R.id.pull_view);
        push=(TextView) itemView.findViewById(R.id.push_view);

    }
}
