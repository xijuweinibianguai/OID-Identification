package wyj.oid.domain;

//供电方式
//Nodeappli 中的desc_ele字段分类
public class Powertype {
	//位0~9，保留，用于扩展
	private String reserved;
	//位10，外部供电直流/交流，0:外部直流供电；1:外部交流供电
	private String powered;
	//位11，是否可以外部供电，0:不可外部供电；1:外部可供电
	private String external;
	//位12，总线供电，0:非总线供电；1:总线供电
	private String buspower;		
	//位13~14，电池，00:无电池；01:不可充电电池；10:可充电电池
	private String battery;
	//位15，标志位 ，0：位14~位0有效；1：位14~位0无效
	private String flag;
	
	public String getReserved() {
		return reserved;
	}

	public void setReserved(String reserved) {
		this.reserved = reserved;
	}

	public String getPowered() {
		return powered;
	}

	public void setPowered(String powered) {
		this.powered = powered;
	}

	public String getExternal() {
		return external;
	}

	public void setExternal(String external) {
		this.external = external;
	}

	public String getBuspower() {
		return buspower;
	}

	public void setBuspower(String buspower) {
		this.buspower = buspower;
	}

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
//截取Nodeappli中的desc_ele字段
	public void toShow(String str){
		//位15，标志位 ，0：位14~位0有效；1：位14~位0无效
		char five = str.charAt(15);
		if(five=='1');{
			//flag="无效";
			reserved="无效";
			powered="无效";
			external="无效";
			buspower="无效";
			battery="无效";
			flag="无效";
		}
		
		reserved = str.substring(0,10);
		char one = str.charAt(10);
		 switch(one){
         case '0': powered = "外部直流供电"; break;
         case '1': powered = "外部交流供电"; break;
         default: powered = "解析错误"; break;
         }
		 
		char two = str.charAt(11);
		switch(two){
        case '0': external = "不可外部供电"; break;
        case '1': external = "外部可供电"; break;
        default: external = "解析错误"; break;
        }
		
		char three = str.charAt(12);
		switch(three){
        case '0': buspower = "非总线供电"; break;
        case '1': buspower = "总线供电"; break;
        default: buspower = "解析错误"; break;
        }
		
		String four = str.substring(13,15);
		switch(four){
        case "00": battery = "无电池"; break;
        case "01": battery = "不可充电电池"; break;
        case "10": battery = "可充电电池"; break;
        default: battery = "电池信息不可识别"; break;
        }
		
		
	}
}

