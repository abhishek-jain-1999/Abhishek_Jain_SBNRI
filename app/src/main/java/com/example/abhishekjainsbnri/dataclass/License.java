package com.example.abhishekjainsbnri.dataclass;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Awesome Pojo Generator
 * */
public class License{
    public License(String name) {
        this.name = name;
    }

    @SerializedName("name")
  @Expose
  private String name;
  @SerializedName("spdx_id")
  @Expose
  private String spdx_id;
  @SerializedName("key")
  @Expose
  private String key;
  @SerializedName("url")
  @Expose
  private String url;
  @SerializedName("node_id")
  @Expose
  private String node_id;


  public void setName(String name){
   this.name=name;
  }
  public String getName(){
   return name;
  }
  public void setSpdx_id(String spdx_id){
   this.spdx_id=spdx_id;
  }
  public String getSpdx_id(){
   return spdx_id;
  }
  public void setKey(String key){
   this.key=key;
  }
  public String getKey(){
   return key;
  }
  public void setUrl(String url){
   this.url=url;
  }
  public String getUrl(){
   return url;
  }
  public void setNode_id(String node_id){
   this.node_id=node_id;
  }
  public String getNode_id(){
   return node_id;
  }
}