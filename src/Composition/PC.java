package Composition;

public class PC {

	private Case theCase;
	private Monitor monitor;
	private MotherBoard motherboard;
	
	public PC(Case theCase, Monitor monitor, MotherBoard motherboard) {
		
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}
//let's create a function=method
	public void powerUp() {
		theCase.pressButtonPower();;
		drawLogo();
	}
	private void drawLogo() {
		//fancy graphics
		monitor.drawPixelAt(1200, 50, "yellow");
	}
	
}