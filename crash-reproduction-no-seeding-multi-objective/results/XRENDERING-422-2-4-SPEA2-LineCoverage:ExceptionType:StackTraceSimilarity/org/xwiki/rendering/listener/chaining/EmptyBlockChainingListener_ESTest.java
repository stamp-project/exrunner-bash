/*

 * Tue Apr 21 18:47:32 UTC 2020
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
import org.xwiki.rendering.listener.Listener;
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
      ListenerChain listenerChain1 = new ListenerChain();
      EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain1);
      MetaData metaData0 = mock(MetaData.class, new ViolatedAssumptionAnswer());
      emptyBlockChainingListener0.beginMetaData(metaData0);
      ResourceReference resourceReference0 = mock(ResourceReference.class, new ViolatedAssumptionAnswer());
      ListenerChain listenerChain2 = new ListenerChain();
      EmptyBlockChainingListener emptyBlockChainingListener1 = new EmptyBlockChainingListener(listenerChain2);
      String string0 = null;
      ResourceType resourceType0 = ResourceType.URL;
      ResourceReference resourceReference1 = new ResourceReference((String) null, resourceType0);
      resourceReference1.clone();
      LookaheadChainingListenerTest.TestChainingListener lookaheadChainingListenerTest_TestChainingListener1 = lookaheadChainingListenerTest0.new TestChainingListener(listenerChain2);
      EmptyBlockChainingListener emptyBlockChainingListener2 = new EmptyBlockChainingListener(listenerChain2);
      Map<String, String> map0 = Listener.EMPTY_PARAMETERS;
      Format format0 = Format.SUPERSCRIPT;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      // Undeclared exception!
      emptyBlockChainingListener2.endFormat(format0, hashMap0);
  }
}
