package wyj.oid.domain;
//外壳防护等级
//Nodeappli 中的desc_ele字段分类
public class Outshell {
	//防水等级
	private String waterproof;
	//防护等级
	private String protection;
	
	
	public String getProtection() {
		return protection;
	}

	public void setProtection(String protection) {
		this.protection = protection;
	}

	public String getWaterproof() {
		return waterproof;
	}

	public void setWaterproof(String waterproof) {
		this.waterproof = waterproof;
	}

	public void toShow(String str){
		String one = str.substring(0,4);
		switch (one) {
		case "0000":waterproof = "没有保护";break;
		case "0001":waterproof = "垂直滴水";break;
		case "0010":waterproof = "15°滴水";break;
		case "0011":waterproof = "淋水";break;
		case "0100":waterproof = "溅水";break;
		case "0101":waterproof = "喷水";break;
		case "0110":waterproof = "猛力喷水";break;
		case "0111":waterproof = "短时间内浸水（1m）";break;
		case "1000":waterproof = "于一定压力下长时间浸水";break;
		case "1111":waterproof = "该字段无效";break;
		default:waterproof = "未定义";break;
		}
		String two = str.substring(4,8);
		switch (two) {
		case "0000":protection = "没有保护";break;
		case "0001":protection = "≥Φ50mm";break;
		case "0010":protection = "≥Φ12.5mm";break;
		case "0011":protection = "≥Φ2.5mm";break;
		case "0100":protection = "≥Φ1.0mm";break;
		case "0101":protection = "防尘";break;
		case "0110":protection = "尘密";break;		
		case "1111":protection = "该字段无效";break;
		default:protection = "未定义";break;
		}
	}
}
