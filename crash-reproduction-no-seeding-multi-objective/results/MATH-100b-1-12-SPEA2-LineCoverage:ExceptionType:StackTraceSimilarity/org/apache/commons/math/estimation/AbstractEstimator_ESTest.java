/*

 * Mon Apr 20 09:53:03 UTC 2020
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
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[7];
      WeightedMeasurement weightedMeasurement0 = mock(WeightedMeasurement.class, new ViolatedAssumptionAnswer());
      weightedMeasurementArray0[0] = weightedMeasurement0;
      weightedMeasurementArray0[2] = weightedMeasurementArray0[1];
      weightedMeasurementArray0[4] = weightedMeasurementArray0[3];
      weightedMeasurementArray0[5] = weightedMeasurementArray0[4];
      weightedMeasurementArray0[1] = weightedMeasurementArray0[5];
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[9];
      EstimatedParameter estimatedParameter0 = new EstimatedParameter((String) null, 0.085456);
      EstimatedParameter estimatedParameter1 = new EstimatedParameter(estimatedParameter0);
      estimatedParameterArray0[0] = estimatedParameter1;
      EstimatedParameter estimatedParameter2 = new EstimatedParameter("'MrbM)ff&B/Somrj<X\"", 0.085456, true);
      estimatedParameterArray0[1] = estimatedParameter2;
      EstimatedParameter estimatedParameter3 = new EstimatedParameter(estimatedParameter2);
      estimatedParameterArray0[2] = estimatedParameter0;
      EstimatedParameter estimatedParameter4 = new EstimatedParameter("", 0.0, false);
      estimatedParameterArray0[3] = estimatedParameter4;
      EstimatedParameter estimatedParameter5 = new EstimatedParameter(estimatedParameter3);
      estimatedParameterArray0[4] = estimatedParameter5;
      EstimatedParameter estimatedParameter6 = new EstimatedParameter(estimatedParameter2);
      estimatedParameterArray0[5] = estimatedParameter6;
      EstimatedParameter estimatedParameter7 = new EstimatedParameter("C)Sz,}Uyjs", 0.085456, false);
      estimatedParameterArray0[6] = estimatedParameter7;
      EstimatedParameter estimatedParameter8 = new EstimatedParameter("", 886.9798643592);
      estimatedParameterArray0[7] = estimatedParameter8;
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest1 = new LevenbergMarquardtEstimatorTest("");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem1 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      SimpleEstimationProblem simpleEstimationProblem0 = new SimpleEstimationProblem();
      levenbergMarquardtEstimator0.setMaxCostEval(4);
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest2 = new LevenbergMarquardtEstimatorTest("org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem2 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      SimpleEstimationProblem simpleEstimationProblem1 = new SimpleEstimationProblem();
      levenbergMarquardtEstimator0.initializeEstimate(simpleEstimationProblem1);
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }
}
