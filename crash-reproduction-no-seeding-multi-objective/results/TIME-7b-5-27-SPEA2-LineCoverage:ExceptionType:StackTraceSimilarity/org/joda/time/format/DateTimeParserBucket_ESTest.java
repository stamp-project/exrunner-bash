/*

 * Wed Apr 22 19:50:30 UTC 2020
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
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeParserBucket.SavedField[] dateTimeParserBucket_SavedFieldArray0 = new DateTimeParserBucket.SavedField[6];
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      gJChronology0.withUTC();
      gJChronology0.getZone();
      Integer integer0 = new Integer((-2653));
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      Integer integer1 = new Integer((-2653));
      Locale locale0 = Locale.FRENCH;
      Hours hours0 = Hours.THREE;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.clockhourOfHalfday();
      Locale locale1 = Locale.ITALIAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(2950, buddhistChronology0, locale1);
      Integer integer2 = new Integer((-2653));
      Object object0 = new Object();
      dateTimeParserBucket0.setPivotYear(integer0);
      locale1.getDisplayScript();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      dateTimeParserBucket0.setPivotYear(integer0);
      Object object1 = new Object();
      dateTimeParserBucket0.getLocale();
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      dateTimeParserBucket0.restoreState(durationFieldType0);
      Integer integer3 = dateTimeParserBucket_SavedState0.iOffset;
      dateTimeParserBucket0.restoreState((Object) null);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 2950);
      dateTimeParserBucket0.getLocale();
      dateTimeParserBucket0.getOffset();
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(dateTimeField0, (-2653));
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new DateTimeParserBucket.SavedField(dateTimeField0, (int) integer1);
      dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField1);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "Zone must not be null");
  }
}
