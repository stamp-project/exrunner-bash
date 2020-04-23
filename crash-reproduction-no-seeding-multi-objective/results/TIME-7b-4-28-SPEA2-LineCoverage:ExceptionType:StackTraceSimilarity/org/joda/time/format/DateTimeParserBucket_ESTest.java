/*

 * Wed Apr 22 19:50:46 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.LocalDateTime;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeParserBucket.SavedField[] dateTimeParserBucket_SavedFieldArray0 = new DateTimeParserBucket.SavedField[2];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      dateTimeFieldType0.isSupported(buddhistChronology0);
      dateTimeFieldType0.getDurationType();
      DurationField durationField0 = buddhistChronology0.halfdays();
      UnsupportedDateTimeField unsupportedDateTimeField0 = UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField0);
      DateTimeFieldType dateTimeFieldType1 = unsupportedDateTimeField0.getType();
      ISOChronology.getInstance();
      BuddhistChronology buddhistChronology1 = BuddhistChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) buddhistChronology1);
      localDateTime0.getCenturyOfEra();
      Locale locale0 = Locale.UK;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-572L), buddhistChronology1, locale0, (Integer) null, 2507);
      dateTimeParserBucket0.getZone();
      Integer integer0 = new Integer((-2748));
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 2507);
      dateTimeParserBucket0.saveField(dateTimeFieldType1, (-2006));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "");
  }
}
