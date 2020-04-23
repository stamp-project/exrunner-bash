/*

 * Tue Apr 21 19:54:39 UTC 2020
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
import org.xwiki.rendering.listener.MetaData;
import org.xwiki.rendering.listener.chaining.BlockStateChainingListener;
import org.xwiki.rendering.listener.chaining.ConsecutiveNewLineStateChainingListener;
import org.xwiki.rendering.listener.chaining.EmptyBlockChainingListener;
import org.xwiki.rendering.listener.chaining.ListenerChain;
import org.xwiki.rendering.listener.chaining.MetaDataStateChainingListener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BlockStateChainingListener_ESTest extends BlockStateChainingListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ListenerChain listenerChain0 = new ListenerChain();
      MetaDataStateChainingListener metaDataStateChainingListener0 = new MetaDataStateChainingListener(listenerChain0);
      ListenerChain listenerChain1 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
      doReturn(metaDataStateChainingListener0, metaDataStateChainingListener0).when(listenerChain1).getNextListener(nullable(java.lang.Class.class));
      EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain1);
      ListenerChain listenerChain2 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
      ConsecutiveNewLineStateChainingListener consecutiveNewLineStateChainingListener0 = new ConsecutiveNewLineStateChainingListener(listenerChain2);
      consecutiveNewLineStateChainingListener0.createChainingListenerInstance();
      ListenerChain listenerChain3 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
      doReturn(emptyBlockChainingListener0, emptyBlockChainingListener0).when(listenerChain3).getNextListener(nullable(java.lang.Class.class));
      BlockStateChainingListener blockStateChainingListener0 = new BlockStateChainingListener(listenerChain3);
      MetaData metaData0 = mock(MetaData.class, new ViolatedAssumptionAnswer());
      blockStateChainingListener0.beginMetaData(metaData0);
      blockStateChainingListener0.getInlineDepth();
      Format format0 = Format.ITALIC;
      Map<String, String> map0 = Listener.EMPTY_PARAMETERS;
      // Undeclared exception!
      blockStateChainingListener0.endFormat(format0, map0);
  }
}
