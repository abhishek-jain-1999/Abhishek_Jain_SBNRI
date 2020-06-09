package com.example.abhishekjainsbnri.dataholder;

import java.util.List;

import androidx.paging.DataSource;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

@Dao
public interface MainDAO {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long[] insertWholeData(List<AllDetailTableData> allDetailTableData) ;

    @Query("Select * from 'Main table'")
    List<AllDetailTableData> getWholeData();

}
