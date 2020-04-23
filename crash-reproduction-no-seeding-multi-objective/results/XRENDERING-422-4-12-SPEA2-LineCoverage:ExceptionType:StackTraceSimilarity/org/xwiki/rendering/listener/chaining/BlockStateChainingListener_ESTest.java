/*

 * Tue Apr 21 19:14:25 UTC 2020
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
import org.xwiki.rendering.listener.reference.ResourceReference;
import org.xwiki.rendering.listener.reference.ResourceType;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BlockStateChainingListener_ESTest extends BlockStateChainingListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ListenerChain listenerChain0 = new ListenerChain();
      EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain0);
      ListenerChain listenerChain1 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
      doReturn(emptyBlockChainingListener0).when(listenerChain1).getNextListener(nullable(java.lang.Class.class));
      BlockStateChainingListener blockStateChainingListener0 = new BlockStateChainingListener(listenerChain1);
      blockStateChainingListener0.getLinkDepth();
      Map<String, String> map0 = Listener.EMPTY_PARAMETERS;
      BlockStateChainingListener blockStateChainingListener1 = new BlockStateChainingListener(listenerChain0);
      Format format0 = Format.STRIKEDOUT;
      blockStateChainingListener1.endFormat(format0, map0);
      blockStateChainingListener0.isInMacro();
      blockStateChainingListener0.pushLinkDepth();
      blockStateChainingListener1.beginTableHeadCell(map0);
      Format format1 = Format.NONE;
      String string0 = null;
      ResourceReference resourceReference0 = new ResourceReference((String) null, (ResourceType) null);
      Map<String, String> map1 = resourceReference0.getParameters();
      // Undeclared exception!
      blockStateChainingListener0.endFormat(format1, map1);
  }
}
