/*

 * Tue Apr 21 05:17:55 UTC 2020
 */

package com.xpn.xwiki.objects;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.objects.BaseObject;
import com.xpn.xwiki.objects.LargeStringProperty;
import com.xpn.xwiki.objects.StringListProperty;
import javax.xml.stream.util.EventReaderDelegate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseObject_ESTest extends BaseObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseObject baseObject0 = new BaseObject();
      BaseObject baseObject1 = baseObject0.clone();
      EventReaderDelegate eventReaderDelegate0 = new EventReaderDelegate();
      LargeStringProperty largeStringProperty0 = new LargeStringProperty();
      baseObject0.put((String) null, largeStringProperty0);
      StringListProperty stringListProperty0 = new StringListProperty();
      baseObject1.addField("", stringListProperty0);
      XWikiContext xWikiContext0 = new XWikiContext();
      // Undeclared exception!
      baseObject0.equals(baseObject1);
  }
}
