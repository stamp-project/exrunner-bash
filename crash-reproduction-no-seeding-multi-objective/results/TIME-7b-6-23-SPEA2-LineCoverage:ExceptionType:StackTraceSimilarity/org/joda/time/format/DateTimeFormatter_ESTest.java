/*

 * Wed Apr 22 19:52:51 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.MutableDateTime;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeFormatter_ESTest extends DateTimeFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      int[] intArray0 = new int[10];
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      dateTimeFieldType0.isSupported(islamicChronology0);
      dateTimeFieldType0.getRangeDurationType();
      DateTimeFormatterBuilder.UnpaddedNumber dateTimeFormatterBuilder_UnpaddedNumber0 = new DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 1755, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_UnpaddedNumber0, dateTimeFormatterBuilder_UnpaddedNumber0);
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      dateTimeFormatter0.parseInto(mutableDateTime0, "", 1755);
  }
}
