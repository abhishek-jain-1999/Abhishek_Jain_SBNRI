package com.example.abhishekjainsbnri.dataholder;
import com.example.abhishekjainsbnri.dataclass.AllDetail;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;


@Entity(tableName = "Main table" ,indices = @Index(value = {"name"}, unique = true))

public class AllDetailTableData {

    public AllDetailTableData() {
    }

    public AllDetailTableData(AllDetail allDetail) {
        this.full_name=allDetail.getFull_name();
        if(allDetail.getLicense()!=null) {
            this.l_name = allDetail.getLicense().getName();
        }
        if(allDetail.getPermissions()!=null) {
            this.admin = allDetail.getPermissions().getAdmin();
            this.pull = allDetail.getPermissions().getPull();
            this.push = allDetail.getPermissions().getPush();
        }
        this.name=allDetail.getName();
        this.open_issues_count=allDetail.getOpen_issues_count();
        this.description=allDetail.getDescription();

    }

    public long getFixedID() {
        return fixedID;
    }

    public void setFixedID(long fixedID) {
        this.fixedID = fixedID;
    }

    @PrimaryKey(autoGenerate = true)
    private  long fixedID;


    @SerializedName("open_issues_count")
    @Expose
    private Integer open_issues_count;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("pull")
    @Expose
    private Boolean pull;
    @SerializedName("admin")
    @Expose
    private Boolean admin;
    @SerializedName("push")
    @Expose
    private Boolean push;

    @SerializedName("full_name")
    @Expose
    private String full_name;

    @SerializedName("l_name")
    @Expose
    private String l_name;

    public Boolean getPull() {
        return pull;
    }

    public void setPull(Boolean pull) {
        this.pull = pull;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public Boolean getPush() {
        return push;
    }

    public void setPush(Boolean push) {
        this.push = push;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }
    public Integer getOpen_issues_count() {
        return open_issues_count;
    }

    public void setOpen_issues_count(Integer open_issues_count) {
        this.open_issues_count = open_issues_count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}