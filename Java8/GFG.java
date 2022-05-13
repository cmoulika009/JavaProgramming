
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class GFG {

	// A utility function to add an edge in an
	// undirected graph.
	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}

	// A utility function to print the adjacency list
	// representation of graph
	static void printGraph(ArrayList<ArrayList<Integer>> adj, int V) {
		for (int v = 0; v < V; ++v) {
			System.out.print("\n Adjacency list of vertex " + v + "\n head ");
			for (int x : adj.get(v)) {
				System.out.print("-> " + x);
			}
			System.out.println();
		}
	}

	/*
	 * Function to return true if the graph represented by the adjacency list
	 * represents a bus topology else return false
	 */
	static int checkBusTopologyUtil(ArrayList<ArrayList<Integer>> adj, int V, int E) {
		// a single node is termed as a bus topology
		if (V == 1) {
			return 1;
		}

		int[] vertexDegree = new int[V + 1];

		// calculate the degree of each vertex
		for (int i = 1; i <= V; i++) {
			for (int v : adj.get(i)) {
				vertexDegree[v]++;
			}
		}

		int countDegree2 = 0, countDegree1 = 0;
		int countCentralNodes = 0, centralNode = 0;
		for (int i = 1; i <= V; i++) {
			if (vertexDegree[i] == 2) {
				countDegree2++;
			} else if (vertexDegree[i] == 1) {
				countDegree1++;
			} else if (vertexDegree[i] == (V - 1)) {
				countCentralNodes++;
				centralNode = i;
			} else {

				// if any node has degree other
				// than 1 or 2, it is
				// NOT a bus topology
				return -1;
			}
		}

		// if both necessary conditions as discussed,
		// satisfy return true
		if (E == (V - 1) && countDegree1 == 2 && countDegree2 == (V - 2)) {
			return 1;
		} else if ((E == V) && countDegree2 == V) {
			return 3;
		} else if (E == (V - 1)) {
			if (countCentralNodes != 1)
				return -1;
			for (int i = 1; i <= V; i++) {

				// except for the central node
				// check if all other nodes have
				// degree 1, if not return false
				if (i == centralNode)
					continue;
				if (vertexDegree[i] != 1) {
					return -1;
				}
			}

			// if all three necessary
			// conditions as discussed,
			// satisfy return true
			return 2;
		}
		return -1;
	}

	// Function to check if the graph represents a bus topology
	static void checkBusTopology(ArrayList<ArrayList<Integer>> adj, int V, int E) {
		int isBus = checkBusTopologyUtil(adj, V, E);
		System.out.println(isBus);
	}

	// Driver code
	public static void main(String[] args) {

		// Graph 1
		int V = 5, E = 2;
		int[] input3 = {1,1,1,1,1} ;
		int[] input4 ={2,2,2,2,2};
		ArrayList<ArrayList<Integer>> adj1 = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < V + 1; i++) {
			adj1.add(new ArrayList<Integer>());
		}
		for (int i = 0, j = 0; i < input3.length; i++, j++) {
			addEdge(adj1, input3[i], input4[j]);
			//System.out.println(input3[i] + ":" + input4[j]);
		}
		checkBusTopology(adj1, V, E);

		/*
		 * addEdge(adj1, 1, 2); addEdge(adj1, 1, 3); addEdge(adj1, 3, 4); addEdge(adj1,
		 * 4, 5);
		 */

		// Graph 2
		V = 5;
		E = 4;
		ArrayList<ArrayList<Integer>> adj2 = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < (V + 1); i++) {
			adj2.add(new ArrayList<Integer>());
		}
		addEdge(adj2, 1, 2);
		addEdge(adj2, 3, 2);
		addEdge(adj2, 4, 2);
		addEdge(adj2, 5, 2);
		checkBusTopology(adj2, V, E);

		// Graph 2
		V = 3;
		E = 3;
		ArrayList<ArrayList<Integer>> adj3 = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < (V + 1); i++) {
			adj3.add(new ArrayList<Integer>());
		}
		addEdge(adj3, 1, 2);
		addEdge(adj3, 2, 3);
		addEdge(adj3, 3, 1);
		checkBusTopology(adj3, V, E);
	}
}

// This code is contributed by rag2127
