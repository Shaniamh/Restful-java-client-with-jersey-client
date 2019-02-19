package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class Docs {
	private String date_dt;
	private String id;
	private String _version_;
	private List<String>id_user = new ArrayList<String>();
	private List<String>type = new ArrayList<String>();
	private List<String>url = new ArrayList<String>();
	private List<String>post = new ArrayList<String>();
	private List<String>typeMedia = new ArrayList<String>();
	private List<String>ori_post = new ArrayList<String>();
	private List<String>stance = new ArrayList<String>();
	private List<String>username = new ArrayList<String>();
	private List<String>hashtag = new ArrayList<String>();
	public List<String> getTypeMedia() {
		return typeMedia;
	}
	public void setTypeMedia(List<String> typeMedia) {
		this.typeMedia = typeMedia;
	}
	
	
	public List<String> getId_user() {
		return id_user;
	}
	public void setId_user(List<String> id_user) {
		this.id_user = id_user;
	}
	public List<String> getType() {
		return type;
	}
	public void setType(List<String> type) {
		this.type = type;
	}
	public List<String> getUrl() {
		return url;
	}
	public void setUrl(List<String> url) {
		this.url = url;
	}
	public List<String> getPost() {
		return post;
	}
	public void setPost(List<String> post) {
		this.post = post;
	}
	public List<String> getOri_post() {
		return ori_post;
	}
	public void setOri_post(List<String> ori_post) {
		this.ori_post = ori_post;
	}
	public List<String> getStance() {
		return stance;
	}
	public void setStance(List<String> stance) {
		this.stance = stance;
	}
	public List<String> getUsername() {
		return username;
	}
	public void setUsername(List<String> username) {
		this.username = username;
	}
	public List<String> getHashtag() {
		return hashtag;
	}
	public void setHashtag(List<String> hashtag) {
		this.hashtag = hashtag;
	}
	public String getDate_dt() {
		return date_dt;
	}
	public void setDate_dt(String date_dt) {
		this.date_dt = date_dt;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String get_version_() {
		return _version_;
	}
	public void set_version_(String _version_) {
		this._version_ = _version_;
	}
	
	public String toString() {
		return(date_dt + "," + id_user + "," + type + "," + url.toString().replace(", ", ". ").replace("\n", " ") + "," + post.toString().replace(",", ". ").replace("\n", " ") + "," + typeMedia + "," + id + "," + ori_post.toString().replace(",", ". ").replace("\n", " ") + "," + stance + "," + username + ","  + hashtag.toString().replace(",", " ") + _version_);
	}
}
