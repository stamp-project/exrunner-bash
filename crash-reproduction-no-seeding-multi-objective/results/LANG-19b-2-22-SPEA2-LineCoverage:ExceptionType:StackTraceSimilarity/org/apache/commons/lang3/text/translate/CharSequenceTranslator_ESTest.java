/*

 * Tue Apr 21 06:57:15 UTC 2020
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import org.apache.commons.lang3.text.translate.AggregateTranslator;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.NumericEntityEscaper;
import org.apache.commons.lang3.text.translate.NumericEntityUnescaper;
import org.apache.commons.lang3.text.translate.UnicodeEscaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class CharSequenceTranslator_ESTest extends CharSequenceTranslator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = new StringWriter(88);
      stringWriter0.write("&#");
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[9];
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      charSequenceTranslatorArray0[0] = (CharSequenceTranslator) numericEntityUnescaper0;
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(43, 88);
      charSequenceTranslatorArray0[1] = (CharSequenceTranslator) numericEntityEscaper0;
      NumericEntityEscaper.between(459, 38);
      UnicodeEscaper.below(43);
      NumericEntityEscaper.below(981);
      NumericEntityEscaper.above(1228);
      UnicodeEscaper.above(1848);
      NumericEntityEscaper numericEntityEscaper1 = new NumericEntityEscaper();
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      StringWriter stringWriter2 = stringWriter0.append((CharSequence) "&#");
      AggregateTranslator aggregateTranslator1 = new AggregateTranslator(charSequenceTranslatorArray0);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      aggregateTranslator1.translate((CharSequence) stringBuffer0, (Writer) stringWriter2);
  }
}
