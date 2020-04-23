/*

 * Tue Apr 21 10:06:29 UTC 2020
 */

package org.apache.commons.math.ode.events;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
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
      doReturn(0).when(eventHandler0).eventOccurred(anyDouble() , any(double[].class) , anyBoolean());
      doReturn((-4005.2347472207), (-4360.29), 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, 0.4, 0.4, 70);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 0.4;
      doubleArray0[1] = (-4360.29);
      doubleArray0[2] = (double) 70;
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(230.1299412).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      doReturn(true, false).when(stepInterpolator0).isForward();
      eventState0.evaluateStep(stepInterpolator0);
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = (double) 70;
      doubleArray1[1] = (double) 70;
      doubleArray1[2] = (double) 70;
      doubleArray1[3] = (double) 70;
      doubleArray1[4] = (double) 70;
      doubleArray1[5] = 25.7732722415;
      doubleArray1[6] = 0.4;
      doubleArray1[7] = (double) 70;
      doubleArray1[8] = (double) 70;
      eventState0.stepAccepted(70, doubleArray1);
  }
}
