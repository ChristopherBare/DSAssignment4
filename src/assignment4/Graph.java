/*
 * ITCS 2214 - Data Structures
 * Fall 2016
 * CCI@UNCC
 */
package assignment4;

import DataStructures.ElementNotFoundException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author mapq
 */
abstract class Graph {
    // You must declare an adjacency matrix

    /**
     * buildGraphs reads a data file and creates a graph
     * calling other routines to do the work of storing
     * the data.
     * @param theFilename
     * @throws FileNotFoundException
     * @throws IOException 
     * @throws ElementNotFoundException
     * @throws IllegalStateForMatrixException
     */
    void buildGraph(String theFilename)
            throws FileNotFoundException, IOException, 
            ElementNotFoundException, IllegalStateForMatrixException {

        File file = new File(theFilename);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String str;
        boolean firstEdge = true;

        while ((str = in.readLine()) != null) {

            String[] tokens = str.split(":");
            if (tokens.length < 2) {
                throw new IOException("Error in input line:" + tokens.length);
            } else {
                if (tokens[0].compareTo("node") == 0) {
                    // tokens[1] is a node name
                    // add name to some list so you know the index
                    addNode(tokens[1].trim());
                } else if (tokens[0].compareTo("edge") == 0) {
                    if (firstEdge) {
                        firstEdge = false;
                        createAdjacencyMatrix();
                    }
                    // we have an edge
                    String[] parts = tokens[1].split(",");

                    // parts[0] is fromNode
                    // parts[1] is toNode
                    // parts[2] is weight
                    int weight = Integer.parseInt(parts[2]);

                    // look up the index to the fromNode and toNode and
                    // add them to an adjancency matrix
                    addEdge(parts[0].trim(), parts[1].trim(), weight);
                }
            }
        }
    }

    /**
     * Creates an adjacency matrix (2d int array) based
     * on how many nodes have been added. This routine
     * is called from the buildGraph() above.
     */
    abstract void createAdjacencyMatrix();

    /**
     * Adds a note to some internal list. This list is used
     * for two purposes. First, it is used to convert the node
     * name to an index. Second, the size of the internal list
     * is later used to create an adjacency matrix.
     * @param nodeName 
     */
    abstract void addNode(String nodeName);

    /**
     * Adds an edge to the adjacency matrix. Note that the
     * array is a mirror across the main diagonal, it would
     * be easier to process the matrix later if you enforce
     * the mirror property.
     * @param fromNode
     * @param toNode
     * @param weight 
     */
    abstract void addEdge(String fromNode, String toNode, int weight)
            throws ElementNotFoundException, IllegalStateForMatrixException;

    /**
     * Returns the number of nodes in the graph. This is
     * also the size of the internal list of nodes and also
     * the size of the matrix.
     * @return number of nodes
     */
    abstract int getNumberOfNodes();

    /**
     * Returns the number of edges in the graph.
     * @return number of edges
     */
    abstract int getNumberOfEdges()
            throws IllegalStateForMatrixException;

    /**
     * Returns the node with the highest degree. This routine must 
     * count how many edges are connected to each node in the graph.
     * and return the node that has the most connected edges
     * @return the name of the highest degree node (String)
     */
    abstract String getHighestDegreeNode()
            throws ElementNotFoundException, IllegalStateForMatrixException;

    /**
     * Returns weight/cost of an edge between fromNode to
     * toNode, if there is an edge. Returns -1 otherwise. 
     * @param fromNode asdfasdf
     * @param toNode asdfasdf
     * @return int
     */
    abstract int costOfEdgeBetween(String fromNode, String toNode)
            throws ElementNotFoundException, IllegalStateForMatrixException;

    /**
     * Returns true if there is a path between fromNode to
     * toNode. The algorithm to use is here:
     * 
     * hasPath (start, end)
     *	create boolean array to mark visited
	visited[start] = true
	add to queue(start)
	while (!queue.isEmpty()) {
		s = dequeue()
		for all the edges starting at s {
			p = node edge leads to (e.g., s->p)
			if (p == end)
				return true
			else if (!visited[p]) {
				visited[p] = true
				queue.add(p)
			}
		}
	}
	return false
        * */
    
     /**
     * @param fromNode starting node
     * @param toNode ending node
     * @return boolean true if there is a path between start and end, false 
     * otherwise
     */
    abstract boolean hasPathBetween(String fromName, String toName)
            throws ElementNotFoundException, IllegalStateForMatrixException;


    /**
     * Returns the number of isolated nodes in the graph, which is the number
     * of nodes not connected to any other nodes.
     * @return int number of unconnected nodes
     * @throws IllegalStateForMatrixException 
     */
    abstract int numIsolatedPoints() throws IllegalStateForMatrixException;
    
    /**
     * Inclusiveness is the percentage of points in the graph that
     * are not isolated
     * @return float, percentage of connected points
     * @throws IllegalStateForMatrixException 
     */
    abstract float inclusiveness() throws IllegalStateForMatrixException;
    
    
    /**
     * Density is the defined as edges/(nodes*(nodes-1)/2)
     * @return float, the density of the graph
     * @throws IllegalStateForMatrixException 
     */
    abstract float density() throws IllegalStateForMatrixException;

}
