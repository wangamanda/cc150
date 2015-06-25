package problem10;

import java.util.ArrayList;

public class Element{
	String tag;
	ArrayList<Attribute> attributes;
	ArrayList<Element> children;
	String value;

	public Element(String t) {
		tag = t;
		attributes = new ArrayList<Attribute>();
		children = new ArrayList<Element>();
		value = "";
	}

	public Element(String t, String v) {
		tag = t;
		value = v;
		attributes = new ArrayList<Attribute>();
		children = new ArrayList<Element>();
	}

	public void insert(Attribute attr) {
		attributes.add(attr);
	}

	public void insert(Element e) {
		children.add(e);
	}

	public String getTagCode() {
		switch(tag) {
			case "family":
				return "1";
			case "person":
				return "2";
			case "firstName":
				return "3";
			case "lastName":
				return "4";
			case "state":
				return "5";
			default:
				return "";
		}
	}
}
