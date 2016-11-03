package com.app.model;
// Generated 2016-3-29 9:01:01 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Comment generated by hbm2java
 */
@Entity
@Table(name = "comment", catalog = "tip")
public class Comment implements java.io.Serializable {

	private Long id;
	private Date time;
	private Long uid;
	private String content;
	private Long tid;


	public Comment() {
	}

	public Comment(Date time, Long uid, String content, Long reuid, Long tid, Integer state) {
		this.time = time;
		this.uid = uid;
		this.content = content;
		this.tid = tid;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "time", length = 19)
	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Column(name = "uid")
	public Long getuid() {
		return this.uid;
	}

	public void setuid(Long uid) {
		this.uid = uid;
	}

	@Column(name = "content")
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}


	@Column(name = "tid")
	public Long gettid() {
		return this.tid;
	}

	public void settid(Long tid) {
		this.tid = tid;
	}


}