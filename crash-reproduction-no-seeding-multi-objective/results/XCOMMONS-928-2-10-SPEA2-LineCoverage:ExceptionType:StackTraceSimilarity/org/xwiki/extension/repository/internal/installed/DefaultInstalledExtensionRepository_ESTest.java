/*

 * Mon Apr 20 12:37:53 UTC 2020
 */

package org.xwiki.extension.repository.internal.installed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedTransferQueue;
import org.apache.hadoop.conf.Configuration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.xwiki.extension.DefaultExtensionDependency;
import org.xwiki.extension.ExtensionAuthor;
import org.xwiki.extension.ExtensionId;
import org.xwiki.extension.ExtensionIssueManagement;
import org.xwiki.extension.ExtensionLicense;
import org.xwiki.extension.ExtensionScm;
import org.xwiki.extension.LocalExtension;
import org.xwiki.extension.repository.CoreExtensionRepository;
import org.xwiki.extension.repository.LocalExtensionRepository;
import org.xwiki.extension.repository.internal.installed.DefaultInstalledExtension;
import org.xwiki.extension.repository.internal.installed.DefaultInstalledExtensionRepository;
import org.xwiki.extension.test.EmptyExtension;
import org.xwiki.extension.wrap.WrappingInstalledExtension;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DefaultInstalledExtensionRepository_ESTest extends DefaultInstalledExtensionRepository_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultInstalledExtensionRepository defaultInstalledExtensionRepository0 = new DefaultInstalledExtensionRepository();
      CoreExtensionRepository coreExtensionRepository0 = mock(CoreExtensionRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultInstalledExtensionRepository0, (Class<?>) DefaultInstalledExtensionRepository.class, "coreExtensionRepository", (Object) coreExtensionRepository0);
      LinkedHashSet<ExtensionAuthor> linkedHashSet0 = new LinkedHashSet<ExtensionAuthor>();
      LinkedTransferQueue<DefaultExtensionDependency> linkedTransferQueue0 = new LinkedTransferQueue<DefaultExtensionDependency>();
      Configuration configuration0 = new Configuration(true);
      Set<String> set0 = configuration0.getFinalParameters();
      ExtensionId extensionId0 = new ExtensionId("V0Dq9CH3_YcP4R#(k@", "");
      LinkedBlockingDeque<ExtensionLicense> linkedBlockingDeque0 = new LinkedBlockingDeque<ExtensionLicense>();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      EmptyExtension emptyExtension0 = new EmptyExtension(extensionId0, "");
      emptyExtension0.getScm();
      WrappingInstalledExtension<DefaultInstalledExtension> wrappingInstalledExtension0 = (WrappingInstalledExtension<DefaultInstalledExtension>) mock(WrappingInstalledExtension.class, new ViolatedAssumptionAnswer());
      doReturn(linkedHashSet0).when(wrappingInstalledExtension0).getAuthors();
      doReturn("k.DQcvhC'[88ShDaw`").when(wrappingInstalledExtension0).getCategory();
      doReturn(linkedTransferQueue0).when(wrappingInstalledExtension0).getDependencies();
      doReturn("Extension [%s] already exists as a core extension").when(wrappingInstalledExtension0).getDescription();
      doReturn(set0).when(wrappingInstalledExtension0).getFeatures();
      doReturn(extensionId0, extensionId0, extensionId0).when(wrappingInstalledExtension0).getId();
      doReturn((ExtensionIssueManagement) null).when(wrappingInstalledExtension0).getIssueManagement();
      doReturn(linkedBlockingDeque0).when(wrappingInstalledExtension0).getLicenses();
      doReturn("").when(wrappingInstalledExtension0).getName();
      doReturn(hashMap0).when(wrappingInstalledExtension0).getProperties();
      doReturn((ExtensionScm) null).when(wrappingInstalledExtension0).getScm();
      doReturn("").when(wrappingInstalledExtension0).getSummary();
      doReturn("Dependency [%s] is incompatible with the core extension [%s]").when(wrappingInstalledExtension0).getType();
      doReturn("P#8{4oNeD~qI(d<25?").when(wrappingInstalledExtension0).getWebSite();
      WrappingInstalledExtension<WrappingInstalledExtension<DefaultInstalledExtension>> wrappingInstalledExtension1 = new WrappingInstalledExtension<WrappingInstalledExtension<DefaultInstalledExtension>>(wrappingInstalledExtension0);
      LocalExtensionRepository localExtensionRepository0 = mock(LocalExtensionRepository.class, new ViolatedAssumptionAnswer());
      doReturn(wrappingInstalledExtension1).when(localExtensionRepository0).getLocalExtension(any(org.xwiki.extension.ExtensionId.class));
      Injector.inject(defaultInstalledExtensionRepository0, (Class<?>) DefaultInstalledExtensionRepository.class, "localRepository", (Object) localExtensionRepository0);
      Logger logger0 = mock(Logger.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultInstalledExtensionRepository0, (Class<?>) DefaultInstalledExtensionRepository.class, "logger", (Object) logger0);
      Injector.validateBean(defaultInstalledExtensionRepository0, (Class<?>) DefaultInstalledExtensionRepository.class);
      // Undeclared exception!
      defaultInstalledExtensionRepository0.installExtension((LocalExtension) wrappingInstalledExtension1, "Invalid extension [{}] on namespace [{}] ({})", true, (Map<String, Object>) null);
  }
}
