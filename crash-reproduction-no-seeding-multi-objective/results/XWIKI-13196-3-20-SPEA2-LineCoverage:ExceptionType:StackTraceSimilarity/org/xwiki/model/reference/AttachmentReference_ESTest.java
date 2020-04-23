/*

 * Tue Apr 21 05:55:48 UTC 2020
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
import org.xwiki.model.reference.WikiReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AttachmentReference_ESTest extends AttachmentReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WikiReference wikiReference0 = new WikiReference("|BCEp8WU+=OG'");
      EntityType entityType0 = EntityType.ATTACHMENT;
      DocumentReference documentReference0 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      doReturn(wikiReference0, wikiReference0).when(documentReference0).getParent();
      doReturn(entityType0).when(documentReference0).getType();
      AttachmentReference attachmentReference0 = new AttachmentReference("$VALUES", documentReference0);
      attachmentReference0.size();
      attachmentReference0.getDocumentReference();
      wikiReference0.equals((EntityReference) null, entityType0, entityType0);
      attachmentReference0.getParent();
      AttachmentReference attachmentReference1 = new AttachmentReference("", (DocumentReference) null);
  }
}
