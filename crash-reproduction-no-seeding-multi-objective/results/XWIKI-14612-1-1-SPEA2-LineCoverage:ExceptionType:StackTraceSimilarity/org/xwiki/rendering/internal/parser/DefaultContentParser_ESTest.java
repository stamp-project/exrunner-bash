/*

 * Mon Apr 20 19:07:37 UTC 2020
 */

package org.xwiki.rendering.internal.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.chrono.HijrahDate;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinTask;
import javatests.DiamondIterableMapMRO;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.component.internal.ContextComponentManager;
import org.xwiki.model.reference.EntityReferenceSerializer;
import org.xwiki.rendering.internal.parser.DefaultContentParser;
import org.xwiki.rendering.internal.parser.twiki.TWikiParser;
import org.xwiki.rendering.syntax.Syntax;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DefaultContentParser_ESTest extends DefaultContentParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultContentParser defaultContentParser0 = new DefaultContentParser();
      DiamondIterableMapMRO diamondIterableMapMRO0 = new DiamondIterableMapMRO();
      ForkJoinTask.adapt((Callable<? extends TWikiParser>) diamondIterableMapMRO0);
      ContextComponentManager contextComponentManager0 = mock(ContextComponentManager.class, new ViolatedAssumptionAnswer());
      Provider<ContextComponentManager> provider0 = (Provider<ContextComponentManager>) mock(Provider.class, new ViolatedAssumptionAnswer());
      doReturn(contextComponentManager0).when(provider0).get();
      Injector.inject(defaultContentParser0, (Class<?>) DefaultContentParser.class, "componentManagerProvider", (Object) provider0);
      EntityReferenceSerializer<HijrahDate> entityReferenceSerializer0 = (EntityReferenceSerializer<HijrahDate>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultContentParser0, (Class<?>) DefaultContentParser.class, "serializer", (Object) entityReferenceSerializer0);
      // Undeclared exception!
      defaultContentParser0.parse("r],x<),3r", (Syntax) null);
  }
}
