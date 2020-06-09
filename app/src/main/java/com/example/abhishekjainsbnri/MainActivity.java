package com.example.abhishekjainsbnri;

import android.os.Bundle;
import android.util.Log;

import com.example.abhishekjainsbnri.dataclass.AllDetail;
import com.example.abhishekjainsbnri.dataholder.AllDetailTableData;
import com.example.abhishekjainsbnri.dataholder.MainDAO;
import com.example.abhishekjainsbnri.dataholder.MainDatabase;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity  {

    @BindView(R.id.r_view)
    RecyclerView rView;
    private MainDatabase dataBase;
    private MainDAO mainDAO;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        rView.setLayoutManager(new LinearLayoutManager(this));
        rView.setHasFixedSize(true);

        dataBase = MainDatabase.getDb(this);
        mainDAO = dataBase.getTodoDao();
        MainDatabase.setContext(this);

        //CardRepository cardRepository= ViewModelProviders.of(this).get(CardRepository.class);

        CardViewModel cardViewModel= ViewModelProviders.of(this).get(CardViewModel.class);

        final CardListAdapter cardListAdapter= new CardListAdapter(this);

        /*cardRepository.pagedList.observe(this, new Observer<PagedList<AllDetail>>() {
            @Override
            public void onChanged(PagedList<AllDetail> allDetails) {
                cardListAdapter.submitList(allDetails);
            }
        });*/


        cardViewModel.pagedList.observe(this, (PagedList<AllDetail> allDetails) -> {

            Log.e("cardViewModel.class","able  "+allDetails.size());

            cardListAdapter.submitList(allDetails);
            mainDAO.insertWholeData(createList(allDetails));
        });
        rView.setAdapter(cardListAdapter);

    }



    private List<AllDetailTableData> createList(PagedList<AllDetail> allDetails) {
        List<AllDetailTableData> allDetailTableData= new ArrayList<>();
        for(AllDetail a:allDetails){
            allDetailTableData.add(new AllDetailTableData(a));
        }
        return allDetailTableData;
    }


}
