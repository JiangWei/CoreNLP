/**
 * 
 */
package edu.stanford.nlp.neural;

import static org.junit.Assert.*;

import org.ejml.simple.SimpleMatrix;
import org.junit.Test;

/**
 * @author Minh-Thang Luong <lmthang@stanford.edu>, created on Nov 15, 2013
 *
 */
public class UtilsTest {

  @Test
  public void testCosine() {
    double[][] values = new double[1][5];
    values[0] = new double[]{0.1, 0.2, 0.3, 0.4, 0.5};
    SimpleMatrix vector1 = new SimpleMatrix(values);
    
    values[0] = new double[]{0.5, 0.4, 0.3, 0.2, 0.1};
    SimpleMatrix vector2 = new SimpleMatrix(values);
    
    assertEquals(0.35000000000000003, Utils.dot(vector1, vector2), 1e-5);
    assertEquals(0.6363636363636364, Utils.cosine(vector1, vector2), 1e-5);
    
    vector1 = vector1.transpose();
    vector2 = vector2.transpose();
    assertEquals(0.35000000000000003, Utils.dot(vector1, vector2), 1e-5);
    assertEquals(0.6363636363636364, Utils.cosine(vector1, vector2), 1e-5);
  }

}
