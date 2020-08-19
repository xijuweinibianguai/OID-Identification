package wyj.oid.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.engine.jdbc.spi.SqlExceptionHelper;

import wyj.oid.dao.NodeAptDao;
import wyj.oid.dao.impl.NodeAptDaoImpl;
import wyj.oid.utils.HibernateUtils;
import wyj.oid.domain.Nodeappli;
import wyj.oid.service.NodeAptService;

public class NodeAptServiceImpl implements NodeAptService {

	private NodeAptDao nodeaptDao = new NodeAptDaoImpl();
	@Override
	public void save(Nodeappli n) {
		Session session =  HibernateUtils.getCurrentSession();
		//打开事务
		Transaction tx = session.beginTransaction();
		//调用Dao保存厂商
		try {
			nodeaptDao.save(n);
			//关闭事务
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		
		}

	@Override
	public List<Nodeappli> getAll() {
		Session session =  HibernateUtils.getCurrentSession();
		//打开事务
		Transaction tx = session.beginTransaction();		
		List<Nodeappli> list = nodeaptDao.getAll();		
		//关闭事务
		tx.commit();
		return list;
	}
	
	@Override
	public List<Nodeappli> getAll(DetachedCriteria dc) {
		Session session =  HibernateUtils.getCurrentSession();
		//打开事务
		Transaction tx = session.beginTransaction();	
		List<Nodeappli> list=nodeaptDao.getAll(dc);
//		try{
//			list = nodeaptDao.getAll(dc);
//			//关闭事务
//			tx.commit();
//		}catch(Exception e){
//			e.printStackTrace();
//			tx.rollback();
//		}
//		
		return list;
	}

	@Override
	public Nodeappli getById(String node_oid) {
		//1.获得session
			Session session = HibernateUtils.getCurrentSession();
			//2.打开事务
			Transaction tx = session.beginTransaction();
			Nodeappli na = new Nodeappli();
			try{			
			//3.调用dao层方法
			na = nodeaptDao.getById(node_oid);
			//4.关闭事务
			tx.commit();			
			}catch(Exception e){
				e.printStackTrace();
				tx.rollback();
			}
			return na;
			
	}

	@Override
	public void delete(String node_oid) {
		Session session=HibernateUtils.getCurrentSession();  
        Transaction tx=null;  
        try{  
            tx=session.beginTransaction();  
            nodeaptDao.delete(node_oid);  
        } catch (Exception e) {  
            tx.rollback();  
            throw new RuntimeException(e);  
            } finally{  
            	tx.commit();   
            }  
	}

	

	

}
