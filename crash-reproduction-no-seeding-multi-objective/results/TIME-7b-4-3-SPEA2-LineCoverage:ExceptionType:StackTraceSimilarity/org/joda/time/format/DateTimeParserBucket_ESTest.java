/*

 * Wed Apr 22 19:43:24 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.URI;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "";
      URI uRI0 = new URI((String) null, "", (String) null);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = null;
      Integer.getInteger((String) null, (-297));
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(46, ethiopicChronology0, (Locale) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      Locale locale1 = Locale.KOREAN;
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale1);
      dateTimeParserBucket0.setOffset(6);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "2002-06-08T00:00:00.000-04:00");
  }
}
