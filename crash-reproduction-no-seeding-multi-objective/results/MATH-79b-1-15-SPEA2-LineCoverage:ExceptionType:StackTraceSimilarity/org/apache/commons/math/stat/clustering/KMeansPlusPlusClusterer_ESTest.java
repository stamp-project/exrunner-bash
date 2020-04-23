/*

 * Mon Apr 20 11:53:33 UTC 2020
 */

package org.apache.commons.math.stat.clustering;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import java.util.Random;
import org.apache.commons.math.stat.clustering.Cluster;
import org.apache.commons.math.stat.clustering.EuclideanIntegerPoint;
import org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class KMeansPlusPlusClusterer_ESTest extends KMeansPlusPlusClusterer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 0;
      int[] intArray0 = new int[5];
      intArray0[0] = Integer.MAX_VALUE;
      intArray0[1] = Integer.MAX_VALUE;
      intArray0[2] = 1;
      intArray0[3] = 1;
      intArray0[4] = Integer.MAX_VALUE;
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      Cluster<EuclideanIntegerPoint> cluster0 = new Cluster<EuclideanIntegerPoint>(euclideanIntegerPoint0);
      List<EuclideanIntegerPoint> list0 = cluster0.getPoints();
      EuclideanIntegerPoint euclideanIntegerPoint1 = new EuclideanIntegerPoint(intArray0);
      cluster0.addPoint(euclideanIntegerPoint1);
      int int1 = 21;
      Random random0 = new Random(0L);
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(random0);
      kMeansPlusPlusClusterer0.cluster(list0, (-1), (-9));
      List<EuclideanIntegerPoint> list1 = cluster0.getPoints();
      EuclideanIntegerPoint euclideanIntegerPoint2 = new EuclideanIntegerPoint(intArray0);
      cluster0.addPoint(euclideanIntegerPoint1);
      euclideanIntegerPoint1.centroidOf(list1);
      Random random1 = new Random(446L);
      cluster0.addPoint(euclideanIntegerPoint1);
      // Undeclared exception!
      kMeansPlusPlusClusterer0.cluster(list1, (-1), Integer.MAX_VALUE);
  }
}
