/*

 * Tue Apr 21 18:38:19 UTC 2020
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
import org.xwiki.rendering.listener.chaining.BlockStateChainingListener;
import org.xwiki.rendering.listener.chaining.EmptyBlockChainingListener;
import org.xwiki.rendering.listener.chaining.ListenerChain;
import org.xwiki.rendering.listener.chaining.StackableChainingListener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BlockStateChainingListener_ESTest extends BlockStateChainingListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ListenerChain listenerChain0 = new ListenerChain();
      BlockStateChainingListener blockStateChainingListener0 = new BlockStateChainingListener(listenerChain0);
      StackableChainingListener stackableChainingListener0 = blockStateChainingListener0.createChainingListenerInstance();
      EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain0);
      ListenerChain listenerChain1 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
      doReturn(stackableChainingListener0, blockStateChainingListener0, emptyBlockChainingListener0).when(listenerChain1).getNextListener(nullable(java.lang.Class.class));
      BlockStateChainingListener blockStateChainingListener1 = new BlockStateChainingListener(listenerChain1);
      blockStateChainingListener1.getQuotationDepth();
      blockStateChainingListener1.getQuotationLineIndex();
      blockStateChainingListener1.isInDefinitionList();
      blockStateChainingListener1.onId("G");
      Format format0 = Format.UNDERLINED;
      Map<String, String> map0 = Listener.EMPTY_PARAMETERS;
      blockStateChainingListener1.beginGroup(map0);
      // Undeclared exception!
      blockStateChainingListener1.endFormat(format0, map0);
  }
}
