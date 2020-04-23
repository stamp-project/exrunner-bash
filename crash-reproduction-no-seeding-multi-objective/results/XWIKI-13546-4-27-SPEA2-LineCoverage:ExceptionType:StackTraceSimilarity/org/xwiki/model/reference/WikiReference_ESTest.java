/*

 * Mon Apr 20 14:17:41 UTC 2020
 */

package org.xwiki.model.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.user.impl.xwiki.XWikiRightServiceImpl;
import java.io.Serializable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.EntityReference;
import org.xwiki.model.reference.WikiReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class WikiReference_ESTest extends WikiReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WikiReference wikiReference0 = new WikiReference("Invalid type [");
      EntityReference entityReference0 = XWikiRightServiceImpl.GLOBALRIGHTCLASS_REFERENCE;
      entityReference0.setParameter("", (Serializable) null);
      WikiReference wikiReference1 = new WikiReference("");
  }
}
