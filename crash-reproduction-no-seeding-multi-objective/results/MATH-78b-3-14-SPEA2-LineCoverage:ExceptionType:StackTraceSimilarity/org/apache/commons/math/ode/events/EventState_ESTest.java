/*

 * Tue Apr 21 10:08:46 UTC 2020
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
      doReturn(0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, 0.0, 0.0, 719);
      EventHandler eventHandler1 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-550.5685196322), 0.0, (-550.5685196322), 0.0, 0.0).when(eventHandler1).g(anyDouble() , any(double[].class));
      EventState eventState1 = new EventState(eventHandler1, 719, 0.0, 719);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 719;
      doubleArray0[1] = (double) 719;
      doubleArray0[2] = 0.0;
      eventState1.reinitializeBegin(0.0, doubleArray0);
      eventState0.reset(0.0, doubleArray0);
      eventState1.reinitializeBegin(150.0, doubleArray0);
      eventState1.reset(1.414213562373095, doubleArray0);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator0).isForward();
      eventState1.evaluateStep(stepInterpolator0);
      eventState0.reinitializeBegin(0.0, doubleArray0);
      eventState0.getEventTime();
      eventState0.reset(1.0, doubleArray0);
      eventState0.stepAccepted(1084.46970697, doubleArray0);
      eventState0.getEventTime();
  }
}
