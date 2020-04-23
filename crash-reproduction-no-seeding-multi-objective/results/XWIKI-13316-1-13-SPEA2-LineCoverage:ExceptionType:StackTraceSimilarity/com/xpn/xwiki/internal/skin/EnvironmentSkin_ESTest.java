/*

 * Mon Apr 20 21:18:43 UTC 2020
 */

package com.xpn.xwiki.internal.skin;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.qos.logback.classic.Logger;
import com.google.inject.Injector;
import com.xpn.xwiki.internal.XWikiContextProvider;
import com.xpn.xwiki.internal.skin.EnvironmentSkin;
import com.xpn.xwiki.internal.skin.InternalSkinConfiguration;
import com.xpn.xwiki.internal.skin.InternalSkinManager;
import com.xpn.xwiki.util.XWikiStubContextProvider;
import org.apache.commons.dbcp2.PoolableConnection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.component.embed.EmbeddableComponentManager;
import org.xwiki.component.internal.ContextComponentManagerProvider;
import org.xwiki.component.internal.DocumentComponentManager;
import org.xwiki.component.internal.RootComponentManager;
import org.xwiki.component.internal.multi.ComponentManagerManager;
import org.xwiki.component.manager.ComponentManager;
import org.xwiki.configuration.ConfigurationSource;
import org.xwiki.configuration.internal.AbstractConfigurationSourceProvider;
import org.xwiki.configuration.internal.DefaultConfigurationSourceProvider;
import org.xwiki.context.Execution;
import org.xwiki.environment.Environment;
import org.xwiki.model.reference.EntityReferenceSerializer;
import org.xwiki.rendering.block.ParagraphBlock;
import org.xwiki.rendering.internal.syntax.DefaultSyntaxFactory;
import org.xwiki.wiki.descriptor.WikiDescriptorManager;
import ucar.httpservices.CustomX509TrustManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class EnvironmentSkin_ESTest extends EnvironmentSkin_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InternalSkinManager internalSkinManager0 = new InternalSkinManager();
      RootComponentManager rootComponentManager0 = new RootComponentManager();
      DocumentComponentManager documentComponentManager0 = new DocumentComponentManager();
      Injector injector0 = mock(Injector.class, new ViolatedAssumptionAnswer());
      Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
      EmbeddableComponentManager embeddableComponentManager0 = new EmbeddableComponentManager();
      Execution execution1 = mock(Execution.class, new ViolatedAssumptionAnswer());
      EntityReferenceSerializer<ParagraphBlock> entityReferenceSerializer0 = (EntityReferenceSerializer<ParagraphBlock>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      ComponentManagerManager componentManagerManager0 = mock(ComponentManagerManager.class, new ViolatedAssumptionAnswer());
      ContextComponentManagerProvider contextComponentManagerProvider0 = new ContextComponentManagerProvider();
      Logger logger0 = (Logger)CustomX509TrustManager.logger;
      org.evosuite.runtime.javaee.injection.Injector.inject(contextComponentManagerProvider0, (Class<?>) ContextComponentManagerProvider.class, "logger", (Object) logger0);
      EmbeddableComponentManager embeddableComponentManager1 = new EmbeddableComponentManager("~Rzy)3d2PR[O{mC");
      org.evosuite.runtime.javaee.injection.Injector.inject(contextComponentManagerProvider0, (Class<?>) ContextComponentManagerProvider.class, "rootComponentManager", (Object) embeddableComponentManager1);
      org.evosuite.runtime.javaee.injection.Injector.validateBean(contextComponentManagerProvider0, (Class<?>) ContextComponentManagerProvider.class);
      contextComponentManagerProvider0.get();
      EntityReferenceSerializer<Object> entityReferenceSerializer1 = (EntityReferenceSerializer<Object>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Execution execution2 = mock(Execution.class, new ViolatedAssumptionAnswer());
      EntityReferenceSerializer<Integer> entityReferenceSerializer2 = (EntityReferenceSerializer<Integer>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      ComponentManagerManager componentManagerManager1 = mock(ComponentManagerManager.class, new ViolatedAssumptionAnswer());
      WikiDescriptorManager wikiDescriptorManager0 = mock(WikiDescriptorManager.class, new ViolatedAssumptionAnswer());
      Execution execution3 = mock(Execution.class, new ViolatedAssumptionAnswer());
      EntityReferenceSerializer<PoolableConnection> entityReferenceSerializer3 = (EntityReferenceSerializer<PoolableConnection>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      ComponentManagerManager componentManagerManager2 = mock(ComponentManagerManager.class, new ViolatedAssumptionAnswer());
      DefaultSyntaxFactory defaultSyntaxFactory0 = new DefaultSyntaxFactory();
      XWikiContextProvider xWikiContextProvider0 = new XWikiContextProvider();
      XWikiStubContextProvider xWikiStubContextProvider0 = mock(XWikiStubContextProvider.class, new ViolatedAssumptionAnswer());
      org.evosuite.runtime.javaee.injection.Injector.inject(xWikiContextProvider0, (Class<?>) XWikiContextProvider.class, "contextProvider", (Object) xWikiStubContextProvider0);
      Execution execution4 = mock(Execution.class, new ViolatedAssumptionAnswer());
      org.evosuite.runtime.javaee.injection.Injector.inject(xWikiContextProvider0, (Class<?>) XWikiContextProvider.class, "execution", (Object) execution4);
      org.evosuite.runtime.javaee.injection.Injector.validateBean(xWikiContextProvider0, (Class<?>) XWikiContextProvider.class);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "?LeJN}:YF+";
      InternalSkinConfiguration internalSkinConfiguration0 = new InternalSkinConfiguration();
      DefaultConfigurationSourceProvider defaultConfigurationSourceProvider0 = new DefaultConfigurationSourceProvider();
      ComponentManager componentManager0 = contextComponentManagerProvider0.get();
      org.evosuite.runtime.javaee.injection.Injector.inject(defaultConfigurationSourceProvider0, (Class<?>) AbstractConfigurationSourceProvider.class, "componentManager", (Object) componentManager0);
      org.evosuite.runtime.javaee.injection.Injector.validateBean(defaultConfigurationSourceProvider0, (Class<?>) DefaultConfigurationSourceProvider.class);
      ConfigurationSource configurationSource0 = defaultConfigurationSourceProvider0.get();
      org.evosuite.runtime.javaee.injection.Injector.inject(internalSkinConfiguration0, (Class<?>) InternalSkinConfiguration.class, "xwikicfg", (Object) configurationSource0);
      org.evosuite.runtime.javaee.injection.Injector.validateBean(internalSkinConfiguration0, (Class<?>) InternalSkinConfiguration.class);
      EnvironmentSkin environmentSkin0 = new EnvironmentSkin("64V+Iq", internalSkinManager0, internalSkinConfiguration0, logger0, defaultSyntaxFactory0, (Environment) null, xWikiContextProvider0);
      // Undeclared exception!
      environmentSkin0.getOutputSyntaxString();
  }
}
