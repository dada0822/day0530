package day0530;

class MyTv{
	private boolean isPowerOn; // 전원
	private int channel; // 채널
	private int volume; // 볼륨
	
	private int prevChannel; // 이전 채널
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	/* MyTv 클래스의 멤버변수 isPowerOn, channel, volume은
	 * 클래스 외부에서 접근할 수 없음
	 * 이 멤버 변수들의 값을 어디서나 읽고 변경할 수 있도록
	 * getter와 setter 메서드를 추가하시오
	 * 매개변수가 있는 메서드는 반드시 작업 전에 넘겨받은 값의
	 * 유효성 검사를 실시할 것 */
	
	/* 이전 채널로 이동하는 기능의 메서드를 추가하시오
	 * 메서드명 : gotoPrevChannel
	 * 기능 : 채널이 바뀌기 전에 현재 채널을 이전 채널로 변경한다.
	 * 반환 타입 : 없음
	 * 매개변수 : 없음 */
	
	public void gotoPrevChannel() {
		setChannel(prevChannel);
	}

	public int getChannel() {
		return channel;
	}
	
	public void setChannel(int channel) {
		if(channel > MAX_CHANNEL || channel < MIN_CHANNEL) {
			return;
		}
		prevChannel = this.channel;
		this.channel = channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME || volume < MIN_VOLUME)
			return;
		
		this.volume = volume;
	}
	
//	public boolean getIsPowerOn() {
//		return isPowerOn;
//	}
//
//	
//	public void setIsPowerOn(boolean isPowerOn) {
//		this.isPowerOn = isPowerOn;
//	}
	

}

public class TvMain {

	public static void main(String[] args) {
		
		MyTv t = new MyTv();
		
		t.setChannel(10);
		System.out.println("channel : " + t.getChannel());
		
		t.setChannel(30);
		System.out.println("channel : " + t.getChannel());

		t.gotoPrevChannel();
		System.out.println("prevChannel : " + t.getChannel());
		
		t.setVolume(20);
		System.out.println("volume : " + t.getVolume());

	}

}
