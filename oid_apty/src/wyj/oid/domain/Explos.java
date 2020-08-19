package wyj.oid.domain;
//防爆类型
//class Nodeappli中desc_explos字段
public class Explos {
	private String explosion;

	public String getExplosion() {
		return explosion;
	}

	public void setExplosion(String explosion) {
		this.explosion = explosion;
	}
	public void toShow(String str){
		String one = str.substring(0,4);
		switch (one) {
		case "0000":explosion = "无防爆型";break;
		case "0001":explosion = "隔爆型";break;
		case "0010":explosion = "增安型";break;
		case "0011":explosion = "本质安全型";break;
		case "0100":explosion = "正压型";break;
		case "0101":explosion = "油浸型";break;
		case "0110":explosion = "充砂型";break;
		case "0111":explosion = "浇封型";break;
		case "1111":explosion = "该字段无效";break;
		default:explosion = "未定义";break;
		}
	}
}
