/*

 * Tue Apr 21 10:09:11 UTC 2020
 */

package org.apache.commons.math.ode.events;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.events.EventState;
import org.apache.commons.math.ode.nonstiff.StepProblem;
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
      doReturn((-1046.019069176), 0.0, 2589.00619060632, (-1705.54208), 1523.0689591361308).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-2961.9109), 0.0, 0);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (-2961.9109);
      doubleArray0[4] = (-2961.9109);
      doubleArray0[5] = (-2961.9109);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      DummyStepInterpolator dummyStepInterpolator1 = new DummyStepInterpolator(dummyStepInterpolator0);
      eventState0.evaluateStep(dummyStepInterpolator1);
      double double0 = (-1677.1019628969932);
      StepProblem stepProblem0 = new StepProblem((-1677.1019628969932), (-2288.681932585678), 0);
      EventState eventState1 = new EventState(stepProblem0, (-1677.1019628969932), 0.0, 0);
      // Undeclared exception!
      eventState0.evaluateStep(dummyStepInterpolator0);
  }
}
