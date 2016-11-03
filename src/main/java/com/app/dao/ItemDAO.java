/*package com.app.dao;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.bouncycastle.crypto.engines.ISAACEngine;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.SessionAttributes;





@Repository
public class ItemDAO {
	
	@Resource(name="orderDAO")
	OrderDAO orderDAO;
	
	SessionFactory sessionFactory;
	
	@Resource(name="sessionFactory")
	public void setSuperSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	

	
	public List<Item> search(List<String> searchtext) {
		freshItems();
		Session session = sessionFactory.openSession();
		List<Item> list=null;
		String hql = "from Item where ";             //way2 通过hql删除
		int i=0;
		if(searchtext.size()>0){
			hql=hql+"(";
		}
		for (String string : searchtext) {
			if(i==0){	
				hql=hql+ " name like '%"+string+"%' or city like '%"+string+"%'or description like '%"+string+"%' ";
			}else {
				hql=hql+ " or name like '%"+string+"%' or city like '%"+string+"%'or description like '%"+string+"%' ";
			}
			i++;
		}
		if(searchtext.size()>0){
			hql=hql+") and ";
		}
		hql=hql+"(state='0' or state='1')";
		
        Query query = session.createQuery(hql);
        //int ref = query.executeUpdate();
        list=query.list();
		return list;	
	}
	

	
	
	public List<Item> searchItemBycity(List<String> citys) {
		freshItems();
		Session session = sessionFactory.openSession();
		List<Item> list=null;
		String hql = "from Item where";             //way2 通过hql删除
		int i=0;
		for (String string : citys) {
				if(i==0){
					hql=hql+ " city ='"+string+"' ";
				}else {
					hql=hql+"or city='"+string+"'";
				}
				i++;
		}
        Query query = session.createQuery(hql);
        query.setFirstResult(0);
        query.setMaxResults(4);
        //int ref = query.executeUpdate();
        list=query.list();
		return list;
		
	}
	
	
	public void freshItems() {

		Session session = sessionFactory.openSession();
		//session.get(User.class, 5 );
		//List<User> list=(List<User>) session.get(User.class, 5);
		Criteria c = session.createCriteria(User.class);
	    c.add(Expression.eq("id", 5));
	    c.addOrder(Order.desc("date"));
	    List<User> list=c.list();     
		String hql = "from Item";             //way2 通过hql删除
        Query query = session.createQuery(hql);
        //int ref = query.executeUpdate();
        List<Item> list=query.list();
        session.close();
		for (Item item : list) {
			if(item.getState()==1){
			if((item.getTime().getTime()+item.getCounttime()*1000*60*60*24-new Date().getTime())<0){
				System.err.println("运行1");
				System.err.println( "holdid"+ item.getHolderid());
				if(item.getHolderid()==null){
					item.setState(4);
				}else {
					item.setState(5);
				}
				updateItem(item);
				List<Order> list2= orderDAO.findOrderbyiid(item.getId());
				for (Order order: list2) {
					if(item.getHolderid()==order.getCid()){
						order.setState(2);
					}else {
						order.setState(4);
					}
					orderDAO.updateOrder(order);
					System.err.println("运行2");
				}
				updateItem(item);
				System.err.println("运行3");
			}
		}}
	}
	public List<Item> findbycid(long cid) {

		Session session = sessionFactory.openSession();
		//session.get(User.class, 5 );
		//List<User> list=(List<User>) session.get(User.class, 5);
		Criteria c = session.createCriteria(User.class);
	    c.add(Expression.eq("id", 5));
	    c.addOrder(Order.desc("date"));
	    List<User> list=c.list();     
		String hql = "from Item where cid='"+cid+"'";             //way2 通过hql删除
        Query query = session.createQuery(hql);
        //int ref = query.executeUpdate();
        List<Item> list=query.list();
        return list;
	}
	
	
	
	public void saveItem(Item item){
		Session session =sessionFactory.getCurrentSession();
		session.save(item);
		session.close();
	}
	
	public void updateItem(Item item){
		Session session =sessionFactory.getCurrentSession();
		session.update(item);
		session.close();
	}
	
	public void updateItem(Item item,Session session){
	
		session.update(item);
		session.close();
	}
	
	
	public Item get(Long id) {
		freshItems();
		Session session = sessionFactory.openSession();
		Item item=(Item) session.get(Item.class, id);              //get 与 load之间的关系与   fetch的lazy 与eager类似  即load是直到使用时才调用相关参数的查询代码，而get则在这句代码运行时则就查询数据
		for(Address address: user.getAddresses()){
			System.out.println(address.getAddress());
		}
		return item;
	}
	
	

	public Item getitem(Long id) {
		Session session = sessionFactory.openSession();
		Item item=(Item) session.get(Item.class, id);              //get 与 load之间的关系与   fetch的lazy 与eager类似  即load是直到使用时才调用相关参数的查询代码，而get则在这句代码运行时则就查询数据
		for(Address address: user.getAddresses()){
			System.out.println(address.getAddress());
		}
		session.close();
		return item;
	}
	
	public List<Item> searchplus(List<String> citys,String pricelow,String pricehigh) {
		Session session =sessionFactory.getCurrentSession();
		freshItems();
		List<Item> items = null;
		String hql = "from Item where";             //way2 通过hql删除
		int i=0;

		for (String string : citys) {
			if(i==0){
				hql=hql+ " ( city ='"+string+"' ";
			}else {
				hql=hql+"or city='"+string+"' ";
			}
			i++;
		}
		
	
		if(citys.size()!=0){
			hql=hql+") and ";
		}
		hql=hql+"(state='0' or state='1') ";
		if(pricelow!=null){
			hql=hql+"and nowprice>='"+pricelow+"' ";
		}
		if(pricehigh!=null){
			hql=hql+"and nowprice<='"+pricehigh+"' ";
		}
		
        Query query = session.createQuery(hql);
        items=query.list();
		return items;
	}
	
}
*/