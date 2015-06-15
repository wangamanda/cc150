package filesystem;

public class Entry{
	Directory parent;
	long createdTime;
	long updatedTime;
	long accessedTime;
	String name;
	String author;
	double size;

	public Entry(String n, String a, Directory p) {
		name = n;
		author = a;
		parent = p;
		createdTime = System.currentTimeMillis();
		updatedTime = System.currentTimeMillis();
		accessedTime = System.currentTimeMillis();
		size = 1000;
	}

	public boolean delete(){
		if (parent == null) {
			return false;
		} else {
			return parent.deleteEntry(this);
		}
	}

	public double getSize(){
		return size;
	}

	public String getFullPath(){
		if(parent == null) {
			return name;
		}
		return parent.getFullPath() + "/" + name;
	}

	public long getCreateTime(){
		return createdTime;
	}

	public long getUpdatedTime(){
		return updatedTime;
	}

	public long getAccessedTime(){
		return accessedTime;
	}

	public String getName(){
		return name;
	}

	public String getAuthor(){
		return author;
	}

	public void changeName(String n) {
		name = n;
	}

	public void access(){
		accessedTime = System.currentTimeMillis();
	}

	public void update(){
		updatedTime = System.currentTimeMillis();
	}
}
