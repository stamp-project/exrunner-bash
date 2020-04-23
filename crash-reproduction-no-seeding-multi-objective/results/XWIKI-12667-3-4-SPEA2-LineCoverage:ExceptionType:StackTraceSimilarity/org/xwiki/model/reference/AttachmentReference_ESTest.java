/*

 * Mon Apr 20 13:15:57 UTC 2020
 */

package org.xwiki.model.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Serializable;
import java.util.HashMap;
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
      AttachmentReference attachmentReference0 = new AttachmentReference("4fKKWh/ nL,WZpi>", documentReference0);
      HashMap<String, Serializable> hashMap0 = new HashMap<String, Serializable>();
      attachmentReference0.setParameters(hashMap0);
      AttachmentReference attachmentReference1 = new AttachmentReference(attachmentReference0);
      String string0 = "";
      AttachmentReference attachmentReference2 = new AttachmentReference(attachmentReference0);
      DocumentReference documentReference1 = null;
      AttachmentReference attachmentReference3 = new AttachmentReference("", (DocumentReference) null);
  }
}
