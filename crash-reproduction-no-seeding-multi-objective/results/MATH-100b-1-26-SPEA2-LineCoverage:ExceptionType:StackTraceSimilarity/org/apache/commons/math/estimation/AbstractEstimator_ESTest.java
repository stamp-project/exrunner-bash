/*

 * Mon Apr 20 09:53:42 UTC 2020
 */

package org.apache.commons.math.estimation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.estimation.EstimatedParameter;
import org.apache.commons.math.estimation.LevenbergMarquardtEstimator;
import org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest;
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
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("\"hB/Pn9t");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimatorTest_QuadraticProblem0.getMeasurements();
      EstimatedParameter estimatedParameter0 = new EstimatedParameter((String) null, 2);
      estimatedParameter0.setEstimate(2);
      levenbergMarquardtEstimatorTest_QuadraticProblem0.getUnboundParameters();
      levenbergMarquardtEstimatorTest_QuadraticProblem0.getMeasurements();
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem1 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      WeightedMeasurement weightedMeasurement0 = mock(WeightedMeasurement.class, new ViolatedAssumptionAnswer());
      levenbergMarquardtEstimatorTest_QuadraticProblem1.addMeasurement(weightedMeasurement0);
      levenbergMarquardtEstimator0.initializeEstimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest1 = new LevenbergMarquardtEstimatorTest("");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem2 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest2 = new LevenbergMarquardtEstimatorTest((String) null);
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(levenbergMarquardtEstimatorTest_QuadraticProblem1);
  }
}
