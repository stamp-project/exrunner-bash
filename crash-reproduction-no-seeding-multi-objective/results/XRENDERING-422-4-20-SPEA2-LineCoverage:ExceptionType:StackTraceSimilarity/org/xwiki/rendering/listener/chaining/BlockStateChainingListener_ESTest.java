/*

 * Tue Apr 21 19:41:20 UTC 2020
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
import org.xwiki.rendering.listener.MetaData;
import org.xwiki.rendering.listener.chaining.BlockStateChainingListener;
import org.xwiki.rendering.listener.chaining.EmptyBlockChainingListener;
import org.xwiki.rendering.listener.chaining.ListenerChain;
import org.xwiki.rendering.syntax.Syntax;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BlockStateChainingListener_ESTest extends BlockStateChainingListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ListenerChain listenerChain0 = new ListenerChain();
      EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain0);
      ListenerChain listenerChain1 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
      doReturn(emptyBlockChainingListener0, emptyBlockChainingListener0, emptyBlockChainingListener0, emptyBlockChainingListener0, emptyBlockChainingListener0).when(listenerChain1).getNextListener(nullable(java.lang.Class.class));
      BlockStateChainingListener blockStateChainingListener0 = new BlockStateChainingListener(listenerChain1);
      MetaData metaData0 = mock(MetaData.class, new ViolatedAssumptionAnswer());
      blockStateChainingListener0.beginMetaData(metaData0);
      blockStateChainingListener0.onSpace();
      blockStateChainingListener0.beginQuotationLine();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      blockStateChainingListener0.endTableCell(hashMap0);
      Syntax syntax0 = Syntax.ANNOTATED_XHTML_1_0;
      blockStateChainingListener0.onRawText("", syntax0);
      blockStateChainingListener0.onHorizontalLine(hashMap0);
      Format format0 = Format.SUPERSCRIPT;
      // Undeclared exception!
      blockStateChainingListener0.endFormat(format0, hashMap0);
  }
}
