/*

 * Mon Apr 20 09:53:43 UTC 2020
 */

package org.apache.commons.math.estimation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.estimation.EstimatedParameter;
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
      levenbergMarquardtEstimator0.getCostEvaluations();
      levenbergMarquardtEstimator0.getJacobianEvaluations();
      SimpleEstimationProblem simpleEstimationProblem0 = new SimpleEstimationProblem();
      EstimatedParameter estimatedParameter0 = new EstimatedParameter("", (-3718.426568478), true);
      EstimatedParameter estimatedParameter1 = new EstimatedParameter(estimatedParameter0);
      simpleEstimationProblem0.addParameter(estimatedParameter1);
      WeightedMeasurement weightedMeasurement0 = mock(WeightedMeasurement.class, new ViolatedAssumptionAnswer());
      simpleEstimationProblem0.addMeasurement(weightedMeasurement0);
      EstimatedParameter estimatedParameter2 = new EstimatedParameter((String) null, 0);
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest((String) null);
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimatorTest_QuadraticProblem0.addParameter(estimatedParameter0);
      GaussNewtonEstimator gaussNewtonEstimator0 = new GaussNewtonEstimator(0, 0, (-590.063417509));
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest1 = new LevenbergMarquardtEstimatorTest("");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem1 = levenbergMarquardtEstimatorTest1.new QuadraticProblem();
      gaussNewtonEstimator0.initializeEstimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      // Undeclared exception!
      gaussNewtonEstimator0.getCovariances(simpleEstimationProblem0);
  }
}
