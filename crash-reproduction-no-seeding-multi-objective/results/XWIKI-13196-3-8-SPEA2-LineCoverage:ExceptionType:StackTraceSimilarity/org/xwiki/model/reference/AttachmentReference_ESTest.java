/*

 * Tue Apr 21 05:44:20 UTC 2020
 */

package org.xwiki.model.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.AttachmentReference;
import org.xwiki.model.reference.DocumentReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AttachmentReference_ESTest extends AttachmentReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DocumentReference documentReference0 = new DocumentReference("4Kg@E}u", "8F~_rw@emiL.,,q&@B", "8F~_rw@emiL.,,q&@B", "*vy1s75P`XFg.O[`E");
      AttachmentReference attachmentReference0 = new AttachmentReference("*vy1s75P`XFg.O[`E", documentReference0);
      AttachmentReference attachmentReference1 = new AttachmentReference("", documentReference0);
  }
}
