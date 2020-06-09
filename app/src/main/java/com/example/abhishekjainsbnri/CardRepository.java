package com.example.abhishekjainsbnri;

import android.app.Application;

import com.example.abhishekjainsbnri.dataclass.AllDetail;
import com.example.abhishekjainsbnri.dataholder.AllDetailTableData;
import com.example.abhishekjainsbnri.dataholder.MainDAO;
import com.example.abhishekjainsbnri.dataholder.MainDatabase;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.paging.DataSource;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PagedList;

public class CardRepository extends AndroidViewModel {


    public static  int FIRST_PAGE = 1;
    private final MainDatabase dataBase;
    private final MainDAO mainDAO;
    public final List<AllDetailTableData> savedData;
      LiveData <PagedList<AllDetail>> pagedList;
    CardViewModel cardViewModel;
    MediatorLiveData mediatorLiveData;

    public CardRepository(@NonNull Application application) {
        super(application);
        dataBase = MainDatabase.getDb(application);
        mainDAO = dataBase.getTodoDao();
        MainDatabase.setContext(application);

        savedData = mainDAO.getWholeData();




    }
}
