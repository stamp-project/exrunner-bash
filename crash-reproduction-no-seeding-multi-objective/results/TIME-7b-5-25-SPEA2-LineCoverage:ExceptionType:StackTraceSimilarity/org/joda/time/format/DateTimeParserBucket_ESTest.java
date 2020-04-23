/*

 * Wed Apr 22 19:49:52 UTC 2020
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
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.MockPartial;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DateTimeZone) null).when(chronology1).getZone();
      doReturn(chronology0).when(chronology1).withUTC();
      Integer integer0 = new Integer(0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1L), chronology1, (Locale) null, integer0);
      dateTimeParserBucket0.computeMillis(true);
      MockPartial mockPartial0 = new MockPartial();
      Chronology chronology2 = mockPartial0.getChronology();
      DateTimeParserBucket dateTimeParserBucket1 = new DateTimeParserBucket(0L, chronology2, (Locale) null);
      dateTimeParserBucket1.getChronology();
      dateTimeParserBucket1.computeMillis(true);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      Integer integer1 = dateTimeParserBucket_SavedState0.iOffset;
      dateTimeParserBucket0.setOffset((Integer) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket1.saveField(dateTimeFieldType0, 0);
      // Undeclared exception!
      dateTimeParserBucket1.computeMillis(false, (String) null);
  }
}
