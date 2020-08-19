package wyj.oid.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import wyj.oid.utils.HibernateUtils;
import wyj.oid.domain.Nodeappli;
import wyj.oid.dao.NodeAptDao;

public class NodeAptDaoImpl implements NodeAptDao{

	@Override
	public void save(Nodeappli n) {
		//1 获得session
		Session session = HibernateUtils.getCurrentSession();
		//2 执行保存
		session.save(n);
	}

	@Override
	public List<Nodeappli> getAll() {
		//1 获得session
		Session session = HibernateUtils.getCurrentSession();
		//2 创建Criteria对象
		Criteria c = session.createCriteria(Nodeappli.class);
		return c.list();
	}

	@Override
	public List<Nodeappli> getAll(DetachedCriteria dc) {
		//1 获得session
		Session session = HibernateUtils.getCurrentSession();
		//2 将离线对象关联到session
		Criteria c = dc.getExecutableCriteria(session);
		//3 执行查询并返回
		return c.list();
	} 
	
	@Override
	public Nodeappli getById(String node_oid) {
		Session session = HibernateUtils.getCurrentSession();
		return session.get(Nodeappli.class, node_oid);//get方法产生查询语句
	}


	@Override
	public void delete(String node_oid) {
		Session session=HibernateUtils.getCurrentSession();  
        session.delete(session.get(Nodeappli.class, node_oid));
		
	}

	

	

}