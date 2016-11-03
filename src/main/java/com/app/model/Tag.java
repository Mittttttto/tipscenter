package com.app.model;
// Generated 2016-3-29 9:01:01 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Customer generated by hbm2java
 */
@Entity
@Table(name = "tag", catalog = "tip")
public class Tag implements java.io.Serializable {

	private long id;
	private String content;


	public Tag() {
	}

	public Tag(long id) {
		this.id = id;
	}

	public Tag(long id, String content, String mobile, String email, String pwd) {
		this.id = id;
		this.content = content;
		
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "content")
	public String getcontent() {
		return this.content;
	}

	public void setcontent(String content) {
		this.content = content;
	}

	

}
