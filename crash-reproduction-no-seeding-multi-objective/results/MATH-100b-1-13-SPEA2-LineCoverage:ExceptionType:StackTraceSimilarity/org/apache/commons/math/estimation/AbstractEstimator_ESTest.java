/*

 * Mon Apr 20 09:53:07 UTC 2020
 */

package org.apache.commons.math.estimation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
      SimpleEstimationProblem simpleEstimationProblem0 = new SimpleEstimationProblem();
      simpleEstimationProblem0.getAllParameters();
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      levenbergMarquardtEstimator0.getJacobianEvaluations();
      levenbergMarquardtEstimator0.setMaxCostEval(0);
      levenbergMarquardtEstimator0.setInitialStepBoundFactor(0.056658);
      levenbergMarquardtEstimator0.incrementJacobianEvaluationsCounter();
      levenbergMarquardtEstimator0.getCostEvaluations();
      levenbergMarquardtEstimator0.setMaxCostEval(62);
      levenbergMarquardtEstimator0.setMaxCostEval(79);
      simpleEstimationProblem0.getMeasurements();
      SimpleEstimationProblem simpleEstimationProblem1 = new SimpleEstimationProblem();
      levenbergMarquardtEstimator0.getChiSquare(simpleEstimationProblem1);
      levenbergMarquardtEstimator0.initializeEstimate(simpleEstimationProblem0);
      levenbergMarquardtEstimator0.setCostRelativeTolerance(62);
      levenbergMarquardtEstimator0.getJacobianEvaluations();
      SimpleEstimationProblem simpleEstimationProblem2 = new SimpleEstimationProblem();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimatorTest_QuadraticProblem0.getAllParameters();
      levenbergMarquardtEstimatorTest_QuadraticProblem0.addPoint(0.0, 0, (-2543.19336172438));
      levenbergMarquardtEstimator0.estimate(simpleEstimationProblem2);
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(levenbergMarquardtEstimatorTest_QuadraticProblem0);
  }
}
