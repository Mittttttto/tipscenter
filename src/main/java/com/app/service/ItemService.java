/*package com.app.service;

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

import com.app.dao.CommentDAO;
import com.app.dao.CustomerDAO;
import com.app.dao.FindPwdDAO;
import com.app.dao.ItemDAO;
import com.app.dao.ItemPicDAO;
import com.app.dao.TaskDAO;
import com.app.model.Comment;
import com.app.model.Customer;
import com.app.model.Findpwd;
import com.app.model.Item;
import com.app.model.Itempic;
import com.app.model.Task;
import com.app.tools.SendEmail;
import com.app.tools.SendMail;;

@Service
public class ItemService {
	@Resource(name="itemDAO")
	ItemDAO itemDAO;

	@Resource(name="itemPicDAO")
	ItemPicDAO itemPicDAO;
	
	@Resource(name="taskDAO")
	TaskDAO taskDAO;

	@Resource(name="commentDAO")
	CommentDAO commentDAO;


	//图片保存
	@Transactional(propagation = Propagation.REQUIRED)
	public void save(Itempic itempic,Item item) {
		itemPicDAO.savePic(itempic);
		if(itempic.getIsmain()==1){
			itemDAO.saveItem(item);
		}
	}
	
	public Item findbyid(long id) {
		return itemDAO.get(id);
	}
	
	public Item finditem(long id) {
		return itemDAO.getitem(id);
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void updateItem(Item item) {
		itemDAO.updateItem(item);
	}

	//获取商品信息
	@Transactional(propagation = Propagation.REQUIRED)
	public HashMap<String, Object> getItemDetail(Long itemid) {
		Item item=itemDAO.get(itemid);
		List<Itempic> itempics=itemPicDAO.getpic(itemid);
		HashMap<String, Object> map =new HashMap<String, Object>();
		map.put("item", item);
		map.put("piclist", itempics);
		return map;
	}
	
	
	@Transactional(propagation = Propagation.REQUIRED)
	public List<Comment> getitemcomment(Long itemid) {
		List<Comment> list=commentDAO.getmyCommentbyiid(itemid);
		return list;
	}
	

	@Transactional(propagation = Propagation.REQUIRED)
	public void savecomment(Comment comment) {
		commentDAO.save(comment);
		
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public List<Task> getTaskOfStudent(Long studentid) {
		return taskDAO.findBySid(studentid);
		
	}
	
	
	@Transactional(propagation = Propagation.REQUIRED)
	public List<Task> getTaskById(Long id) {
		return taskDAO.findById(id);
		
	}
	@Transactional(propagation = Propagation.REQUIRED)
	public List<Task> getTampleTaskById(Long id) {
		return taskDAO.getTampleTaskById(id);
		
	}
	
	
	@Transactional(propagation = Propagation.REQUIRED)
	public List<Task> getTemplet(Long id) {
		return taskDAO.findTemplet(id);
		
	}
	
	
	@Transactional(propagation = Propagation.REQUIRED)
	public List<Task> getAllTask() {
		return taskDAO.findAllTask();
		
	}
	
	
	@Transactional(propagation = Propagation.REQUIRED)
	public List<Task> getTaskOfTeacher(Long teacherId) {
		return taskDAO.findByTeacherId(teacherId);
		
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void saveTask(Task task) {
		taskDAO.saveTask(task);
		
	}
	
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void updateTask(Task task) {
		taskDAO.updateTask(task);
		
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void deleteTask(Long taskid) {
		taskDAO.deleteTask(taskid);
		
	}
	
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void approveTask(Long taskid) {
		taskDAO.approveTask(taskid);
		
	}
	
	
}
*/