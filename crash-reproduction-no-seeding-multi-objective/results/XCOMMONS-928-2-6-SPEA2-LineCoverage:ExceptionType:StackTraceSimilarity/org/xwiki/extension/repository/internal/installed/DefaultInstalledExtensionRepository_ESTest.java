/*

 * Mon Apr 20 12:31:14 UTC 2020
 */

package org.xwiki.extension.repository.internal.installed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
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
import org.xwiki.extension.version.internal.DefaultVersion;
import org.xwiki.extension.wrap.WrappingLocalExtension;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DefaultInstalledExtensionRepository_ESTest extends DefaultInstalledExtensionRepository_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultInstalledExtensionRepository defaultInstalledExtensionRepository0 = new DefaultInstalledExtensionRepository();
      CoreExtensionRepository coreExtensionRepository0 = mock(CoreExtensionRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultInstalledExtensionRepository0, (Class<?>) DefaultInstalledExtensionRepository.class, "coreExtensionRepository", (Object) coreExtensionRepository0);
      Vector<ExtensionAuthor> vector0 = new Vector<ExtensionAuthor>(0);
      LinkedList<DefaultExtensionDependency> linkedList0 = new LinkedList<DefaultExtensionDependency>();
      Locale locale0 = Locale.US;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      ExtensionId extensionId0 = new ExtensionId("Failed to add cloned item.", "@12#ScY[,%k/62+]=");
      EmptyExtension emptyExtension0 = new EmptyExtension(extensionId0, "");
      emptyExtension0.getIssueManagement();
      Vector<ExtensionLicense> vector1 = new Vector<ExtensionLicense>();
      Map<String, Object> map0 = emptyExtension0.getProperties();
      emptyExtension0.getScm();
      DefaultInstalledExtension defaultInstalledExtension0 = mock(DefaultInstalledExtension.class, new ViolatedAssumptionAnswer());
      doReturn(vector0).when(defaultInstalledExtension0).getAuthors();
      doReturn("Range").when(defaultInstalledExtension0).getCategory();
      doReturn(linkedList0).when(defaultInstalledExtension0).getDependencies();
      doReturn((String) null).when(defaultInstalledExtension0).getDescription();
      doReturn(set0).when(defaultInstalledExtension0).getFeatures();
      doReturn(extensionId0).when(defaultInstalledExtension0).getId();
      doReturn((ExtensionIssueManagement) null).when(defaultInstalledExtension0).getIssueManagement();
      doReturn(vector1).when(defaultInstalledExtension0).getLicenses();
      doReturn("uI").when(defaultInstalledExtension0).getName();
      doReturn(map0).when(defaultInstalledExtension0).getProperties();
      doReturn((ExtensionScm) null).when(defaultInstalledExtension0).getScm();
      doReturn("").when(defaultInstalledExtension0).getSummary();
      doReturn((String) null).when(defaultInstalledExtension0).getType();
      doReturn(":S$!dsc/+86+v@CBO}0").when(defaultInstalledExtension0).getWebSite();
      WrappingLocalExtension<DefaultInstalledExtension> wrappingLocalExtension0 = new WrappingLocalExtension<DefaultInstalledExtension>(defaultInstalledExtension0);
      DefaultInstalledExtension defaultInstalledExtension1 = new DefaultInstalledExtension(wrappingLocalExtension0, (InstalledExtensionRepository) null);
      LocalExtensionRepository localExtensionRepository0 = mock(LocalExtensionRepository.class, new ViolatedAssumptionAnswer());
      doReturn(defaultInstalledExtension1).when(localExtensionRepository0).getLocalExtension(any(org.xwiki.extension.ExtensionId.class));
      Injector.inject(defaultInstalledExtensionRepository0, (Class<?>) DefaultInstalledExtensionRepository.class, "localRepository", (Object) localExtensionRepository0);
      Logger logger0 = mock(Logger.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultInstalledExtensionRepository0, (Class<?>) DefaultInstalledExtensionRepository.class, "logger", (Object) logger0);
      Injector.validateBean(defaultInstalledExtensionRepository0, (Class<?>) DefaultInstalledExtensionRepository.class);
      DefaultVersion defaultVersion0 = new DefaultVersion((String) null);
      DefaultVersion defaultVersion1 = new DefaultVersion(defaultVersion0);
      ExtensionId extensionId1 = new ExtensionId("Invalid extension [{}] ({})", defaultVersion1);
      LocalExtension localExtension0 = mock(LocalExtension.class, new ViolatedAssumptionAnswer());
      doReturn(extensionId1, extensionId1).when(localExtension0).getId();
      boolean boolean0 = true;
      Map<String, Object> map1 = null;
      // Undeclared exception!
      defaultInstalledExtensionRepository0.installExtension(localExtension0, ":", true, (Map<String, Object>) null);
  }
}
