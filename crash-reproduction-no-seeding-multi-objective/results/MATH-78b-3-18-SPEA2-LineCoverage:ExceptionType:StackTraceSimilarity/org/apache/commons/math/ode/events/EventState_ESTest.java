/*

 * Tue Apr 21 10:09:29 UTC 2020
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
      doReturn((-624.29933030742), (-624.29933030742), (-624.29933030742)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, 1.0, (-765.73879396), 4627);
      StepProblem stepProblem0 = new StepProblem(4627, 1.0, 8.0);
      EventState eventState1 = new EventState(stepProblem0, 1.0, 8.0, 4627);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-765.73879396);
      doubleArray0[1] = 1.0;
      doubleArray0[2] = (double) 4627;
      stepProblem0.eventOccurred((-95.5960064075408), doubleArray0, false);
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = (double) 4627;
      doubleArray1[1] = 1.0;
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray1, false);
      StepInterpolator stepInterpolator0 = dummyStepInterpolator0.copy();
      eventState1.evaluateStep(stepInterpolator0);
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }
}
