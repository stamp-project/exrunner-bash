/*

 * Mon Apr 20 13:22:04 UTC 2020
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
import org.xwiki.model.reference.SpaceReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AttachmentReference_ESTest extends AttachmentReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "drwz'_\\H5qWa'>Xw/)";
      DocumentReference documentReference0 = new DocumentReference("drwz'_H5qWa'>Xw/)", "drwz'_H5qWa'>Xw/)", "U\"XxT6Rb%=^(cZeC-7", "U\"XxT6Rb%=^(cZeC-7");
      EntityType entityType0 = EntityType.WIKI;
      EntityType entityType1 = EntityType.BLOCK;
      EntityReference entityReference0 = mock(EntityReference.class, new ViolatedAssumptionAnswer());
      doReturn(documentReference0, documentReference0).when(entityReference0).getParent();
      doReturn(entityType0).when(entityReference0).getType();
      SpaceReference spaceReference0 = mock(SpaceReference.class, new ViolatedAssumptionAnswer());
      doReturn(entityReference0).when(spaceReference0).getParent();
      DocumentReference documentReference1 = new DocumentReference("Invalid parent reference [", spaceReference0);
      AttachmentReference attachmentReference0 = new AttachmentReference("] in an attachment reference", documentReference1);
      DocumentReference documentReference2 = attachmentReference0.getDocumentReference();
      String string1 = "] in an attachment reference";
      AttachmentReference attachmentReference1 = new AttachmentReference("", documentReference2);
  }
}
