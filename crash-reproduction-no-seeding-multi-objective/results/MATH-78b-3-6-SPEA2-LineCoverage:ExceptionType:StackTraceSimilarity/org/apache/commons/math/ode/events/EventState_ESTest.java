/*

 * Tue Apr 21 10:06:59 UTC 2020
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
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-2500.383877), 0.9, 0.9).when(eventHandler0).g(anyDouble() , any(double[].class));
      double double0 = 0.9640275800758169;
      double double1 = 1577.31510194;
      int int0 = 1940;
      EventState eventState0 = new EventState(eventHandler0, 0.9640275800758169, 1577.31510194, 1940);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-2500.383877);
      doubleArray0[1] = 1577.31510194;
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      DummyStepInterpolator dummyStepInterpolator1 = new DummyStepInterpolator(dummyStepInterpolator0);
      StepInterpolator stepInterpolator0 = dummyStepInterpolator1.copy();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }
}
