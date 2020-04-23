/*

 * Mon Apr 20 11:24:23 UTC 2020
 */

package org.apache.commons.math3.geometry.partitioning;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractRegion_ESTest extends AbstractRegion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      Vector2D vector2D0 = new Vector2D(3.0095696449279785, 0.0);
      Vector2D vector2D1 = new Vector2D((-1720.3776), vector2D0, 3.0095696449279785, vector2D0, (-2557.98715), vector2D0);
      SubLine subLine0 = new SubLine(vector2D1, vector2D1);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn("", "", "").when(bSPTree0).toString();
      doReturn(polygonsSet0, subLine0).when(bSPTree0).getAttribute();
      doReturn(subLine0, subLine0).when(bSPTree0).getCut();
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      // Undeclared exception!
      polygonsSet1.getSize();
  }
}
