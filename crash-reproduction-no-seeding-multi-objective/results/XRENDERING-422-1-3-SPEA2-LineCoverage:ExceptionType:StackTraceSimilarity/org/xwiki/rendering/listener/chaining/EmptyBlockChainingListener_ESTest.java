/*

 * Tue Apr 21 18:44:23 UTC 2020
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
import org.xwiki.rendering.listener.HeaderLevel;
import org.xwiki.rendering.listener.Listener;
import org.xwiki.rendering.listener.chaining.EmptyBlockChainingListener;
import org.xwiki.rendering.listener.chaining.ListenerChain;
import org.xwiki.rendering.listener.chaining.LookaheadChainingListenerTest;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class EmptyBlockChainingListener_ESTest extends EmptyBlockChainingListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ListenerChain listenerChain0 = new ListenerChain();
      EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain0);
      ListenerChain listenerChain1 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
      EmptyBlockChainingListener emptyBlockChainingListener1 = new EmptyBlockChainingListener(listenerChain1);
      LookaheadChainingListenerTest lookaheadChainingListenerTest0 = new LookaheadChainingListenerTest();
      ListenerChain listenerChain2 = new ListenerChain();
      LookaheadChainingListenerTest.TestChainingListener lookaheadChainingListenerTest_TestChainingListener0 = lookaheadChainingListenerTest0.new TestChainingListener(listenerChain2);
      EmptyBlockChainingListener emptyBlockChainingListener2 = new EmptyBlockChainingListener(listenerChain2);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      emptyBlockChainingListener2.beginSection(hashMap0);
      emptyBlockChainingListener2.onId("^#XRIUHZuSe");
      emptyBlockChainingListener2.onMacro("", hashMap0, "", false);
      Map<String, String> map0 = Listener.EMPTY_PARAMETERS;
      emptyBlockChainingListener2.beginQuotation(map0);
      emptyBlockChainingListener2.onEmptyLines(0);
      Format format0 = Format.ITALIC;
      Format format1 = Format.SUBSCRIPT;
      emptyBlockChainingListener2.endFormat(format1, hashMap0);
      EmptyBlockChainingListener emptyBlockChainingListener3 = new EmptyBlockChainingListener(listenerChain2);
      HeaderLevel headerLevel0 = HeaderLevel.LEVEL3;
      // Undeclared exception!
      emptyBlockChainingListener3.endHeader(headerLevel0, "", map0);
  }
}
