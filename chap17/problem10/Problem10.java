package problem10;

import java.util.ArrayList;

public class Problem10 {
	public static String encodeToString(Element root) {
		StringBuilder sb = new StringBuilder();
		encodeToString(root, sb);
		return sb.toString();
	}

	public static void encodeToString(Element root, StringBuilder sb) {
		encode(root.getTagCode(), sb);
		for (Attribute attr : root.attributes) {
			encode(attr, sb);
		}
		encodeEnd(sb);
		encode(root.value, sb);
		for (Element child : root.children) {
			encodeToString(child, sb);
		}
		encodeEnd(sb);
	}

	public static void encodeEnd(StringBuilder sb) {
		sb.append("0 ");
	}

	public static void encode(String str, StringBuilder sb) {
		str.replace("0","\\0");
		sb.append(str+" ");
	}

	public static void encode(Attribute attr, StringBuilder sb) {
		sb.append(attr.getTagCode()+" ");
		sb.append(attr.value+" ");
	}

	public static void main(String[] args) {
		Element root = new Element("family");
		Attribute a1 = new Attribute("lastName", "McDowell");
		Attribute a2 = new Attribute("state", "CA");
		root.insert(a1);
		root.insert(a2);

		Element child = new Element("person", "Some Message");
		Attribute a3 = new Attribute("firstName", "Gayle");
		child.insert(a3);

		root.insert(child);

		String s = encodeToString(root);
		System.out.println(s);
	}
}
