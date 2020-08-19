package wyj.oid.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import wyj.oid.domain.Nodeappli;

public interface NodeAptService {
	//保存节点信息
			void save(Nodeappli c);
			//获得所有节点信息
			List<Nodeappli> getAll();
			//根据条件查询所有厂商信息
			List<Nodeappli> getAll(DetachedCriteria dc);
			//根据oid查询指定节点信息
			Nodeappli getById(String node_oid);
			//根据name查询指定厂商信息
			void delete(String node_oid);
			
}
