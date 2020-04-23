/*

 * Mon Apr 20 09:53:27 UTC 2020
 */

package org.apache.commons.math.estimation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimatorTest_QuadraticProblem0.getUnboundParameters();
      WeightedMeasurement weightedMeasurement0 = mock(WeightedMeasurement.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(weightedMeasurement0).getResidual();
      doReturn(0.0).when(weightedMeasurement0).getWeight();
      WeightedMeasurement weightedMeasurement1 = mock(WeightedMeasurement.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(weightedMeasurement1).getPartial(any(org.apache.commons.math.estimation.EstimatedParameter.class));
      doReturn(0.0, 0.0).when(weightedMeasurement1).getResidual();
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(weightedMeasurement1).getWeight();
      levenbergMarquardtEstimatorTest_QuadraticProblem0.addMeasurement(weightedMeasurement1);
      levenbergMarquardtEstimatorTest_QuadraticProblem0.getMeasurements();
      levenbergMarquardtEstimator0.initializeEstimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      levenbergMarquardtEstimatorTest_QuadraticProblem0.addMeasurement(weightedMeasurement0);
      levenbergMarquardtEstimator0.setParRelativeTolerance(366.238232584708);
      levenbergMarquardtEstimator0.getChiSquare(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(levenbergMarquardtEstimatorTest_QuadraticProblem0);
  }
}
