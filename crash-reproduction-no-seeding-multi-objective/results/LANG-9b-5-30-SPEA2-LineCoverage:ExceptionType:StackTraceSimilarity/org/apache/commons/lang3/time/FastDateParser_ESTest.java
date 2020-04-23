/*

 * Mon Apr 20 09:51:14 GMT+00:00 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.commons.lang3.time.FastDateParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class FastDateParser_ESTest extends FastDateParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = new Locale("d@_t].B", "y 3ln");
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedList<String> linkedList1 = new LinkedList<String>();
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) linkedList1);
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.MAP_EXTENDED_RANGES;
      Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) list0, locale_FilteringMode0);
      FastDateParser fastDateParser0 = new FastDateParser("d@_t].B", timeZone0, locale0);
      fastDateParser0.isNextNumber();
      LinkedList<Object> linkedList2 = new LinkedList<Object>();
      LinkedHashSet<Locale> linkedHashSet0 = new LinkedHashSet<Locale>();
      linkedHashSet0.spliterator();
      linkedHashSet0.removeAll(linkedList2);
      Locale locale1 = Locale.ENGLISH;
      Locale locale2 = new Locale("y 3ln", "d@_t].B", "y 3ln");
      Locale locale3 = FastDateParser.JAPANESE_IMPERIAL;
      FastDateParser fastDateParser1 = new FastDateParser("GMTNST", timeZone0, locale3);
  }
}
