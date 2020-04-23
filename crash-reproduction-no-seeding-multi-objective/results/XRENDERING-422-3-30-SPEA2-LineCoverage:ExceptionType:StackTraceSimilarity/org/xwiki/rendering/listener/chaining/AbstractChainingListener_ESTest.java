/*

 * Tue Apr 21 20:14:49 UTC 2020
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
import org.xwiki.rendering.listener.HeaderLevel;
import org.xwiki.rendering.listener.ListType;
import org.xwiki.rendering.listener.MetaData;
import org.xwiki.rendering.listener.chaining.ChainingListener;
import org.xwiki.rendering.listener.chaining.ConsecutiveNewLineStateChainingListener;
import org.xwiki.rendering.listener.chaining.EmptyBlockChainingListener;
import org.xwiki.rendering.listener.chaining.ListenerChain;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractChainingListener_ESTest extends AbstractChainingListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ListenerChain listenerChain0 = new ListenerChain();
      EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain0);
      ListenerChain listenerChain1 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
      doReturn("z<Pg$!XW;aK", "z<Pg$!XW;aK", "<F;,`\"T*Cxsm#", "<F;,`\"T*Cxsm#", "").when(listenerChain1).toString();
      doReturn(emptyBlockChainingListener0, emptyBlockChainingListener0, emptyBlockChainingListener0, emptyBlockChainingListener0, emptyBlockChainingListener0).when(listenerChain1).getNextListener(nullable(java.lang.Class.class));
      Class<ChainingListener> class0 = ChainingListener.class;
      listenerChain0.popListener(class0);
      ConsecutiveNewLineStateChainingListener consecutiveNewLineStateChainingListener0 = new ConsecutiveNewLineStateChainingListener(listenerChain1);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      consecutiveNewLineStateChainingListener0.onVerbatim("[lsC`Z/I$ (b", false, hashMap0);
      MetaData metaData0 = new MetaData();
      consecutiveNewLineStateChainingListener0.beginDocument(metaData0);
      HeaderLevel headerLevel0 = HeaderLevel.LEVEL5;
      consecutiveNewLineStateChainingListener0.beginHeader(headerLevel0, "[lsC`Z/I$ (b", hashMap0);
      consecutiveNewLineStateChainingListener0.beginTableRow(hashMap0);
      ListType listType0 = ListType.NUMBERED;
      consecutiveNewLineStateChainingListener0.endList(listType0, hashMap0);
      consecutiveNewLineStateChainingListener0.endTableCell(hashMap0);
      consecutiveNewLineStateChainingListener0.endGroup(hashMap0);
      consecutiveNewLineStateChainingListener0.beginTableHeadCell(hashMap0);
      Format format0 = Format.SUBSCRIPT;
      consecutiveNewLineStateChainingListener0.endTableHeadCell(hashMap0);
      // Undeclared exception!
      consecutiveNewLineStateChainingListener0.endFormat(format0, hashMap0);
  }
}
