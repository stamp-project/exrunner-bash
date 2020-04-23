/*

 * Mon Apr 20 09:53:45 UTC 2020
 */

package org.apache.commons.math.estimation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.estimation.GaussNewtonEstimator;
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
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("3*[N'/~4");
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest1 = new LevenbergMarquardtEstimatorTest("3*[N'/~4");
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest2 = new LevenbergMarquardtEstimatorTest("");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest2.new QuadraticProblem();
      WeightedMeasurement weightedMeasurement0 = mock(WeightedMeasurement.class, new ViolatedAssumptionAnswer());
      levenbergMarquardtEstimatorTest_QuadraticProblem0.addMeasurement(weightedMeasurement0);
      levenbergMarquardtEstimatorTest1.testNonInversible();
      GaussNewtonEstimator gaussNewtonEstimator0 = new GaussNewtonEstimator(1870, (-6933.6), 0.1735);
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest3 = new LevenbergMarquardtEstimatorTest("+#=OY");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem1 = levenbergMarquardtEstimatorTest2.new QuadraticProblem();
      gaussNewtonEstimator0.initializeEstimate(levenbergMarquardtEstimatorTest_QuadraticProblem1);
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest4 = new LevenbergMarquardtEstimatorTest("3*[N'/~4");
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest5 = new LevenbergMarquardtEstimatorTest("3*[N'/~4");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem2 = levenbergMarquardtEstimatorTest5.new QuadraticProblem();
      // Undeclared exception!
      gaussNewtonEstimator0.getCovariances(levenbergMarquardtEstimatorTest_QuadraticProblem0);
  }
}
