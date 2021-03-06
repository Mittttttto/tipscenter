package com.app.model;
// Generated 2016-3-29 9:01:01 by Hibernate Tools 4.3.1.Final

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.crypto.Data;

/**
 * Customer generated by hbm2java
 */
@Entity
@Table(name = "version", catalog = "tip")
public class Version implements java.io.Serializable {

	private long id;
	private long uid;
	private long tipid;
	private int version;
	private Date time;
	private String comment;
	private String url;
	
	public Version() {
	}

	public Version(long id) {
		this.id = id;
	}

	

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "uid")
	public long getUid() {
		return this.uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}

	@Column(name = "tipid")
	public long getTipid() {
		return this.tipid;
	}

	public void settipid(long tipid) {
		this.tipid = tipid;
	}
	
	@Column(name = "time")
	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Column(name = "version")
	public int getversion() {
		return this.version;
	}

	public void setversion(int version) {
		this.version = version;
	}
	
	@Column(name = "comment")
	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	@Column(name = "url")
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}




}
