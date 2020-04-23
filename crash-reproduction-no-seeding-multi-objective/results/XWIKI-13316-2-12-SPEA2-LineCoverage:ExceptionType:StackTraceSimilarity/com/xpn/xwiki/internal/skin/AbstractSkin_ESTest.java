/*

 * Mon Apr 20 21:17:57 UTC 2020
 */

package com.xpn.xwiki.internal.skin;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.qos.logback.classic.Logger;
import com.google.inject.Injector;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.internal.XWikiContextProvider;
import com.xpn.xwiki.internal.skin.EnvironmentSkin;
import com.xpn.xwiki.internal.skin.InternalSkinConfiguration;
import com.xpn.xwiki.internal.skin.InternalSkinManager;
import com.xpn.xwiki.util.XWikiStubContextProvider;
import javax.swing.JFileChooser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.hibernate.loader.custom.sql.SQLCustomQuery;
import org.junit.runner.RunWith;
import org.slf4j.event.SubstituteLoggingEvent;
import org.xwiki.component.internal.multi.ComponentManagerManager;
import org.xwiki.context.Execution;
import org.xwiki.context.ExecutionContext;
import org.xwiki.environment.Environment;
import org.xwiki.model.reference.EntityReferenceSerializer;
import org.xwiki.rendering.internal.syntax.DefaultSyntaxFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractSkin_ESTest extends AbstractSkin_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InternalSkinManager internalSkinManager0 = mock(InternalSkinManager.class, new ViolatedAssumptionAnswer());
      Logger logger0 = (Logger)SQLCustomQuery.log;
      Injector injector0 = mock(Injector.class, new ViolatedAssumptionAnswer());
      SubstituteLoggingEvent substituteLoggingEvent0 = new SubstituteLoggingEvent();
      DefaultSyntaxFactory defaultSyntaxFactory0 = new DefaultSyntaxFactory();
      Injector injector1 = mock(Injector.class, new ViolatedAssumptionAnswer());
      Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
      ComponentManagerManager componentManagerManager0 = mock(ComponentManagerManager.class, new ViolatedAssumptionAnswer());
      EntityReferenceSerializer<JFileChooser> entityReferenceSerializer0 = (EntityReferenceSerializer<JFileChooser>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      ComponentManagerManager componentManagerManager1 = mock(ComponentManagerManager.class, new ViolatedAssumptionAnswer());
      XWikiContextProvider xWikiContextProvider0 = new XWikiContextProvider();
      XWikiContext xWikiContext0 = new XWikiContext();
      XWikiContext xWikiContext1 = xWikiContext0.clone();
      XWikiStubContextProvider xWikiStubContextProvider0 = mock(XWikiStubContextProvider.class, new ViolatedAssumptionAnswer());
      doReturn(xWikiContext1).when(xWikiStubContextProvider0).createStubContext();
      org.evosuite.runtime.javaee.injection.Injector.inject(xWikiContextProvider0, (Class<?>) XWikiContextProvider.class, "contextProvider", (Object) xWikiStubContextProvider0);
      ExecutionContext executionContext0 = new ExecutionContext();
      Execution execution1 = mock(Execution.class, new ViolatedAssumptionAnswer());
      doReturn(executionContext0, executionContext0, executionContext0, executionContext0, executionContext0).when(execution1).getContext();
      org.evosuite.runtime.javaee.injection.Injector.inject(xWikiContextProvider0, (Class<?>) XWikiContextProvider.class, "execution", (Object) execution1);
      org.evosuite.runtime.javaee.injection.Injector.validateBean(xWikiContextProvider0, (Class<?>) XWikiContextProvider.class);
      xWikiContextProvider0.get();
      xWikiContextProvider0.get();
      EnvironmentSkin environmentSkin0 = new EnvironmentSkin("L.o5;}t'8NF?o+<ev*", internalSkinManager0, (InternalSkinConfiguration) null, logger0, defaultSyntaxFactory0, (Environment) null, xWikiContextProvider0);
      // Undeclared exception!
      environmentSkin0.getOutputSyntax();
  }
}
