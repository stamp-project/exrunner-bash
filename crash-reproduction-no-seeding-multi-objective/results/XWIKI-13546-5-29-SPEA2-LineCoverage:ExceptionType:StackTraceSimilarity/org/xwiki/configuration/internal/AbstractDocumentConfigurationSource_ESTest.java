/*

 * Mon Apr 20 14:20:47 UTC 2020
 */

package org.xwiki.configuration.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import java.util.PriorityQueue;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.event.SubstituteLoggingEvent;
import org.xwiki.cache.CacheManager;
import org.xwiki.configuration.internal.AbstractDocumentConfigurationSource;
import org.xwiki.configuration.internal.WikiPreferencesConfigurationSource;
import org.xwiki.model.reference.EntityReferenceSerializer;
import org.xwiki.observation.ObservationManager;
import org.xwiki.observation.event.AllEvent;
import org.xwiki.properties.ConverterManager;
import org.xwiki.properties.converter.Converter;
import org.xwiki.wiki.descriptor.WikiDescriptorManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractDocumentConfigurationSource_ESTest extends AbstractDocumentConfigurationSource_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WikiPreferencesConfigurationSource wikiPreferencesConfigurationSource0 = new WikiPreferencesConfigurationSource();
      CacheManager cacheManager0 = mock(CacheManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(wikiPreferencesConfigurationSource0, (Class<?>) AbstractDocumentConfigurationSource.class, "cacheManager", (Object) cacheManager0);
      ConverterManager converterManager0 = mock(ConverterManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(wikiPreferencesConfigurationSource0, (Class<?>) AbstractDocumentConfigurationSource.class, "converter", (Object) converterManager0);
      Logger logger0 = mock(Logger.class, new ViolatedAssumptionAnswer());
      Injector.inject(wikiPreferencesConfigurationSource0, (Class<?>) AbstractDocumentConfigurationSource.class, "logger", (Object) logger0);
      ObservationManager observationManager0 = mock(ObservationManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(wikiPreferencesConfigurationSource0, (Class<?>) AbstractDocumentConfigurationSource.class, "observation", (Object) observationManager0);
      EntityReferenceSerializer<Object> entityReferenceSerializer0 = (EntityReferenceSerializer<Object>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Injector.inject(wikiPreferencesConfigurationSource0, (Class<?>) AbstractDocumentConfigurationSource.class, "referenceSerializer", (Object) entityReferenceSerializer0);
      WikiDescriptorManager wikiDescriptorManager0 = mock(WikiDescriptorManager.class, new ViolatedAssumptionAnswer());
      doReturn("").when(wikiDescriptorManager0).getCurrentWikiId();
      Injector.inject(wikiPreferencesConfigurationSource0, (Class<?>) AbstractDocumentConfigurationSource.class, "wikiManager", (Object) wikiDescriptorManager0);
      Provider<AllEvent> provider0 = (Provider<AllEvent>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Injector.inject(wikiPreferencesConfigurationSource0, (Class<?>) AbstractDocumentConfigurationSource.class, "xcontextProvider", (Object) provider0);
      Injector.validateBean(wikiPreferencesConfigurationSource0, (Class<?>) AbstractDocumentConfigurationSource.class);
      com.google.inject.Injector injector0 = mock(com.google.inject.Injector.class, new ViolatedAssumptionAnswer());
      Converter<Integer> converter0 = (Converter<Integer>) mock(Converter.class, new ViolatedAssumptionAnswer());
      Converter<XWikiContext> converter1 = (Converter<XWikiContext>) mock(Converter.class, new ViolatedAssumptionAnswer());
      String string0 = "";
      PriorityQueue<SubstituteLoggingEvent> priorityQueue0 = new PriorityQueue<SubstituteLoggingEvent>();
      // Undeclared exception!
      wikiPreferencesConfigurationSource0.getCurrentWikiReference();
  }
}
