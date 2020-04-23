/*

 * Mon Apr 20 12:42:49 UTC 2020
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
import org.slf4j.Logger;
import org.xwiki.extension.ExtensionId;
import org.xwiki.extension.LocalExtension;
import org.xwiki.extension.repository.CoreExtensionRepository;
import org.xwiki.extension.repository.LocalExtensionRepository;
import org.xwiki.extension.repository.internal.installed.DefaultInstalledExtension;
import org.xwiki.extension.repository.internal.installed.DefaultInstalledExtensionRepository;
import org.xwiki.extension.version.internal.DefaultVersion;
import org.xwiki.extension.wrap.WrappingInstalledExtension;
import org.xwiki.extension.wrap.WrappingLocalExtension;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DefaultInstalledExtensionRepository_ESTest extends DefaultInstalledExtensionRepository_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultInstalledExtensionRepository defaultInstalledExtensionRepository0 = new DefaultInstalledExtensionRepository();
      CoreExtensionRepository coreExtensionRepository0 = mock(CoreExtensionRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultInstalledExtensionRepository0, (Class<?>) DefaultInstalledExtensionRepository.class, "coreExtensionRepository", (Object) coreExtensionRepository0);
      WrappingInstalledExtension<DefaultInstalledExtension> wrappingInstalledExtension0 = (WrappingInstalledExtension<DefaultInstalledExtension>) mock(WrappingInstalledExtension.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null).when(wrappingInstalledExtension0).getFeatures();
      doReturn((ExtensionId) null).when(wrappingInstalledExtension0).getId();
      doReturn((String) null).when(wrappingInstalledExtension0).getType();
      WrappingLocalExtension<WrappingInstalledExtension<DefaultInstalledExtension>> wrappingLocalExtension0 = new WrappingLocalExtension<WrappingInstalledExtension<DefaultInstalledExtension>>(wrappingInstalledExtension0);
      LocalExtensionRepository localExtensionRepository0 = mock(LocalExtensionRepository.class, new ViolatedAssumptionAnswer());
      doReturn(wrappingLocalExtension0).when(localExtensionRepository0).getLocalExtension(any(org.xwiki.extension.ExtensionId.class));
      Injector.inject(defaultInstalledExtensionRepository0, (Class<?>) DefaultInstalledExtensionRepository.class, "localRepository", (Object) localExtensionRepository0);
      Logger logger0 = mock(Logger.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultInstalledExtensionRepository0, (Class<?>) DefaultInstalledExtensionRepository.class, "logger", (Object) logger0);
      Injector.validateBean(defaultInstalledExtensionRepository0, (Class<?>) DefaultInstalledExtensionRepository.class);
      defaultInstalledExtensionRepository0.isFilterable();
      DefaultVersion defaultVersion0 = new DefaultVersion("95*(|RQr)d%");
      ExtensionId extensionId0 = new ExtensionId((String) null, defaultVersion0);
      WrappingInstalledExtension<DefaultInstalledExtension> wrappingInstalledExtension1 = (WrappingInstalledExtension<DefaultInstalledExtension>) mock(WrappingInstalledExtension.class, new ViolatedAssumptionAnswer());
      doReturn(extensionId0).when(wrappingInstalledExtension1).getId();
      WrappingInstalledExtension<WrappingInstalledExtension<DefaultInstalledExtension>> wrappingInstalledExtension2 = new WrappingInstalledExtension<WrappingInstalledExtension<DefaultInstalledExtension>>(wrappingInstalledExtension1);
      ExtensionId extensionId1 = wrappingInstalledExtension2.getId();
      LocalExtension localExtension0 = mock(LocalExtension.class, new ViolatedAssumptionAnswer());
      doReturn(extensionId1, extensionId1).when(localExtension0).getId();
      String string0 = "The extension [%s] need to be stored first";
      Map<String, Object> map0 = null;
      // Undeclared exception!
      defaultInstalledExtensionRepository0.installExtension(localExtension0, "The extension [%s] need to be stored first", false, (Map<String, Object>) null);
  }
}
