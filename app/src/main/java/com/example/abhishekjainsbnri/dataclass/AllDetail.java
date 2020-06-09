package com.example.abhishekjainsbnri.dataclass;
import com.example.abhishekjainsbnri.dataholder.AllDetailTableData;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class AllDetail{
  @SerializedName("stargazers_count")
  @Expose
  private Integer stargazers_count;
  @SerializedName("pushed_at")
  @Expose
  private String pushed_at;
  @SerializedName("subscription_url")
  @Expose
  private String subscription_url;
  @SerializedName("language")
  @Expose
  private String language;
  @SerializedName("branches_url")
  @Expose
  private String branches_url;
  @SerializedName("issue_comment_url")
  @Expose
  private String issue_comment_url;
  @SerializedName("labels_url")
  @Expose
  private String labels_url;
  @SerializedName("subscribers_url")
  @Expose
  private String subscribers_url;
  @SerializedName("permissions")
  @Expose
  private Permissions permissions;
  @SerializedName("releases_url")
  @Expose
  private String releases_url;
  @SerializedName("svn_url")
  @Expose
  private String svn_url;
  @SerializedName("id")
  @Expose
  private Integer id;
  @SerializedName("forks")
  @Expose
  private Integer forks;
  @SerializedName("archive_url")
  @Expose
  private String archive_url;
  @SerializedName("git_refs_url")
  @Expose
  private String git_refs_url;
  @SerializedName("forks_url")
  @Expose
  private String forks_url;
  @SerializedName("statuses_url")
  @Expose
  private String statuses_url;
  @SerializedName("ssh_url")
  @Expose
  private String ssh_url;
  @SerializedName("license")
  @Expose
  private License license;
  @SerializedName("full_name")
  @Expose
  private String full_name;
  @SerializedName("size")
  @Expose
  private Integer size;
  @SerializedName("languages_url")
  @Expose
  private String languages_url;
  @SerializedName("html_url")
  @Expose
  private String html_url;
  @SerializedName("collaborators_url")
  @Expose
  private String collaborators_url;
  @SerializedName("clone_url")
  @Expose
  private String clone_url;
  @SerializedName("name")
  @Expose
  private String name;
  @SerializedName("pulls_url")
  @Expose
  private String pulls_url;
  @SerializedName("default_branch")
  @Expose
  private String default_branch;
  @SerializedName("hooks_url")
  @Expose
  private String hooks_url;
  @SerializedName("trees_url")
  @Expose
  private String trees_url;
  @SerializedName("tags_url")
  @Expose
  private String tags_url;
  @SerializedName("contributors_url")
  @Expose
  private String contributors_url;
  @SerializedName("has_downloads")
  @Expose
  private Boolean has_downloads;
  @SerializedName("notifications_url")
  @Expose
  private String notifications_url;
  @SerializedName("open_issues_count")
  @Expose
  private Integer open_issues_count;
  @SerializedName("description")
  @Expose
  private String description;
  @SerializedName("created_at")
  @Expose
  private String created_at;
  @SerializedName("watchers")
  @Expose
  private Integer watchers;
  @SerializedName("keys_url")
  @Expose
  private String keys_url;
  @SerializedName("deployments_url")
  @Expose
  private String deployments_url;
  @SerializedName("has_projects")
  @Expose
  private Boolean has_projects;
  @SerializedName("archived")
  @Expose
  private Boolean archived;
  @SerializedName("has_wiki")
  @Expose
  private Boolean has_wiki;
  @SerializedName("updated_at")
  @Expose
  private String updated_at;
  @SerializedName("comments_url")
  @Expose
  private String comments_url;
  @SerializedName("stargazers_url")
  @Expose
  private String stargazers_url;
  @SerializedName("disabled")
  @Expose
  private Boolean disabled;
  @SerializedName("git_url")
  @Expose
  private String git_url;
  @SerializedName("has_pages")
  @Expose
  private Boolean has_pages;
  @SerializedName("owner")
  @Expose
  private Owner owner;
  @SerializedName("commits_url")
  @Expose
  private String commits_url;
  @SerializedName("compare_url")
  @Expose
  private String compare_url;
  @SerializedName("git_commits_url")
  @Expose
  private String git_commits_url;
  @SerializedName("blobs_url")
  @Expose
  private String blobs_url;
  @SerializedName("git_tags_url")
  @Expose
  private String git_tags_url;
  @SerializedName("merges_url")
  @Expose
  private String merges_url;
  @SerializedName("downloads_url")
  @Expose
  private String downloads_url;
  @SerializedName("has_issues")
  @Expose
  private Boolean has_issues;
  @SerializedName("url")
  @Expose
  private String url;
  @SerializedName("contents_url")
  @Expose
  private String contents_url;
  @SerializedName("mirror_url")
  @Expose
  private Object mirror_url;
  @SerializedName("milestones_url")
  @Expose
  private String milestones_url;
  @SerializedName("teams_url")
  @Expose
  private String teams_url;
  @SerializedName("fork")
  @Expose
  private Boolean fork;
  @SerializedName("issues_url")
  @Expose
  private String issues_url;
  @SerializedName("events_url")
  @Expose
  private String events_url;
  @SerializedName("issue_events_url")
  @Expose
  private String issue_events_url;
  @SerializedName("assignees_url")
  @Expose
  private String assignees_url;
  @SerializedName("open_issues")
  @Expose
  private Integer open_issues;
  @SerializedName("watchers_count")
  @Expose
  private Integer watchers_count;
  @SerializedName("node_id")
  @Expose
  private String node_id;
  @SerializedName("homepage")
  @Expose
  private String homepage;
  @SerializedName("forks_count")
  @Expose
  private Integer forks_count;
  public void setStargazers_count(Integer stargazers_count){
   this.stargazers_count=stargazers_count;
  }
  public Integer getStargazers_count(){
   return stargazers_count;
  }
  public void setPushed_at(String pushed_at){
   this.pushed_at=pushed_at;
  }
  public String getPushed_at(){
   return pushed_at;
  }
  public void setSubscription_url(String subscription_url){
   this.subscription_url=subscription_url;
  }
  public String getSubscription_url(){
   return subscription_url;
  }
  public void setLanguage(String language){
   this.language=language;
  }
  public String getLanguage(){
   return language;
  }
  public void setBranches_url(String branches_url){
   this.branches_url=branches_url;
  }
  public String getBranches_url(){
   return branches_url;
  }
  public void setIssue_comment_url(String issue_comment_url){
   this.issue_comment_url=issue_comment_url;
  }
  public String getIssue_comment_url(){
   return issue_comment_url;
  }
  public void setLabels_url(String labels_url){
   this.labels_url=labels_url;
  }
  public String getLabels_url(){
   return labels_url;
  }
  public void setSubscribers_url(String subscribers_url){
   this.subscribers_url=subscribers_url;
  }
  public String getSubscribers_url(){
   return subscribers_url;
  }
  public void setPermissions(Permissions permissions){
   this.permissions=permissions;
  }
  public Permissions getPermissions(){
   return permissions;
  }
  public void setReleases_url(String releases_url){
   this.releases_url=releases_url;
  }
  public String getReleases_url(){
   return releases_url;
  }
  public void setSvn_url(String svn_url){
   this.svn_url=svn_url;
  }
  public String getSvn_url(){
   return svn_url;
  }
  public void setId(Integer id){
   this.id=id;
  }
  public Integer getId(){
   return id;
  }
  public void setForks(Integer forks){
   this.forks=forks;
  }
  public Integer getForks(){
   return forks;
  }
  public void setArchive_url(String archive_url){
   this.archive_url=archive_url;
  }
  public String getArchive_url(){
   return archive_url;
  }
  public void setGit_refs_url(String git_refs_url){
   this.git_refs_url=git_refs_url;
  }
  public String getGit_refs_url(){
   return git_refs_url;
  }
  public void setForks_url(String forks_url){
   this.forks_url=forks_url;
  }
  public String getForks_url(){
   return forks_url;
  }
  public void setStatuses_url(String statuses_url){
   this.statuses_url=statuses_url;
  }
  public String getStatuses_url(){
   return statuses_url;
  }
  public void setSsh_url(String ssh_url){
   this.ssh_url=ssh_url;
  }
  public String getSsh_url(){
   return ssh_url;
  }
  public void setLicense(License license){
   this.license=license;
  }
  public License getLicense(){
   return license;
  }
  public void setFull_name(String full_name){
   this.full_name=full_name;
  }
  public String getFull_name(){
   return full_name;
  }
  public void setSize(Integer size){
   this.size=size;
  }
  public Integer getSize(){
   return size;
  }
  public void setLanguages_url(String languages_url){
   this.languages_url=languages_url;
  }
  public String getLanguages_url(){
   return languages_url;
  }
  public void setHtml_url(String html_url){
   this.html_url=html_url;
  }
  public String getHtml_url(){
   return html_url;
  }
  public void setCollaborators_url(String collaborators_url){
   this.collaborators_url=collaborators_url;
  }
  public String getCollaborators_url(){
   return collaborators_url;
  }
  public void setClone_url(String clone_url){
   this.clone_url=clone_url;
  }
  public String getClone_url(){
   return clone_url;
  }
  public void setName(String name){
   this.name=name;
  }
  public String getName(){
   return name;
  }
  public void setPulls_url(String pulls_url){
   this.pulls_url=pulls_url;
  }
  public String getPulls_url(){
   return pulls_url;
  }
  public void setDefault_branch(String default_branch){
   this.default_branch=default_branch;
  }
  public String getDefault_branch(){
   return default_branch;
  }
  public void setHooks_url(String hooks_url){
   this.hooks_url=hooks_url;
  }
  public String getHooks_url(){
   return hooks_url;
  }
  public void setTrees_url(String trees_url){
   this.trees_url=trees_url;
  }
  public String getTrees_url(){
   return trees_url;
  }
  public void setTags_url(String tags_url){
   this.tags_url=tags_url;
  }
  public String getTags_url(){
   return tags_url;
  }

  public void setContributors_url(String contributors_url){
   this.contributors_url=contributors_url;
  }
  public String getContributors_url(){
   return contributors_url;
  }
  public void setHas_downloads(Boolean has_downloads){
   this.has_downloads=has_downloads;
  }
  public Boolean getHas_downloads(){
   return has_downloads;
  }
  public void setNotifications_url(String notifications_url){
   this.notifications_url=notifications_url;
  }
  public String getNotifications_url(){
   return notifications_url;
  }
  public void setOpen_issues_count(Integer open_issues_count){
   this.open_issues_count=open_issues_count;
  }
  public Integer getOpen_issues_count(){
   return open_issues_count;
  }
  public void setDescription(String description){
   this.description=description;
  }
  public String getDescription(){
   return description;
  }
  public void setCreated_at(String created_at){
   this.created_at=created_at;
  }
  public String getCreated_at(){
   return created_at;
  }
  public void setWatchers(Integer watchers){
   this.watchers=watchers;
  }
  public Integer getWatchers(){
   return watchers;
  }
  public void setKeys_url(String keys_url){
   this.keys_url=keys_url;
  }
  public String getKeys_url(){
   return keys_url;
  }
  public void setDeployments_url(String deployments_url){
   this.deployments_url=deployments_url;
  }
  public String getDeployments_url(){
   return deployments_url;
  }
  public void setHas_projects(Boolean has_projects){
   this.has_projects=has_projects;
  }
  public Boolean getHas_projects(){
   return has_projects;
  }
  public void setArchived(Boolean archived){
   this.archived=archived;
  }
  public Boolean getArchived(){
   return archived;
  }
  public void setHas_wiki(Boolean has_wiki){
   this.has_wiki=has_wiki;
  }
  public Boolean getHas_wiki(){
   return has_wiki;
  }
  public void setUpdated_at(String updated_at){
   this.updated_at=updated_at;
  }
  public String getUpdated_at(){
   return updated_at;
  }
  public void setComments_url(String comments_url){
   this.comments_url=comments_url;
  }
  public String getComments_url(){
   return comments_url;
  }
  public void setStargazers_url(String stargazers_url){
   this.stargazers_url=stargazers_url;
  }
  public String getStargazers_url(){
   return stargazers_url;
  }
  public void setDisabled(Boolean disabled){
   this.disabled=disabled;
  }
  public Boolean getDisabled(){
   return disabled;
  }
  public void setGit_url(String git_url){
   this.git_url=git_url;
  }
  public String getGit_url(){
   return git_url;
  }
  public void setHas_pages(Boolean has_pages){
   this.has_pages=has_pages;
  }
  public Boolean getHas_pages(){
   return has_pages;
  }
  public void setOwner(Owner owner){
   this.owner=owner;
  }
  public Owner getOwner(){
   return owner;
  }
  public void setCommits_url(String commits_url){
   this.commits_url=commits_url;
  }
  public String getCommits_url(){
   return commits_url;
  }
  public void setCompare_url(String compare_url){
   this.compare_url=compare_url;
  }
  public String getCompare_url(){
   return compare_url;
  }
  public void setGit_commits_url(String git_commits_url){
   this.git_commits_url=git_commits_url;
  }
  public String getGit_commits_url(){
   return git_commits_url;
  }
  public void setBlobs_url(String blobs_url){
   this.blobs_url=blobs_url;
  }
  public String getBlobs_url(){
   return blobs_url;
  }
  public void setGit_tags_url(String git_tags_url){
   this.git_tags_url=git_tags_url;
  }
  public String getGit_tags_url(){
   return git_tags_url;
  }
  public void setMerges_url(String merges_url){
   this.merges_url=merges_url;
  }
  public String getMerges_url(){
   return merges_url;
  }
  public void setDownloads_url(String downloads_url){
   this.downloads_url=downloads_url;
  }
  public String getDownloads_url(){
   return downloads_url;
  }
  public void setHas_issues(Boolean has_issues){
   this.has_issues=has_issues;
  }
  public Boolean getHas_issues(){
   return has_issues;
  }
  public void setUrl(String url){
   this.url=url;
  }
  public String getUrl(){
   return url;
  }
  public void setContents_url(String contents_url){
   this.contents_url=contents_url;
  }
  public String getContents_url(){
   return contents_url;
  }
  public void setMirror_url(Object mirror_url){
   this.mirror_url=mirror_url;
  }
  public Object getMirror_url(){
   return mirror_url;
  }
  public void setMilestones_url(String milestones_url){
   this.milestones_url=milestones_url;
  }
  public String getMilestones_url(){
   return milestones_url;
  }
  public void setTeams_url(String teams_url){
   this.teams_url=teams_url;
  }
  public String getTeams_url(){
   return teams_url;
  }
  public void setFork(Boolean fork){
   this.fork=fork;
  }
  public Boolean getFork(){
   return fork;
  }
  public void setIssues_url(String issues_url){
   this.issues_url=issues_url;
  }
  public String getIssues_url(){
   return issues_url;
  }
  public void setEvents_url(String events_url){
   this.events_url=events_url;
  }
  public String getEvents_url(){
   return events_url;
  }
  public void setIssue_events_url(String issue_events_url){
   this.issue_events_url=issue_events_url;
  }
  public String getIssue_events_url(){
   return issue_events_url;
  }
  public void setAssignees_url(String assignees_url){
   this.assignees_url=assignees_url;
  }
  public String getAssignees_url(){
   return assignees_url;
  }
  public void setOpen_issues(Integer open_issues){
   this.open_issues=open_issues;
  }
  public Integer getOpen_issues(){
   return open_issues;
  }
  public void setWatchers_count(Integer watchers_count){
   this.watchers_count=watchers_count;
  }
  public Integer getWatchers_count(){
   return watchers_count;
  }
  public void setNode_id(String node_id){
   this.node_id=node_id;
  }
  public String getNode_id(){
   return node_id;
  }
  public void setHomepage(String homepage){
   this.homepage=homepage;
  }
  public String getHomepage(){
   return homepage;
  }
  public void setForks_count(Integer forks_count){
   this.forks_count=forks_count;
  }
  public Integer getForks_count(){
   return forks_count;
  }

    public AllDetail(AllDetailTableData a) {
      this.setName(a.getName());
      this.setFull_name(a.getFull_name());
      this.setOpen_issues_count(a.getOpen_issues_count());
      this.setDescription(a.getDescription());
      this.setLicense(new License(a.getL_name()));
      this.setPermissions(new Permissions(a.getAdmin(),a.getPull(),a.getPush()));
    }

    public Boolean equals(AllDetail allDetail){
    if(!this.name.equals(allDetail.name)){
      return false;
    }
    if(!this.description.equals(allDetail.description)){
      return false;
    }
    return this.open_issues_count.equals(allDetail.open_issues_count);
  }


}