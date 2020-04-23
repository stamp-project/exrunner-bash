/*

 * Wed Apr 22 19:51:10 UTC 2020
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
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket$SavedField_ESTest extends DateTimeParserBucket$SavedField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.year();
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(dateTimeField0, "-", (Locale) null);
      Integer integer0 = new Integer(2360);
      BuddhistChronology buddhistChronology1 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField1 = buddhistChronology1.dayOfMonth();
      BuddhistChronology.getInstanceUTC();
      buddhistChronology1.year();
      Locale.forLanguageTag("-");
      BuddhistChronology buddhistChronology2 = BuddhistChronology.getInstance();
      buddhistChronology2.weekyearOfCentury();
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new DateTimeParserBucket.SavedField(dateTimeField0, 2360);
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField2 = new DateTimeParserBucket.SavedField(dateTimeField1, (-3107));
      // Undeclared exception!
      dateTimeParserBucket_SavedField2.set(0L, true);
  }
}
