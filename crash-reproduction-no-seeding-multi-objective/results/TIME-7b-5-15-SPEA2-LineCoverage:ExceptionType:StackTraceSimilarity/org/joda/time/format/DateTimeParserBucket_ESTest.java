/*

 * Wed Apr 22 19:46:56 UTC 2020
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
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2009);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      islamicChronology0.add((-4008L), (long) 2009, 1687);
      islamicChronology0.withZone(dateTimeZone0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.weekyear();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      buddhistChronology0.yearOfCentury();
      dateTimeFieldType0.getRangeDurationType();
      OffsetDateTimeField offsetDateTimeField0 = new OffsetDateTimeField(dateTimeField0, dateTimeFieldType0, 2009);
      OffsetDateTimeField offsetDateTimeField1 = new OffsetDateTimeField(offsetDateTimeField0, dateTimeFieldType0, 2009, 2009, 6141);
      offsetDateTimeField1.getLeapDurationField();
      buddhistChronology0.dayOfYear();
      DateTimeZone.getDefault();
      Integer integer0 = new Integer((-116));
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(4071L, buddhistChronology0, (Locale) null, integer0);
      Integer integer1 = new Integer((-70));
      dateTimeParserBucket0.setOffset(integer1);
      dateTimeParserBucket0.getOffset();
      DateTimeFieldType.era();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 546);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "");
  }
}
