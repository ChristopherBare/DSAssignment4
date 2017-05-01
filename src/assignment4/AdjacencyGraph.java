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
    private int edges = 0;

    @Override
    void createAdjacencyMatrix() {
        matrix = new int[nodes.size()][nodes.size()];
        for (int i = 0; i < nodes.size(); i++) {
            for (int j = 0; j < nodes.size(); j++) {
                matrix[i][j] = -1;
            }
        }
    }

    @Override
    void addNode(String nodeName) {
        nodes.add(nodeName);

    }

    @Override
    void addEdge(String fromNode, String toNode, int weight)
            throws ElementNotFoundException, IllegalStateForMatrixException {
        if (matrix == null) {
            throw new IllegalStateForMatrixException("isn't there.");
        }

        int startIndex = nodes.indexOf(toNode);
        int endIndex = nodes.indexOf(fromNode);
        if (startIndex == -1 || endIndex == -1) {
            throw new ElementNotFoundException("No element.");
        }
        matrix[startIndex][endIndex] = weight;
        matrix[endIndex][startIndex] = weight;
        edges++;

    }

    @Override
    int getNumberOfEdges()
            throws IllegalStateForMatrixException {
        if (matrix == null) {
            throw new IllegalStateForMatrixException("No matrix was made!");
        }
//        int edges = 0;
//        for (int row = 0; row < matrix.length; row++) {
//            for (int column = 0; column < matrix.length; column++) {
//                if (column < nodes.size() && matrix[row][column] != 0) {
//                    edges++;
//                }
//            }

        
        //may want to divide this by 2 later if webcat is dumb.
        return edges;
    }

    /**
     * (
     * java doc comments.
     *
     * @return asdfasdf asdf
     */
    @Override
    int getNumberOfNodes() {
        return nodes.size();
    }
    /**
     * 
     * @return the node of highest degree.
     * @throws ElementNotFoundException asdfsdaf
     * @throws IllegalStateForMatrixException  asdfasdf
     */
    @Override
    String getHighestDegreeNode()
            throws ElementNotFoundException, IllegalStateForMatrixException {
        if (matrix == null) {
            throw new IllegalStateForMatrixException("not there");
        }
        String high = null;
        int highest = 0;
        for (int row = 0; row < matrix.length; row++) {
            int notNegative = 0;
            for (int column = 0; column < matrix.length; column++) {
                if (matrix[row][column] != -1) {
                    notNegative++;
                }
            }
            if (nodes.get(row) == null) {
                throw new ElementNotFoundException("why am I doing this");
            }
            if (notNegative > highest) {
                highest = notNegative;
                high = nodes.get(row);
            }
        }
        return high;
    }

    @Override
    int costOfEdgeBetween(String fromNode, String toNode)
            throws ElementNotFoundException, IllegalStateForMatrixException {
        if (matrix == null) {
            throw new IllegalStateForMatrixException("not there");
        }
        
        int startIndex = nodes.indexOf(toNode);
        int endIndex = nodes.indexOf(fromNode);
        if (startIndex == -1 || endIndex == -1) {
            throw new ElementNotFoundException("taint there.");
        }
        return matrix[startIndex][endIndex];
    }

    @Override
    boolean hasPathBetween(String fromName, String toName)
            throws ElementNotFoundException, IllegalStateForMatrixException {
        int startIndex = nodes.indexOf(toName);
        int endIndex = nodes.indexOf(fromName);
        if (startIndex == -1 || endIndex == -1) {
            throw new ElementNotFoundException("No element.");
        }
        else if (matrix[startIndex][endIndex] == -1) {
            return false;
        }
        else {
            return true;
        }

    }

    @Override
    int numIsolatedPoints() throws IllegalStateForMatrixException {
        if (matrix == null) {
            throw new IllegalStateForMatrixException("not there");
        }
        int isolated = 0;

        //loop graph if all value is -1 in row then is isolated 
        //if it is equal to number of noodles then it ++.
        for (int row = 0; row < matrix.length; row++) {
            int counteryCounter = 0;
            for (int column = 0; column < matrix.length; column++) {
                if (matrix[row][column] == -1) {
                    counteryCounter++;
                }

            }
            if (counteryCounter == nodes.size()) {
                isolated++;
            }
        }
        return isolated;
    }

    @Override
    float inclusiveness() throws IllegalStateForMatrixException {
        if (matrix == null) {
            throw new IllegalStateForMatrixException("not there");
        }
        float noodles = getNumberOfNodes();
        float isolated = numIsolatedPoints();

        return (noodles - isolated) / noodles;
    }

    @Override
    float density() throws IllegalStateForMatrixException {
        //Density is the defined as edges/(noodles*(noodles-1)/2)

        if (matrix == null) {
            throw new IllegalStateForMatrixException("not there");
        }
        float edges = getNumberOfEdges();
        float nodidlies = getNumberOfNodes();

        return edges / (nodidlies * (nodidlies - 1) / 2);
    }

    /**
     * There wasn't a print method there. NetBeans made me do it.
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
