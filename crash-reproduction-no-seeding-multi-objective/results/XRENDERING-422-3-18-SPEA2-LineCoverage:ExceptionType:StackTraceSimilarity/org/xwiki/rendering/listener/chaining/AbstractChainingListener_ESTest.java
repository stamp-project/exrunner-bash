/*

 * Tue Apr 21 19:35:30 UTC 2020
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
import org.xwiki.rendering.listener.chaining.EmptyBlockChainingListener;
import org.xwiki.rendering.listener.chaining.ListenerChain;
import org.xwiki.rendering.listener.chaining.MetaDataStateChainingListener;
import org.xwiki.rendering.listener.reference.ResourceReference;
import org.xwiki.rendering.listener.reference.ResourceType;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractChainingListener_ESTest extends AbstractChainingListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "";
      ListenerChain listenerChain0 = new ListenerChain();
      MetaDataStateChainingListener metaDataStateChainingListener0 = new MetaDataStateChainingListener(listenerChain0);
      EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain0);
      ListenerChain listenerChain1 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
      doReturn("", "").when(listenerChain1).toString();
      doReturn(metaDataStateChainingListener0, emptyBlockChainingListener0).when(listenerChain1).getNextListener(nullable(java.lang.Class.class));
      EmptyBlockChainingListener emptyBlockChainingListener1 = new EmptyBlockChainingListener(listenerChain1);
      ListType listType0 = ListType.NUMBERED;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      emptyBlockChainingListener1.beginList(listType0, hashMap0);
      EmptyBlockChainingListener emptyBlockChainingListener2 = new EmptyBlockChainingListener(listenerChain1);
      Format format0 = Format.NONE;
      ResourceType resourceType0 = ResourceType.PATH;
      ResourceReference resourceReference0 = new ResourceReference("", resourceType0);
      Map<String, String> map0 = resourceReference0.getParameters();
      // Undeclared exception!
      emptyBlockChainingListener1.endFormat(format0, map0);
  }
}
