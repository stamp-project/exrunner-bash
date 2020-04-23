/*

 * Tue Apr 21 06:52:35 UTC 2020
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.nio.CharBuffer;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.NumericEntityUnescaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class NumericEntityUnescaper_ESTest extends NumericEntityUnescaper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      String string0 = "\"&#B:2Oc";
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append('%');
      stringWriter1.append('=');
      StringWriter stringWriter2 = stringWriter1.append((CharSequence) "\"&#B:2Oc");
      CharSequenceTranslator.hex((-965));
      stringWriter2.write("");
      CharBuffer.wrap((CharSequence) "");
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) "\"&#B:2Oc");
  }
}
