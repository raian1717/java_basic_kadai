package kadai_015;

public class Car_Chapter15 {
	private int gear = 0;
	private int speed = 0;
	
	public Car_Chapter15(int gear, int speed) {
		System.out.println("読み込み開始");
		this.gear = gear;
		this.speed = speed;
		System.out.println("この車のギアは" + this.gear + "/この車のスピードは" + this.speed + "km");
	}
	
	public void gearChange(int afterGear){
		int beforeGear = this.gear;
		this.gear = afterGear;
		System.out.println("ギア" + beforeGear + "からギア" + this.gear + "に切り替えました");
		
	}
	
	public void run() {
		switch(this.gear) {
		case 1 -> {
			this.speed = 10;
			System.out.println("速度は時速" + this.speed + "kmです");
		}
		case 2  -> {
			this.speed = 20;
			System.out.println("速度は時速" + this.speed + "kmです");
		}
		case 3  -> {
			this.speed = 30;
			System.out.println("速度は時速" + this.speed + "kmです");
		}
		case 4  -> {
			this.speed = 40;
			System.out.println("速度は時速" + this.speed + "kmです");
		}
		case 5  -> {
			this.speed = 50;
			System.out.println("速度は時速" + this.speed + "kmです");
		}
		default  -> {
			this.speed = 10;
			System.out.println("速度は時速" + this.speed + "kmです");
		}
		}
	}
}
