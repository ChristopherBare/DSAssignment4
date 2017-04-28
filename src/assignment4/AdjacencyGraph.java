package assignment4;

import DataStructures.ElementNotFoundException;

/**
 *
 * @author christopher1
 */
class AdjacencyGraph extends Graph {

    @Override
    void createAdjacencyMatrix() {
        
    }

    @Override
    void addNode(String nodeName) {
        }

    @Override
    void addEdge(String fromNode, String toNode, int weight) throws ElementNotFoundException, IllegalStateForMatrixException {
     }

    @Override
    int getNumberOfNodes() {
        return 0;
    }

    @Override
    int getNumberOfEdges() throws IllegalStateForMatrixException {
        return 0;
    }

    @Override
    String getHighestDegreeNode() throws ElementNotFoundException, IllegalStateForMatrixException {
        return null;
    }

    @Override
    int costOfEdgeBetween(String fromNode, String toNode) throws ElementNotFoundException, IllegalStateForMatrixException {
        return 0;
    }

    @Override
    boolean hasPathBetween(String fromName, String toName) throws ElementNotFoundException, IllegalStateForMatrixException {
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

    void print() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
