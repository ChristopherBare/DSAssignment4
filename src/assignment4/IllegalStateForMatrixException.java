/*
 * ITCS 2214 - Data Structures
 * Fall 2016
 * CCI@UNCC
 */
package assignment4;


/**
 * Exception used in graph.
 * @author clatulip
 * @author perez
 */
public class IllegalStateForMatrixException extends Exception {

    public IllegalStateForMatrixException(String el) {
        super("Illegal call to "+el + " before the matrix was created (must call createAdjacencyMatrix)");
    }

}
