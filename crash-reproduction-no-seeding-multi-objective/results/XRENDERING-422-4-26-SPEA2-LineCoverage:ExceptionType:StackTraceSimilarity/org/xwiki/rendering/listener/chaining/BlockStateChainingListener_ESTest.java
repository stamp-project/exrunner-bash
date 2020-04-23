/*

 * Tue Apr 21 20:01:07 UTC 2020
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
import org.xwiki.rendering.listener.chaining.BlockStateChainingListener;
import org.xwiki.rendering.listener.chaining.ConsecutiveNewLineStateChainingListener;
import org.xwiki.rendering.listener.chaining.EmptyBlockChainingListener;
import org.xwiki.rendering.listener.chaining.ListenerChain;
import org.xwiki.rendering.listener.chaining.StackableChainingListener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BlockStateChainingListener_ESTest extends BlockStateChainingListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ListenerChain listenerChain0 = new ListenerChain();
      ConsecutiveNewLineStateChainingListener consecutiveNewLineStateChainingListener0 = new ConsecutiveNewLineStateChainingListener(listenerChain0);
      StackableChainingListener stackableChainingListener0 = consecutiveNewLineStateChainingListener0.createChainingListenerInstance();
      ListenerChain listenerChain1 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
      doReturn(stackableChainingListener0, stackableChainingListener0, consecutiveNewLineStateChainingListener0, stackableChainingListener0, consecutiveNewLineStateChainingListener0).when(listenerChain1).getNextListener(nullable(java.lang.Class.class));
      EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain1);
      ListenerChain listenerChain2 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
      doReturn(emptyBlockChainingListener0, emptyBlockChainingListener0, emptyBlockChainingListener0, emptyBlockChainingListener0, emptyBlockChainingListener0).when(listenerChain2).getNextListener(nullable(java.lang.Class.class));
      BlockStateChainingListener blockStateChainingListener0 = new BlockStateChainingListener(listenerChain2);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      blockStateChainingListener0.onMacro("j:t{4:d_YD*$gSd", hashMap0, "j:t{4:d_YD*$gSd", false);
      blockStateChainingListener0.onHorizontalLine(hashMap0);
      blockStateChainingListener0.beginTableHeadCell(hashMap0);
      blockStateChainingListener0.onSpace();
      blockStateChainingListener0.endQuotation(hashMap0);
      blockStateChainingListener0.onMacro("j:t{4:d_YD*$gSd", hashMap0, "QUOTATION_LINE", false);
      Format format0 = Format.STRIKEDOUT;
      // Undeclared exception!
      blockStateChainingListener0.endFormat(format0, hashMap0);
  }
}
