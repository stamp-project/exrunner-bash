/*

 * Mon Apr 20 12:56:43 UTC 2020
 */

package org.xwiki.extension.repository.internal.installed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.SynchronousQueue;
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
import org.xwiki.extension.ExtensionScm;
import org.xwiki.extension.LocalExtension;
import org.xwiki.extension.repository.CoreExtensionRepository;
import org.xwiki.extension.repository.InstalledExtensionRepository;
import org.xwiki.extension.repository.LocalExtensionRepository;
import org.xwiki.extension.repository.internal.installed.DefaultInstalledExtension;
import org.xwiki.extension.repository.internal.installed.DefaultInstalledExtensionRepository;
import org.xwiki.extension.test.EmptyExtension;
import org.xwiki.extension.version.internal.DefaultVersion;
import org.xwiki.extension.wrap.WrappingExtension;
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
      SynchronousQueue<DefaultExtensionDependency> synchronousQueue0 = new SynchronousQueue<DefaultExtensionDependency>();
      ArrayDeque<String> arrayDeque0 = new ArrayDeque<String>();
      Vector<String> vector1 = new Vector<String>(arrayDeque0);
      ExtensionId extensionId0 = new ExtensionId("", "6tohw9'0m/&d+DM&y@.");
      DefaultVersion defaultVersion0 = new DefaultVersion("6tohw9'0m/&d+DM&y@.");
      DefaultVersion defaultVersion1 = new DefaultVersion(defaultVersion0);
      ExtensionId extensionId1 = new ExtensionId("", defaultVersion1);
      EmptyExtension emptyExtension0 = new EmptyExtension(extensionId1, "");
      emptyExtension0.getIssueManagement();
      LinkedList<ExtensionLicense> linkedList0 = new LinkedList<ExtensionLicense>();
      DiamondIterableMapMRO diamondIterableMapMRO0 = new DiamondIterableMapMRO();
      DefaultExtensionScmConnection defaultExtensionScmConnection0 = new DefaultExtensionScmConnection("", "");
      DefaultExtensionScm defaultExtensionScm0 = new DefaultExtensionScm(";!h?NvBv?g[c]GLR", defaultExtensionScmConnection0, defaultExtensionScmConnection0);
      WrappingInstalledExtension<DefaultInstalledExtension> wrappingInstalledExtension0 = (WrappingInstalledExtension<DefaultInstalledExtension>) mock(WrappingInstalledExtension.class, new ViolatedAssumptionAnswer());
      doReturn(vector0).when(wrappingInstalledExtension0).getAuthors();
      doReturn("?s3@IU~ ").when(wrappingInstalledExtension0).getCategory();
      doReturn(synchronousQueue0).when(wrappingInstalledExtension0).getDependencies();
      doReturn("").when(wrappingInstalledExtension0).getDescription();
      doReturn(vector1).when(wrappingInstalledExtension0).getFeatures();
      doReturn(extensionId1).when(wrappingInstalledExtension0).getId();
      doReturn((ExtensionIssueManagement) null).when(wrappingInstalledExtension0).getIssueManagement();
      doReturn(linkedList0).when(wrappingInstalledExtension0).getLicenses();
      doReturn("6tohw9'0m/&d+DM&y@.").when(wrappingInstalledExtension0).getName();
      doReturn(diamondIterableMapMRO0).when(wrappingInstalledExtension0).getProperties();
      doReturn(defaultExtensionScm0).when(wrappingInstalledExtension0).getScm();
      doReturn("").when(wrappingInstalledExtension0).getSummary();
      doReturn("Failed to modify extension descriptor").when(wrappingInstalledExtension0).getType();
      doReturn(";!h?NvBv?g[c]GLR").when(wrappingInstalledExtension0).getWebSite();
      WrappingLocalExtension<WrappingInstalledExtension<DefaultInstalledExtension>> wrappingLocalExtension0 = new WrappingLocalExtension<WrappingInstalledExtension<DefaultInstalledExtension>>(wrappingInstalledExtension0);
      DefaultInstalledExtension defaultInstalledExtension0 = new DefaultInstalledExtension(wrappingLocalExtension0, (InstalledExtensionRepository) null);
      WrappingInstalledExtension<DefaultInstalledExtension> wrappingInstalledExtension1 = new WrappingInstalledExtension<DefaultInstalledExtension>(defaultInstalledExtension0);
      wrappingInstalledExtension1.getIssueManagement();
      Vector<ExtensionLicense> vector2 = new Vector<ExtensionLicense>();
      WrappingExtension<WrappingLocalExtension<DefaultInstalledExtension>> wrappingExtension0 = new WrappingExtension<WrappingLocalExtension<DefaultInstalledExtension>>(wrappingInstalledExtension1);
      Map<String, Object> map0 = wrappingExtension0.getProperties();
      ExtensionScm extensionScm0 = wrappingInstalledExtension1.getScm();
      WrappingInstalledExtension<DefaultInstalledExtension> wrappingInstalledExtension2 = (WrappingInstalledExtension<DefaultInstalledExtension>) mock(WrappingInstalledExtension.class, new ViolatedAssumptionAnswer());
      doReturn(vector0).when(wrappingInstalledExtension2).getAuthors();
      doReturn("?s3@IU~ ").when(wrappingInstalledExtension2).getCategory();
      doReturn(synchronousQueue0).when(wrappingInstalledExtension2).getDependencies();
      doReturn("").when(wrappingInstalledExtension2).getDescription();
      doReturn(vector1).when(wrappingInstalledExtension2).getFeatures();
      doReturn(extensionId0).when(wrappingInstalledExtension2).getId();
      doReturn((ExtensionIssueManagement) null).when(wrappingInstalledExtension2).getIssueManagement();
      doReturn(vector2).when(wrappingInstalledExtension2).getLicenses();
      doReturn("6tohw9'0m/&d+DM&y@.").when(wrappingInstalledExtension2).getName();
      doReturn(map0).when(wrappingInstalledExtension2).getProperties();
      doReturn(extensionScm0).when(wrappingInstalledExtension2).getScm();
      doReturn("6tohw9'0m/&d+DM&y@.").when(wrappingInstalledExtension2).getSummary();
      doReturn("P").when(wrappingInstalledExtension2).getType();
      doReturn("?s3@IU~ ").when(wrappingInstalledExtension2).getWebSite();
      WrappingInstalledExtension<WrappingInstalledExtension<DefaultInstalledExtension>> wrappingInstalledExtension3 = new WrappingInstalledExtension<WrappingInstalledExtension<DefaultInstalledExtension>>(wrappingInstalledExtension2);
      DefaultInstalledExtension defaultInstalledExtension1 = new DefaultInstalledExtension(wrappingInstalledExtension3, (InstalledExtensionRepository) null);
      LocalExtensionRepository localExtensionRepository0 = mock(LocalExtensionRepository.class, new ViolatedAssumptionAnswer());
      doReturn(defaultInstalledExtension1).when(localExtensionRepository0).getLocalExtension(any(org.xwiki.extension.ExtensionId.class));
      Injector.inject(defaultInstalledExtensionRepository0, (Class<?>) DefaultInstalledExtensionRepository.class, "localRepository", (Object) localExtensionRepository0);
      Logger logger0 = mock(Logger.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultInstalledExtensionRepository0, (Class<?>) DefaultInstalledExtensionRepository.class, "logger", (Object) logger0);
      Injector.validateBean(defaultInstalledExtensionRepository0, (Class<?>) DefaultInstalledExtensionRepository.class);
      DefaultVersion defaultVersion2 = new DefaultVersion("`Tj&");
      ExtensionId extensionId2 = new ExtensionId("`Tj&", defaultVersion2);
      LocalExtension localExtension0 = mock(LocalExtension.class, new ViolatedAssumptionAnswer());
      DefaultInstalledExtension defaultInstalledExtension2 = new DefaultInstalledExtension(defaultInstalledExtension1, (InstalledExtensionRepository) null);
      defaultInstalledExtension2.getNamespaceProperties("");
      // Undeclared exception!
      defaultInstalledExtensionRepository0.installExtension((LocalExtension) defaultInstalledExtension2, "]YtLKK`", false, (Map<String, Object>) null);
  }
}
