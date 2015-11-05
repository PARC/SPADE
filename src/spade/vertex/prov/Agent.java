/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spade.vertex.prov;

import spade.core.AbstractVertex;

/**
 *
 * @author dawood
 */
public class Agent extends AbstractVertex {

    private static final long serialVersionUID = 1L;

    public Agent() {
        addAnnotation("type", "Agent");
    }
}
