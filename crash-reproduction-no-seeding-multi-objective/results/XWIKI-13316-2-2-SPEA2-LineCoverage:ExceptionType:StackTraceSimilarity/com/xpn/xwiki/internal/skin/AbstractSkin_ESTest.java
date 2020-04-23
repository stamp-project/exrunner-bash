/*

 * Mon Apr 20 21:03:12 UTC 2020
 */

package com.xpn.xwiki.internal.skin;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.qos.logback.classic.Logger;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.internal.skin.EnvironmentSkin;
import com.xpn.xwiki.internal.skin.InternalSkinConfiguration;
import com.xpn.xwiki.internal.skin.InternalSkinManager;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.slf4j.event.SubstituteLoggingEvent;
import org.xwiki.component.embed.EmbeddableComponentManager;
import org.xwiki.component.internal.ContextComponentManager;
import org.xwiki.component.internal.ContextRootComponentManager;
import org.xwiki.component.internal.RootComponentManager;
import org.xwiki.context.Execution;
import org.xwiki.context.ExecutionContext;
import org.xwiki.environment.Environment;
import org.xwiki.model.reference.DocumentReferenceResolver;
import org.xwiki.rendering.internal.syntax.DefaultSyntaxFactory;
import ucar.httpservices.CustomX509TrustManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractSkin_ESTest extends AbstractSkin_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InternalSkinManager internalSkinManager0 = new InternalSkinManager();
      InternalSkinConfiguration internalSkinConfiguration0 = new InternalSkinConfiguration();
      DocumentReferenceResolver<SubstituteLoggingEvent> documentReferenceResolver0 = (DocumentReferenceResolver<SubstituteLoggingEvent>) mock(DocumentReferenceResolver.class, new ViolatedAssumptionAnswer());
      ContextComponentManager contextComponentManager0 = new ContextComponentManager();
      ExecutionContext executionContext0 = new ExecutionContext();
      Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
      Injector.inject(contextComponentManager0, (Class<?>) ContextComponentManager.class, "execution", (Object) execution0);
      RootComponentManager rootComponentManager0 = new RootComponentManager();
      ContextRootComponentManager contextRootComponentManager0 = new ContextRootComponentManager();
      Injector.inject(contextRootComponentManager0, (Class<?>) ContextRootComponentManager.class, "rootComponentManager", (Object) rootComponentManager0);
      EmbeddableComponentManager embeddableComponentManager0 = new EmbeddableComponentManager();
      Injector.inject(contextRootComponentManager0, (Class<?>) ContextRootComponentManager.class, "userComponentManager", (Object) embeddableComponentManager0);
      Injector.validateBean(contextRootComponentManager0, (Class<?>) ContextRootComponentManager.class);
      Injector.inject(rootComponentManager0, (Class<?>) RootComponentManager.class, "rootComponentManager", (Object) contextRootComponentManager0);
      Injector.validateBean(rootComponentManager0, (Class<?>) RootComponentManager.class);
      Injector.inject(contextComponentManager0, (Class<?>) ContextComponentManager.class, "rootComponentManager", (Object) rootComponentManager0);
      Injector.inject(contextComponentManager0, (Class<?>) ContextComponentManager.class, "userComponentManager", (Object) embeddableComponentManager0);
      Logger logger0 = (Logger)CustomX509TrustManager.logger;
      DefaultSyntaxFactory defaultSyntaxFactory0 = new DefaultSyntaxFactory();
      EnvironmentSkin environmentSkin0 = new EnvironmentSkin("Invalid DHDomainParameters: ", internalSkinManager0, internalSkinConfiguration0, logger0, defaultSyntaxFactory0, (Environment) null, (Provider<XWikiContext>) null);
      // Undeclared exception!
      environmentSkin0.getOutputSyntax();
  }
}
