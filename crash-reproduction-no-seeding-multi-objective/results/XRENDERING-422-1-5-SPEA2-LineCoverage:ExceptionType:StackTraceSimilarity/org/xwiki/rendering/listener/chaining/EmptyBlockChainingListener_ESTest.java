/*

 * Tue Apr 21 18:51:00 UTC 2020
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
import org.xwiki.rendering.listener.chaining.BlockStateChainingListener;
import org.xwiki.rendering.listener.chaining.EmptyBlockChainingListener;
import org.xwiki.rendering.listener.chaining.ListenerChain;
import org.xwiki.rendering.listener.chaining.LookaheadChainingListener;
import org.xwiki.rendering.syntax.Syntax;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class EmptyBlockChainingListener_ESTest extends EmptyBlockChainingListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ListenerChain listenerChain0 = new ListenerChain();
      BlockStateChainingListener blockStateChainingListener0 = new BlockStateChainingListener(listenerChain0);
      EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain0);
      ListenerChain listenerChain1 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
      EmptyBlockChainingListener emptyBlockChainingListener1 = new EmptyBlockChainingListener(listenerChain1);
      LookaheadChainingListener lookaheadChainingListener0 = new LookaheadChainingListener(listenerChain0, 206);
      ListenerChain listenerChain2 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
      doReturn(lookaheadChainingListener0).when(listenerChain2).getNextListener(nullable(java.lang.Class.class));
      EmptyBlockChainingListener emptyBlockChainingListener2 = new EmptyBlockChainingListener(listenerChain2);
      Syntax syntax0 = Syntax.XWIKI_1_0;
      emptyBlockChainingListener0.onRawText("", syntax0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      // Undeclared exception!
      emptyBlockChainingListener2.endParagraph(hashMap0);
  }
}
