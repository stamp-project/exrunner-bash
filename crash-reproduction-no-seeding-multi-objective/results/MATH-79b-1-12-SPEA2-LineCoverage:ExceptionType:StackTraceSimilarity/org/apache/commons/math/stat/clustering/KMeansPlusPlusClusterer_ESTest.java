/*

 * Mon Apr 20 11:54:42 UTC 2020
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
      int[] intArray0 = new int[4];
      intArray0[0] = (-43);
      intArray0[1] = Integer.MIN_VALUE;
      intArray0[2] = 0;
      intArray0[3] = 0;
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      Cluster<EuclideanIntegerPoint> cluster0 = new Cluster<EuclideanIntegerPoint>(euclideanIntegerPoint0);
      List<EuclideanIntegerPoint> list0 = cluster0.getPoints();
      cluster0.addPoint(euclideanIntegerPoint0);
      EuclideanIntegerPoint euclideanIntegerPoint1 = new EuclideanIntegerPoint(intArray0);
      cluster0.addPoint(euclideanIntegerPoint0);
      cluster0.addPoint(euclideanIntegerPoint0);
      EuclideanIntegerPoint euclideanIntegerPoint2 = new EuclideanIntegerPoint(intArray0);
      Cluster<EuclideanIntegerPoint> cluster1 = new Cluster<EuclideanIntegerPoint>(euclideanIntegerPoint1);
      cluster1.getPoints();
      cluster1.addPoint(euclideanIntegerPoint2);
      EuclideanIntegerPoint euclideanIntegerPoint3 = new EuclideanIntegerPoint(intArray0);
      cluster1.addPoint(euclideanIntegerPoint2);
      cluster1.addPoint((EuclideanIntegerPoint) null);
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(random0);
      Random random1 = new Random();
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer1 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(random1);
      // Undeclared exception!
      kMeansPlusPlusClusterer1.cluster(list0, (-344), (-1264));
  }
}
