/*

 * Tue Apr 21 05:51:07 UTC 2020
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
import org.xwiki.model.reference.EntityReference;
import org.xwiki.model.reference.LocalDocumentReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AttachmentReference_ESTest extends AttachmentReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocalDocumentReference localDocumentReference0 = new LocalDocumentReference("", "");
      DocumentReference documentReference0 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      doReturn(localDocumentReference0).when(documentReference0).getParent();
      AttachmentReference attachmentReference0 = new AttachmentReference("", documentReference0);
      EntityType entityType0 = EntityType.OBJECT;
      attachmentReference0.equals((EntityReference) attachmentReference0, entityType0);
      AttachmentReference attachmentReference1 = new AttachmentReference(attachmentReference0);
      EntityType entityType1 = EntityType.ATTACHMENT;
      attachmentReference0.setType(entityType1);
      String string0 = "";
      attachmentReference0.getParameter("");
      attachmentReference1.size();
      String string1 = "";
      DocumentReference documentReference1 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      AttachmentReference attachmentReference2 = new AttachmentReference("", documentReference1);
  }
}
