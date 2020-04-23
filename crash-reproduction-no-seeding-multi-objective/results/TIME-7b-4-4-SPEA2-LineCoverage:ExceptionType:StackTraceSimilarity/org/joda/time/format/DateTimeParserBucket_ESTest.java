/*

 * Wed Apr 22 19:43:39 UTC 2020
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
import org.joda.time.chrono.GJChronology;
import org.joda.time.field.DelegatedDateTimeField;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.SkipDateTimeField;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      Integer integer0 = new Integer(3);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(3, gJChronology0, (Locale) null);
      dateTimeParserBucket0.getPivotYear();
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
      dateTimeParserBucket0.setZone((DateTimeZone) null);
      dateTimeParserBucket0.getZone();
      Integer integer1 = new Integer((-2627));
      dateTimeParserBucket0.getOffset();
      dateTimeParserBucket0.setPivotYear(integer0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-1));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.minuteOfHour();
      OffsetDateTimeField offsetDateTimeField0 = new OffsetDateTimeField(dateTimeField0, dateTimeFieldType0, (-3797));
      DelegatedDateTimeField delegatedDateTimeField0 = new DelegatedDateTimeField(offsetDateTimeField0, dateTimeFieldType0);
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField(gJChronology0, delegatedDateTimeField0, (-3797));
      skipDateTimeField0.getLeapDurationField();
      DateTimeParserBucket.compareReverse((DurationField) null, (DurationField) null);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "t,exRTz+F(3'2=Fv");
  }
}
