package piano;

import javafx.scene.media.AudioClip;

public class NoteObject {
	private char note;
	private int octave;
	private AudioClip sound;
	
	public NoteObject(char note, int octave, AudioClip sound) {
		this.note = note;
		this.octave = octave;
		this.sound = sound;
	}
	
	public void playSound() {
		sound.play();
	}
	
	
	// getters and setters
	
	
	public char getNote() {
		return note;
	}
	
	public int getOctave() {
		return octave;
	}
}
