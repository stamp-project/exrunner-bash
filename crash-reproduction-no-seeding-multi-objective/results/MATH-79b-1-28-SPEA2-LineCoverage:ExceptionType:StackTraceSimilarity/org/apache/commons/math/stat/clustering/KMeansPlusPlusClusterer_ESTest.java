/*

 * Mon Apr 20 11:57:45 UTC 2020
 */

package org.apache.commons.math.stat.clustering;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.Random;
import java.util.function.UnaryOperator;
import org.apache.commons.math.stat.clustering.EuclideanIntegerPoint;
import org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class KMeansPlusPlusClusterer_ESTest extends KMeansPlusPlusClusterer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Random random0 = mock(Random.class, new ViolatedAssumptionAnswer());
      KMeansPlusPlusClusterer kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer(random0);
      UnaryOperator<EuclideanIntegerPoint> unaryOperator0 = UnaryOperator.identity();
      UnaryOperator.identity();
      LinkedList<EuclideanIntegerPoint> linkedList0 = new LinkedList<EuclideanIntegerPoint>();
      linkedList0.replaceAll(unaryOperator0);
      int[] intArray0 = new int[7];
      intArray0[0] = 1;
      intArray0[1] = (-2147483624);
      intArray0[2] = 2213;
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      linkedList0.add(euclideanIntegerPoint0);
      intArray0[3] = 2213;
      intArray0[4] = (-2147483624);
      euclideanIntegerPoint0.toString();
      intArray0[5] = 2213;
      intArray0[6] = 2213;
      linkedList0.add(euclideanIntegerPoint0);
      EuclideanIntegerPoint euclideanIntegerPoint1 = new EuclideanIntegerPoint(intArray0);
      linkedList0.add(euclideanIntegerPoint1);
      Random random1 = new Random();
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer1 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(random1);
      // Undeclared exception!
      kMeansPlusPlusClusterer1.cluster(linkedList0, (-1273), (-11));
  }
}
