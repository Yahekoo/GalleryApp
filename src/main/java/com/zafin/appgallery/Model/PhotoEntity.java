package com.zafin.appgallery.Model;

import java.util.Date;

import org.hibernate.annotations.CurrentTimestamp;
import org.hibernate.tuple.GenerationTiming;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity(name = "ph_photos")
public class PhotoEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String title;
	
	@CurrentTimestamp(timing = GenerationTiming.INSERT)
	private Date created_at;
	
	private String content;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
