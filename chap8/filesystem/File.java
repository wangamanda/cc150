package filesystem;

public class File extends Entry{
	String content;

	public File(String n,String a, String c, Directory p, double sz) {
		super(n, a, p);
		size = sz;
		content = c;
	}

	public String getContent(){
		return content;
	}

	public void addContent(String c){
		content += c;
		updatedTime = System.currentTimeMillis();
	}

	public void readContent(){
		System.out.println(content);
	}
}
