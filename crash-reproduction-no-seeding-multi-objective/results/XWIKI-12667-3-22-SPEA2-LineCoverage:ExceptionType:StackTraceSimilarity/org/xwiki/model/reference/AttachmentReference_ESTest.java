/*

 * Mon Apr 20 13:34:13 UTC 2020
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
      DocumentReference documentReference0 = new DocumentReference("SwI", "SwI", "SwI", "An Entity Reference name cannot be null or empty");
      DocumentReference documentReference1 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      doReturn(documentReference0).when(documentReference1).getParent();
      AttachmentReference attachmentReference0 = new AttachmentReference("SwI", documentReference1);
      attachmentReference0.size();
      attachmentReference0.size();
      EntityType entityType0 = EntityType.OBJECT_PROPERTY;
      attachmentReference0.equals((EntityReference) attachmentReference0, entityType0);
      EntityType entityType1 = EntityType.DOCUMENT;
      DocumentReference documentReference2 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      doReturn("UrWE ^%Cl695(j!M4").when(documentReference2).toString();
      doReturn(entityType1).when(documentReference2).getType();
      AttachmentReference attachmentReference1 = new AttachmentReference("SwI", documentReference2);
      DocumentReference documentReference3 = attachmentReference1.getDocumentReference();
      attachmentReference1.setName("SwI");
      AttachmentReference attachmentReference2 = new AttachmentReference((String) null, documentReference3);
  }
}
