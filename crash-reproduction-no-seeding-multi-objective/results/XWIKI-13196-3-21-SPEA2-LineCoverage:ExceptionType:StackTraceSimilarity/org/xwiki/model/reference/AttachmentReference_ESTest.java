/*

 * Tue Apr 21 05:56:45 UTC 2020
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
      DocumentReference documentReference0 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      String string0 = "=z|SQEF4GiE!s'~8";
      AttachmentReference attachmentReference0 = new AttachmentReference("=z|SQEF4GiE!s'~8", documentReference0);
      AttachmentReference attachmentReference1 = new AttachmentReference(attachmentReference0);
      DocumentReference documentReference1 = null;
      AttachmentReference attachmentReference2 = new AttachmentReference((String) null, (DocumentReference) null);
  }
}
