package piano;

public class Key {
	private NoteObject note;
	
	public Key(NoteObject note) {
		this.note = note;
	}
	
	//getters and setters
	
	public char getNote() {
		return note.getNote();
	}
	
	public int getOctave() {
		return note.getOctave();
	}
	
	public void playNote() {
		note.playSound();
	}
	
	public NoteObject getNoteObject() {
		return note;
	}
	
}
