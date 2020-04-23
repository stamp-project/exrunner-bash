/*

 * Tue Apr 21 06:04:27 UTC 2020
 */

package org.xwiki.model.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.Stack;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.AttachmentReference;
import org.xwiki.model.reference.DocumentReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AttachmentReference_ESTest extends AttachmentReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DocumentReference documentReference0 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      AttachmentReference attachmentReference0 = new AttachmentReference("^O", documentReference0);
      Stack<Locale.LanguageRange> stack0 = new Stack<Locale.LanguageRange>();
      Vector<Locale.LanguageRange> vector0 = new Vector<Locale.LanguageRange>(stack0);
      ArrayDeque<Locale> arrayDeque0 = new ArrayDeque<Locale>();
      ArrayDeque<Locale> arrayDeque1 = arrayDeque0.clone();
      Locale.lookup(vector0, arrayDeque1);
      DocumentReference documentReference1 = new DocumentReference("&:+j!I5b", "^O", "^O", (Locale) null);
      AttachmentReference attachmentReference1 = new AttachmentReference("^O", documentReference1);
      AttachmentReference attachmentReference2 = new AttachmentReference((String) null, documentReference1);
  }
}
