/*

 * Tue Apr 21 10:08:55 UTC 2020
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
      doReturn((-1314.024587352661), (-1314.024587352661), (-1314.024587352661)).when(eventHandler0).g(anyDouble() , any(double[].class));
      int int0 = (-1272);
      EventState eventState0 = new EventState(eventHandler0, (-2929.8141519368864), (-2929.8141519368864), (-1272));
      double double0 = (-1.0);
      double[] doubleArray0 = new double[1];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      StepInterpolator stepInterpolator0 = dummyStepInterpolator0.copy();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }
}
