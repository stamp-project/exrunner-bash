/*

 * Mon Apr 20 09:52:41 UTC 2020
 */

package org.apache.commons.math.estimation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.estimation.LevenbergMarquardtEstimator;
import org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractEstimator_ESTest extends AbstractEstimator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      double double0 = 2283.622467;
      double[] doubleArray0 = new double[9];
      levenbergMarquardtEstimator0.jacobian = doubleArray0;
      levenbergMarquardtEstimator0.setCostRelativeTolerance(2283.622467);
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("fh9oHc )Vbi;^J`Q");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.getRMS(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem1 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimatorTest_QuadraticProblem1.addPoint(1218.5, 0.0, 2283.622467);
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest1 = new LevenbergMarquardtEstimatorTest("<f63E_XqKdQX#u+<E.");
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(levenbergMarquardtEstimatorTest_QuadraticProblem1);
  }
}
