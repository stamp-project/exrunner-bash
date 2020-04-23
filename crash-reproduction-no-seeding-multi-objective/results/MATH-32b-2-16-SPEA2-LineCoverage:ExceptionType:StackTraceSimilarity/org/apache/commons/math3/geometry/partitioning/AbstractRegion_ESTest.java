/*

 * Mon Apr 20 11:12:51 UTC 2020
 */

package org.apache.commons.math3.geometry.partitioning;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractRegion_ESTest extends AbstractRegion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<SubHyperplane<Euclidean2D>> linkedList1 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      SubLine subLine1 = new SubLine(vector2D0, vector2D0);
      vector2D0.getNormInf();
      subLine0.intersection(subLine1, false);
      subLine1.intersection(subLine0, true);
      LinkedList<SubHyperplane<Euclidean1D>> linkedList2 = new LinkedList<SubHyperplane<Euclidean1D>>();
      IntervalsSet intervalsSet0 = new IntervalsSet(linkedList2);
      IntervalsSet intervalsSet1 = new IntervalsSet();
      Object object0 = new Object();
      BSPTree<Euclidean1D> bSPTree0 = new BSPTree<Euclidean1D>(object0);
      IntervalsSet intervalsSet2 = new IntervalsSet(bSPTree0);
      IntervalsSet intervalsSet3 = new IntervalsSet(bSPTree0);
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList1);
      Object object1 = new Object();
      BSPTree<Euclidean2D> bSPTree1 = new BSPTree<Euclidean2D>(object1);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree1);
      // Undeclared exception!
      polygonsSet1.getSize();
  }
}
