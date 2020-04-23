/*

 * Mon Apr 20 13:11:00 UTC 2020
 */

package org.xwiki.extension.repository.internal.installed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
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
import org.xwiki.extension.wrap.WrappingInstalledExtension;
import org.xwiki.extension.wrap.WrappingLocalExtension;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DefaultInstalledExtensionRepository_ESTest extends DefaultInstalledExtensionRepository_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultInstalledExtensionRepository defaultInstalledExtensionRepository0 = new DefaultInstalledExtensionRepository();
      CoreExtensionRepository coreExtensionRepository0 = mock(CoreExtensionRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultInstalledExtensionRepository0, (Class<?>) DefaultInstalledExtensionRepository.class, "coreExtensionRepository", (Object) coreExtensionRepository0);
      LinkedList<ExtensionAuthor> linkedList0 = new LinkedList<ExtensionAuthor>();
      LinkedList<DefaultExtensionDependency> linkedList1 = new LinkedList<DefaultExtensionDependency>();
      Vector<String> vector0 = new Vector<String>();
      DefaultVersion defaultVersion0 = new DefaultVersion("I/O error reading keystore/truststore file: ");
      ExtensionId extensionId0 = new ExtensionId("on@", defaultVersion0);
      EmptyExtension emptyExtension0 = new EmptyExtension(extensionId0, ")n}TAD'jHB");
      emptyExtension0.getIssueManagement();
      LinkedHashSet<ExtensionLicense> linkedHashSet0 = new LinkedHashSet<ExtensionLicense>();
      Map<String, Object> map0 = emptyExtension0.getProperties();
      emptyExtension0.getScm();
      DefaultInstalledExtension defaultInstalledExtension0 = mock(DefaultInstalledExtension.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0).when(defaultInstalledExtension0).getAuthors();
      doReturn("I/O error reading keystore/truststore file: ").when(defaultInstalledExtension0).getCategory();
      doReturn(linkedList1).when(defaultInstalledExtension0).getDependencies();
      doReturn("on@").when(defaultInstalledExtension0).getDescription();
      doReturn(vector0).when(defaultInstalledExtension0).getFeatures();
      doReturn(extensionId0).when(defaultInstalledExtension0).getId();
      doReturn((ExtensionIssueManagement) null).when(defaultInstalledExtension0).getIssueManagement();
      doReturn(linkedHashSet0).when(defaultInstalledExtension0).getLicenses();
      doReturn(")n}TAD'jHB").when(defaultInstalledExtension0).getName();
      doReturn(map0).when(defaultInstalledExtension0).getProperties();
      doReturn((ExtensionScm) null).when(defaultInstalledExtension0).getScm();
      doReturn("").when(defaultInstalledExtension0).getSummary();
      doReturn("G!:ac\"AZg,xoN").when(defaultInstalledExtension0).getType();
      doReturn("I/O error reading keystore/truststore file: ").when(defaultInstalledExtension0).getWebSite();
      WrappingInstalledExtension<DefaultInstalledExtension> wrappingInstalledExtension0 = new WrappingInstalledExtension<DefaultInstalledExtension>(defaultInstalledExtension0);
      DefaultInstalledExtension defaultInstalledExtension1 = new DefaultInstalledExtension(wrappingInstalledExtension0, (InstalledExtensionRepository) null);
      WrappingLocalExtension<DefaultInstalledExtension> wrappingLocalExtension0 = new WrappingLocalExtension<DefaultInstalledExtension>(defaultInstalledExtension1);
      LocalExtensionRepository localExtensionRepository0 = mock(LocalExtensionRepository.class, new ViolatedAssumptionAnswer());
      doReturn(wrappingLocalExtension0).when(localExtensionRepository0).getLocalExtension(any(org.xwiki.extension.ExtensionId.class));
      Injector.inject(defaultInstalledExtensionRepository0, (Class<?>) DefaultInstalledExtensionRepository.class, "localRepository", (Object) localExtensionRepository0);
      Logger logger0 = mock(Logger.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultInstalledExtensionRepository0, (Class<?>) DefaultInstalledExtensionRepository.class, "logger", (Object) logger0);
      Injector.validateBean(defaultInstalledExtensionRepository0, (Class<?>) DefaultInstalledExtensionRepository.class);
      defaultInstalledExtension1.getNamespaceProperties("WWt=S+K9X2h3zRK[I");
      // Undeclared exception!
      defaultInstalledExtensionRepository0.installExtension((LocalExtension) wrappingLocalExtension0, "WWt=S+K9X2h3zRK[I", true, (Map<String, Object>) null);
  }
}
