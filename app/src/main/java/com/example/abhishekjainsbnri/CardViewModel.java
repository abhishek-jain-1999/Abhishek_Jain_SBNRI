package com.example.abhishekjainsbnri;

import com.example.abhishekjainsbnri.dataclass.AllDetail;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PageKeyedDataSource;
import androidx.paging.PagedList;

public class CardViewModel extends ViewModel {
    LiveData <PagedList<AllDetail>>pagedList;
    LiveData <PageKeyedDataSource<Integer,AllDetail>> liveDataSource;



    public CardViewModel() {

        CardDataFactory cardDataFactory= new CardDataFactory();

        liveDataSource=cardDataFactory.getMutableLiveData();

        PagedList.Config config=(new PagedList.Config.Builder())
                .setEnablePlaceholders(false)
                .setPageSize(CardDataSource.PAGE_SIZE).build();

        pagedList = (new LivePagedListBuilder(cardDataFactory,config)).build();

    }
}
