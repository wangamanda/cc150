package jukebox;

public class JukeBox {
	List<CD> cds;

	public JukeBox(List<CD> list) {
		cds = list;
	}

	public void selectCD(int i){
		CD cd = cds.get(i);
		cd.play();
	}

	public void play(){}

	public void stop(){}

	public void pause(){}

	public void changeCD(CD cd){
		cds.remove(0);
		cds.add(cd);
	}

	public void addCD(CD cd) {
		cds.add(cd);
	}

	public void removeCD() {
		cds.remove(0);
	}
}
