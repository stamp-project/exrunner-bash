/*

 * Tue Apr 21 19:57:36 UTC 2020
 */

package org.xwiki.rendering.listener.chaining;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.rendering.listener.Listener;
import org.xwiki.rendering.listener.chaining.EmptyBlockChainingListener;
import org.xwiki.rendering.listener.chaining.ListenerChain;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class EmptyBlockChainingListener_ESTest extends EmptyBlockChainingListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ListenerChain listenerChain0 = new ListenerChain();
      EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain0);
      String string0 = "";
      Map<String, String> map0 = Listener.EMPTY_PARAMETERS;
      String string1 = "";
      boolean boolean0 = false;
      // Undeclared exception!
      emptyBlockChainingListener0.endMacroMarker("", map0, "", false);
  }
}
