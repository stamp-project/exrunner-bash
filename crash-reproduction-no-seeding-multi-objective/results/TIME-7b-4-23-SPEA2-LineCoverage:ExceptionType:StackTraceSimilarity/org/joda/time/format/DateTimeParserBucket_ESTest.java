/*

 * Wed Apr 22 19:49:10 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeField;
import org.joda.time.DurationField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.DelegatedDateTimeField;
import org.joda.time.field.SkipDateTimeField;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      iSOChronology0.withUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-2659L), iSOChronology0, (Locale) null, (Integer) null);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfMonth();
      buddhistChronology0.add((long) 2503, 0L, 2503);
      DelegatedDateTimeField delegatedDateTimeField0 = new DelegatedDateTimeField(dateTimeField0);
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(dateTimeField0, 2503);
      dateTimeParserBucket0.saveField((DateTimeField) delegatedDateTimeField0, 2503);
      dateTimeParserBucket0.setOffset(31);
      Integer integer0 = new Integer(2503);
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField(buddhistChronology0, dateTimeField0, (-29));
      DurationField durationField0 = buddhistChronology0.days();
      DateTimeParserBucket.compareReverse(durationField0, durationField0);
      dateTimeParserBucket0.getLocale();
      dateTimeParserBucket0.getOffset();
      dateTimeParserBucket0.saveState();
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "");
  }
}
