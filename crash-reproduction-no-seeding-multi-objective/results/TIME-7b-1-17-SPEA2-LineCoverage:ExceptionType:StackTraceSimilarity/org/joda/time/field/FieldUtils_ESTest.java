/*

 * Wed Apr 22 19:47:03 UTC 2020
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeField;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.TestPreciseDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class FieldUtils_ESTest extends FieldUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = null;
      int int0 = 0;
      int int1 = 0;
      int int2 = 4706;
      FieldUtils.verifyValueBounds((String) null, 0, 0, 4706);
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, (-2063), 4706, 4706);
  }
}
