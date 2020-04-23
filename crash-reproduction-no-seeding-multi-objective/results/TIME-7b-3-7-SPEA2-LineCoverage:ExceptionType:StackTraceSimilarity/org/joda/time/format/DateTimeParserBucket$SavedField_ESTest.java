/*

 * Wed Apr 22 19:44:24 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTimeField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket$SavedField_ESTest extends DateTimeParserBucket$SavedField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(3528L).when(dateTimeField0).roundFloor(anyLong());
      doReturn(3528L).when(dateTimeField0).set(anyLong() , anyString() , any(java.util.Locale.class));
      Locale locale0 = Locale.CANADA;
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(dateTimeField0, "", locale0);
      dateTimeParserBucket_SavedField0.set(4444L, true);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      int int0 = 20587500;
      DateTimeField dateTimeField1 = buddhistChronology0.dayOfYear();
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new DateTimeParserBucket.SavedField(dateTimeField1, 20587500);
      // Undeclared exception!
      dateTimeParserBucket_SavedField1.set(8000L, false);
  }
}
