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
import com.app.dao.VersionDAO;
import com.app.model.Tag;
import com.app.model.Tip;
import com.app.model.User;
import com.app.model.Version;


@Service
public class VersionService {

	@Resource(name="versionDAO")
	VersionDAO versionDAO;


	//tipsave
	@Transactional(propagation = Propagation.REQUIRED)
	public void saveVersion(Version version) {
		versionDAO.saveVersion(version);;
	}
	
	public void deleteVersion(Version version) {
		versionDAO.deleteVersion(version);;
	}
	
	
	@Transactional(propagation = Propagation.REQUIRED)
	public List<Version> findtipVersion(Long tipid) {

		return versionDAO.findbyTipid(tipid);
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public Version findVersion(Long id) {

		return versionDAO.findVersion(id);
	}
	
	
	
}
