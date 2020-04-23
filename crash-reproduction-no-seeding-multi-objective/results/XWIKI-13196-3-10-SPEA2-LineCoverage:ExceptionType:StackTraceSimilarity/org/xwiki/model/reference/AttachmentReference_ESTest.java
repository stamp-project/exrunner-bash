/*

 * Tue Apr 21 05:46:30 UTC 2020
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
      String string0 = "sYb";
      DocumentReference documentReference0 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      doReturn((EntityReference) null, (EntityReference) null, (EntityReference) null).when(documentReference0).getParent();
      doReturn((EntityType) null).when(documentReference0).getType();
      AttachmentReference attachmentReference0 = new AttachmentReference("sYb", documentReference0);
      attachmentReference0.hasParent(attachmentReference0);
      attachmentReference0.size();
      EntityType entityType0 = EntityType.BLOCK;
      attachmentReference0.extractReference(entityType0);
      String string1 = null;
      DocumentReference documentReference1 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      AttachmentReference attachmentReference1 = new AttachmentReference((String) null, documentReference1);
  }
}
