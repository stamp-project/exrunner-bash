/*

 * Tue Apr 21 19:51:16 UTC 2020
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
import org.xwiki.rendering.listener.chaining.ConsecutiveNewLineStateChainingListener;
import org.xwiki.rendering.listener.chaining.EmptyBlockChainingListener;
import org.xwiki.rendering.listener.chaining.ListenerChain;
import org.xwiki.rendering.listener.chaining.StackableChainingListener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractChainingListener_ESTest extends AbstractChainingListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ListenerChain listenerChain0 = new ListenerChain();
      EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain0);
      ListenerChain listenerChain1 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
      doReturn("w{[qw6\u0002", "KFpax", "awk-~8e%^]uy e7&").when(listenerChain1).toString();
      doReturn(emptyBlockChainingListener0).when(listenerChain1).getNextListener(nullable(java.lang.Class.class));
      ConsecutiveNewLineStateChainingListener consecutiveNewLineStateChainingListener0 = new ConsecutiveNewLineStateChainingListener(listenerChain1);
      StackableChainingListener stackableChainingListener0 = consecutiveNewLineStateChainingListener0.createChainingListenerInstance();
      ListenerChain listenerChain2 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
      doReturn("").when(listenerChain2).toString();
      doReturn(stackableChainingListener0).when(listenerChain2).getNextListener(nullable(java.lang.Class.class));
      ListenerChain listenerChain3 = new ListenerChain();
      EmptyBlockChainingListener emptyBlockChainingListener1 = new EmptyBlockChainingListener(listenerChain3);
      emptyBlockChainingListener1.beginListItem();
      consecutiveNewLineStateChainingListener0.createChainingListenerInstance();
      EmptyBlockChainingListener emptyBlockChainingListener2 = new EmptyBlockChainingListener(listenerChain2);
      Format format0 = Format.SUBSCRIPT;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      // Undeclared exception!
      emptyBlockChainingListener2.endFormat(format0, hashMap0);
  }
}
