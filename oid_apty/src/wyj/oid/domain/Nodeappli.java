package wyj.oid.domain;

public class Nodeappli {
	//传感节点应用属性（节点描述符编码）
	/*对应数据库
	 * CREATE TABLE `node_apt1` (
  `node_oid` varchar(40) NOT NULL,
  `desc_type` varchar(4) NOT NULL,
  `desc_version` varchar(4) NOT NULL,
  `desc_chanum` varchar(8) NOT NULL,
  `desc_powertype` varchar(16) NOT NULL,
  `desc_outshell` varchar(8) NOT NULL,
  `desc_wireless` varchar(8) NOT NULL,
  `desc_explos` varchar(4) NOT NULL,
  PRIMARY KEY (`node_oid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
	 */
	private String node_oid;
	//1.节点描述符
	private String desc_type;
	//2.版本号
	private String desc_version;
	//3.通道口数量
	private String desc_chanum;
	//4.供电方式
	private String desc_powertype;
	//5.外壳防护等级
	private String desc_outshell;
	//6.无线频段
	private String desc_wireless;
	//7.防爆类型
	private String desc_explos;
	//生产批次
	private int node_order;
	//生产日期
	private String birth_date;
	//出产日期
	private String manuf_date;
	//总编码
	private String node_coding;
	
	
	
	public int getNode_order() {
		return node_order;
	}
	public void setNode_order(int node_order) {
		this.node_order = node_order;
	}
	public String getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}
	public String getManuf_date() {
		return manuf_date;
	}
	public void setManuf_date(String manuf_date) {
		this.manuf_date = manuf_date;
	}
	
	
	
	
	
	public String getNode_oid() {
		return node_oid;
	}
	public void setNode_oid(String node_oid) {
		this.node_oid = node_oid;
	}
	public String getDesc_type() {
		return desc_type;
	}
	public void setDesc_type(String desc_type) {
		this.desc_type = desc_type;
	}
	public String getDesc_version() {
		return desc_version;
	}
	public void setDesc_version(String desc_version) {
		this.desc_version = desc_version;
	}
	public String getDesc_chanum() {
		return desc_chanum;
	}
	public void setDesc_chanum(String desc_chanum) {
		this.desc_chanum = desc_chanum;
	}
	public String getDesc_powertype() {
		return desc_powertype;
	}
	public void setDesc_powertype(String desc_powertype) {
		this.desc_powertype = desc_powertype;
	}
	public String getDesc_outshell() {
		return desc_outshell;
	}
	public void setDesc_outshell(String desc_outshell) {
		this.desc_outshell = desc_outshell;
	}
	public String getDesc_wireless() {
		return desc_wireless;
	}
	public void setDesc_wireless(String desc_wireless) {
		this.desc_wireless = desc_wireless;
	}
	public String getDesc_explos() {
		return desc_explos;
	}
	public void setDesc_explos(String desc_explos) {
		this.desc_explos = desc_explos;
	}
	public String getNode_coding() {
		return node_coding;
	}
	public void setNode_coding(String node_coding) {
		this.node_coding = node_coding;
	}
	
	/*public void toShow(String str){
		//1.节点描述符类型
		desc_type = str.substring(0, 3);
		
		//2.节点描述符版本号
		desc_version = str.substring(4, 7);
		
		//3.信号接口通道数量
		desc_chanum = Integer.parseInt(str.substring(8, 15), 2);//二进制转十进制
		//4.供电方式
		desc_powertype = str.substring(16, 31);
		//5.外壳防护等级
		desc_outshell = str.substring(32, 39);
		//6.无线频段
		desc_wireless = str.substring(40, 47);
		//7.防爆类型
		desc_explos = str.substring(48, 51);

	}*/
	
}
