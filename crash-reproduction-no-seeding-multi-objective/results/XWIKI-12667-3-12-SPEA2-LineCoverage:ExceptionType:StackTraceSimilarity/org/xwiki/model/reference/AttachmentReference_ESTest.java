/*

 * Mon Apr 20 13:24:01 UTC 2020
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
import org.xwiki.model.EntityType;
import org.xwiki.model.reference.AttachmentReference;
import org.xwiki.model.reference.DocumentReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AttachmentReference_ESTest extends AttachmentReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EntityType entityType0 = EntityType.ATTACHMENT;
      DocumentReference documentReference0 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      AttachmentReference attachmentReference0 = new AttachmentReference("Xop<u>OM_uI05", documentReference0);
      DocumentReference documentReference1 = new DocumentReference("Xop<u>OM_uI05", "Xop<u>OM_uI05", "Xop<u>OM_uI05");
      AttachmentReference attachmentReference1 = new AttachmentReference(attachmentReference0);
      attachmentReference1.equals((Object) entityType0);
      attachmentReference1.setName("Kc");
      DocumentReference documentReference2 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      AttachmentReference attachmentReference2 = new AttachmentReference("", documentReference2);
  }
}
