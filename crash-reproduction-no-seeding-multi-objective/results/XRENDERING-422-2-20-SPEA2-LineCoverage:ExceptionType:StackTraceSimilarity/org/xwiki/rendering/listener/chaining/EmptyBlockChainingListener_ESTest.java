/*

 * Tue Apr 21 19:41:12 UTC 2020
 */

package org.xwiki.rendering.listener.chaining;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.rendering.listener.Format;
import org.xwiki.rendering.listener.MetaData;
import org.xwiki.rendering.listener.chaining.EmptyBlockChainingListener;
import org.xwiki.rendering.listener.chaining.ListenerChain;
import org.xwiki.rendering.listener.chaining.LookaheadChainingListenerTest;
import org.xwiki.rendering.listener.reference.ResourceReference;
import org.xwiki.rendering.listener.reference.ResourceType;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class EmptyBlockChainingListener_ESTest extends EmptyBlockChainingListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LookaheadChainingListenerTest lookaheadChainingListenerTest0 = new LookaheadChainingListenerTest();
      ListenerChain listenerChain0 = new ListenerChain();
      LookaheadChainingListenerTest.TestChainingListener lookaheadChainingListenerTest_TestChainingListener0 = lookaheadChainingListenerTest0.new TestChainingListener(listenerChain0);
      ListenerChain listenerChain1 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
      doReturn(lookaheadChainingListenerTest_TestChainingListener0, lookaheadChainingListenerTest_TestChainingListener0).when(listenerChain1).getNextListener(nullable(java.lang.Class.class));
      EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain1);
      MetaData metaData0 = new MetaData();
      emptyBlockChainingListener0.endMetaData(metaData0);
      ResourceType resourceType0 = ResourceType.DATA;
      ResourceReference resourceReference0 = new ResourceReference(">14&e", resourceType0);
      ResourceReference resourceReference1 = resourceReference0.clone();
      Map<String, String> map0 = resourceReference1.getParameters();
      lookaheadChainingListenerTest_TestChainingListener0.onMacro("wf>C3(z[(n!}M", map0, "", true);
      Format format0 = Format.NONE;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      ResourceType resourceType1 = ResourceType.USER;
      ResourceReference resourceReference2 = new ResourceReference((String) null, resourceType1);
      Map<String, String> map1 = resourceReference2.getParameters();
      // Undeclared exception!
      emptyBlockChainingListener0.endFormat(format0, map1);
  }
}
