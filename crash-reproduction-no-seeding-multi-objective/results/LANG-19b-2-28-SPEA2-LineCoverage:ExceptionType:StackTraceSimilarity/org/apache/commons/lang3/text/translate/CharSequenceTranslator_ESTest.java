/*

 * Tue Apr 21 06:59:27 UTC 2020
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
      CharSequenceTranslator.hex(626);
      CharSequenceTranslator.hex(626);
      StringWriter stringWriter0 = new StringWriter();
      CharSequenceTranslator.hex(5);
      stringWriter0.write("&##");
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      NumericEntityUnescaper numericEntityUnescaper1 = new NumericEntityUnescaper();
      // Undeclared exception!
      numericEntityUnescaper1.translate((CharSequence) "&##", (Writer) stringWriter0);
  }
}
