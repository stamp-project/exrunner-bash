/*

 * Mon Apr 20 12:46:40 UTC 2020
 */

package org.xwiki.extension.repository.internal.installed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
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
import org.xwiki.extension.repository.InstalledExtensionRepository;
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
      LinkedBlockingQueue<ExtensionAuthor> linkedBlockingQueue0 = new LinkedBlockingQueue<ExtensionAuthor>();
      SynchronousQueue<DefaultExtensionDependency> synchronousQueue0 = new SynchronousQueue<DefaultExtensionDependency>();
      Locale locale0 = new Locale("cp367", "pV&\"Jg-N(Dr[0r\"0");
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      ExtensionId extensionId0 = new ExtensionId("pV&\"Jg-N(Dr[0r\"0", "cp367");
      PriorityBlockingQueue<ExtensionLicense> priorityBlockingQueue0 = new PriorityBlockingQueue<ExtensionLicense>();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      String string0 = "h_Gi\\(9hA%";
      EmptyExtension emptyExtension0 = new EmptyExtension(extensionId0, "h_Gi(9hA%");
      emptyExtension0.getScm();
      WrappingInstalledExtension<DefaultInstalledExtension> wrappingInstalledExtension0 = (WrappingInstalledExtension<DefaultInstalledExtension>) mock(WrappingInstalledExtension.class, new ViolatedAssumptionAnswer());
      doReturn(linkedBlockingQueue0).when(wrappingInstalledExtension0).getAuthors();
      doReturn("pV&\"Jg-N(Dr[0r\"0").when(wrappingInstalledExtension0).getCategory();
      doReturn(synchronousQueue0).when(wrappingInstalledExtension0).getDependencies();
      doReturn("pV&\"Jg-N(Dr[0r\"0").when(wrappingInstalledExtension0).getDescription();
      doReturn(set0).when(wrappingInstalledExtension0).getFeatures();
      doReturn(extensionId0).when(wrappingInstalledExtension0).getId();
      doReturn((ExtensionIssueManagement) null).when(wrappingInstalledExtension0).getIssueManagement();
      doReturn(priorityBlockingQueue0).when(wrappingInstalledExtension0).getLicenses();
      doReturn("not able to find the highest writable parent dir").when(wrappingInstalledExtension0).getName();
      doReturn(hashtable0).when(wrappingInstalledExtension0).getProperties();
      doReturn((ExtensionScm) null).when(wrappingInstalledExtension0).getScm();
      doReturn("h_Gi(9hA%").when(wrappingInstalledExtension0).getSummary();
      doReturn("not able to find the highest writable parent dir").when(wrappingInstalledExtension0).getType();
      doReturn("not able to find the highest writable parent dir").when(wrappingInstalledExtension0).getWebSite();
      WrappingInstalledExtension<WrappingInstalledExtension<DefaultInstalledExtension>> wrappingInstalledExtension1 = new WrappingInstalledExtension<WrappingInstalledExtension<DefaultInstalledExtension>>(wrappingInstalledExtension0);
      DefaultInstalledExtension defaultInstalledExtension0 = new DefaultInstalledExtension(wrappingInstalledExtension1, (InstalledExtensionRepository) null);
      LocalExtensionRepository localExtensionRepository0 = mock(LocalExtensionRepository.class, new ViolatedAssumptionAnswer());
      doReturn(defaultInstalledExtension0).when(localExtensionRepository0).getLocalExtension(any(org.xwiki.extension.ExtensionId.class));
      Injector.inject(defaultInstalledExtensionRepository0, (Class<?>) DefaultInstalledExtensionRepository.class, "localRepository", (Object) localExtensionRepository0);
      Logger logger0 = mock(Logger.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultInstalledExtensionRepository0, (Class<?>) DefaultInstalledExtensionRepository.class, "logger", (Object) logger0);
      Injector.validateBean(defaultInstalledExtensionRepository0, (Class<?>) DefaultInstalledExtensionRepository.class);
      ExtensionId extensionId1 = mock(ExtensionId.class, new ViolatedAssumptionAnswer());
      defaultInstalledExtension0.getNamespaceProperties((String) null);
      // Undeclared exception!
      defaultInstalledExtensionRepository0.installExtension((LocalExtension) defaultInstalledExtension0, ";G3^x[l)aY", false, (Map<String, Object>) null);
  }
}
