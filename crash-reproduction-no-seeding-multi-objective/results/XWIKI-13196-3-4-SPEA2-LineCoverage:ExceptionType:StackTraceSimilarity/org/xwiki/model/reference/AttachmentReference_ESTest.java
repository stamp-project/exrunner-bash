/*

 * Tue Apr 21 05:40:57 UTC 2020
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
import org.xwiki.model.reference.SpaceReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AttachmentReference_ESTest extends AttachmentReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = ")`T,dwWj?tn1";
      stringArray0[1] = ")`T,dwWj?tn1";
      stringArray0[2] = ")`T,dwWj?tn1";
      stringArray0[3] = ")`T,dwWj?tn1";
      stringArray0[4] = ")`T,dwWj?tn1";
      stringArray0[5] = ")`T,dwWj?tn1";
      stringArray0[6] = ")`T,dwWj?tn1";
      stringArray0[7] = ")`T,dwWj?tn1";
      stringArray0[8] = ")`T,dwWj?tn1";
      SpaceReference spaceReference0 = new SpaceReference(")`T,dwWj?tn1", stringArray0);
      DocumentReference documentReference0 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      doReturn(spaceReference0, spaceReference0).when(documentReference0).getParent();
      AttachmentReference attachmentReference0 = new AttachmentReference(")`T,dwWj?tn1", documentReference0);
      attachmentReference0.getRoot();
      AttachmentReference attachmentReference1 = new AttachmentReference("", (DocumentReference) null);
  }
}
