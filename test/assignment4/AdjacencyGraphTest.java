/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import DataStructures.ElementNotFoundException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author christopher1
 */
public class AdjacencyGraphTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
    

    /**
     * Test of createAdjacencyMatrix method, of class AdjacencyGraph.
     */
    @Test
    public void testCreateAdjacencyMatrix() {
        System.out.println("createAdjacencyMatrix");
        AdjacencyGraph instance = new AdjacencyGraph();
        instance.createAdjacencyMatrix();
        
    }

    /**
     * Test of addNode method, of class AdjacencyGraph.
     */
    @Test
    public void testAddNode() {
        System.out.println("addNode");
        String nodeName = "";
        AdjacencyGraph instance = new AdjacencyGraph();
        instance.addNode(nodeName);
       
    }

    /**
     * Test of addEdge method, of class AdjacencyGraph.
     */
    @Test
    public void testAddEdge() throws ElementNotFoundException {
        System.out.println("addEdge");
        String fromNode = "";
        String toNode = "";
        int weight = 0;
        AdjacencyGraph instance = new AdjacencyGraph();
        instance.addEdge(fromNode, toNode, weight);
        
    }

    /**
     * Test of getNumberOfEdges method, of class AdjacencyGraph.
     */
    @Test
    public void testGetNumberOfEdges() throws Exception {
        System.out.println("getNumberOfEdges");
        AdjacencyGraph instance = new AdjacencyGraph();
        int expResult = 0;
        int result = instance.getNumberOfEdges();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getNumberOfNodes method, of class AdjacencyGraph.
     */
    @Test
    public void testGetNumberOfNodes() {
        System.out.println("getNumberOfNodes");
        AdjacencyGraph instance = new AdjacencyGraph();
        int expResult = 0;
        int result = instance.getNumberOfNodes();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getHighestDegreeNode method, of class AdjacencyGraph.
     */
    @Test
    public void testGetHighestDegreeNode() throws Exception {
        System.out.println("getHighestDegreeNode");
        AdjacencyGraph instance = new AdjacencyGraph();
        String expResult = "";
        String result = instance.getHighestDegreeNode();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of costOfEdgeBetween method, of class AdjacencyGraph.
     */
    @Test
    public void testCostOfEdgeBetween() throws Exception {
        System.out.println("costOfEdgeBetween");
        String fromNode = "";
        String toNode = "";
        AdjacencyGraph instance = new AdjacencyGraph();
        int expResult = 0;
        int result = instance.costOfEdgeBetween(fromNode, toNode);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of hasPathBetween method, of class AdjacencyGraph.
     */
    @Test
    public void testHasPathBetween() throws Exception {
        System.out.println("hasPathBetween");
        String fromName = "";
        String toName = "";
        AdjacencyGraph instance = new AdjacencyGraph();
        boolean expResult = false;
        boolean result = instance.hasPathBetween(fromName, toName);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of numIsolatedPoints method, of class AdjacencyGraph.
     */
    @Test
    public void testNumIsolatedPoints() throws Exception {
        System.out.println("numIsolatedPoints");
        AdjacencyGraph instance = new AdjacencyGraph();
        int expResult = 0;
        int result = instance.numIsolatedPoints();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of inclusiveness method, of class AdjacencyGraph.
     */
    @Test
    public void testInclusiveness() throws Exception {
        System.out.println("inclusiveness");
        AdjacencyGraph instance = new AdjacencyGraph();
        float expResult = 0.0F;
        float result = instance.inclusiveness();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of density method, of class AdjacencyGraph.
     */
    @Test
    public void testDensity() throws Exception {
        System.out.println("density");
        AdjacencyGraph instance = new AdjacencyGraph();
        float expResult = 0.0F;
        float result = instance.density();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of print method, of class AdjacencyGraph.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        AdjacencyGraph instance = new AdjacencyGraph();
        instance.print();
        
    }

    /**
     * Test of expandMatrix method, of class AdjacencyGraph.
     */
    @Test
    public void testExpandMatrix() {
        System.out.println("expandMatrix");
        AdjacencyGraph instance = new AdjacencyGraph();
        instance.expandMatrix();
        
    }
    
}
