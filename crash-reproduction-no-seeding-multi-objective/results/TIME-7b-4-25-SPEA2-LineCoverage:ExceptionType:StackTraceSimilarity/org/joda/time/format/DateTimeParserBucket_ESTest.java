/*

 * Wed Apr 22 19:49:46 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Seconds seconds0 = Seconds.ONE;
      ethiopicChronology0.get((ReadablePeriod) seconds0, (long) (-292269041), (long) (-292269041));
      Locale locale0 = new Locale("");
      ethiopicChronology0.get((ReadablePeriod) seconds0, 0L);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-925L), ethiopicChronology0, locale0, (Integer) null);
      dateTimeParserBucket0.setOffset((Integer) null);
      DateTimeFieldType.monthOfYear();
      Integer integer0 = new Integer(888);
      DateTimeParserBucket dateTimeParserBucket1 = new DateTimeParserBucket(4507L, ethiopicChronology0, locale0, integer0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      dateTimeParserBucket1.saveField(dateTimeFieldType0, (-292269041));
      String string0 = "CST";
      // Undeclared exception!
      dateTimeParserBucket1.computeMillis(false, "");
  }
}
