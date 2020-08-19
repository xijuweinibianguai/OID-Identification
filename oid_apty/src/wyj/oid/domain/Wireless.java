package wyj.oid.domain;
//无线频段
//class Nodeappli 中的desc_wireless
public class Wireless {
	private String frequency;

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	public void toShow(String str){
		String one = str.substring(0,8);
		switch (one) {		
		case "00000001":frequency = "A";break;
		case "00000010":frequency = "B";break;
		case "00000011":frequency = "C";break;
		case "00000100":frequency = "D";break;
		case "00000101":frequency = "E";break;
		case "00000110":frequency = "A B";break;
		case "00000111":frequency = "A C";break;
		case "00001000":frequency = "A D";break;
		case "00001001":frequency = "A E";break;
		case "00001010":frequency = "B C";break;
		case "00001011":frequency = "B D";break;
		case "00001100":frequency = "B E";break;
		case "00001101":frequency = "C D";break;
		case "00001110":frequency = "C E";break;
		case "00001111":frequency = "D E";break;
		case "00010000":frequency = "A B C";break;
		case "00010001":frequency = "A B D";break;
		case "00010010":frequency = "A B E";break;
		case "00010011":frequency = "A C D";break;
		case "00010100":frequency = "A C E";break;
		case "00010101":frequency = "A D E";break;
		case "00010110":frequency = "B C D";break;
		case "00010111":frequency = "B C E";break;
		case "00011000":frequency = "B D E";break;
		case "00011001":frequency = "C D E";break;
		case "00011010":frequency = "A B C D";break;
		case "00011011":frequency = "A B C E ";break;
		case "00011100":frequency = "A B D E";break;
		case "00011101":frequency = "A C D E";break;
		case "00011110":frequency = "B C D E";break;
		case "00011111":frequency = "A B C D E";break;
		case "11111111":frequency = "该字段无效";break;
		default:frequency = "未定义";break;
		}
		}
}
