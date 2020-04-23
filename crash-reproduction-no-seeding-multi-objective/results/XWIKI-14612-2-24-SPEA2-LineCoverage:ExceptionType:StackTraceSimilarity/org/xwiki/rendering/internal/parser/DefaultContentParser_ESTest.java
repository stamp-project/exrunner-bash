/*

 * Mon Apr 20 19:18:05 UTC 2020
 */

package org.xwiki.rendering.internal.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.user.impl.xwiki.XWikiGroupServiceImpl;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.component.internal.SpaceComponentManager;
import org.xwiki.model.reference.EntityReference;
import org.xwiki.model.reference.EntityReferenceSerializer;
import org.xwiki.rendering.internal.parser.DefaultContentParser;
import org.xwiki.rendering.internal.parser.twiki.TWikiParser;
import org.xwiki.rendering.syntax.Syntax;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DefaultContentParser_ESTest extends DefaultContentParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultContentParser defaultContentParser0 = new DefaultContentParser();
      SpaceComponentManager spaceComponentManager0 = mock(SpaceComponentManager.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(spaceComponentManager0).getInstance(any(java.lang.reflect.Type.class) , anyString());
      Provider<SpaceComponentManager> provider0 = (Provider<SpaceComponentManager>) mock(Provider.class, new ViolatedAssumptionAnswer());
      doReturn(spaceComponentManager0).when(provider0).get();
      Injector.inject(defaultContentParser0, (Class<?>) DefaultContentParser.class, "componentManagerProvider", (Object) provider0);
      EntityReferenceSerializer<TWikiParser> entityReferenceSerializer0 = (EntityReferenceSerializer<TWikiParser>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultContentParser0, (Class<?>) DefaultContentParser.class, "serializer", (Object) entityReferenceSerializer0);
      Injector.validateBean(defaultContentParser0, (Class<?>) DefaultContentParser.class);
      String string0 = "VUt:G";
      Syntax syntax0 = Syntax.TEX_1_0;
      EntityReference entityReference0 = XWikiGroupServiceImpl.GROUPCLASS_REFERENCE;
      // Undeclared exception!
      defaultContentParser0.parse("VUt:G", syntax0, entityReference0);
  }
}
