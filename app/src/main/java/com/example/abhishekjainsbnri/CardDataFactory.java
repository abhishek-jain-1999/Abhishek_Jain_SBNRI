package com.example.abhishekjainsbnri;


import android.util.Log;

import com.example.abhishekjainsbnri.dataclass.AllDetail;

import androidx.lifecycle.MutableLiveData;
import androidx.paging.DataSource;
import androidx.paging.PageKeyedDataSource;

public class CardDataFactory extends DataSource.Factory {


    public MutableLiveData<PageKeyedDataSource<Integer, AllDetail>> getMutableLiveData() {
        return mutableLiveData;
    }

    private MutableLiveData<PageKeyedDataSource<Integer,AllDetail>> mutableLiveData= new MutableLiveData<>();


    @Override
    public DataSource<Integer, AllDetail> create() {
        CardDataSource cardDataSource= new CardDataSource();
        mutableLiveData.postValue(cardDataSource);
        return cardDataSource;
    }

}
