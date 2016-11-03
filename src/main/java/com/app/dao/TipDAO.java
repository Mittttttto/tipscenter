package com.app.dao;
import java.util.List;
import javax.annotation.Resource;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.app.model.Tip;
import com.app.model.User;





@Repository
public class TipDAO {
	
	
	SessionFactory sessionFactory;
	
	@Resource(name="sessionFactory")
	public void setSuperSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	
	
	public void saveTip(Tip tip){
		Session session =sessionFactory.getCurrentSession();
		session.save(tip);
		
		/*session.close();*/
	}

	
	public List<Tip> findByTitle(String title) {
		Session session = sessionFactory.openSession();
		//session.get(User.class, 5 );
		//List<User> list=(List<User>) session.get(User.class, 5);
		/*Criteria c = session.createCriteria(User.class);
	    c.add(Expression.eq("id", 5));
	    c.addOrder(Order.desc("date"));
	    List<User> list=c.list();*/     
		String hql = "from Tip where title='"+title+"' and state='0' ";             //way2 通过hql删除
        Query query = session.createQuery(hql);
        //int ref = query.executeUpdate();
        List<Tip> list=query.list();
		session.close();
        return list;
	}
	
	
	public List<Tip> search(String searchText,List<String> users,List<String> tags) {
		Session session = sessionFactory.openSession();
		//session.get(User.class, 5 );
		//List<User> list=(List<User>) session.get(User.class, 5);
		/*Criteria c = session.createCriteria(User.class);
	    c.add(Expression.eq("id", 5));
	    c.addOrder(Order.desc("date"));
	    List<User> list=c.list();*/  
		String hql="from Tip where ";
		boolean flagSearchtext=false;
		boolean flagUsers=false;
		boolean flagTags=false;
		if (searchText.length()!=0) {
			flagSearchtext=true;
		}
		if (users.size()!=0) {
			flagUsers=true;
		}
		if (tags.size()!=0) {
			flagTags=true;
		}
		
		if (flagSearchtext) {
			hql = hql +" (title like'%"+searchText+"%' or comment like '%"+searchText+"%' or id='"+searchText+"') ";      
		}
	    if (flagTags&&(!flagSearchtext)) {
		}else{
			if(flagTags){
				hql=hql+" and ";
			}
		}
		if (flagTags) {
			hql=hql+"( ";
			for (int i = 0; i < tags.size(); i++) {
				if (i!=0) {
					hql=hql+" or ";
				}
				hql=hql+"tag1id='"+tags.get(i)+"'"+"or tag2id='"+tags.get(i)+"'"+"or tag3id='"+tags.get(i)+"'";
			}
        	hql=hql+" )";
		}
		
		if((!flagSearchtext)&&(!flagTags)&&flagUsers){
		}else {
			if(flagUsers){
			hql=hql+" and ";}
		}
		if (flagUsers) {
			hql=hql+"(";
			for (int i = 0; i < users.size(); i++) {
				if (i!=0) {
					hql=hql+" or ";
				}
				hql=hql+"uid='"+users.get(i)+"'";
			}
			hql=hql+" )";
			
		}
		if((!flagSearchtext)&&(!flagTags)&&(!flagUsers)){
		}else {
			hql=hql+" and";
		}
		hql=hql+" state='0' order by id desc";
        System.err.println(hql);
		
		Query query = session.createQuery(hql);
        //int ref = query.executeUpdate();
        List<Tip> list=query.list();
		session.close();
        return list;
	}
	
	public void updateTip(Tip tip){
		Session session =sessionFactory.getCurrentSession();
		session.update(tip);
		/*session.close();*/
	}

	
	public List<Tip> findbyuid(long uid) {

		Session session = sessionFactory.openSession();
		//session.get(User.class, 5 );
		//List<User> list=(List<User>) session.get(User.class, 5);
		/*Criteria c = session.createCriteria(User.class);
	    c.add(Expression.eq("id", 5));
	    c.addOrder(Order.desc("date"));
	    List<User> list=c.list();*/     
		String hql = "from Tip where uid='"+uid+"'";             //way2 通过hql删除
        Query query = session.createQuery(hql);
        //int ref = query.executeUpdate();
        List<Tip> list=query.list();
        return list;
	}

	
	public List<Tip> findAll() {

		Session session = sessionFactory.openSession();
		//session.get(User.class, 5 );
		//List<User> list=(List<User>) session.get(User.class, 5);
		/*Criteria c = session.createCriteria(User.class);
	    c.add(Expression.eq("id", 5));
	    c.addOrder(Order.desc("date"));
	    List<User> list=c.list();*/     
		String hql = "from Tip where state='0' order by id desc";             //way2 通过hql删除
        Query query = session.createQuery(hql);
        //int ref = query.executeUpdate();
        List<Tip> list=query.list();
        return list;
	}
	
	
	public Tip get(Long id) {
		Session session = sessionFactory.openSession();
		Tip tip=(Tip) session.get(Tip.class, id);              //get 与 load之间的关系与   fetch的lazy 与eager类似  即load是直到使用时才调用相关参数的查询代码，而get则在这句代码运行时则就查询数据
		/*for(Address address: user.getAddresses()){
			System.out.println(address.getAddress());
		}*/
		return tip;
	}
	
}
