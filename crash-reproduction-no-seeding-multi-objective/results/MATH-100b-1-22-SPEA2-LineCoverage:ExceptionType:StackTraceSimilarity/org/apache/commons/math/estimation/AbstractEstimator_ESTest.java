/*

 * Mon Apr 20 09:53:37 UTC 2020
 */

package org.apache.commons.math.estimation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.estimation.EstimatedParameter;
import org.apache.commons.math.estimation.EstimationProblem;
import org.apache.commons.math.estimation.LevenbergMarquardtEstimator;
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
      double[] doubleArray0 = new double[7];
      levenbergMarquardtEstimator0.setMaxCostEval(2);
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 2176.224922516231;
      doubleArray0[2] = 3221.643;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 0.694;
      doubleArray0[5] = 0.0;
      doubleArray0[6] = 1.0;
      levenbergMarquardtEstimator0.jacobian = doubleArray0;
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[4];
      WeightedMeasurement weightedMeasurement0 = mock(WeightedMeasurement.class, new ViolatedAssumptionAnswer());
      weightedMeasurementArray0[0] = weightedMeasurement0;
      weightedMeasurementArray0[1] = weightedMeasurement0;
      weightedMeasurementArray0[2] = weightedMeasurement0;
      weightedMeasurementArray0[3] = weightedMeasurement0;
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[9];
      EstimatedParameter estimatedParameter0 = new EstimatedParameter("", (-2480.186), true);
      EstimatedParameter estimatedParameter1 = new EstimatedParameter(estimatedParameter0);
      estimatedParameterArray0[0] = estimatedParameter1;
      EstimatedParameter estimatedParameter2 = new EstimatedParameter("", 1.0);
      estimatedParameterArray0[1] = estimatedParameter2;
      EstimatedParameter estimatedParameter3 = new EstimatedParameter("", 0.694);
      estimatedParameterArray0[2] = estimatedParameter3;
      EstimatedParameter estimatedParameter4 = new EstimatedParameter("", 0.0, true);
      estimatedParameterArray0[3] = estimatedParameter4;
      EstimatedParameter estimatedParameter5 = new EstimatedParameter("", 0.0);
      estimatedParameterArray0[4] = estimatedParameter5;
      EstimatedParameter estimatedParameter6 = new EstimatedParameter("", 1.0, true);
      estimatedParameterArray0[5] = estimatedParameter6;
      EstimatedParameter estimatedParameter7 = new EstimatedParameter("", (-1029.637327013));
      estimatedParameterArray0[6] = estimatedParameter7;
      EstimatedParameter estimatedParameter8 = new EstimatedParameter("v>I", 0.0);
      estimatedParameterArray0[7] = estimatedParameter8;
      EstimatedParameter estimatedParameter9 = new EstimatedParameter("", 0.0, true);
      estimatedParameterArray0[8] = estimatedParameter9;
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }
}
