/*

 * Tue Apr 21 10:10:14 UTC 2020
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
      doReturn("a!>").when(eventHandler0).toString();
      doReturn(0.0, 0.0, 0.0, 0.0, (-655.7026098277847)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-2708.0), (-265.0), 0);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-265.0);
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = (-265.0);
      doubleArray0[5] = 0.0;
      doubleArray0[6] = 0.0;
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(stepInterpolator0).getCurrentTime();
      doReturn(doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator0).isForward();
      eventState0.evaluateStep(stepInterpolator0);
      eventState0.getEventTime();
      eventState0.getConvergence();
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = Double.NaN;
      doubleArray1[1] = (-2708.0);
      eventState0.reset(265.0, doubleArray1);
      eventState0.reinitializeBegin(1.2599210498948732, doubleArray1);
      eventState0.getEventHandler();
      eventState0.reinitializeBegin(0.0, doubleArray0);
      eventState0.stop();
      StepInterpolator stepInterpolator1 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-0.9899924966004454)).when(stepInterpolator1).getCurrentTime();
      doReturn(doubleArray0).when(stepInterpolator1).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator1).isForward();
      eventState0.evaluateStep(stepInterpolator1);
      StepInterpolator stepInterpolator2 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-2354.13923)).when(stepInterpolator2).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray1, (Object) doubleArray1).when(stepInterpolator2).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator2).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator2);
  }
}
