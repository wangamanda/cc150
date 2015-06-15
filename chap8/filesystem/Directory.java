package filesystem;
import java.util.List;
import java.util.ArrayList;

public class Directory extends Entry {
	List<Entry> files;

	public Directory(String n, Directory p) {
		super(n, null, p);
		files = new ArrayList<Entry>();
		size = getSize();
	}

	public double getSize(){
		double res = 0;
		for (int i = 0 ; i < files.size() ; i ++ ) {
			res += files.get(i).getSize();
		}
		return res;
	}

	public void addEntry(Entry e) {
		files.add(e);
	}

	public boolean deleteEntry(Entry e) {
		for (int i = 0 ; i < files.size(); i ++ ) {
			if (files.get(i).equals(e)){
				files.remove(e);
				return true;
			}
		}
		return false;
	}

}

