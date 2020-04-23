/*

 * Mon Apr 20 13:14:58 UTC 2020
 */

package org.xwiki.model.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.AttachmentReference;
import org.xwiki.model.reference.DocumentReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AttachmentReference_ESTest extends AttachmentReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "szor::t";
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      DocumentReference documentReference0 = new DocumentReference("< ", "szor::t", "< ", locale0);
      AttachmentReference attachmentReference0 = new AttachmentReference("szor::t", documentReference0);
      attachmentReference0.size();
      String string1 = "] in an attachment reference";
      DocumentReference documentReference1 = null;
      AttachmentReference attachmentReference1 = new AttachmentReference("", (DocumentReference) null);
  }
}
