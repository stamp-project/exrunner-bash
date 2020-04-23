/*

 * Tue Apr 21 10:06:19 UTC 2020
 */

package org.apache.commons.math.ode.events;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.events.EventState;
import org.apache.commons.math.ode.sampling.DummyStepInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class EventState_ESTest extends EventState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-1690.76101442), (-1374.4913872), (-280.53), 32.0, 1.047197551196598).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-514.877277981607), (-514.877277981607), (-116));
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) (-116);
      doubleArray0[1] = (double) (-116);
      doubleArray0[2] = (-514.877277981607);
      eventState0.reinitializeBegin((-514.877277981607), doubleArray0);
      eventState0.reinitializeBegin(0.0, doubleArray0);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      DummyStepInterpolator dummyStepInterpolator1 = new DummyStepInterpolator(dummyStepInterpolator0);
      eventState0.evaluateStep(dummyStepInterpolator1);
      eventState0.getMaxCheckInterval();
      DummyStepInterpolator dummyStepInterpolator2 = new DummyStepInterpolator();
      DummyStepInterpolator dummyStepInterpolator3 = new DummyStepInterpolator(dummyStepInterpolator1);
      dummyStepInterpolator3.copy();
      // Undeclared exception!
      eventState0.evaluateStep(dummyStepInterpolator3);
  }
}
