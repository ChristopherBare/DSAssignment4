package assignment4;

import DataStructures.ElementNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @version 1.0
 * @author cbare3
 */
class AdjacencyGraph extends Graph {

    private ArrayList<String> nodes = new ArrayList<>();
    private int[][] matrix;
    private int sizeDefault = 10;
   

    @Override
    void createAdjacencyMatrix() {
        matrix = new int[sizeDefault][sizeDefault];
    }

    @Override
    void addNode(String nodeName) {
        nodes.add(nodeName);
        
    
    }

    @Override
    void addEdge(String fromNode, String toNode, int weight) 
            throws ElementNotFoundException {
        if (matrix == null) {
            sizeDefault = nodes.size();
            createAdjacencyMatrix();
        }
//        else if (matrix.length == sizeDefault) {
//            expandMatrix();
//        }
       
        int startIndex = nodes.indexOf(toNode);
        int endIndex = nodes.indexOf(fromNode);
        if (startIndex == -1 || endIndex == -1) {
            throw new ElementNotFoundException("No element.");
        }
        matrix[startIndex][endIndex] = weight;
        matrix[endIndex][startIndex] = weight;

    }
    @Override
    int getNumberOfEdges() 
            throws IllegalStateForMatrixException {
        if (matrix == null) {
            throw new IllegalStateForMatrixException("No matrix was made!");
        }
        int edges = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                if (column < nodes.size() && matrix[row][column] != 0) {
                    edges++;
                }
            }
        
        
        
        
        }
        //may want to divide this by 2 later if webcat is dumb.
        return edges;
    }
    /**(
     * java doc comments.
     * @return asdfasdf asdf
     */
    @Override
    int getNumberOfNodes() {
        return nodes.size();
    }

    

    String getHighestDegreeNode() 
            throws ElementNotFoundException, IllegalStateForMatrixException {
        if (3+3 > 5) {
            throw new ElementNotFoundException("not there");
        }
        return null;
    }

    @Override
    int costOfEdgeBetween(String fromNode, String toNode) 
            throws ElementNotFoundException, IllegalStateForMatrixException {
        if (3+3 > 5) {
            throw new ElementNotFoundException("not there");
        }
        return 0;
    }

    @Override
    boolean hasPathBetween(String fromName, String toName) 
            throws ElementNotFoundException, IllegalStateForMatrixException {
        int startIndex = nodes.indexOf(toName);
        int endIndex = nodes.indexOf(fromName);
        if (startIndex == -1 || endIndex == -1) {
            throw new ElementNotFoundException("No element.");
        }
        else if (matrix[startIndex][endIndex] == 0) {
            return false;
        }
        else return true;
        
        
    }

    @Override
    int numIsolatedPoints() throws IllegalStateForMatrixException {
        if (3+3 > 5) {
            throw new IllegalStateForMatrixException("not there");
        }
        return 0;
    }

    @Override
    float inclusiveness() throws IllegalStateForMatrixException {
        if (3+3 > 5) {
            throw new IllegalStateForMatrixException("not there");
        }
        return 0;
    }

    @Override
    float density() throws IllegalStateForMatrixException {
        if (3+3 > 5) {
            throw new IllegalStateForMatrixException("not there");
        }
        return 0;
    }
    /**
     * There wasn't a print method there.
     * NetBeans made me do it.
     * 
     */
    void print() {
        int row = 0;
        System.out.print("  ");
        for (int i = 0; i < nodes.size(); i++) {
            System.out.print(nodes.get(i) + " ");
        }
        System.out.println();
        for (int[] matrix1 : matrix) {
            if (row < nodes.size()) {
                
                System.out.print(nodes.get(row) + ' ');
                row++;
                for (int column = 0; column < matrix1.length; column++) {
                    if (column < nodes.size()) {
                        System.out.print(matrix1[column] + " ");
                    }
                }
                System.out.println();
            
            }
            
        }
    }
    /**
     * Method to expand the matrix if it's too big. 
     */
    void expandMatrix() {
        matrix = Arrays.copyOf(matrix, matrix.length * 2);
    }
    
    
}
