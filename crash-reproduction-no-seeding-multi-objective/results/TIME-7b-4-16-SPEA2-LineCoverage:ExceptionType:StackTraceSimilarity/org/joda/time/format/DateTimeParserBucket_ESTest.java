/*

 * Wed Apr 22 19:47:03 UTC 2020
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
import org.joda.time.DurationField;
import org.joda.time.field.MillisDurationField;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DurationField durationField0 = mock(DurationField.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(durationField0).isSupported();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DateTimeParserBucket.compareReverse(durationField0, millisDurationField0);
      long long0 = (-1588L);
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DateTimeZone) null).when(chronology0).getZone();
      doReturn((Chronology) null).when(chronology0).withUTC();
      Integer integer0 = new Integer((-1));
      String string0 = null;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      Integer integer1 = new Integer(489);
      dateTimeFieldType0.getDurationType();
      Locale locale0 = Locale.FRANCE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(31556952000L, chronology0, locale0);
      dateTimeParserBucket0.computeMillis();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis();
  }
}
