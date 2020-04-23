/*

 * Mon Apr 20 13:41:34 UTC 2020
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AttachmentReference_ESTest extends AttachmentReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DocumentReference documentReference0 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      AttachmentReference attachmentReference0 = new AttachmentReference("Invalid type [", documentReference0);
      attachmentReference0.equalsNonRecursive(attachmentReference0);
      attachmentReference0.setName("Invalid type [");
      EntityType entityType0 = EntityType.DOCUMENT;
      String string0 = "K[+1b!MEZ0P!;;}/'S";
      DocumentReference documentReference1 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      doReturn("K[+1b!MEZ0P!;;}/'S").when(documentReference1).toString();
      doReturn(entityType0).when(documentReference1).getType();
      attachmentReference0.equalsNonRecursive((EntityReference) null);
      AttachmentReference attachmentReference1 = new AttachmentReference("Invalid type [", documentReference1);
      DocumentReference documentReference2 = attachmentReference1.getDocumentReference();
      AttachmentReference attachmentReference2 = new AttachmentReference("", documentReference2);
  }
}
