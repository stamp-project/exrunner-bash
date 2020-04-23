/*

 * Tue Apr 21 13:06:56 UTC 2020
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.field.FieldUtils;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class FieldUtils_ESTest extends FieldUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FieldUtils.safeAdd(1L, (-3709L));
      FieldUtils.safeMultiply(19, 187);
      FieldUtils.safeToInt((-3708L));
      FieldUtils.safeMultiply((-1685L), 187);
      FieldUtils.safeSubtract(187, 2651L);
      FieldUtils.safeMultiply(1291, 3553);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.weekyear();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 329, (-911), (-790));
  }
}
