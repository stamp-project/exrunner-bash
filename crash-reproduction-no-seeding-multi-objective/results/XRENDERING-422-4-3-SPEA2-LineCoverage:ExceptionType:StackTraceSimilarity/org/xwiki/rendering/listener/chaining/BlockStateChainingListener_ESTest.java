/*

 * Tue Apr 21 18:44:39 UTC 2020
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
import org.xwiki.rendering.listener.chaining.BlockStateChainingListener;
import org.xwiki.rendering.listener.chaining.EmptyBlockChainingListener;
import org.xwiki.rendering.listener.chaining.ListenerChain;
import org.xwiki.rendering.listener.chaining.LookaheadChainingListener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BlockStateChainingListener_ESTest extends BlockStateChainingListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ListenerChain listenerChain0 = null;
      LookaheadChainingListener lookaheadChainingListener0 = new LookaheadChainingListener((ListenerChain) null, 11);
      ListenerChain listenerChain1 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
      doReturn(lookaheadChainingListener0).when(listenerChain1).getNextListener(nullable(java.lang.Class.class));
      EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain1);
      BlockStateChainingListener blockStateChainingListener0 = new BlockStateChainingListener((ListenerChain) null);
      ListenerChain listenerChain2 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
      doReturn(emptyBlockChainingListener0).when(listenerChain2).getNextListener(nullable(java.lang.Class.class));
      BlockStateChainingListener blockStateChainingListener1 = new BlockStateChainingListener(listenerChain2);
      blockStateChainingListener1.getCellCol();
      blockStateChainingListener0.createChainingListenerInstance();
      BlockStateChainingListener blockStateChainingListener2 = new BlockStateChainingListener((ListenerChain) null);
      blockStateChainingListener0.isInQuotation();
      blockStateChainingListener2.isInLine();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Format format0 = Format.SUPERSCRIPT;
      // Undeclared exception!
      blockStateChainingListener1.endFormat(format0, hashMap0);
  }
}
