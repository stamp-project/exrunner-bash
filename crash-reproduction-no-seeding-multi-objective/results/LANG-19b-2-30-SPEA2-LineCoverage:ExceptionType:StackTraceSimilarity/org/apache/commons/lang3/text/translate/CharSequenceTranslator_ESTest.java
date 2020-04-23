/*

 * Tue Apr 21 07:03:35 UTC 2020
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.CharBuffer;
import org.apache.commons.lang3.text.translate.AggregateTranslator;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.NumericEntityUnescaper;
import org.apache.commons.lang3.text.translate.OctalUnescaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class CharSequenceTranslator_ESTest extends CharSequenceTranslator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      char[] charArray0 = new char[7];
      charArray0[0] = 'H';
      charArray0[1] = '#';
      charArray0[2] = '&';
      charArray0[3] = 'H';
      charArray0[4] = '&';
      charArray0[5] = '#';
      charArray0[6] = '#';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringWriter stringWriter0 = new StringWriter(21);
      octalUnescaper0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      String string0 = "";
      CharBuffer.wrap((CharSequence) stringBuffer0);
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[7];
      charSequenceTranslatorArray0[0] = (CharSequenceTranslator) octalUnescaper0;
      charSequenceTranslatorArray0[1] = (CharSequenceTranslator) numericEntityUnescaper0;
      charSequenceTranslatorArray0[2] = (CharSequenceTranslator) octalUnescaper0;
      charSequenceTranslatorArray0[3] = (CharSequenceTranslator) numericEntityUnescaper0;
      charSequenceTranslatorArray0[4] = (CharSequenceTranslator) numericEntityUnescaper0;
      charSequenceTranslatorArray0[5] = (CharSequenceTranslator) numericEntityUnescaper0;
      charSequenceTranslatorArray0[6] = (CharSequenceTranslator) octalUnescaper0;
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      AggregateTranslator aggregateTranslator1 = new AggregateTranslator(charSequenceTranslatorArray0);
      // Undeclared exception!
      aggregateTranslator1.translate((CharSequence) stringBuffer0, (Writer) stringWriter0);
  }
}
