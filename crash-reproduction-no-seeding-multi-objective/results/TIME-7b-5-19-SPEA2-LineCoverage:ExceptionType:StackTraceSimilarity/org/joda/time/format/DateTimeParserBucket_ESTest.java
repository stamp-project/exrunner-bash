/*

 * Wed Apr 22 19:48:02 UTC 2020
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
import org.joda.time.DateTimeFieldType;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      Integer.divideUnsigned((-1), (-298));
      Locale locale0 = new Locale("eu#?pATG39\"[2", "eu#?pATG39\"[2", "eu#?pATG39\"[2");
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedList<Locale.LanguageRange> linkedList1 = new LinkedList<Locale.LanguageRange>();
      LinkedHashSet<Locale> linkedHashSet0 = new LinkedHashSet<Locale>();
      List<Locale> list0 = Locale.filter((List<Locale.LanguageRange>) linkedList1, (Collection<Locale>) linkedHashSet0);
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
      List<Locale> list1 = Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) list0, locale_FilteringMode0);
      List<Locale> list2 = Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) list1, locale_FilteringMode0);
      LinkedHashSet<Locale> linkedHashSet1 = new LinkedHashSet<Locale>(list2);
      Locale.lookup(linkedList0, linkedHashSet1);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, islamicChronology0, locale0);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      Integer integer0 = dateTimeParserBucket_SavedState0.iOffset;
      DateTimeParserBucket dateTimeParserBucket1 = new DateTimeParserBucket(1147L, islamicChronology0, locale0, (Integer) null, (-1));
      DateTimeFieldType.clockhourOfHalfday();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeParserBucket dateTimeParserBucket2 = new DateTimeParserBucket((-2368), islamicChronology0, locale0);
      dateTimeParserBucket2.saveField(dateTimeFieldType0, (-2368));
      dateTimeParserBucket2.getZone();
      LinkedList<Locale.LanguageRange> linkedList2 = new LinkedList<Locale.LanguageRange>();
      Locale.FilteringMode locale_FilteringMode1 = Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
      Locale.filter((List<Locale.LanguageRange>) linkedList2, (Collection<Locale>) null, locale_FilteringMode1);
      // Undeclared exception!
      dateTimeParserBucket2.computeMillis(false, "yyyy-MM-dd'T'HH:mm:ss.SSS");
  }
}
