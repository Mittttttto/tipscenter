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
import com.app.dao.TipDAO;
import com.app.dao.UserDAO;
import com.app.model.Tag;
import com.app.model.Tip;
import com.app.model.User;


@Service
public class TipService {

	@Resource(name="tipDAO")
	TipDAO tipDAO;


	//tipsave
	@Transactional(propagation = Propagation.REQUIRED)
	public void saveTip(Tip tip) {
		tipDAO.saveTip(tip);
		
	}
	
	public List<Tip> findAllTip() {
	    return tipDAO.findAll();
		
	}
	
	
	public List<Tip> Search(String searchText,List<String> users,List<String> tags) {
	    return tipDAO.search( searchText, users, tags);
		
	}
	
	
	public Long findBytitle(String title) {
		List<Tip> list= tipDAO.findByTitle(title);
		if (list.size()==0) {
			return Long.valueOf(-1);
		}else{
			return list.get(0).getId();
		}
	}
	
	
	public Tip findTipBytitle(String title) {
			List<Tip> list= tipDAO.findByTitle(title);
			return list.get(0);
		
	}
	

	public void updateTip(Tip tip) {
			tipDAO.updateTip(tip);
		
	}
	
	
	
}
