/*

 * Mon Apr 20 12:00:47 UTC 2020
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
      Random random0 = new Random();
      int[] intArray0 = new int[8];
      int int0 = Integer.MAX_VALUE;
      intArray0[0] = Integer.MAX_VALUE;
      random0.nextBoolean();
      int int1 = 1;
      intArray0[1] = 1;
      intArray0[2] = 0;
      int int2 = (-1);
      intArray0[3] = 0;
      intArray0[4] = (-154);
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      Cluster<EuclideanIntegerPoint> cluster0 = new Cluster<EuclideanIntegerPoint>(euclideanIntegerPoint0);
      List<EuclideanIntegerPoint> list0 = cluster0.getPoints();
      cluster0.addPoint(euclideanIntegerPoint0);
      cluster0.addPoint(euclideanIntegerPoint0);
      cluster0.addPoint(euclideanIntegerPoint0);
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(random0);
      int int3 = 3880;
      // Undeclared exception!
      kMeansPlusPlusClusterer0.cluster(list0, (-2840), 838);
  }
}
