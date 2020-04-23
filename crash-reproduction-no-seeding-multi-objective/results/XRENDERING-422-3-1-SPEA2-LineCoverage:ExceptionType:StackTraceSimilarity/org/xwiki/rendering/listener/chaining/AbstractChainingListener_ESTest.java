/*

 * Tue Apr 21 18:39:11 UTC 2020
 */

package org.xwiki.rendering.listener.chaining;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.rendering.listener.Format;
import org.xwiki.rendering.listener.Listener;
import org.xwiki.rendering.listener.MetaData;
import org.xwiki.rendering.listener.chaining.BlockStateChainingListener;
import org.xwiki.rendering.listener.chaining.ChainingListener;
import org.xwiki.rendering.listener.chaining.EmptyBlockChainingListener;
import org.xwiki.rendering.listener.chaining.ListenerChain;
import org.xwiki.rendering.listener.chaining.LookaheadChainingListenerTest;
import org.xwiki.rendering.listener.chaining.StackableChainingListener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractChainingListener_ESTest extends AbstractChainingListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LookaheadChainingListenerTest lookaheadChainingListenerTest0 = new LookaheadChainingListenerTest();
      ListenerChain listenerChain0 = new ListenerChain();
      LookaheadChainingListenerTest.TestChainingListener lookaheadChainingListenerTest_TestChainingListener0 = lookaheadChainingListenerTest0.new TestChainingListener(listenerChain0);
      Class<ChainingListener> class0 = ChainingListener.class;
      listenerChain0.getNextListener(class0);
      ListenerChain listenerChain1 = new ListenerChain();
      BlockStateChainingListener blockStateChainingListener0 = new BlockStateChainingListener(listenerChain1);
      StackableChainingListener stackableChainingListener0 = blockStateChainingListener0.createChainingListenerInstance();
      listenerChain1.addListener(stackableChainingListener0);
      EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain0);
      Map<String, String> map0 = Listener.EMPTY_PARAMETERS;
      MetaData metaData0 = new MetaData();
      Class<ChainingListener> class1 = ChainingListener.class;
      listenerChain0.getNextListener(class1);
      listenerChain1.addListener(emptyBlockChainingListener0);
      Format format0 = Format.SUBSCRIPT;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      // Undeclared exception!
      blockStateChainingListener0.endFormat(format0, hashMap0);
  }
}
