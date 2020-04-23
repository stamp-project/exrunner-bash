/*

 * Tue Apr 21 10:11:06 UTC 2020
 */

package org.apache.commons.math.ode.events;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.events.EventState;
import org.apache.commons.math.ode.sampling.DummyStepInterpolator;
import org.apache.commons.math.ode.sampling.StepInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class EventState_ESTest extends EventState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = (-143.61);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-143.61), (-143.61), 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      double double1 = 0.0;
      EventState eventState0 = new EventState(eventHandler0, 0.0, 0.0, (-410));
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) (-410);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(1273.5247690544084).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator0).isForward();
      eventState0.evaluateStep(stepInterpolator0);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator();
      eventState0.reset(Double.NaN, doubleArray0);
      // Undeclared exception!
      eventState0.evaluateStep(dummyStepInterpolator0);
  }
}
