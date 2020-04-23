/*

 * Tue Apr 21 10:10:47 UTC 2020
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
      doReturn((-1351.2518), (-1351.2518), (-1351.2518)).when(eventHandler0).g(anyDouble() , any(double[].class));
      double double0 = 561.2041;
      EventState eventState0 = new EventState(eventHandler0, 561.2041, 561.2041, 1);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 1;
      doubleArray0[1] = 561.2041;
      doubleArray0[2] = (-1351.2518);
      doubleArray0[3] = (-2578.5351488983433);
      doubleArray0[4] = (double) 1;
      doubleArray0[5] = (double) 1;
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((double)1).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(true, true).when(stepInterpolator0).isForward();
      eventState0.getMaxCheckInterval();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }
}
