import java.util.ArrayList;

public class LockNode{
	int lockId;
	ArrayList<LockNode> children;
	public enum VisitState{
		Visited, Visiting, Fresh
	};

	public LockNode(int id) {
		lockId = id;
		children = new ArrayList<LockNode>();
	}

	public void insert(LockNode n) {
		children.add(n);
	}

	public void remove(LockNode n) {
		children.remove(n);
	}

	public boolean hasCycle(HashMap<Integer, Boolean> map, VisitState[] visited) {
		if (map.containsKey(lockId)){
			map.put(lockId, true);
		}

		if(visited[lockId] == VisitState.Visiting) {
			return true;
		} else if(visited[lockId] == VisitState.Fresh) {
			visited[lockId] = VisitState.Visiting;
			for (LockNode node : children){
				if (node.hasCycle(map, visited)) {
					return true;
				}
			}
			visited[lockId] = VisitState.Visited;
		}

		return false;
	}
}
