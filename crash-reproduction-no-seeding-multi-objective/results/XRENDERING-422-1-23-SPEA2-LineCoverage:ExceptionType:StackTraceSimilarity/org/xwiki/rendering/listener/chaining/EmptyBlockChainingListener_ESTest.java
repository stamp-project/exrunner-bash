/*

 * Tue Apr 21 19:50:47 UTC 2020
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
import org.xwiki.rendering.listener.Listener;
import org.xwiki.rendering.listener.chaining.EmptyBlockChainingListener;
import org.xwiki.rendering.listener.chaining.ListenerChain;
import org.xwiki.rendering.listener.reference.ResourceReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class EmptyBlockChainingListener_ESTest extends EmptyBlockChainingListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Map<String, String> map0 = Listener.EMPTY_PARAMETERS;
      ResourceReference resourceReference0 = mock(ResourceReference.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = true;
      ListenerChain listenerChain0 = new ListenerChain();
      EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain0);
      // Undeclared exception!
      emptyBlockChainingListener0.endGroup((Map<String, String>) null);
  }
}
