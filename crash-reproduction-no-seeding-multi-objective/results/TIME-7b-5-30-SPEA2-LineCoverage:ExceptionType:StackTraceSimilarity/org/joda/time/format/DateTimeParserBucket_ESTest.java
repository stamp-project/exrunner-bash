/*

 * Wed Apr 22 19:51:26 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedList<String> linkedList1 = new LinkedList<String>();
      String string0 = "J5O *#%'^";
      Locale.lookupTag(linkedList0, (Collection<String>) null);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-587L), buddhistChronology0, locale0);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfYear();
      dateTimeParserBucket0.saveField(dateTimeField0, 0);
      Integer integer0 = new Integer(1502);
      dateTimeParserBucket0.getChronology();
      OffsetDateTimeField offsetDateTimeField0 = new OffsetDateTimeField(dateTimeField0, (-20));
      Integer integer1 = new Integer(86400);
      dateTimeParserBucket0.setPivotYear(integer1);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true);
  }
}
