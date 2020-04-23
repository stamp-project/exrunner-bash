/*

 * Tue Apr 21 10:06:36 UTC 2020
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
      doReturn((-0.4161468365471424), (-0.4161468365471424), (-0.4161468365471424), (-0.4161468365471424), 677.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      int int0 = (-1484);
      EventState eventState0 = new EventState(eventHandler0, 0.0, 0.0, (-1484));
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) (-1484);
      doubleArray0[1] = (double) (-1484);
      doubleArray0[2] = (double) (-1484);
      doubleArray0[3] = (double) (-1484);
      eventState0.stepAccepted((-1484), doubleArray0);
      eventState0.reset((-1484), doubleArray0);
      eventState0.getConvergence();
      eventState0.stepAccepted(0.0, doubleArray0);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(892.055568).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) null, (Object) null, (Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator0).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }
}
