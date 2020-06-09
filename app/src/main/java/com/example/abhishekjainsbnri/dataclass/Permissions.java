package com.example.abhishekjainsbnri.dataclass;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Awesome Pojo Generator
 * */
public class Permissions{
  @SerializedName("pull")
  @Expose
  private Boolean pull;
  @SerializedName("admin")
  @Expose
  private Boolean admin;
  @SerializedName("push")
  @Expose
  private Boolean push;

    public Permissions(Boolean admin, Boolean pull, Boolean push) {
        this.pull = pull;
        this.admin = admin;
        this.push = push;
    }

    public void setPull(Boolean pull){
   this.pull=pull;
  }
  public Boolean getPull(){
   return pull;
  }
  public void setAdmin(Boolean admin){
   this.admin=admin;
  }
  public Boolean getAdmin(){
   return admin;
  }
  public void setPush(Boolean push){
   this.push=push;
  }
  public Boolean getPush(){
   return push;
  }
}