/*

 * Tue Apr 21 10:07:11 UTC 2020
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
      doReturn("R6mDk43kD_my\"").when(eventHandler0).toString();
      doReturn(5.0, 5.0, 5.0, (-1018.6482), 5.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-514.71), 3601.438, 2755);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 2755;
      doubleArray0[1] = (-514.71);
      eventState0.reinitializeBegin(3601.438, doubleArray0);
      eventState0.reinitializeBegin((-514.71), doubleArray0);
      eventState0.stepAccepted((-514.71), doubleArray0);
      eventState0.stop();
      eventState0.getEventHandler();
      eventState0.getMaxIterationCount();
      eventState0.getEventTime();
      eventState0.stop();
      eventState0.reinitializeBegin(Double.NaN, doubleArray0);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator0).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }
}
