/*

 * Tue Apr 21 19:57:50 UTC 2020
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
import org.xwiki.rendering.listener.ListType;
import org.xwiki.rendering.listener.Listener;
import org.xwiki.rendering.listener.MetaData;
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
      ListType listType0 = ListType.NUMBERED;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      emptyBlockChainingListener0.beginList(listType0, hashMap0);
      Map<String, String> map0 = Listener.EMPTY_PARAMETERS;
      blockStateChainingListener0.onWord("END_TABLE_HEAD_CELL");
      blockStateChainingListener0.getQuotationLineDepth();
      Map<String, String> map1 = Listener.EMPTY_PARAMETERS;
      Format format0 = Format.UNDERLINED;
      blockStateChainingListener0.endFormat(format0, map1);
      MetaData metaData0 = MetaData.EMPTY;
      Map<String, Object> map2 = metaData0.getMetaData();
      MetaData metaData1 = new MetaData(map2);
      MetaData metaData2 = MetaData.EMPTY;
      blockStateChainingListener0.endMetaData(metaData0);
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      Format format1 = Format.NONE;
      // Undeclared exception!
      blockStateChainingListener0.endFormat(format1, map1);
  }
}
