package day07.Quiz;

public class QuizAnswer {

	public static void main(String[] args) {
		Monitor monitor = new Monitor();
		System.out.println(
				"모니터 기본값 : "+monitor.resolution+
				"해상도 기본값 : "+monitor.size+
				"밝기 기본값 : "+monitor.brightness+
				"전원 기본값 : "+monitor.onOff);

		
		// 전원 버튼 클릭
		monitor.pressPowerBtn();
		System.out.println(monitor.resolution);

		monitor.pressPowerBtn();
		System.out.println(monitor.size);
		
		monitor.pressPowerBtn();
		System.out.println(monitor.brightness);
		
		monitor.pressPowerBtn();
		System.out.println(monitor.onOff);
		
	}
}

class Monitor{
	int resolution; // 해상도
	int size; // 크기
	int brightness; // 밝기
	boolean onOff; // 전원 상태
	
	Monitor(){
		this.resolution = 100;
		this.size = 100;
		this.brightness = 100;
		this.onOff = false;
	}
	
	// 전원 메서드
	public void pressPowerBtn() {
		onOff = !onOff; // 현재값을 부정
	}

	public int getResolution() {
		return resolution;
	}

	public void setResolution(int resolution) {
		this.resolution = resolution;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getBrightness() {
		return brightness;
	}

	public void setBrightness(int brightness) {
		this.brightness = brightness;
	}

	public boolean isOnOff() {
		return onOff;
	}

	public void setOnOff(boolean onOff) {
		this.onOff = onOff;
	}
	
	
}