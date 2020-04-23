/*

 * Tue Apr 21 18:51:13 UTC 2020
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
import org.xwiki.rendering.listener.chaining.BlockStateChainingListener;
import org.xwiki.rendering.listener.chaining.EmptyBlockChainingListener;
import org.xwiki.rendering.listener.chaining.ListenerChain;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BlockStateChainingListener_ESTest extends BlockStateChainingListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ListenerChain listenerChain0 = new ListenerChain();
      EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain0);
      ListenerChain listenerChain1 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
      doReturn(emptyBlockChainingListener0, emptyBlockChainingListener0, emptyBlockChainingListener0, emptyBlockChainingListener0).when(listenerChain1).getNextListener(nullable(java.lang.Class.class));
      BlockStateChainingListener blockStateChainingListener0 = new BlockStateChainingListener(listenerChain1);
      Map<String, String> map0 = null;
      blockStateChainingListener0.onHorizontalLine((Map<String, String>) null);
      blockStateChainingListener0.getDefinitionListItemIndex();
      blockStateChainingListener0.getCellCol();
      blockStateChainingListener0.popLinkDepth();
      Format format0 = Format.BOLD;
      blockStateChainingListener0.beginFormat(format0, (Map<String, String>) null);
      Format format1 = Format.ITALIC;
      blockStateChainingListener0.endFormat(format1, (Map<String, String>) null);
      Format format2 = Format.STRIKEDOUT;
      // Undeclared exception!
      blockStateChainingListener0.endFormat(format2, (Map<String, String>) null);
  }
}
