/*

 * Tue Apr 21 19:44:15 UTC 2020
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
import org.xwiki.rendering.listener.HeaderLevel;
import org.xwiki.rendering.listener.chaining.ChainingListener;
import org.xwiki.rendering.listener.chaining.EmptyBlockChainingListener;
import org.xwiki.rendering.listener.chaining.ListenerChain;
import org.xwiki.rendering.listener.reference.ResourceReference;
import org.xwiki.rendering.syntax.Syntax;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class EmptyBlockChainingListener_ESTest extends EmptyBlockChainingListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ListenerChain listenerChain0 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
      doReturn((ChainingListener) null, (ChainingListener) null, (ChainingListener) null, (ChainingListener) null).when(listenerChain0).getNextListener(nullable(java.lang.Class.class));
      EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain0);
      Map<String, String> map0 = null;
      emptyBlockChainingListener0.beginMacroMarker("syntax", (Map<String, String>) null, "syntax", false);
      Format format0 = Format.SUPERSCRIPT;
      Syntax syntax0 = Syntax.XHTML_1_0;
      HeaderLevel headerLevel0 = HeaderLevel.LEVEL1;
      emptyBlockChainingListener0.endHeader(headerLevel0, "syntax", (Map<String, String>) null);
      ResourceReference resourceReference0 = mock(ResourceReference.class, new ViolatedAssumptionAnswer());
      emptyBlockChainingListener0.onImage(resourceReference0, false, (Map<String, String>) null);
      Format format1 = Format.MONOSPACE;
      // Undeclared exception!
      emptyBlockChainingListener0.endFormat(format1, (Map<String, String>) null);
  }
}
