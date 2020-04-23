/*

 * Mon Apr 20 09:52:08 UTC 2020
 */

package org.apache.commons.math.estimation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.estimation.EstimatedParameter;
import org.apache.commons.math.estimation.EstimationProblem;
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
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[2];
      WeightedMeasurement weightedMeasurement0 = mock(WeightedMeasurement.class, new ViolatedAssumptionAnswer());
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("\"vyCB<[J7'/Ud");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      weightedMeasurementArray0[0] = weightedMeasurement0;
      weightedMeasurementArray0[1] = weightedMeasurement0;
      levenbergMarquardtEstimator0.incrementJacobianEvaluationsCounter();
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[3];
      EstimatedParameter estimatedParameter0 = new EstimatedParameter("\"vyCB<[J7'/Ud", 0.0, true);
      EstimatedParameter estimatedParameter1 = new EstimatedParameter(estimatedParameter0);
      estimatedParameterArray0[0] = estimatedParameter1;
      EstimatedParameter estimatedParameter2 = new EstimatedParameter("\"vyCB<[J7'/Ud", (-1595.272));
      estimatedParameterArray0[1] = estimatedParameter2;
      EstimatedParameter estimatedParameter3 = new EstimatedParameter("\"vyCB<[J7'/Ud", (-1595.272));
      estimatedParameterArray0[2] = estimatedParameter3;
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }
}
