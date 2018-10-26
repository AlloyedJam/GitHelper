
public class Sound {
	String soundNames;
	EZSound sound;
	boolean activationCondition;
	
	
	Sound(String name){
		soundNames = name;
		
		sound = new EZSound(name);
	}
	
	void setSound(EZSound sound) {
		this.sound = sound;
	}
	
	EZSound getSound() {
		return sound;
	}
	
	void playOnCondition(boolean condition) {
		//play the sound when condition is triggered
		if (sound.getFramePosistion() == 0 && condition == true) {
			sound.play();
		//loop the sound while condition is triggered
		} else if (sound.getFramePosistion() >= sound.getFrameLength() && condition == true) {
				sound.play();
		//stop when the condition stops
		} else if (sound.getFramePosistion() > 0 && condition == false) {
				sound.stop();
		
		}
	}
	
}
