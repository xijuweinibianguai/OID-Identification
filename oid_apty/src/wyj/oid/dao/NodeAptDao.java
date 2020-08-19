package wyj.oid.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import wyj.oid.domain.Nodeappli;

public interface NodeAptDao {
	//保存节点
		void save(Nodeappli n);
		//查询所有节点应用属性信息
		List<Nodeappli> getAll();
		//根据条件查询所有节点信息
		List<Nodeappli> getAll(DetachedCriteria dc);
		//根据oid获得节点信息
		Nodeappli getById(String node_oid);
	    //根据oid删除
		void delete(String node_oid);
		
}
