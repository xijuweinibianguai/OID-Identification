package wyj.oid.domain;

//通道口数量
public class Chanum {
	private int chanum;

	public int getChanum() {
		return chanum;
	}

	public void setChanum(int chanum) {
		this.chanum = chanum;
	}
	//将string类型的二进制转成十进制数字
	public void toShow(String str){
		chanum = Integer.parseInt(str, 2);//二进制转十进制
	}
}
