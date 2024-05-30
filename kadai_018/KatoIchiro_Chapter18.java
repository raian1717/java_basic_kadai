package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {
	
	KatoIchiro_Chapter18(){
		setGivenName("一郎");
	}
	
	
	public void setGivenName(String eachName){
		this.giveName = eachName;
	}
	
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}
}
