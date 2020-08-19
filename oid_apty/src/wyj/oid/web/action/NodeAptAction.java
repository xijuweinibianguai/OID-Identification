package wyj.oid.web.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import wyj.oid.domain.*;
import wyj.oid.service.NodeAptService;

import wyj.oid.service.impl.NodeAptServiceImpl;

public class NodeAptAction extends ActionSupport implements ModelDriven<Nodeappli>{//用Nodeappli这个对象来接收参数
	private NodeAptService ns = new NodeAptServiceImpl();	
	private Nodeappli nodeappli = new Nodeappli();

	

	public String execute() throws Exception 
	{
//	           接受参数（node_oid）
		String node_oid = ServletActionContext.getRequest().getParameter("node_oid");
		System.out.println("oid为："+node_oid);

		//2 创建离线查询对象
		DetachedCriteria dc =DetachedCriteria.forClass(Nodeappli.class);
//	判断拼装条件
		if(StringUtils.isNotBlank(node_oid)){
			dc.add(Restrictions.like("node_oid","%+node_oid+%"));
		
		}
//		
//		调用Service将离线对象传递
		Nodeappli a = ns.getById(node_oid);
		
		List<Nodeappli> list = ns.getAll(dc);
	
	    list.add(a);
	    

		// 将返回的list放入request域.转发到list.jsp显示	
//	    ServletActionContext.getRequest().setAttribute("list", list);		
		// 放到ActionContext
	  
	ActionContext.getContext().put("list", list);
		
		List<Powertype> list1 = new ArrayList<Powertype>();
		List<Outshell> list2 = new ArrayList<Outshell>();
		List<Wireless> list3 = new ArrayList<Wireless>();
		List<Explos> list4 = new ArrayList<Explos>();
		List<Chanum> list5 = new ArrayList<Chanum>();
		
		//供电方式
		Powertype powertype = new Powertype();
		powertype.toShow(a.getDesc_powertype());
		//外壳防护等级
		Outshell outshell = new Outshell();
		outshell.toShow(a.getDesc_outshell());
		
		//无线频段
		Wireless wireless = new Wireless();
		wireless.toShow(a.getDesc_wireless());
		//防爆类型
		Explos explos = new Explos();
		explos.toShow(a.getDesc_explos());
		
		//信号接口通道数量
		Chanum chanum = new Chanum();
		chanum.toShow(a.getDesc_chanum());
			
		list1.add(powertype);
		ActionContext.getContext().put("list1", list1);
		
		list2.add(outshell);		
		ActionContext.getContext().put("list2", list2);
		
		list3.add(wireless);	
		ActionContext.getContext().put("list3", list3);
		
		list4.add(explos);
		ActionContext.getContext().put("list4", list4);
		
		list5.add(chanum);
		ActionContext.getContext().put("list5", list5);
				
		return "list";
	}
	/*使用ModelDriven接收参数：
    a.定义：Action实现ModelDriven泛型接口，定义Model类的对象（必须new），通过getModel方法返回该对象；
    b.接收：通过对象的属性接收参数，如：user.getUname()；*/
	@Override
	public Nodeappli getModel() {
		// TODO Auto-generated method stub
		return nodeappli;
	}
}
