/*

 * Tue Apr 21 18:47:41 UTC 2020
 */

package org.xwiki.rendering.listener.chaining;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.rendering.listener.Format;
import org.xwiki.rendering.listener.MetaData;
import org.xwiki.rendering.listener.chaining.ConsecutiveNewLineStateChainingListener;
import org.xwiki.rendering.listener.chaining.EmptyBlockChainingListener;
import org.xwiki.rendering.listener.chaining.ListenerChain;
import org.xwiki.rendering.listener.chaining.LookaheadChainingListener;
import org.xwiki.rendering.listener.chaining.LookaheadChainingListenerTest;
import org.xwiki.rendering.listener.reference.ResourceReference;
import org.xwiki.rendering.listener.reference.ResourceType;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractChainingListener_ESTest extends AbstractChainingListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LookaheadChainingListenerTest lookaheadChainingListenerTest0 = new LookaheadChainingListenerTest();
      ListenerChain listenerChain0 = new ListenerChain();
      EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain0);
      ListenerChain listenerChain1 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
      doReturn("g-L_", "g-L_", "1G3c:iF", "", "").when(listenerChain1).toString();
      doReturn(emptyBlockChainingListener0, emptyBlockChainingListener0, emptyBlockChainingListener0, emptyBlockChainingListener0, emptyBlockChainingListener0).when(listenerChain1).getNextListener(nullable(java.lang.Class.class));
      LookaheadChainingListenerTest.TestChainingListener lookaheadChainingListenerTest_TestChainingListener0 = lookaheadChainingListenerTest0.new TestChainingListener(listenerChain1);
      lookaheadChainingListenerTest_TestChainingListener0.beginDefinitionTerm();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      MetaData metaData0 = new MetaData(hashMap0);
      lookaheadChainingListenerTest_TestChainingListener0.endDocument(metaData0);
      ListenerChain listenerChain2 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
      doReturn("g-L_", " p{", " p{", "g-L_").when(listenerChain2).toString();
      doReturn(lookaheadChainingListenerTest_TestChainingListener0, lookaheadChainingListenerTest_TestChainingListener0, lookaheadChainingListenerTest_TestChainingListener0, lookaheadChainingListenerTest_TestChainingListener0).when(listenerChain2).getNextListener(nullable(java.lang.Class.class));
      EmptyBlockChainingListener emptyBlockChainingListener1 = new EmptyBlockChainingListener(listenerChain2);
      emptyBlockChainingListener1.beginDefinitionDescription();
      ResourceType resourceType0 = ResourceType.UNKNOWN;
      ResourceReference resourceReference0 = new ResourceReference((String) null, resourceType0);
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      emptyBlockChainingListener1.endLink(resourceReference0, false, hashMap1);
      emptyBlockChainingListener1.beginMetaData(metaData0);
      lookaheadChainingListenerTest_TestChainingListener0.endDefinitionDescription();
      LookaheadChainingListener lookaheadChainingListener0 = new LookaheadChainingListener((ListenerChain) null, 1);
      ListenerChain listenerChain3 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, "").when(listenerChain3).toString();
      doReturn(lookaheadChainingListener0, emptyBlockChainingListener1).when(listenerChain3).getNextListener(nullable(java.lang.Class.class));
      ConsecutiveNewLineStateChainingListener consecutiveNewLineStateChainingListener0 = new ConsecutiveNewLineStateChainingListener(listenerChain3);
      consecutiveNewLineStateChainingListener0.endDefinitionDescription();
      Format format0 = Format.SUBSCRIPT;
      // Undeclared exception!
      consecutiveNewLineStateChainingListener0.endFormat(format0, hashMap1);
  }
}
