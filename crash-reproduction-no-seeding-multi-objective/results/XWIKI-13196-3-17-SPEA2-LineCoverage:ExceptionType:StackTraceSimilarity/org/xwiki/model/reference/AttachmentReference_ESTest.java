/*

 * Tue Apr 21 05:53:01 UTC 2020
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
import org.xwiki.model.reference.LocalDocumentReference;
import org.xwiki.model.reference.WikiReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AttachmentReference_ESTest extends AttachmentReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DocumentReference documentReference0 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      AttachmentReference attachmentReference0 = new AttachmentReference("2$W$\"/rN^~H5", documentReference0);
      WikiReference wikiReference0 = new WikiReference("K7%Vx#{W EPC!M");
      LocalDocumentReference localDocumentReference0 = new LocalDocumentReference("Q*]kg,o-nGs0", "T5NzH'KAm.Q");
      DocumentReference documentReference1 = new DocumentReference(localDocumentReference0, wikiReference0);
      AttachmentReference attachmentReference1 = new AttachmentReference("", documentReference1);
  }
}
