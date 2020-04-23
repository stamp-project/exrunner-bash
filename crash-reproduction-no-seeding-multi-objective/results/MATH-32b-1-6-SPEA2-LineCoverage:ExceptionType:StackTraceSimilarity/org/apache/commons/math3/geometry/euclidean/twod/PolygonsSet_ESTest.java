/*

 * Mon Apr 20 11:01:20 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.Hyperplane;
import org.apache.commons.math3.geometry.partitioning.Region;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.apache.commons.math3.geometry.partitioning.Transform;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PolygonsSet_ESTest extends PolygonsSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet();
      polygonsSet0.computeGeometricalProperties();
      Vector2D vector2D0 = Vector2D.ZERO;
      Vector2D vector2D1 = new Vector2D((-3088.49655), vector2D0);
      Line line0 = new Line(vector2D1, vector2D0);
      Line line1 = new Line(line0);
      IntervalsSet intervalsSet0 = new IntervalsSet((-1157.790079127), (-3088.49655));
      SubLine subLine0 = new SubLine(line1, intervalsSet0);
      SubOrientedPoint subOrientedPoint0 = new SubOrientedPoint((Hyperplane<Euclidean1D>) null, intervalsSet0);
      Region<Euclidean1D> region0 = subOrientedPoint0.getRemainingRegion();
      AbstractSubHyperplane<Euclidean2D, Euclidean1D> abstractSubHyperplane0 = subLine0.buildNew(line0, region0);
      SubHyperplane<Euclidean2D> subHyperplane0 = polygonsSet0.intersection(abstractSubHyperplane0);
      SubHyperplane<Euclidean2D> subHyperplane1 = (SubHyperplane<Euclidean2D>) mock(SubHyperplane.class, new ViolatedAssumptionAnswer());
      doReturn(subHyperplane0).when(subHyperplane1).copySelf();
      polygonsSet0.intersection(subHyperplane1);
      Transform<Euclidean2D, Euclidean1D> transform0 = (Transform<Euclidean2D, Euclidean1D>) mock(Transform.class, new ViolatedAssumptionAnswer());
      polygonsSet0.applyTransform(transform0);
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>();
      polygonsSet0.buildNew(bSPTree0);
      SubLine subLine1 = line1.wholeHyperplane();
      BSPTree<Euclidean2D> bSPTree1 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(subLine0, vector2D1).when(bSPTree1).getAttribute();
      doReturn(subLine1, subLine0).when(bSPTree1).getCut();
      PolygonsSet polygonsSet1 = new PolygonsSet(bSPTree1);
      // Undeclared exception!
      polygonsSet1.getBarycenter();
  }
}
