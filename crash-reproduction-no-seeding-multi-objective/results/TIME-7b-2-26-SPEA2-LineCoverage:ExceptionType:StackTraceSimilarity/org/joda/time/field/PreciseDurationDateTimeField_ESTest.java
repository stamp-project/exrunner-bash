/*

 * Wed Apr 22 19:49:54 UTC 2020
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.field.TestPreciseDurationDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PreciseDurationDateTimeField_ESTest extends PreciseDurationDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      locale0.getScript();
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      long long0 = new Integer(2147483598);
      testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0.getDurationField();
      testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0.getRangeDurationField();
      // Undeclared exception!
      testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0.set((long) 2147483598, 2147483598);
  }
}
