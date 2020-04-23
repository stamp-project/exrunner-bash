/*

 * Tue Apr 21 10:10:11 UTC 2020
 */

package org.apache.commons.math.ode.events;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
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
      doReturn(0).when(eventHandler0).eventOccurred(anyDouble() , any(double[].class) , anyBoolean());
      doReturn((-1991.2167229), 1.732050807568877, 1.732050807568877, 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, 232.69852, 232.69852, 9964);
      double[] doubleArray0 = new double[0];
      eventState0.stepAccepted(1.0E-14, doubleArray0);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator();
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = (double) 9964;
      doubleArray1[1] = 1354.973061797323;
      doubleArray1[2] = 232.69852;
      doubleArray1[3] = 232.69852;
      DummyStepInterpolator dummyStepInterpolator1 = new DummyStepInterpolator(doubleArray1, true);
      eventState0.evaluateStep(dummyStepInterpolator1);
      eventState0.stepAccepted(3.626860407847019, doubleArray0);
      DummyStepInterpolator dummyStepInterpolator2 = new DummyStepInterpolator();
      DummyStepInterpolator dummyStepInterpolator3 = new DummyStepInterpolator(doubleArray0, false);
      DummyStepInterpolator dummyStepInterpolator4 = new DummyStepInterpolator(dummyStepInterpolator3);
      eventState0.evaluateStep(dummyStepInterpolator1);
      eventState0.stepAccepted(252.9, doubleArray1);
      eventState0.getConvergence();
  }
}
