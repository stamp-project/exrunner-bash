/*

 * Tue Apr 21 06:05:31 UTC 2020
 */

package org.xwiki.model.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
      String string0 = "*t(22BQyXv~4<J9S;J0";
      DocumentReference documentReference0 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      AttachmentReference attachmentReference0 = new AttachmentReference("*t(22BQyXv~4<J9S;J0", documentReference0);
      AttachmentReference attachmentReference1 = new AttachmentReference(attachmentReference0);
      String string1 = "r.8}";
      String[] stringArray0 = new String[2];
      DocumentReference documentReference1 = null;
      AttachmentReference attachmentReference2 = new AttachmentReference("", (DocumentReference) null);
  }
}
