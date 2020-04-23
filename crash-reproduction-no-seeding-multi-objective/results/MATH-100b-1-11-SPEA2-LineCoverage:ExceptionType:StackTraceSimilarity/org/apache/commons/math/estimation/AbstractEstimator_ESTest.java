/*

 * Mon Apr 20 09:53:06 UTC 2020
 */

package org.apache.commons.math.estimation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.estimation.GaussNewtonEstimator;
import org.apache.commons.math.estimation.LevenbergMarquardtEstimator;
import org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest;
import org.apache.commons.math.estimation.SimpleEstimationProblem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractEstimator_ESTest extends AbstractEstimator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimator levenbergMarquardtEstimator1 = new LevenbergMarquardtEstimator();
      GaussNewtonEstimator gaussNewtonEstimator0 = new GaussNewtonEstimator(2, Double.POSITIVE_INFINITY, 0.0);
      SimpleEstimationProblem simpleEstimationProblem0 = new SimpleEstimationProblem();
      gaussNewtonEstimator0.initializeEstimate(simpleEstimationProblem0);
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest((String) null);
      levenbergMarquardtEstimatorTest0.testIllConditioned();
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimatorTest_QuadraticProblem0.addPoint(0.0, 1736.903161803, 0.192201);
      // Undeclared exception!
      gaussNewtonEstimator0.getCovariances(levenbergMarquardtEstimatorTest_QuadraticProblem0);
  }
}
