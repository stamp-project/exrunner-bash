/*

 * Mon Apr 20 11:54:24 UTC 2020
 */

package org.apache.commons.math.stat.clustering;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.Random;
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
      int int0 = 1411;
      Random random1 = new Random((-1159L));
      KMeansPlusPlusClusterer kMeansPlusPlusClusterer1 = new KMeansPlusPlusClusterer(random1);
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer2 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(random1);
      LinkedList<EuclideanIntegerPoint> linkedList0 = new LinkedList<EuclideanIntegerPoint>();
      int[] intArray0 = new int[6];
      intArray0[0] = Integer.MAX_VALUE;
      intArray0[1] = Integer.MAX_VALUE;
      intArray0[2] = 1411;
      intArray0[3] = 1411;
      intArray0[4] = 1411;
      intArray0[5] = 1411;
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      linkedList0.push(euclideanIntegerPoint0);
      EuclideanIntegerPoint euclideanIntegerPoint1 = new EuclideanIntegerPoint(intArray0);
      euclideanIntegerPoint1.toString();
      linkedList0.push(euclideanIntegerPoint0);
      EuclideanIntegerPoint euclideanIntegerPoint2 = new EuclideanIntegerPoint(intArray0);
      euclideanIntegerPoint0.toString();
      linkedList0.add(euclideanIntegerPoint2);
      // Undeclared exception!
      kMeansPlusPlusClusterer2.cluster(linkedList0, (-1), 3);
  }
}
