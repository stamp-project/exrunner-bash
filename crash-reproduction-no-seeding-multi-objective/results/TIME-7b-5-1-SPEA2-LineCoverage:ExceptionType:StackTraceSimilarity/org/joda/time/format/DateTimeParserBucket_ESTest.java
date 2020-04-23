/*

 * Wed Apr 22 19:42:56 UTC 2020
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
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfYear();
      DateTimeZone.forOffsetMillis((-2856));
      Chronology chronology1 = buddhistChronology0.withUTC();
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(dateTimeField0, (-2856));
      Integer integer0 = new Integer((-2856));
      int int0 = (-5683);
      Integer.divideUnsigned((-5683), (-2856));
      Integer.max(26, 211);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(4040L, chronology1, locale0);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      DateTimeParserBucket dateTimeParserBucket1 = new DateTimeParserBucket((-2856), buddhistChronology0, locale0, integer0);
      dateTimeParserBucket1.setOffset(26);
      dateTimeParserBucket1.saveField(dateTimeField0, (-2856));
      // Undeclared exception!
      dateTimeParserBucket1.computeMillis();
  }
}
