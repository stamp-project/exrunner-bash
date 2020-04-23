/*

 * Mon Apr 20 13:09:46 UTC 2020
 */

package org.xwiki.extension.repository.internal.installed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.slf4j.helpers.NOPLogger;
import org.xwiki.extension.ExtensionId;
import org.xwiki.extension.LocalExtension;
import org.xwiki.extension.repository.CoreExtensionRepository;
import org.xwiki.extension.repository.LocalExtensionRepository;
import org.xwiki.extension.repository.internal.installed.DefaultInstalledExtension;
import org.xwiki.extension.repository.internal.installed.DefaultInstalledExtensionRepository;
import org.xwiki.extension.version.internal.DefaultVersion;
import org.xwiki.extension.wrap.WrappingInstalledExtension;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DefaultInstalledExtensionRepository_ESTest extends DefaultInstalledExtensionRepository_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultInstalledExtensionRepository defaultInstalledExtensionRepository0 = new DefaultInstalledExtensionRepository();
      CoreExtensionRepository coreExtensionRepository0 = mock(CoreExtensionRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultInstalledExtensionRepository0, (Class<?>) DefaultInstalledExtensionRepository.class, "coreExtensionRepository", (Object) coreExtensionRepository0);
      LocalExtensionRepository localExtensionRepository0 = mock(LocalExtensionRepository.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = false;
      Map<String, Object> map0 = null;
      DefaultVersion defaultVersion0 = new DefaultVersion((String) null);
      ExtensionId extensionId0 = new ExtensionId((String) null, defaultVersion0);
      WrappingInstalledExtension<DefaultInstalledExtension> wrappingInstalledExtension0 = (WrappingInstalledExtension<DefaultInstalledExtension>) mock(WrappingInstalledExtension.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null).when(wrappingInstalledExtension0).getFeatures();
      doReturn(extensionId0, extensionId0, (ExtensionId) null).when(wrappingInstalledExtension0).getId();
      doReturn((String) null).when(wrappingInstalledExtension0).getType();
      WrappingInstalledExtension<WrappingInstalledExtension<DefaultInstalledExtension>> wrappingInstalledExtension1 = new WrappingInstalledExtension<WrappingInstalledExtension<DefaultInstalledExtension>>(wrappingInstalledExtension0);
      DefaultInstalledExtensionRepository defaultInstalledExtensionRepository1 = new DefaultInstalledExtensionRepository();
      CoreExtensionRepository coreExtensionRepository1 = mock(CoreExtensionRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultInstalledExtensionRepository1, (Class<?>) DefaultInstalledExtensionRepository.class, "coreExtensionRepository", (Object) coreExtensionRepository1);
      LocalExtensionRepository localExtensionRepository1 = mock(LocalExtensionRepository.class, new ViolatedAssumptionAnswer());
      doReturn(wrappingInstalledExtension1).when(localExtensionRepository1).getLocalExtension(any(org.xwiki.extension.ExtensionId.class));
      Injector.inject(defaultInstalledExtensionRepository1, (Class<?>) DefaultInstalledExtensionRepository.class, "localRepository", (Object) localExtensionRepository1);
      NOPLogger nOPLogger0 = NOPLogger.NOP_LOGGER;
      Injector.inject(defaultInstalledExtensionRepository1, (Class<?>) DefaultInstalledExtensionRepository.class, "logger", (Object) nOPLogger0);
      Injector.validateBean(defaultInstalledExtensionRepository1, (Class<?>) DefaultInstalledExtensionRepository.class);
      String string0 = "There is no existing value for the specified 'period'.";
      // Undeclared exception!
      defaultInstalledExtensionRepository1.installExtension((LocalExtension) wrappingInstalledExtension1, "There is no existing value for the specified 'period'.", false, (Map<String, Object>) null);
  }
}
