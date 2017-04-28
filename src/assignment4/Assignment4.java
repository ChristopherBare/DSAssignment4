/*
 * ITCS 2214 - Data Structures
 * Fall 2016
 * CCI@UNCC
 */
package assignment4;

import DataStructures.ElementNotFoundException;

/**
 * @version 1.0
 * @author mapq , cbare3
 */
public class Assignment4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
            throws ElementNotFoundException, IllegalStateForMatrixException {
        AdjacencyGraph ag = new AdjacencyGraph();
        
        ag.addNode("A");
        ag.addNode("B");
        ag.addNode("C");
        ag.addNode("D");
        ag.createAdjacencyMatrix();
        ag.addEdge("A", "B", 5);
        ag.addEdge("A", "C", 2);
        ag.addEdge("B", "C", 1);
        ag.addEdge("B", "D", 2);
        ag.print();
        
        System.out.println("Num nodes:"
                + ag.getNumberOfNodes());
        System.out.println("Num edges:"
                + ag.getNumberOfEdges());

        System.out.println("Highest degree node = "
                + ag.getHighestDegreeNode());


        System.out.println("Cost of edge from A to B = "
                + ag.costOfEdgeBetween("A", "B"));
        System.out.println("Cost of edge from A to C = "
                + ag.costOfEdgeBetween("A", "C"));
        System.out.println("Cost of edge from B to C = "
                + ag.costOfEdgeBetween("B", "C"));
        System.out.println("Cost of edge from A to D = "
                + ag.costOfEdgeBetween("A", "D"));

        
        System.out.println("Has path from A to B = "
                + ag.hasPathBetween("A", "B"));
        System.out.println("Has path from A to C = "
                + ag.hasPathBetween("A", "C"));
        System.out.println("Has path from B to C = "
                + ag.hasPathBetween("B", "C"));
        System.out.println("Has path from A to D = "
                + ag.hasPathBetween("A", "D"));

        System.out.println("Number of isolated points is:  "
                + ag.numIsolatedPoints());
        System.out.println("Graph inclusiveness is: "
                + ag.inclusiveness());
        System.out.println("Graph density is: "
                + ag.density());
    }
    
}
