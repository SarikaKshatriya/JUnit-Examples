

public class microwaveClass {

	boolean cookState,stop;
	int timer;
	
	public microwaveClass (boolean cookState, boolean stop, int timer) {
		this.cookState=cookState;
		this.stop=stop;
		this.timer=timer;
	}
	
	public void operateMicrowave (boolean cooking, boolean doorOpen, boolean stopButton) {
	
	if (cooking && (doorOpen || stopButton))
		cookState=true;
	else
		cookState=false;
	
	if (timer>0)
		{
		stop=false;
		timer--;
		}
	else
		stop=true;
	}

	public boolean isCookState() {
		return cookState;
	}

	public boolean isStop() {
		return stop;
	}

	public int getTimer() {
		return timer;
	}

	public void setTimer(int timer) {
		this.timer = timer;
	}

}