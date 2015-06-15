package hashtable;

import java.util.LinkedList;

public class Hash<K, V>{
	LinkedList<Cell<K, V>>[] table;
	int MAX_SIZE = 10;

	public Hash(){
		table = (LinkedList<Cell<K, V>>[])new LinkedList[MAX_SIZE];
	}

	public int hashCode(K key) {
		return key.toString().length() % MAX_SIZE;
	}

	public void put(K key, V value) {
		int code = hashCode(key);
		if (table[code] == null) {
			table[code] = new LinkedList<Cell<K, V>>();
		}
		LinkedList<Cell<K, V>> list = table[code];
		for (Cell<K, V> cell : list) {
			if (cell.equals(key)) {
				list.remove(cell);
				break;
			}
		}
		list.add(new Cell<K,V>(key, value));
	}

	public V get(K key) {
		int code = hashCode(key);
		LinkedList<Cell<K, V>> list = table[code];
		if (list == null) {
			return null;
		}
		for (Cell<K, V> cell : list) {
			if (cell.equals(key)) {
				return cell.getValue();
			}
		}
		return null;
	}
}
