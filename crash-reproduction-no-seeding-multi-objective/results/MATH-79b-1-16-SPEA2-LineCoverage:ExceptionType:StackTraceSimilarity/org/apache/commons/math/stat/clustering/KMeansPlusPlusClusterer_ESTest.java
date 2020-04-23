/*

 * Mon Apr 20 11:57:43 UTC 2020
 */

package org.apache.commons.math.stat.clustering;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import java.util.Random;
import org.apache.commons.math.stat.clustering.Cluster;
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
      int[] intArray0 = new int[4];
      intArray0[0] = Integer.MAX_VALUE;
      int int0 = (-1044);
      intArray0[1] = (-1044);
      intArray0[2] = 1;
      intArray0[3] = 928;
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      Cluster<EuclideanIntegerPoint> cluster0 = new Cluster<EuclideanIntegerPoint>(euclideanIntegerPoint0);
      EuclideanIntegerPoint euclideanIntegerPoint1 = new EuclideanIntegerPoint(intArray0);
      cluster0.addPoint(euclideanIntegerPoint1);
      cluster0.addPoint(euclideanIntegerPoint0);
      Random random1 = new Random();
      euclideanIntegerPoint0.distanceFrom(euclideanIntegerPoint1);
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer1 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(random1);
      cluster0.addPoint(euclideanIntegerPoint0);
      random1.nextInt(724);
      euclideanIntegerPoint0.distanceFrom(euclideanIntegerPoint1);
      List<EuclideanIntegerPoint> list0 = cluster0.getPoints();
      // Undeclared exception!
      kMeansPlusPlusClusterer1.cluster(list0, 1, Integer.MAX_VALUE);
  }
}
