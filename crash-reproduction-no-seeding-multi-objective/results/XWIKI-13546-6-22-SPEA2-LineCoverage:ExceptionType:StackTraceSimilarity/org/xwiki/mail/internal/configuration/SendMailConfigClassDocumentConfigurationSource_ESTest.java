/*

 * Mon Apr 20 14:10:33 UTC 2020
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
      ConverterManager converterManager0 = mock(ConverterManager.class, new ViolatedAssumptionAnswer());
      Logger logger0 = mock(Logger.class, new ViolatedAssumptionAnswer());
      ObservationManager observationManager0 = mock(ObservationManager.class, new ViolatedAssumptionAnswer());
      EntityReferenceSerializer<Integer> entityReferenceSerializer0 = (EntityReferenceSerializer<Integer>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Provider<Integer> provider0 = (Provider<Integer>) mock(Provider.class, new ViolatedAssumptionAnswer());
      ConverterManager converterManager1 = mock(ConverterManager.class, new ViolatedAssumptionAnswer());
      ObservationManager observationManager1 = mock(ObservationManager.class, new ViolatedAssumptionAnswer());
      EntityReferenceSerializer<Object> entityReferenceSerializer1 = (EntityReferenceSerializer<Object>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      WikiDescriptorManager wikiDescriptorManager0 = mock(WikiDescriptorManager.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(wikiDescriptorManager0).getCurrentWikiId();
      Provider<Object> provider1 = (Provider<Object>) mock(Provider.class, new ViolatedAssumptionAnswer());
      SendMailConfigClassDocumentConfigurationSource sendMailConfigClassDocumentConfigurationSource0 = new SendMailConfigClassDocumentConfigurationSource();
      CacheManager cacheManager0 = mock(CacheManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(sendMailConfigClassDocumentConfigurationSource0, (Class<?>) AbstractDocumentConfigurationSource.class, "cacheManager", (Object) cacheManager0);
      Injector.inject(sendMailConfigClassDocumentConfigurationSource0, (Class<?>) AbstractDocumentConfigurationSource.class, "converter", (Object) converterManager0);
      Injector.inject(sendMailConfigClassDocumentConfigurationSource0, (Class<?>) AbstractDocumentConfigurationSource.class, "logger", (Object) logger0);
      ObservationManager observationManager2 = mock(ObservationManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(sendMailConfigClassDocumentConfigurationSource0, (Class<?>) AbstractDocumentConfigurationSource.class, "observation", (Object) observationManager2);
      Injector.inject(sendMailConfigClassDocumentConfigurationSource0, (Class<?>) AbstractDocumentConfigurationSource.class, "referenceSerializer", (Object) entityReferenceSerializer0);
      Injector.inject(sendMailConfigClassDocumentConfigurationSource0, (Class<?>) AbstractDocumentConfigurationSource.class, "wikiManager", (Object) wikiDescriptorManager0);
      Injector.inject(sendMailConfigClassDocumentConfigurationSource0, (Class<?>) AbstractDocumentConfigurationSource.class, "xcontextProvider", (Object) provider0);
      Injector.validateBean(sendMailConfigClassDocumentConfigurationSource0, (Class<?>) SendMailConfigClassDocumentConfigurationSource.class);
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      sendMailConfigClassDocumentConfigurationSource0.getProperty("", class0);
  }
}
