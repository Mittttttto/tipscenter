package com.app.dao;
import java.util.List;
import javax.annotation.Resource;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.app.model.Comment;





@Repository
public class CommentDAO {
	
	
	SessionFactory sessionFactory;
	
	@Resource(name="sessionFactory")
	public void setSuperSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	
	
	public void saveComment(Comment comment){
		Session session =sessionFactory.getCurrentSession();
		session.save(comment);
		/*session.close();*/
	}
	
	public void updateComment(Comment comment){
		Session session =sessionFactory.getCurrentSession();
		session.update(comment);
		/*session.close();*/
	}

	
	public List<Comment> findbyuid(long uid) {

		Session session = sessionFactory.openSession();
		//session.get(User.class, 5 );
		//List<User> list=(List<User>) session.get(User.class, 5);
		/*Criteria c = session.createCriteria(User.class);
	    c.add(Expression.eq("id", 5));
	    c.addOrder(Order.desc("date"));
	    List<User> list=c.list();*/     
		String hql = "from Comment where uid='"+uid+"'";             //way2 通过hql删除
        Query query = session.createQuery(hql);
        //int ref = query.executeUpdate();
        List<Comment> list=query.list();
        return list;
	}

	
	
	public Comment get(Long id) {
		Session session = sessionFactory.openSession();
		Comment comment=(Comment) session.get(Comment.class, id);              //get 与 load之间的关系与   fetch的lazy 与eager类似  即load是直到使用时才调用相关参数的查询代码，而get则在这句代码运行时则就查询数据
		/*for(Address address: user.getAddresses()){
			System.out.println(address.getAddress());
		}*/
		return comment;
	}
	
}
