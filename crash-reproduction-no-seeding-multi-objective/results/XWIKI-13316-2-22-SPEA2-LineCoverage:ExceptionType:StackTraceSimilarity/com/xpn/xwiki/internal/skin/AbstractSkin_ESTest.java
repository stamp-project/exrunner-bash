/*

 * Mon Apr 20 21:32:44 UTC 2020
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
import java.time.chrono.MinguoDate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.hibernate.type.CompositeCustomType;
import org.hibernate.usertype.CompositeUserType;
import org.junit.runner.RunWith;
import org.xwiki.component.embed.EmbeddableComponentManager;
import org.xwiki.component.embed.GenericProvider;
import org.xwiki.component.internal.ContextComponentManager;
import org.xwiki.component.internal.RoleHint;
import org.xwiki.component.internal.RootComponentManager;
import org.xwiki.configuration.internal.AbstractConfigurationSourceProvider;
import org.xwiki.configuration.internal.DefaultConfigurationSourceProvider;
import org.xwiki.configuration.internal.RestrictedConfigurationSourceProvider;
import org.xwiki.context.Execution;
import org.xwiki.environment.Environment;
import org.xwiki.rendering.internal.syntax.DefaultSyntaxFactory;
import ucar.nc2.util.net.URLStreamHandlerFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractSkin_ESTest extends AbstractSkin_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InternalSkinManager internalSkinManager0 = new InternalSkinManager();
      Logger logger0 = (Logger)URLStreamHandlerFactory.log;
      org.slf4j.Logger logger1 = mock(org.slf4j.Logger.class, new ViolatedAssumptionAnswer());
      DefaultSyntaxFactory defaultSyntaxFactory0 = new DefaultSyntaxFactory();
      RestrictedConfigurationSourceProvider restrictedConfigurationSourceProvider0 = new RestrictedConfigurationSourceProvider();
      ContextComponentManager contextComponentManager0 = new ContextComponentManager();
      Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
      Injector.inject(contextComponentManager0, (Class<?>) ContextComponentManager.class, "execution", (Object) execution0);
      RootComponentManager rootComponentManager0 = new RootComponentManager();
      EmbeddableComponentManager embeddableComponentManager0 = new EmbeddableComponentManager("6z2Ap<5b");
      Injector.inject(rootComponentManager0, (Class<?>) RootComponentManager.class, "rootComponentManager", (Object) embeddableComponentManager0);
      Injector.validateBean(rootComponentManager0, (Class<?>) RootComponentManager.class);
      Class<MinguoDate> class0 = MinguoDate.class;
      CompositeUserType compositeUserType0 = mock(CompositeUserType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(compositeUserType0).returnedClass();
      CompositeCustomType compositeCustomType0 = new CompositeCustomType(compositeUserType0);
      Class class1 = compositeCustomType0.getReturnedClass();
      InternalSkinConfiguration internalSkinConfiguration0 = new InternalSkinConfiguration();
      DefaultConfigurationSourceProvider defaultConfigurationSourceProvider0 = new DefaultConfigurationSourceProvider();
      EmbeddableComponentManager embeddableComponentManager1 = new EmbeddableComponentManager("");
      Injector.inject(defaultConfigurationSourceProvider0, (Class<?>) AbstractConfigurationSourceProvider.class, "componentManager", (Object) embeddableComponentManager1);
      Injector.validateBean(defaultConfigurationSourceProvider0, (Class<?>) DefaultConfigurationSourceProvider.class);
      defaultConfigurationSourceProvider0.get();
      Logger logger2 = (Logger)URLStreamHandlerFactory.log;
      RoleHint<XWikiContext> roleHint0 = new RoleHint<XWikiContext>(class1);
      GenericProvider<XWikiContext> genericProvider0 = new GenericProvider<XWikiContext>(rootComponentManager0, roleHint0);
      EnvironmentSkin environmentSkin0 = new EnvironmentSkin("+Ex3p", internalSkinManager0, internalSkinConfiguration0, logger1, defaultSyntaxFactory0, (Environment) null, genericProvider0);
      // Undeclared exception!
      environmentSkin0.getOutputSyntax();
  }
}
