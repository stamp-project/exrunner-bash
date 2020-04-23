/*

 * Tue Apr 21 10:09:43 UTC 2020
 */

package org.apache.commons.math.ode.events;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.events.EventState;
import org.apache.commons.math.ode.sampling.StepInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class EventState_ESTest extends EventState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0.3010299956639812, 0.3010299956639812, 0.3010299956639812, (-1.0), (-1.0)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, Double.NaN, 0.0, 0);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = Double.NaN;
      doubleArray0[1] = (double) 0;
      eventState0.reinitializeBegin(Double.NaN, doubleArray0);
      eventState0.stepAccepted(4198.317294602194, doubleArray0);
      eventState0.getMaxCheckInterval();
      eventState0.reset((-3195.580588286), doubleArray0);
      eventState0.getMaxCheckInterval();
      eventState0.getMaxCheckInterval();
      eventState0.getMaxIterationCount();
      eventState0.getMaxIterationCount();
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-582.8782987564636)).when(stepInterpolator0).getCurrentTime();
      doReturn(doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(false, true).when(stepInterpolator0).isForward();
      eventState0.evaluateStep(stepInterpolator0);
      StepInterpolator stepInterpolator1 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-1936.52871307732)).when(stepInterpolator1).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator1).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator1).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator1);
  }
}
