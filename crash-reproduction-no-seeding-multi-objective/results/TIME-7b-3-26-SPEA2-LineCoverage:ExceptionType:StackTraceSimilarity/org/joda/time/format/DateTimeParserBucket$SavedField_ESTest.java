/*

 * Wed Apr 22 19:49:55 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.field.StrictDateTimeField;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket$SavedField_ESTest extends DateTimeParserBucket$SavedField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      DateTimeField dateTimeField1 = StrictDateTimeField.getInstance(dateTimeField0);
      Locale locale0 = Locale.getDefault();
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(dateTimeField1, "OhO@A]S8X!Dst", locale0);
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new DateTimeParserBucket.SavedField(dateTimeField0, (-1276));
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField2 = new DateTimeParserBucket.SavedField(dateTimeField1, "OhO@A]S8X!Dst", locale0);
      // Undeclared exception!
      dateTimeParserBucket_SavedField1.set((-1276), true);
  }
}
