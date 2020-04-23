/*

 * Tue Apr 21 10:28:10 UTC 2020
 */

package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math3.distribution.DiscreteDistribution;
import org.apache.commons.math3.util.Pair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DiscreteDistribution_ESTest extends DiscreteDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Byte> linkedList0 = new LinkedList<Byte>();
      LinkedList<Pair<Object, Double>> linkedList1 = new LinkedList<Pair<Object, Double>>();
      Double double0 = new Double(2147483634L);
      Byte byte0 = new Byte((byte) (-15));
      Pair<Object, Double> pair0 = new Pair<Object, Double>(byte0, double0);
      linkedList1.add(pair0);
      Pair<Object, Double> pair1 = new Pair<Object, Double>(linkedList0, double0);
      linkedList1.add(pair1);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>(linkedList1);
      // Undeclared exception!
      discreteDistribution0.sample(49);
  }
}
