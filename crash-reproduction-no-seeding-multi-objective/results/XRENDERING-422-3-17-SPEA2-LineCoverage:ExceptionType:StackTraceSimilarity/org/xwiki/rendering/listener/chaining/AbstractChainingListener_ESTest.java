/*

 * Tue Apr 21 19:31:51 UTC 2020
 */

package org.xwiki.rendering.listener.chaining;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.rendering.listener.Format;
import org.xwiki.rendering.listener.chaining.BlockStateChainingListener;
import org.xwiki.rendering.listener.chaining.EmptyBlockChainingListener;
import org.xwiki.rendering.listener.chaining.GroupStateChainingListener;
import org.xwiki.rendering.listener.chaining.ListenerChain;
import org.xwiki.rendering.listener.chaining.LookaheadChainingListenerTest;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractChainingListener_ESTest extends AbstractChainingListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LookaheadChainingListenerTest lookaheadChainingListenerTest0 = new LookaheadChainingListenerTest();
      ListenerChain listenerChain0 = new ListenerChain();
      EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      emptyBlockChainingListener0.beginSection(hashMap0);
      GroupStateChainingListener groupStateChainingListener0 = new GroupStateChainingListener(listenerChain0);
      listenerChain0.addListener(groupStateChainingListener0);
      groupStateChainingListener0.onEmptyLines(1359);
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      BlockStateChainingListener blockStateChainingListener0 = new BlockStateChainingListener(listenerChain0);
      blockStateChainingListener0.createChainingListenerInstance();
      emptyBlockChainingListener0.endTableHeadCell(hashMap0);
      listenerChain0.addListener(emptyBlockChainingListener0);
      Format format0 = Format.SUPERSCRIPT;
      // Undeclared exception!
      groupStateChainingListener0.endFormat(format0, hashMap0);
  }
}
