/*

 * Mon Apr 20 09:52:34 UTC 2020
 */

package org.apache.commons.math.estimation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.estimation.EstimatedParameter;
import org.apache.commons.math.estimation.LevenbergMarquardtEstimator;
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
      SimpleEstimationProblem simpleEstimationProblem0 = new SimpleEstimationProblem();
      simpleEstimationProblem0.getMeasurements();
      SimpleEstimationProblem simpleEstimationProblem1 = new SimpleEstimationProblem();
      simpleEstimationProblem0.getUnboundParameters();
      WeightedMeasurement weightedMeasurement0 = mock(WeightedMeasurement.class, new ViolatedAssumptionAnswer());
      doReturn(0.48636115706654715).when(weightedMeasurement0).getResidual();
      doReturn(0.48636115706654715).when(weightedMeasurement0).getWeight();
      simpleEstimationProblem0.addMeasurement(weightedMeasurement0);
      simpleEstimationProblem0.getMeasurements();
      simpleEstimationProblem0.getUnboundParameters();
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      levenbergMarquardtEstimator0.setParRelativeTolerance(0.0);
      levenbergMarquardtEstimator0.setParRelativeTolerance((-4640.965483136804));
      WeightedMeasurement weightedMeasurement1 = mock(WeightedMeasurement.class, new ViolatedAssumptionAnswer());
      doReturn(420.31587119549).when(weightedMeasurement1).getResidual();
      doReturn(0.0).when(weightedMeasurement1).getWeight();
      simpleEstimationProblem0.addMeasurement(weightedMeasurement1);
      simpleEstimationProblem1.getAllParameters();
      levenbergMarquardtEstimator0.estimate(simpleEstimationProblem1);
      EstimatedParameter estimatedParameter0 = new EstimatedParameter("ad1QdM{", 0.273884, true);
      estimatedParameter0.setBound(false);
      estimatedParameter0.estimate = 42.46591450532068;
      simpleEstimationProblem0.addParameter(estimatedParameter0);
      levenbergMarquardtEstimator0.incrementJacobianEvaluationsCounter();
      levenbergMarquardtEstimator0.getJacobianEvaluations();
      // Undeclared exception!
      levenbergMarquardtEstimator0.guessParametersErrors(simpleEstimationProblem0);
  }
}
