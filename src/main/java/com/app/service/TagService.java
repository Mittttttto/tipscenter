package com.app.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.TagDAO;
import com.app.dao.UserDAO;
import com.app.model.Tag;
import com.app.model.User;


@Service
public class TagService {

	@Resource(name="tagDAO")
	TagDAO tagDAO;


	//图片保存
	@Transactional(propagation = Propagation.REQUIRED)
	public boolean checkNewTag(String content) {
		List<Tag> tags = tagDAO.checknewTag(content);
		if (tags.size()>0) {
			return false;
		}else {
			saveTag(content);
			return true;
		}
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void saveTag(String content) {
		Tag tag= new Tag();
		tag.setcontent(content);
		tagDAO.saveTag(tag);
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public Tag getTagbyContent(String content) {
		return tagDAO.checknewTag(content).get(0);
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public List<Tag> getTags() {
		return tagDAO.getTags();
	}
	
}
