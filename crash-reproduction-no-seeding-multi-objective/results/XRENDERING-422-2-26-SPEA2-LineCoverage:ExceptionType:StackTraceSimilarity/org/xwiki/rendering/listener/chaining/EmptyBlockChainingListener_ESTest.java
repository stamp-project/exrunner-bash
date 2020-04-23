/*

 * Tue Apr 21 20:00:55 UTC 2020
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
import org.xwiki.rendering.listener.Format;
import org.xwiki.rendering.listener.ListType;
import org.xwiki.rendering.listener.Listener;
import org.xwiki.rendering.listener.MetaData;
import org.xwiki.rendering.listener.chaining.ChainingListener;
import org.xwiki.rendering.listener.chaining.EmptyBlockChainingListener;
import org.xwiki.rendering.listener.chaining.ListenerChain;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class EmptyBlockChainingListener_ESTest extends EmptyBlockChainingListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ListenerChain listenerChain0 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
      doReturn((ChainingListener) null, (ChainingListener) null).when(listenerChain0).getNextListener(nullable(java.lang.Class.class));
      EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain0);
      Map<String, String> map0 = Listener.EMPTY_PARAMETERS;
      emptyBlockChainingListener0.beginDefinitionList(map0);
      ListenerChain listenerChain1 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
      doReturn((ChainingListener) null, (ChainingListener) null, (ChainingListener) null, (ChainingListener) null).when(listenerChain1).getNextListener(nullable(java.lang.Class.class));
      EmptyBlockChainingListener emptyBlockChainingListener1 = new EmptyBlockChainingListener(listenerChain1);
      MetaData metaData0 = mock(MetaData.class, new ViolatedAssumptionAnswer());
      emptyBlockChainingListener1.beginDocument(metaData0);
      emptyBlockChainingListener1.isCurrentContainerBlockEmpty();
      emptyBlockChainingListener1.onVerbatim("", true, map0);
      ListType listType0 = ListType.BULLETED;
      emptyBlockChainingListener0.beginList(listType0, map0);
      emptyBlockChainingListener1.endMacroMarker("", map0, "C|F", false);
      Format format0 = Format.STRIKEDOUT;
      // Undeclared exception!
      emptyBlockChainingListener1.endFormat(format0, map0);
  }
}
