/*

 * Mon Apr 20 09:53:16 UTC 2020
 */

package org.apache.commons.math.estimation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.estimation.GaussNewtonEstimator;
import org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest;
import org.apache.commons.math.estimation.SimpleEstimationProblem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractEstimator_ESTest extends AbstractEstimator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GaussNewtonEstimator gaussNewtonEstimator0 = new GaussNewtonEstimator(2009, 2009, 2009);
      SimpleEstimationProblem simpleEstimationProblem0 = new SimpleEstimationProblem();
      gaussNewtonEstimator0.getChiSquare(simpleEstimationProblem0);
      gaussNewtonEstimator0.initializeEstimate(simpleEstimationProblem0);
      gaussNewtonEstimator0.setMaxCostEval(0);
      gaussNewtonEstimator0.setMaxCostEval((-1902));
      gaussNewtonEstimator0.initializeEstimate(simpleEstimationProblem0);
      SimpleEstimationProblem simpleEstimationProblem1 = new SimpleEstimationProblem();
      gaussNewtonEstimator0.initializeEstimate(simpleEstimationProblem0);
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem1 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimatorTest_QuadraticProblem1.addPoint((-1281.0), (-3085.116657960973), 0.0);
      // Undeclared exception!
      gaussNewtonEstimator0.getCovariances(levenbergMarquardtEstimatorTest_QuadraticProblem1);
  }
}
