/*

 * Wed Apr 22 19:43:54 UTC 2020
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
import org.joda.time.chrono.CopticChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      Locale locale0 = null;
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DateTimeZone) null).when(chronology0).getZone();
      doReturn((Chronology) null).when(chronology0).withUTC();
      copticChronology0.add(1L, 1L, 916);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, chronology0, (Locale) null);
      DateTimeField dateTimeField0 = buddhistChronology0.hourOfDay();
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeField0).when(dateTimeFieldType0).getField(any(org.joda.time.Chronology.class));
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-3042));
      String string0 = "0|:t&AN!/;wfrQ";
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.weekOfWeekyear();
      dateTimeParserBucket0.saveField(dateTimeFieldType1, (-3042));
      dateTimeParserBucket0.getOffsetInteger();
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "0|:t&AN!/;wfrQ");
  }
}
