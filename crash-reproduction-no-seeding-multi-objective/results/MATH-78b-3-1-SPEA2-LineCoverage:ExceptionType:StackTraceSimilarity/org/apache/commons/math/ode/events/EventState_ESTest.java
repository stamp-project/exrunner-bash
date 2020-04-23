/*

 * Tue Apr 21 10:06:18 UTC 2020
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
      doReturn((String) null).when(eventHandler0).toString();
      doReturn(211.9488434044534, (-1439.9061), 211.9488434044534, 211.9488434044534).when(eventHandler0).g(anyDouble() , any(double[].class));
      double[] doubleArray0 = new double[0];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      dummyStepInterpolator0.copy();
      StepProblem stepProblem0 = new StepProblem((-1.1), 211.9488434044534, (-1.0));
      EventState eventState0 = new EventState(eventHandler0, (-1353.2907), (-1.1), 2040566732);
      EventHandler eventHandler1 = eventState0.getEventHandler();
      StepProblem stepProblem1 = new StepProblem(281.405072181753, 1.0, 0.7853981633974483);
      stepProblem1.eventOccurred(1.0, doubleArray0, false);
      EventState eventState1 = new EventState(eventHandler1, 2, 281.405072181753, 2);
      eventState1.evaluateStep(dummyStepInterpolator0);
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (-426.74431642);
      doubleArray1[1] = 8.0;
      doubleArray1[2] = 211.9488434044534;
      doubleArray1[3] = 3065.87768319443;
      doubleArray1[4] = (-1353.2907);
      eventState0.reset(0.7853981633974483, doubleArray1);
      // Undeclared exception!
      eventState0.evaluateStep(dummyStepInterpolator0);
  }
}
