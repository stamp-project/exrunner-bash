/*

 * Mon Apr 20 09:52:35 UTC 2020
 */

package org.apache.commons.math.estimation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.estimation.GaussNewtonEstimator;
import org.apache.commons.math.estimation.LevenbergMarquardtEstimator;
import org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest;
import org.apache.commons.math.estimation.SimpleEstimationProblem;
import org.apache.commons.math.estimation.WeightedMeasurement;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractEstimator_ESTest extends AbstractEstimator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GaussNewtonEstimator gaussNewtonEstimator0 = new GaussNewtonEstimator(610, 610, (-88.0));
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimator levenbergMarquardtEstimator1 = new LevenbergMarquardtEstimator();
      SimpleEstimationProblem simpleEstimationProblem0 = new SimpleEstimationProblem();
      gaussNewtonEstimator0.initializeEstimate(simpleEstimationProblem0);
      simpleEstimationProblem0.getMeasurements();
      levenbergMarquardtEstimator1.estimate(simpleEstimationProblem0);
      levenbergMarquardtEstimator0.setCostRelativeTolerance((-1976.70865453));
      levenbergMarquardtEstimator0.initializeEstimate(simpleEstimationProblem0);
      SimpleEstimationProblem simpleEstimationProblem1 = new SimpleEstimationProblem();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("matrix must be initialized to perfom this method");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      gaussNewtonEstimator0.initializeEstimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem1 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      WeightedMeasurement weightedMeasurement0 = mock(WeightedMeasurement.class, new ViolatedAssumptionAnswer());
      levenbergMarquardtEstimatorTest_QuadraticProblem1.addMeasurement(weightedMeasurement0);
      levenbergMarquardtEstimatorTest_QuadraticProblem1.getAllParameters();
      levenbergMarquardtEstimator1.estimate(simpleEstimationProblem0);
      levenbergMarquardtEstimator0.setCostRelativeTolerance((-1166.296842));
      levenbergMarquardtEstimator0.initializeEstimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      // Undeclared exception!
      gaussNewtonEstimator0.getCovariances(levenbergMarquardtEstimatorTest_QuadraticProblem1);
  }
}
