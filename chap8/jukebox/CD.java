package jukebox;

import java.util.List;
import java.util.ArrayList;

public class CD {
	List<Song> songs;
	String name;
	String category;

	public CD(List<Song> list, String n, String c) {
		songs = list;
		name = n;
		category = c;
	}

	public void play(){
		for (int i = 0 ; i < songs.size() ; i ++ ){
			songs.get(i).play();
		}
	}
}
