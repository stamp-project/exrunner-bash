/*

 * Tue Apr 21 06:56:46 UTC 2020
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.NumericEntityUnescaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class CharSequenceTranslator_ESTest extends CharSequenceTranslator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      StringWriter stringWriter0 = new StringWriter(982);
      CharSequenceTranslator.hex(2642);
      numericEntityUnescaper0.translate((CharSequence) "A52");
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "A52");
      StringBuffer stringBuffer0 = stringWriter1.getBuffer();
      numericEntityUnescaper0.translate((CharSequence) stringBuffer0, (Writer) stringWriter0);
      stringWriter0.write("&#");
      stringWriter1.append((CharSequence) stringBuffer0);
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) stringBuffer0, (Writer) stringWriter1);
  }
}
