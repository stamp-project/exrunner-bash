/*

 * Tue Apr 21 10:07:25 UTC 2020
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
      doReturn((-725.4487529), (-72.0), (-72.0)).when(eventHandler0).g(anyDouble() , any(double[].class));
      double double0 = 1503.077747707192;
      EventState eventState0 = new EventState(eventHandler0, (-597.0), 1503.077747707192, 0);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 417.026123569047;
      doubleArray0[1] = 1503.077747707192;
      doubleArray0[2] = (-72.0);
      doubleArray0[3] = (double) 0;
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = (-72.0);
      doubleArray1[1] = 1261.9779392979485;
      doubleArray1[2] = (-597.0);
      doubleArray1[3] = (double) 0;
      doubleArray1[4] = 1202.141;
      doubleArray1[5] = 417.026123569047;
      doubleArray1[6] = 0.0;
      doubleArray1[7] = (-725.4487529);
      doubleArray1[8] = (-725.4487529);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(417.026123569047).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray1).when(stepInterpolator0).getInterpolatedState();
      doReturn(true, true).when(stepInterpolator0).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }
}
