/*

 * Mon Apr 20 21:07:05 UTC 2020
 */

package com.xpn.xwiki.internal.skin;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.qos.logback.classic.Logger;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.internal.skin.EnvironmentSkin;
import com.xpn.xwiki.internal.skin.InternalSkinConfiguration;
import com.xpn.xwiki.internal.skin.InternalSkinManager;
import java.lang.reflect.Type;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.slf4j.event.SubstituteLoggingEvent;
import org.xwiki.component.embed.EmbeddableComponentManager;
import org.xwiki.component.internal.ContextComponentManagerProvider;
import org.xwiki.component.util.DefaultParameterizedType;
import org.xwiki.configuration.internal.AbstractConfigurationSourceProvider;
import org.xwiki.configuration.internal.DefaultConfigurationSourceProvider;
import org.xwiki.environment.Environment;
import org.xwiki.model.reference.EntityReferenceSerializer;
import org.xwiki.rendering.internal.syntax.DefaultSyntaxFactory;
import ucar.nc2.util.net.URLStreamHandlerFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractSkin_ESTest extends AbstractSkin_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InternalSkinManager internalSkinManager0 = new InternalSkinManager();
      ContextComponentManagerProvider contextComponentManagerProvider0 = new ContextComponentManagerProvider();
      InternalSkinConfiguration internalSkinConfiguration0 = new InternalSkinConfiguration();
      DefaultConfigurationSourceProvider defaultConfigurationSourceProvider0 = new DefaultConfigurationSourceProvider();
      EmbeddableComponentManager embeddableComponentManager0 = new EmbeddableComponentManager();
      DefaultParameterizedType defaultParameterizedType0 = (DefaultParameterizedType)EntityReferenceSerializer.TYPE_STRING;
      embeddableComponentManager0.getInstanceMap((Type) defaultParameterizedType0);
      Injector.inject(defaultConfigurationSourceProvider0, (Class<?>) AbstractConfigurationSourceProvider.class, "componentManager", (Object) embeddableComponentManager0);
      Injector.validateBean(defaultConfigurationSourceProvider0, (Class<?>) DefaultConfigurationSourceProvider.class);
      SubstituteLoggingEvent substituteLoggingEvent0 = new SubstituteLoggingEvent();
      substituteLoggingEvent0.getThrowable();
      substituteLoggingEvent0.getMarker();
      DefaultSyntaxFactory defaultSyntaxFactory0 = new DefaultSyntaxFactory();
      Logger logger0 = (Logger)URLStreamHandlerFactory.log;
      DefaultSyntaxFactory defaultSyntaxFactory1 = new DefaultSyntaxFactory();
      EnvironmentSkin environmentSkin0 = new EnvironmentSkin("<BiQQY", internalSkinManager0, internalSkinConfiguration0, (org.slf4j.Logger) null, defaultSyntaxFactory1, (Environment) null, (Provider<XWikiContext>) null);
      environmentSkin0.createResource("<BiQQY", "ZtwirE=@E7V>}");
      // Undeclared exception!
      environmentSkin0.getOutputSyntax();
  }
}
