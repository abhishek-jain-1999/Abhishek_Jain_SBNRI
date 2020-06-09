package com.example.abhishekjainsbnri;

import android.util.Log;

import com.example.abhishekjainsbnri.dataclass.AllDetail;
import com.example.abhishekjainsbnri.dataholder.AllDetailTableData;
import com.example.abhishekjainsbnri.dataholder.MainDAO;
import com.example.abhishekjainsbnri.dataholder.MainDatabase;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.paging.PageKeyedDataSource;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CardDataSource extends PageKeyedDataSource<Integer, AllDetail> {


    public static final int PAGE_SIZE = 10;
    private static final int FIRST_PAGE = CardRepository.FIRST_PAGE;
    private MainDatabase dataBase;
    private MainDAO mainDAO;

    @Override
    public void loadInitial(@NonNull LoadInitialParams<Integer> params, @NonNull final LoadInitialCallback<Integer, AllDetail> callback) {

        Log.e("loadInitial call","able");


        dataBase = MainDatabase.getDb();
        mainDAO = dataBase.getTodoDao();
        List<AllDetailTableData> savedData = mainDAO.getWholeData();
        if(savedData.size()!=0) {
            callback.onResult(createList(mainDAO.getWholeData()), null, savedData.size() / 10 + 1);
        }else {
            ApiClient.getApiClientService().getList(FIRST_PAGE, PAGE_SIZE).enqueue(new Callback<List<AllDetail>>() {
                @Override
                public void onResponse(Call<List<AllDetail>> call, Response<List<AllDetail>> response) {

                    if (response.body() != null) {
                        callback.onResult(response.body(), null, FIRST_PAGE + 1);

                    }
                }

                @Override
                public void onFailure(Call<List<AllDetail>> call, Throwable t) {

                }
            });
        }
    }

    private List<AllDetail> createList(List<AllDetailTableData> wholeData) {
        List<AllDetail> allDetails = new ArrayList<>();
        for(AllDetailTableData j:wholeData){
            allDetails.add(new AllDetail(j));
        }
        return allDetails;
    }

    @Override
    public void loadBefore(@NonNull final LoadParams<Integer> params, @NonNull final LoadCallback<Integer, AllDetail> callback) {
        ApiClient.getApiClientService().getList(params.key,PAGE_SIZE).enqueue(new Callback<List<AllDetail>>() {
            @Override
            public void onResponse(Call<List<AllDetail>> call, Response<List<AllDetail>> response) {

                Integer previousPage= params.key>1?params.key-1:null;

                if(response.body()!=null){
                    callback.onResult(response.body(),previousPage);
                }
            }

            @Override
            public void onFailure(Call<List<AllDetail>> call, Throwable t) {


            }
        });
    }

    @Override
    public void loadAfter(@NonNull final LoadParams<Integer> params, @NonNull final LoadCallback<Integer, AllDetail> callback) {
        ApiClient.getApiClientService().getList(params.key,PAGE_SIZE).enqueue(new Callback<List<AllDetail>>() {
            @Override
            public void onResponse(Call<List<AllDetail>> call, Response<List<AllDetail>> response) {


                if(response.body()!=null){
                    callback.onResult(response.body(),params.key+1);
                }
            }

            @Override
            public void onFailure(Call<List<AllDetail>> call, Throwable t) {


            }
        });

    }
}
