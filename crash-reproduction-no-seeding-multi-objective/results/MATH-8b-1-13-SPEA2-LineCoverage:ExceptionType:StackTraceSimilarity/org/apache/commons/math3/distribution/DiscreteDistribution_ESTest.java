/*

 * Tue Apr 21 10:28:24 UTC 2020
 */

package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math3.distribution.DiscreteDistribution;
import org.apache.commons.math3.random.ISAACRandom;
import org.apache.commons.math3.util.Pair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DiscreteDistribution_ESTest extends DiscreteDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 396;
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Double double0 = new Double(396);
      Pair<Object, Double> pair0 = new Pair<Object, Double>(linkedList0, double0);
      linkedList0.add(pair0);
      Double double1 = new Double(396);
      Double.sum(396, 396);
      Pair<Double, Double> pair1 = new Pair<Double, Double>(double1, double1);
      Pair<Object, Double> pair2 = new Pair<Object, Double>(pair1);
      linkedList0.addFirst(pair2);
      ISAACRandom iSAACRandom0 = new ISAACRandom(396);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>(iSAACRandom0, linkedList0);
      // Undeclared exception!
      discreteDistribution0.sample(3549);
  }
}
