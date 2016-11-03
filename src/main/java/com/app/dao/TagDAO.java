package com.app.dao;
import java.util.List;
import javax.annotation.Resource;
import javax.swing.text.AbstractDocument.Content;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.app.model.Tag;





@Repository
public class TagDAO {
	
	
	SessionFactory sessionFactory;
	
	@Resource(name="sessionFactory")
	public void setSuperSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	
	
	public void saveTag(Tag tag){
		Session session =sessionFactory.getCurrentSession();
		session.save(tag);
		/*session.close();*/
	}
	
	public void updateTag(Tag tag){
		Session session =sessionFactory.getCurrentSession();
		session.update(tag);
		/*session.close();*/
	}

	
	public List<Tag> checknewTag(String content) {

		Session session = sessionFactory.openSession();
		//session.get(User.class, 5 );
		//List<User> list=(List<User>) session.get(User.class, 5);
		/*Criteria c = session.createCriteria(User.class);
	    c.add(Expression.eq("id", 5));
	    c.addOrder(Order.desc("date"));
	    List<User> list=c.list();*/     
		String hql = "from Tag where content='"+content+"'";             //way2 通过hql删除
        Query query = session.createQuery(hql);
        //int ref = query.executeUpdate();
        List<Tag> list=query.list();
        return list;
	}
	
	

	public List<Tag> getTags() {
		Session session = sessionFactory.openSession();
		String hql = "from Tag";             //way2 通过hql删除
        Query query = session.createQuery(hql);
        List<Tag> list=query.list();
        return list;
	}
	
	

	
	public Tag get(Long id) {
		Session session = sessionFactory.openSession();
		Tag tag=(Tag) session.get(Tag.class, id);              //get 与 load之间的关系与   fetch的lazy 与eager类似  即load是直到使用时才调用相关参数的查询代码，而get则在这句代码运行时则就查询数据
		/*for(Address address: user.getAddresses()){
			System.out.println(address.getAddress());
		}*/
		return tag;
	}
	
}
