/*

 * Mon Apr 20 11:08:51 UTC 2020
 */

package org.apache.commons.math3.geometry.partitioning;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.Space;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.BoundarySizeVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractRegion_ESTest extends AbstractRegion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BoundarySizeVisitor<Euclidean1D> boundarySizeVisitor0 = new BoundarySizeVisitor<Euclidean1D>();
      Vector1D vector1D0 = new Vector1D(81.8897920207275);
      BSPTree<Euclidean1D> bSPTree0 = new BSPTree<Euclidean1D>();
      Vector2D vector2D0 = Vector2D.NaN;
      Line line0 = new Line(vector2D0, 2465.7812245);
      Line line1 = new Line(line0);
      Vector1D vector1D1 = line1.toSubSpace(vector2D0);
      vector1D1.subtract((-1.0), (Vector<Euclidean1D>) vector1D0);
      vector1D0.distance((Vector<Euclidean1D>) vector1D1);
      Space space0 = vector1D0.getSpace();
      Euclidean3D.getInstance();
      IntervalsSet intervalsSet0 = new IntervalsSet(Double.NaN, 2465.7812245);
      BSPTree<Euclidean2D> bSPTree1 = new BSPTree<Euclidean2D>(space0);
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree1);
      // Undeclared exception!
      polygonsSet0.getSize();
  }
}
