/*

 * Mon Apr 20 21:08:56 UTC 2020
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
import com.xpn.xwiki.web.XWikiServletResponseStub;
import java.lang.reflect.Type;
import java.util.Locale;
import javax.print.attribute.Attribute;
import javax.print.attribute.standard.JobOriginatingUserName;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.slf4j.event.SubstituteLoggingEvent;
import org.xwiki.component.embed.EmbeddableComponentManager;
import org.xwiki.component.embed.GenericProvider;
import org.xwiki.component.internal.RoleHint;
import org.xwiki.component.internal.RootComponentManager;
import org.xwiki.configuration.internal.AbstractConfigurationSourceProvider;
import org.xwiki.configuration.internal.RestrictedConfigurationSourceProvider;
import org.xwiki.environment.Environment;
import org.xwiki.rendering.internal.syntax.DefaultSyntaxFactory;
import ucar.httpservices.CustomX509TrustManager;
import ucar.nc2.util.net.URLStreamHandlerFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractSkin_ESTest extends AbstractSkin_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InternalSkinManager internalSkinManager0 = null;
      InternalSkinConfiguration internalSkinConfiguration0 = new InternalSkinConfiguration();
      RestrictedConfigurationSourceProvider restrictedConfigurationSourceProvider0 = new RestrictedConfigurationSourceProvider();
      RootComponentManager rootComponentManager0 = new RootComponentManager();
      EmbeddableComponentManager embeddableComponentManager0 = new EmbeddableComponentManager("Unimplemented - use org.eclipse.jetty.servlet.ServletContextHandler");
      XWikiServletResponseStub xWikiServletResponseStub0 = new XWikiServletResponseStub();
      xWikiServletResponseStub0.getLocale();
      JobOriginatingUserName jobOriginatingUserName0 = new JobOriginatingUserName("#3#,NRVMHQLF<", (Locale) null);
      Class<? extends Attribute> class0 = jobOriginatingUserName0.getCategory();
      embeddableComponentManager0.hasComponent((Type) class0);
      Injector.inject(rootComponentManager0, (Class<?>) RootComponentManager.class, "rootComponentManager", (Object) embeddableComponentManager0);
      Injector.validateBean(rootComponentManager0, (Class<?>) RootComponentManager.class);
      Injector.inject(restrictedConfigurationSourceProvider0, (Class<?>) AbstractConfigurationSourceProvider.class, "componentManager", (Object) rootComponentManager0);
      Injector.validateBean(restrictedConfigurationSourceProvider0, (Class<?>) RestrictedConfigurationSourceProvider.class);
      Logger logger0 = (Logger)CustomX509TrustManager.logger;
      DefaultSyntaxFactory defaultSyntaxFactory0 = new DefaultSyntaxFactory();
      Class<Attribute> class1 = Attribute.class;
      com.google.inject.Injector injector0 = mock(com.google.inject.Injector.class, new ViolatedAssumptionAnswer());
      Logger logger1 = (Logger)URLStreamHandlerFactory.log;
      SubstituteLoggingEvent substituteLoggingEvent0 = new SubstituteLoggingEvent();
      substituteLoggingEvent0.getLogger();
      RoleHint<XWikiContext> roleHint0 = new RoleHint<XWikiContext>(class1, "Unimplemented - use org.eclipse.jetty.servlet.ServletContextHandler");
      GenericProvider<XWikiContext> genericProvider0 = new GenericProvider<XWikiContext>(embeddableComponentManager0, roleHint0);
      EnvironmentSkin environmentSkin0 = new EnvironmentSkin("Unimplemented - use org.eclipse.jetty.servlet.ServletContextHandler", (InternalSkinManager) null, internalSkinConfiguration0, logger0, defaultSyntaxFactory0, (Environment) null, genericProvider0);
      // Undeclared exception!
      environmentSkin0.getOutputSyntax();
  }
}
