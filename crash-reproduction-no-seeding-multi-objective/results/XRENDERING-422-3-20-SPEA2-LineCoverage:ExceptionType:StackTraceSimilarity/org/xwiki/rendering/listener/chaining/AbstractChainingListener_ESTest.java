/*

 * Tue Apr 21 19:41:20 UTC 2020
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
import org.xwiki.rendering.listener.Listener;
import org.xwiki.rendering.listener.chaining.EmptyBlockChainingListener;
import org.xwiki.rendering.listener.chaining.ListenerChain;
import org.xwiki.rendering.listener.reference.ResourceReference;
import org.xwiki.rendering.listener.reference.ResourceType;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractChainingListener_ESTest extends AbstractChainingListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ListenerChain listenerChain0 = new ListenerChain();
      EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain0);
      ListenerChain listenerChain1 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, "", "", (String) null).when(listenerChain1).toString();
      doReturn(emptyBlockChainingListener0, emptyBlockChainingListener0, emptyBlockChainingListener0, emptyBlockChainingListener0, emptyBlockChainingListener0).when(listenerChain1).getNextListener(nullable(java.lang.Class.class));
      EmptyBlockChainingListener emptyBlockChainingListener1 = new EmptyBlockChainingListener(listenerChain1);
      emptyBlockChainingListener1.beginDefinitionTerm();
      Map<String, String> map0 = Listener.EMPTY_PARAMETERS;
      emptyBlockChainingListener1.endTableHeadCell(map0);
      emptyBlockChainingListener1.onSpecialSymbol('f');
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      emptyBlockChainingListener1.beginMacroMarker("", hashMap0, "", true);
      emptyBlockChainingListener1.endTableHeadCell(hashMap0);
      ResourceType resourceType0 = ResourceType.URL;
      ResourceReference resourceReference0 = new ResourceReference("4 7?87kT]__s) .P7", resourceType0);
      ResourceReference resourceReference1 = resourceReference0.clone();
      resourceReference1.getParameters();
      Format format0 = Format.NONE;
      // Undeclared exception!
      emptyBlockChainingListener1.endFormat(format0, map0);
  }
}
