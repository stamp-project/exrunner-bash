/*

 * Wed Apr 22 19:45:40 UTC 2020
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
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.field.DelegatedDateTimeField;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeZone0).when(chronology0).getZone();
      doReturn(buddhistChronology0).when(chronology0).withUTC();
      Locale locale0 = null;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-2594L), chronology0, (Locale) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      int int0 = (-376);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-376));
      String string0 = "";
      Integer integer0 = new Integer((-5613));
      dateTimeParserBucket0.setOffset(integer0);
      DateTimeParserBucket dateTimeParserBucket1 = new DateTimeParserBucket(0L, buddhistChronology0, (Locale) null);
      DateTimeField dateTimeField0 = buddhistChronology0.weekOfWeekyear();
      DelegatedDateTimeField delegatedDateTimeField0 = new DelegatedDateTimeField(dateTimeField0);
      dateTimeParserBucket1.saveField((DateTimeField) delegatedDateTimeField0, (-376));
      String string1 = ")0R$=\"Db~c/g[";
      // Undeclared exception!
      dateTimeParserBucket1.computeMillis(true, "2");
  }
}
