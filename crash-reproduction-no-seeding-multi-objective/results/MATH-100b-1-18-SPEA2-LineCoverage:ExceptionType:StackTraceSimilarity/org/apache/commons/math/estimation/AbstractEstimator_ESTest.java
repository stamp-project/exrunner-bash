/*

 * Mon Apr 20 09:53:22 UTC 2020
 */

package org.apache.commons.math.estimation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.estimation.EstimatedParameter;
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
      levenbergMarquardtEstimator0.initializeEstimate(simpleEstimationProblem0);
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("*thON}*%*oMj^la6KG|");
      EstimatedParameter estimatedParameter0 = new EstimatedParameter("unable to compute covariances: singular problem", Double.POSITIVE_INFINITY, true);
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest1 = new LevenbergMarquardtEstimatorTest("unable to compute covariances: singular problem");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest1.new QuadraticProblem();
      levenbergMarquardtEstimatorTest_QuadraticProblem0.getMeasurements();
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem1 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.initializeEstimate(levenbergMarquardtEstimatorTest_QuadraticProblem1);
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest2 = new LevenbergMarquardtEstimatorTest("c");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem2 = levenbergMarquardtEstimatorTest1.new QuadraticProblem();
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem3 = levenbergMarquardtEstimatorTest2.new QuadraticProblem();
      WeightedMeasurement weightedMeasurement0 = mock(WeightedMeasurement.class, new ViolatedAssumptionAnswer());
      levenbergMarquardtEstimatorTest_QuadraticProblem3.addMeasurement(weightedMeasurement0);
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(levenbergMarquardtEstimatorTest_QuadraticProblem3);
  }
}
