package com.app.dao;
import java.util.List;
import javax.annotation.Resource;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.app.model.Version;





@Repository
public class VersionDAO {
	
	
	SessionFactory sessionFactory;
	
	@Resource(name="sessionFactory")
	public void setSuperSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	
	
	public void saveVersion(Version version){
		Session session =sessionFactory.getCurrentSession();
		session.save(version);
		/*session.close();*/
	}
	
	public void updateVersion(Version version){
		Session session =sessionFactory.getCurrentSession();
		session.update(version);
		/*session.close();*/
	}
	
	public void deleteVersion(Version version){
		Session session =sessionFactory.getCurrentSession();
		session.delete(version);
		/*session.close();*/
	}

	
	public List<Version> findbyTipid(long tipid) {

		Session session = sessionFactory.openSession();
		//session.get(User.class, 5 );
		//List<User> list=(List<User>) session.get(User.class, 5);
		/*Criteria c = session.createCriteria(User.class);
	    c.add(Expression.eq("id", 5));
	    c.addOrder(Order.desc("date"));
	    List<User> list=c.list();*/     
		String hql = "from Version where tipid='"+tipid+"'";             //way2 通过hql删除
        Query query = session.createQuery(hql);
        //int ref = query.executeUpdate();
        List<Version> list=query.list();
        return list;
	}
	
	public Version findVersion(long id) {

		Session session = sessionFactory.openSession();
		//session.get(User.class, 5 );
		//List<User> list=(List<User>) session.get(User.class, 5);
		/*Criteria c = session.createCriteria(User.class);
	    c.add(Expression.eq("id", 5));
	    c.addOrder(Order.desc("date"));
	    List<User> list=c.list();*/     
		String hql = "from Version where id='"+id+"'";             //way2 通过hql删除
        Query query = session.createQuery(hql);
        //int ref = query.executeUpdate();
        List<Version> list=query.list();
        return list.get(0);
	}

	
	
	public Version get(Long id) {
		Session session = sessionFactory.openSession();
		Version version=(Version) session.get(Version.class, id);              //get 与 load之间的关系与   fetch的lazy 与eager类似  即load是直到使用时才调用相关参数的查询代码，而get则在这句代码运行时则就查询数据
		/*for(Address address: user.getAddresses()){
			System.out.println(address.getAddress());
		}*/
		return version;
	}
	
}
