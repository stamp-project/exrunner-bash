/*

 * Tue Apr 21 19:28:42 UTC 2020
 */

package org.xwiki.rendering.listener.chaining;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.rendering.listener.Format;
import org.xwiki.rendering.listener.Listener;
import org.xwiki.rendering.listener.chaining.EmptyBlockChainingListener;
import org.xwiki.rendering.listener.chaining.GroupStateChainingListener;
import org.xwiki.rendering.listener.chaining.ListenerChain;
import org.xwiki.rendering.listener.reference.ResourceReference;
import org.xwiki.rendering.listener.reference.ResourceType;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractChainingListener_ESTest extends AbstractChainingListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ListenerChain listenerChain0 = new ListenerChain();
      GroupStateChainingListener groupStateChainingListener0 = new GroupStateChainingListener(listenerChain0);
      EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain0);
      ListenerChain listenerChain1 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
      doReturn("MmCRO_MARKER", "MmCRO_MARKER", "").when(listenerChain1).toString();
      doReturn(groupStateChainingListener0, groupStateChainingListener0, emptyBlockChainingListener0).when(listenerChain1).getNextListener(nullable(java.lang.Class.class));
      EmptyBlockChainingListener emptyBlockChainingListener1 = new EmptyBlockChainingListener(listenerChain1);
      emptyBlockChainingListener1.beginDefinitionTerm();
      ResourceType resourceType0 = ResourceType.USER;
      ResourceReference resourceReference0 = new ResourceReference("*?DvG;b", resourceType0);
      ResourceReference resourceReference1 = resourceReference0.clone();
      ResourceReference resourceReference2 = resourceReference1.clone();
      Map<String, String> map0 = resourceReference2.getParameters();
      ResourceReference resourceReference3 = resourceReference2.clone();
      emptyBlockChainingListener1.endLink(resourceReference3, true, map0);
      Map<String, String> map1 = Listener.EMPTY_PARAMETERS;
      Format format0 = Format.NONE;
      // Undeclared exception!
      emptyBlockChainingListener1.endFormat(format0, map1);
  }
}
