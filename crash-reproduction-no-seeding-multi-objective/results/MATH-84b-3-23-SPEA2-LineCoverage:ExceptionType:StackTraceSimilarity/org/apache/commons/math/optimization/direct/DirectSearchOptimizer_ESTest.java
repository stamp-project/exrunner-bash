/*

 * Tue Apr 21 10:16:18 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import org.apache.commons.math.analysis.MultivariateRealFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.optimization.direct.MultiDirectional;
import org.apache.commons.math.optimization.direct.NelderMead;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DirectSearchOptimizer_ESTest extends DirectSearchOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MultivariateRealFunction multivariateRealFunction0 = mock(MultivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1820.0), (-1820.0), (-1820.0), (-1820.0), (-1820.0)).when(multivariateRealFunction0).value(any(double[].class));
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-639.93257);
      doubleArray0[1] = (-639.93257);
      MultivariateRealFunction multivariateRealFunction1 = mock(MultivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-639.93257), 2615.5061544105, 1.0, 0.0, 33.279857).when(multivariateRealFunction1).value(any(double[].class));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      GoalType goalType0 = GoalType.MAXIMIZE;
      NelderMead nelderMead0 = new NelderMead();
      MultiDirectional multiDirectional0 = new MultiDirectional(0.0, 1.0);
      multiDirectional0.getConvergenceChecker();
      nelderMead0.getEvaluations();
      multiDirectional0.setMaxIterations(57);
      GoalType goalType1 = GoalType.MAXIMIZE;
      nelderMead0.optimize(multivariateRealFunction0, goalType1, doubleArray0);
      try { 
        multiDirectional0.optimize(multivariateRealFunction1, goalType0, doubleArray0);
        fail("Expecting exception: OptimizationException");
      
      } catch(OptimizationException e) {
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (57) exceeded
         //
         verifyException("org.apache.commons.math.optimization.direct.DirectSearchOptimizer", e);
      }
  }
}
