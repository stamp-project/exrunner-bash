/*

 * Tue Apr 21 19:01:14 UTC 2020
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
import org.xwiki.rendering.listener.chaining.BlockStateChainingListener;
import org.xwiki.rendering.listener.chaining.EmptyBlockChainingListener;
import org.xwiki.rendering.listener.chaining.ListenerChain;
import org.xwiki.rendering.listener.reference.ResourceReference;
import org.xwiki.rendering.listener.reference.ResourceType;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BlockStateChainingListener_ESTest extends BlockStateChainingListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ListenerChain listenerChain0 = new ListenerChain();
      BlockStateChainingListener blockStateChainingListener0 = new BlockStateChainingListener(listenerChain0);
      EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain0);
      ListenerChain listenerChain1 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
      doReturn(blockStateChainingListener0, emptyBlockChainingListener0).when(listenerChain1).getNextListener(nullable(java.lang.Class.class));
      BlockStateChainingListener blockStateChainingListener1 = new BlockStateChainingListener(listenerChain1);
      ResourceType resourceType0 = ResourceType.UNKNOWN;
      ResourceReference resourceReference0 = new ResourceReference((String) null, resourceType0);
      ResourceReference resourceReference1 = resourceReference0.clone();
      blockStateChainingListener1.endListItem();
      Object object0 = new Object();
      resourceReference0.equals(object0);
      Map<String, String> map0 = resourceReference1.getParameters();
      ListenerChain listenerChain2 = new ListenerChain();
      BlockStateChainingListener blockStateChainingListener2 = new BlockStateChainingListener(listenerChain2);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Format format0 = Format.NONE;
      // Undeclared exception!
      blockStateChainingListener1.endFormat(format0, map0);
  }
}
