/*

 * Tue Apr 21 19:48:06 UTC 2020
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
import org.xwiki.rendering.listener.chaining.GroupStateChainingListener;
import org.xwiki.rendering.listener.chaining.ListenerChain;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BlockStateChainingListener_ESTest extends BlockStateChainingListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ListenerChain listenerChain0 = new ListenerChain();
      EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain0);
      BlockStateChainingListener blockStateChainingListener0 = new BlockStateChainingListener(listenerChain0);
      blockStateChainingListener0.createChainingListenerInstance();
      ListenerChain listenerChain1 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
      doReturn(emptyBlockChainingListener0).when(listenerChain1).getNextListener(nullable(java.lang.Class.class));
      GroupStateChainingListener groupStateChainingListener0 = new GroupStateChainingListener(listenerChain1);
      ListenerChain listenerChain2 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
      doReturn(groupStateChainingListener0).when(listenerChain2).getNextListener(nullable(java.lang.Class.class));
      BlockStateChainingListener blockStateChainingListener1 = new BlockStateChainingListener(listenerChain2);
      Format format0 = Format.BOLD;
      Map<String, String> map0 = Listener.EMPTY_PARAMETERS;
      // Undeclared exception!
      blockStateChainingListener1.endFormat(format0, map0);
  }
}
