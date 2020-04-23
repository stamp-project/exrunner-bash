/*

 * Mon Apr 20 13:44:01 UTC 2020
 */

package org.xwiki.mail.internal.configuration;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.xwiki.cache.CacheManager;
import org.xwiki.configuration.internal.AbstractDocumentConfigurationSource;
import org.xwiki.mail.internal.configuration.SendMailConfigClassDocumentConfigurationSource;
import org.xwiki.model.reference.EntityReferenceSerializer;
import org.xwiki.observation.ObservationManager;
import org.xwiki.properties.ConverterManager;
import org.xwiki.wiki.descriptor.WikiDescriptorManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class SendMailConfigClassDocumentConfigurationSource_ESTest extends SendMailConfigClassDocumentConfigurationSource_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CacheManager cacheManager0 = mock(CacheManager.class, new ViolatedAssumptionAnswer());
      ConverterManager converterManager0 = mock(ConverterManager.class, new ViolatedAssumptionAnswer());
      Logger logger0 = mock(Logger.class, new ViolatedAssumptionAnswer());
      ObservationManager observationManager0 = mock(ObservationManager.class, new ViolatedAssumptionAnswer());
      EntityReferenceSerializer<Object> entityReferenceSerializer0 = (EntityReferenceSerializer<Object>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Provider<Object> provider0 = (Provider<Object>) mock(Provider.class, new ViolatedAssumptionAnswer());
      SendMailConfigClassDocumentConfigurationSource sendMailConfigClassDocumentConfigurationSource0 = new SendMailConfigClassDocumentConfigurationSource();
      CacheManager cacheManager1 = mock(CacheManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(sendMailConfigClassDocumentConfigurationSource0, (Class<?>) AbstractDocumentConfigurationSource.class, "cacheManager", (Object) cacheManager1);
      ConverterManager converterManager1 = mock(ConverterManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(sendMailConfigClassDocumentConfigurationSource0, (Class<?>) AbstractDocumentConfigurationSource.class, "converter", (Object) converterManager1);
      Logger logger1 = mock(Logger.class, new ViolatedAssumptionAnswer());
      Injector.inject(sendMailConfigClassDocumentConfigurationSource0, (Class<?>) AbstractDocumentConfigurationSource.class, "logger", (Object) logger1);
      ObservationManager observationManager1 = mock(ObservationManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(sendMailConfigClassDocumentConfigurationSource0, (Class<?>) AbstractDocumentConfigurationSource.class, "observation", (Object) observationManager1);
      EntityReferenceSerializer<String> entityReferenceSerializer1 = (EntityReferenceSerializer<String>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Injector.inject(sendMailConfigClassDocumentConfigurationSource0, (Class<?>) AbstractDocumentConfigurationSource.class, "referenceSerializer", (Object) entityReferenceSerializer1);
      WikiDescriptorManager wikiDescriptorManager0 = mock(WikiDescriptorManager.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(wikiDescriptorManager0).getCurrentWikiId();
      Injector.inject(sendMailConfigClassDocumentConfigurationSource0, (Class<?>) AbstractDocumentConfigurationSource.class, "wikiManager", (Object) wikiDescriptorManager0);
      Provider<Object> provider1 = (Provider<Object>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Injector.inject(sendMailConfigClassDocumentConfigurationSource0, (Class<?>) AbstractDocumentConfigurationSource.class, "xcontextProvider", (Object) provider1);
      Injector.validateBean(sendMailConfigClassDocumentConfigurationSource0, (Class<?>) SendMailConfigClassDocumentConfigurationSource.class);
      // Undeclared exception!
      sendMailConfigClassDocumentConfigurationSource0.getDocumentReference();
  }
}
