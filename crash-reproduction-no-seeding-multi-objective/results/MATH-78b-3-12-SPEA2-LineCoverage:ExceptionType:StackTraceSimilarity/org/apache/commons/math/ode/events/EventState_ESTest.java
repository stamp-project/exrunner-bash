/*

 * Tue Apr 21 10:08:11 UTC 2020
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
      doReturn(1115.637589890231, 1115.637589890231, (-1.0), (-1.0), (-1.0)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, 1561.0, 767.607702121712, 2399);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 2399;
      doubleArray0[1] = (double) 2399;
      doubleArray0[2] = 767.607702121712;
      eventState0.stepAccepted(2399, doubleArray0);
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = 1561.0;
      doubleArray1[2] = (-1.0);
      doubleArray1[3] = (double) 2399;
      doubleArray1[4] = 1561.0;
      doubleArray1[5] = (double) 2399;
      doubleArray1[6] = 1115.637589890231;
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(767.607702121712).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray1, (Object) doubleArray1).when(stepInterpolator0).getInterpolatedState();
      doReturn(true, true).when(stepInterpolator0).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }
}
