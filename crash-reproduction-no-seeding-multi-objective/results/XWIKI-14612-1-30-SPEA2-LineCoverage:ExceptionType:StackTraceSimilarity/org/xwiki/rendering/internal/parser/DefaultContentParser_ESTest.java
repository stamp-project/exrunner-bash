/*

 * Mon Apr 20 19:20:14 UTC 2020
 */

package org.xwiki.rendering.internal.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.chrono.MinguoDate;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.EntityReference;
import org.xwiki.model.reference.EntityReferenceSerializer;
import org.xwiki.model.reference.SpaceReference;
import org.xwiki.rendering.internal.parser.DefaultContentParser;
import org.xwiki.rendering.internal.parser.creole.CreoleParser;
import org.xwiki.rendering.syntax.Syntax;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DefaultContentParser_ESTest extends DefaultContentParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultContentParser defaultContentParser0 = new DefaultContentParser();
      Provider<CreoleParser> provider0 = (Provider<CreoleParser>) mock(Provider.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(provider0).get();
      Injector.inject(defaultContentParser0, (Class<?>) DefaultContentParser.class, "componentManagerProvider", (Object) provider0);
      EntityReferenceSerializer<MinguoDate> entityReferenceSerializer0 = (EntityReferenceSerializer<MinguoDate>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultContentParser0, (Class<?>) DefaultContentParser.class, "serializer", (Object) entityReferenceSerializer0);
      Injector.validateBean(defaultContentParser0, (Class<?>) DefaultContentParser.class);
      Syntax syntax0 = Syntax.CREOLE_1_0;
      String[] stringArray0 = new String[6];
      stringArray0[0] = "915=wI[5^I/Cx";
      stringArray0[1] = "915=wI[5^I/Cx";
      stringArray0[2] = "915=wI[5^I/Cx";
      stringArray0[3] = "915=wI[5^I/Cx";
      stringArray0[4] = "915=wI[5^I/Cx";
      String string0 = "bp|K2^<t{'";
      stringArray0[5] = "bp|K2^<t{'";
      SpaceReference spaceReference0 = new SpaceReference("915=wI[5^I/Cx", stringArray0);
      // Undeclared exception!
      defaultContentParser0.parse("915=wI[5^I/Cx", syntax0, (EntityReference) spaceReference0);
  }
}
