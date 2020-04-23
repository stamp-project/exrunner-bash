/*

 * Tue Apr 21 19:17:11 UTC 2020
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
import org.xwiki.rendering.listener.MetaData;
import org.xwiki.rendering.listener.chaining.BlockStateChainingListener;
import org.xwiki.rendering.listener.chaining.ConsecutiveNewLineStateChainingListener;
import org.xwiki.rendering.listener.chaining.EmptyBlockChainingListener;
import org.xwiki.rendering.listener.chaining.GroupStateChainingListener;
import org.xwiki.rendering.listener.chaining.ListenerChain;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractChainingListener_ESTest extends AbstractChainingListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ListenerChain listenerChain0 = new ListenerChain();
      BlockStateChainingListener blockStateChainingListener0 = new BlockStateChainingListener(listenerChain0);
      EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain0);
      ListenerChain listenerChain1 = mock(ListenerChain.class, new ViolatedAssumptionAnswer());
      doReturn("su2~t%]9=ssL:gN-+", "su2~t%]9=ssL:gN-+", "M", "su2~t%]9=ssL:gN-+").when(listenerChain1).toString();
      doReturn(blockStateChainingListener0, blockStateChainingListener0, blockStateChainingListener0, emptyBlockChainingListener0).when(listenerChain1).getNextListener(nullable(java.lang.Class.class));
      BlockStateChainingListener blockStateChainingListener1 = new BlockStateChainingListener(listenerChain1);
      blockStateChainingListener1.endMetaData((MetaData) null);
      GroupStateChainingListener groupStateChainingListener0 = new GroupStateChainingListener(listenerChain0);
      Format format0 = Format.SUBSCRIPT;
      Map<String, String> map0 = Listener.EMPTY_PARAMETERS;
      groupStateChainingListener0.endFormat(format0, map0);
      blockStateChainingListener1.endTableCell(map0);
      ConsecutiveNewLineStateChainingListener consecutiveNewLineStateChainingListener0 = new ConsecutiveNewLineStateChainingListener(listenerChain0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      consecutiveNewLineStateChainingListener0.beginMacroMarker("`Es", hashMap0, "su2~t%]9=ssL:gN-+", true);
      blockStateChainingListener1.onMacro("Z~^e#", map0, "", true);
      ListenerChain listenerChain2 = new ListenerChain();
      EmptyBlockChainingListener emptyBlockChainingListener1 = new EmptyBlockChainingListener(listenerChain2);
      Map<String, String> map1 = Listener.EMPTY_PARAMETERS;
      Map<String, String> map2 = Listener.EMPTY_PARAMETERS;
      Format format1 = Format.UNDERLINED;
      // Undeclared exception!
      blockStateChainingListener1.endFormat(format1, map2);
  }
}
