/*

 * Tue Apr 21 18:57:35 UTC 2020
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
import org.xwiki.rendering.listener.chaining.EmptyBlockChainingListener;
import org.xwiki.rendering.listener.chaining.GroupStateChainingListener;
import org.xwiki.rendering.listener.chaining.ListenerChain;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class EmptyBlockChainingListener_ESTest extends EmptyBlockChainingListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ListenerChain listenerChain0 = new ListenerChain();
      GroupStateChainingListener groupStateChainingListener0 = new GroupStateChainingListener(listenerChain0);
      ListenerChain listenerChain1 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
      doReturn(groupStateChainingListener0, groupStateChainingListener0, groupStateChainingListener0, groupStateChainingListener0, groupStateChainingListener0).when(listenerChain1).getNextListener(nullable(java.lang.Class.class));
      EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain1);
      emptyBlockChainingListener0.onWord("c$+kFI}a0o5v8\"");
      MetaData metaData0 = mock(MetaData.class, new ViolatedAssumptionAnswer());
      emptyBlockChainingListener0.endMetaData(metaData0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      emptyBlockChainingListener0.beginTable(hashMap0);
      emptyBlockChainingListener0.endDefinitionTerm();
      Format format0 = Format.ITALIC;
      // Undeclared exception!
      emptyBlockChainingListener0.endFormat(format0, hashMap0);
  }
}
