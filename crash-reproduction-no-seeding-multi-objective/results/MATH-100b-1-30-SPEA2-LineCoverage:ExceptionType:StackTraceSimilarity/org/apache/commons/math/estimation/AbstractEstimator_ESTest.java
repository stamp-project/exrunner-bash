/*

 * Mon Apr 20 09:53:51 UTC 2020
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
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      SimpleEstimationProblem simpleEstimationProblem0 = new SimpleEstimationProblem();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest((String) null);
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest1 = new LevenbergMarquardtEstimatorTest((String) null);
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest1.new QuadraticProblem();
      levenbergMarquardtEstimatorTest_QuadraticProblem0.addPoint(0.991, 4.0, 0.991);
      WeightedMeasurement weightedMeasurement0 = mock(WeightedMeasurement.class, new ViolatedAssumptionAnswer());
      levenbergMarquardtEstimatorTest_QuadraticProblem0.addMeasurement(weightedMeasurement0);
      GaussNewtonEstimator gaussNewtonEstimator0 = new GaussNewtonEstimator(52, 0.391, (-630.161));
      GaussNewtonEstimator gaussNewtonEstimator1 = new GaussNewtonEstimator(1, 4.0, 1.0);
      gaussNewtonEstimator1.getChiSquare(simpleEstimationProblem0);
      gaussNewtonEstimator1.initializeEstimate(simpleEstimationProblem0);
      // Undeclared exception!
      gaussNewtonEstimator1.getCovariances(levenbergMarquardtEstimatorTest_QuadraticProblem0);
  }
}
