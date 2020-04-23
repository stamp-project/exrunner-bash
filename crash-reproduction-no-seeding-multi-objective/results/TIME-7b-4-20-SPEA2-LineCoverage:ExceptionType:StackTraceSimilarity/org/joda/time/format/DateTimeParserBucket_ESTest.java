/*

 * Wed Apr 22 19:48:25 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfMonth();
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(dateTimeField0, 2);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, buddhistChronology0, locale0);
      dateTimeParserBucket0.saveField(dateTimeField0, (-1516));
      dateTimeParserBucket0.setOffset(2);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
      dateTimeParserBucket0.getChronology();
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      UTCProvider uTCProvider0 = new UTCProvider();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) linkedHashSet0, (Locale.FilteringMode) null);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1403);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true);
  }
}
