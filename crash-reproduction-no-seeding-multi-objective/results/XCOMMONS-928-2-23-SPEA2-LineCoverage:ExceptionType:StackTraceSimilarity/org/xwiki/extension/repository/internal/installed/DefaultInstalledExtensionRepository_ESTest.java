/*

 * Mon Apr 20 12:59:57 UTC 2020
 */

package org.xwiki.extension.repository.internal.installed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import javatests.DiamondIterableMapMRO;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.xwiki.extension.DefaultExtensionDependency;
import org.xwiki.extension.DefaultExtensionScm;
import org.xwiki.extension.DefaultExtensionScmConnection;
import org.xwiki.extension.ExtensionAuthor;
import org.xwiki.extension.ExtensionId;
import org.xwiki.extension.ExtensionIssueManagement;
import org.xwiki.extension.ExtensionLicense;
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
      Vector<ExtensionAuthor> vector0 = new Vector<ExtensionAuthor>();
      LinkedHashSet<DefaultExtensionDependency> linkedHashSet0 = new LinkedHashSet<DefaultExtensionDependency>();
      Locale locale0 = Locale.ENGLISH;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      ExtensionId extensionId0 = new ExtensionId("Timer runner", "");
      LinkedHashSet<ExtensionLicense> linkedHashSet1 = new LinkedHashSet<ExtensionLicense>();
      DiamondIterableMapMRO diamondIterableMapMRO0 = new DiamondIterableMapMRO();
      DefaultExtensionScmConnection defaultExtensionScmConnection0 = new DefaultExtensionScmConnection("", "pY;1L<7Bu^!ZCFU|m");
      DefaultExtensionScm defaultExtensionScm0 = new DefaultExtensionScm("", defaultExtensionScmConnection0, defaultExtensionScmConnection0);
      WrappingInstalledExtension<DefaultInstalledExtension> wrappingInstalledExtension0 = (WrappingInstalledExtension<DefaultInstalledExtension>) mock(WrappingInstalledExtension.class, new ViolatedAssumptionAnswer());
      doReturn(vector0).when(wrappingInstalledExtension0).getAuthors();
      doReturn("H").when(wrappingInstalledExtension0).getCategory();
      doReturn(linkedHashSet0).when(wrappingInstalledExtension0).getDependencies();
      doReturn("").when(wrappingInstalledExtension0).getDescription();
      doReturn(set0).when(wrappingInstalledExtension0).getFeatures();
      doReturn(extensionId0).when(wrappingInstalledExtension0).getId();
      doReturn((ExtensionIssueManagement) null).when(wrappingInstalledExtension0).getIssueManagement();
      doReturn(linkedHashSet1).when(wrappingInstalledExtension0).getLicenses();
      doReturn("? super ").when(wrappingInstalledExtension0).getName();
      doReturn(diamondIterableMapMRO0).when(wrappingInstalledExtension0).getProperties();
      doReturn(defaultExtensionScm0).when(wrappingInstalledExtension0).getScm();
      doReturn("").when(wrappingInstalledExtension0).getSummary();
      doReturn("").when(wrappingInstalledExtension0).getType();
      doReturn("").when(wrappingInstalledExtension0).getWebSite();
      WrappingLocalExtension<WrappingInstalledExtension<DefaultInstalledExtension>> wrappingLocalExtension0 = new WrappingLocalExtension<WrappingInstalledExtension<DefaultInstalledExtension>>(wrappingInstalledExtension0);
      LocalExtensionRepository localExtensionRepository0 = mock(LocalExtensionRepository.class, new ViolatedAssumptionAnswer());
      doReturn(wrappingLocalExtension0).when(localExtensionRepository0).getLocalExtension(any(org.xwiki.extension.ExtensionId.class));
      Injector.inject(defaultInstalledExtensionRepository0, (Class<?>) DefaultInstalledExtensionRepository.class, "localRepository", (Object) localExtensionRepository0);
      Logger logger0 = mock(Logger.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultInstalledExtensionRepository0, (Class<?>) DefaultInstalledExtensionRepository.class, "logger", (Object) logger0);
      Injector.validateBean(defaultInstalledExtensionRepository0, (Class<?>) DefaultInstalledExtensionRepository.class);
      DefaultVersion defaultVersion0 = new DefaultVersion("aIiA*6X,%.Ii>gdC;0");
      ExtensionId extensionId1 = new ExtensionId("OIy,<f7a4L1VMRKS2F", defaultVersion0);
      LocalExtension localExtension0 = mock(LocalExtension.class, new ViolatedAssumptionAnswer());
      doReturn(extensionId1, extensionId1).when(localExtension0).getId();
      ExtensionId extensionId2 = new ExtensionId("", defaultVersion0);
      DefaultVersion defaultVersion1 = new DefaultVersion("");
      DefaultVersion defaultVersion2 = new DefaultVersion(defaultVersion0);
      ExtensionId extensionId3 = new ExtensionId("HZf.", defaultVersion1);
      // Undeclared exception!
      defaultInstalledExtensionRepository0.installExtension(localExtension0, (String) null, true, (Map<String, Object>) null);
  }
}
