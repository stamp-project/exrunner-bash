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
      doReturn(2231.34593077315, 2183.99036, 2183.99036, 2231.34593077315, (-1.0)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, 0.4, 0.3010299956639812, 0);
      EventHandler eventHandler1 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      EventState eventState1 = new EventState(eventHandler1, 0.4, 0, 1015);
      eventState0.stop();
      EventHandler eventHandler2 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      EventState eventState2 = new EventState(eventHandler2, 0.0, 10.0178749274099, 589);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = 0.3010299956639812;
      doubleArray0[2] = (double) 589;
      eventState0.reinitializeBegin(1015, doubleArray0);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(2231.34593077315).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator0).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }
}
