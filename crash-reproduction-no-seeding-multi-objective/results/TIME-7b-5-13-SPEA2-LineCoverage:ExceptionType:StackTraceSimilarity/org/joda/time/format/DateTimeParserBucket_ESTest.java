/*

 * Wed Apr 22 19:46:24 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.field.LenientDateTimeField;
import org.joda.time.format.DateTimeParserBucket;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      String string0 = ")NxHak";
      uTCProvider0.getZone(")NxHak");
      GregorianChronology.getInstance((DateTimeZone) null);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfMonth();
      LenientDateTimeField.getInstance(dateTimeField0, buddhistChronology0);
      Locale locale0 = Locale.KOREAN;
      Integer integer0 = Integer.getInteger(")NxHak", 0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(3076, buddhistChronology0, locale0, integer0);
      dateTimeParserBucket0.saveField(dateTimeField0, 3076);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      Locale locale1 = Locale.UK;
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 0);
      BuddhistChronology buddhistChronology1 = BuddhistChronology.getInstance();
      buddhistChronology1.eras();
      DateTimeParserBucket.compareReverse((DurationField) null, (DurationField) null);
      String string1 = "Cannot parse \"";
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "Cannot parse \"");
  }
}
