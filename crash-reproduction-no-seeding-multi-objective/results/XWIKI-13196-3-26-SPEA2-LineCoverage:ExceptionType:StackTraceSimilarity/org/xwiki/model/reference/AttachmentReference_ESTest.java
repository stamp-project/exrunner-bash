/*

 * Tue Apr 21 06:01:39 UTC 2020
 */

package org.xwiki.model.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.ClientInfoStatus;
import java.sql.SQLClientInfoException;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.AttachmentReference;
import org.xwiki.model.reference.DocumentReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AttachmentReference_ESTest extends AttachmentReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DocumentReference documentReference0 = new DocumentReference("I", "I", "I");
      AttachmentReference attachmentReference0 = new AttachmentReference("I", documentReference0);
      HashMap<String, ClientInfoStatus> hashMap0 = new HashMap<String, ClientInfoStatus>();
      SQLClientInfoException sQLClientInfoException0 = new SQLClientInfoException(hashMap0);
      String string0 = "";
      DocumentReference documentReference1 = null;
      AttachmentReference attachmentReference1 = new AttachmentReference("", (DocumentReference) null);
  }
}
