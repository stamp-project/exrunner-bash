/*

 * Mon Apr 20 13:30:14 UTC 2020
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
      EntityReference entityReference0 = null;
      DocumentReference documentReference0 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      doReturn((EntityReference) null, (EntityReference) null).when(documentReference0).extractReference(any(org.xwiki.model.EntityType.class));
      doReturn((EntityReference) null).when(documentReference0).getParent();
      AttachmentReference attachmentReference0 = new AttachmentReference("Invalid parent reference [", documentReference0);
      EntityType entityType0 = EntityType.WIKI;
      DocumentReference documentReference1 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      doReturn(entityType0, entityType0).when(documentReference1).getType();
      AttachmentReference attachmentReference1 = new AttachmentReference("U7,Hqkh~YZUHsE", documentReference1);
      EntityReference entityReference1 = attachmentReference0.getRoot();
      EntityType entityType1 = EntityType.WIKI;
      attachmentReference1.equals(entityReference1, entityType1, entityType1);
      EntityType entityType2 = EntityType.ATTACHMENT;
      attachmentReference1.equals(entityReference1, entityType1, entityType2);
      DocumentReference documentReference2 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      AttachmentReference attachmentReference2 = new AttachmentReference("", documentReference2);
  }
}
