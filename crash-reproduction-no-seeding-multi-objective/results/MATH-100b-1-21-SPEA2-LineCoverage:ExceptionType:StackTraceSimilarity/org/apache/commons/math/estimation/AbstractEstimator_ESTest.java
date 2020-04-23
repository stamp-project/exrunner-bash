/*

 * Mon Apr 20 09:53:28 UTC 2020
 */

package org.apache.commons.math.estimation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.estimation.LevenbergMarquardtEstimator;
import org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractEstimator_ESTest extends AbstractEstimator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = new double[8];
      double double0 = 0.0;
      doubleArray1[0] = 0.0;
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("HV");
      double[] doubleArray2 = new double[0];
      levenbergMarquardtEstimator0.residuals = doubleArray2;
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.initializeEstimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      levenbergMarquardtEstimatorTest_QuadraticProblem0.addPoint(0.0, (-3142.4663686357), 0.0);
      LevenbergMarquardtEstimator levenbergMarquardtEstimator1 = new LevenbergMarquardtEstimator();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(levenbergMarquardtEstimatorTest_QuadraticProblem0);
  }
}
