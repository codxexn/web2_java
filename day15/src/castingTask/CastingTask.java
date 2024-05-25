package castingTask;

public class CastingTask {
	
	void check(Music music) {
		music.mode();
		
		if (music instanceof Ballad) {
			((Ballad) music).onlyBallad();
		} else if (music instanceof Hiphop) {
			((Hiphop) music).onlyHiphop();
		} else if (music instanceof Rock) {
			((Rock) music).onlyRock();
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Ballad ballad = new Ballad();
		Hiphop hiphop = new Hiphop();
		Rock rock = new Rock();
		
		CastingTask ct = new CastingTask();
		
		ct.check(ballad);
		ct.check(hiphop);
		ct.check(rock);
		
		
	}
}
