/*

 * Tue Apr 21 18:47:38 UTC 2020
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
import org.xwiki.rendering.listener.Listener;
import org.xwiki.rendering.listener.MetaData;
import org.xwiki.rendering.listener.chaining.BlockStateChainingListener;
import org.xwiki.rendering.listener.chaining.ConsecutiveNewLineStateChainingListener;
import org.xwiki.rendering.listener.chaining.EmptyBlockChainingListener;
import org.xwiki.rendering.listener.chaining.ListenerChain;
import org.xwiki.rendering.listener.chaining.MetaDataStateChainingListener;
import org.xwiki.rendering.listener.reference.ResourceReference;
import org.xwiki.rendering.syntax.Syntax;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BlockStateChainingListener_ESTest extends BlockStateChainingListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ListenerChain listenerChain0 = new ListenerChain();
      MetaDataStateChainingListener metaDataStateChainingListener0 = new MetaDataStateChainingListener(listenerChain0);
      ConsecutiveNewLineStateChainingListener consecutiveNewLineStateChainingListener0 = new ConsecutiveNewLineStateChainingListener(listenerChain0);
      EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain0);
      ListenerChain listenerChain1 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
      doReturn(metaDataStateChainingListener0, consecutiveNewLineStateChainingListener0, metaDataStateChainingListener0, emptyBlockChainingListener0).when(listenerChain1).getNextListener(nullable(java.lang.Class.class));
      BlockStateChainingListener blockStateChainingListener0 = new BlockStateChainingListener(listenerChain1);
      MetaData metaData0 = mock(MetaData.class, new ViolatedAssumptionAnswer());
      blockStateChainingListener0.beginMetaData(metaData0);
      blockStateChainingListener0.popLinkDepth();
      Syntax syntax0 = Syntax.CREOLE_1_0;
      blockStateChainingListener0.isInLink();
      blockStateChainingListener0.isInHeader();
      ResourceReference resourceReference0 = mock(ResourceReference.class, new ViolatedAssumptionAnswer());
      Map<String, String> map0 = Listener.EMPTY_PARAMETERS;
      HashMap<String, String> hashMap0 = new HashMap<String, String>(map0);
      blockStateChainingListener0.endLink(resourceReference0, false, hashMap0);
      blockStateChainingListener0.isInTable();
      blockStateChainingListener0.beginSection(map0);
      blockStateChainingListener0.getPreviousEvent();
      Format format0 = Format.NONE;
      // Undeclared exception!
      blockStateChainingListener0.endFormat(format0, map0);
  }
}
