/*

 * Tue Apr 21 18:47:26 UTC 2020
 */

package org.xwiki.rendering.listener.chaining;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.rendering.listener.Format;
import org.xwiki.rendering.listener.HeaderLevel;
import org.xwiki.rendering.listener.chaining.EmptyBlockChainingListener;
import org.xwiki.rendering.listener.chaining.ListenerChain;
import org.xwiki.rendering.listener.reference.ResourceReference;
import org.xwiki.rendering.listener.reference.ResourceType;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class EmptyBlockChainingListener_ESTest extends EmptyBlockChainingListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ListenerChain listenerChain0 = new ListenerChain();
      EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain0);
      emptyBlockChainingListener0.beginDefinitionTerm();
      Format format0 = Format.NONE;
      String string0 = "lMcq7y~FfL5od[8z|";
      ResourceReference resourceReference0 = new ResourceReference("lMcq7y~FfL5od[8z|", (ResourceType) null);
      Map<String, String> map0 = resourceReference0.getParameters();
      emptyBlockChainingListener0.endFormat(format0, map0);
      HeaderLevel headerLevel0 = HeaderLevel.LEVEL3;
      // Undeclared exception!
      emptyBlockChainingListener0.endHeader(headerLevel0, "lMcq7y~FfL5od[8z|", map0);
  }
}
