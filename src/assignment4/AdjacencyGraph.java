package assignment4;

import DataStructures.ElementNotFoundException;
import java.util.ArrayList;

/**
 * @version 1.0
 * @author cbare3
 */
class AdjacencyGraph extends Graph {

    private ArrayList<String> nodes = new ArrayList<>();
    private int[][] matrix;
    private int size = 10;

    @Override
    void createAdjacencyMatrix() {
       
    }

    @Override
    void addNode(String nodeName) {
        nodes.add(nodeName);
        
    
    }

    @Override
    void addEdge(String fromNode, String toNode, int weight) {
        if (matrix == null) {
            size = nodes.size();
            createAdjacencyMatrix();
        }

        int startIndex = nodes.indexOf(toNode);
        int endIndex = nodes.indexOf(fromNode);
        matrix[startIndex][endIndex] = weight;

    }
    @Override
    int getNumberOfEdges() 
            throws IllegalStateForMatrixException {
        return 0;
    }
    
    @Override
    int getNumberOfNodes() {
        return 0;
    }

    

    @Override
    String getHighestDegreeNode() 
            throws ElementNotFoundException, IllegalStateForMatrixException {
        return null;
    }

    @Override
    int costOfEdgeBetween(String fromNode, String toNode) 
            throws ElementNotFoundException, IllegalStateForMatrixException {
        return 0;
    }

    @Override
    boolean hasPathBetween(String fromName, String toName) 
            throws ElementNotFoundException, IllegalStateForMatrixException {
        return false;
    }

    @Override
    int numIsolatedPoints() throws IllegalStateForMatrixException {
        return 0;
    }

    @Override
    float inclusiveness() throws IllegalStateForMatrixException {
        return 0;
    }

    @Override
    float density() throws IllegalStateForMatrixException {
        return 0;
    }
    /**
     * There wasn't a print method there.
     * NetBeans made me do it.
     * 
     */
    void print() {
        for (int[] matrix1 : matrix) {
            for (int column = 0; column < matrix1.length; column++) {
                System.out.print(matrix1[column] + " ");
            }
            System.out.println();
        }
    }
    
    
}
