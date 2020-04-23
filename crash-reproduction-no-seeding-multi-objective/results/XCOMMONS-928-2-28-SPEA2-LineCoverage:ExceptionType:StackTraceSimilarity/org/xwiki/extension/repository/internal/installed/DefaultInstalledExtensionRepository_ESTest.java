/*

 * Mon Apr 20 13:09:10 UTC 2020
 */

package org.xwiki.extension.repository.internal.installed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.extension.DefaultExtensionDependency;
import org.xwiki.extension.ExtensionAuthor;
import org.xwiki.extension.ExtensionId;
import org.xwiki.extension.ExtensionLicense;
import org.xwiki.extension.repository.CoreExtensionRepository;
import org.xwiki.extension.repository.InstalledExtensionRepository;
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
      LinkedList<ExtensionAuthor> linkedList0 = new LinkedList<ExtensionAuthor>();
      String string0 = "counter info";
      Vector<DefaultExtensionDependency> vector0 = new Vector<DefaultExtensionDependency>();
      String string1 = "";
      String string2 = "GqY\\{\\z{XR:90T~(CX{";
      DefaultVersion defaultVersion0 = new DefaultVersion("GqY{z{XR:90T~(CX{");
      ExtensionId extensionId0 = new ExtensionId("", defaultVersion0);
      EmptyExtension emptyExtension0 = new EmptyExtension(extensionId0, "GqY{z{XR:90T~(CX{");
      emptyExtension0.getFeatures();
      emptyExtension0.getIssueManagement();
      Vector<ExtensionLicense> vector1 = new Vector<ExtensionLicense>();
      DefaultInstalledExtension defaultInstalledExtension0 = mock(DefaultInstalledExtension.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null).when(defaultInstalledExtension0).getFeatures();
      doReturn((ExtensionId) null).when(defaultInstalledExtension0).getId();
      doReturn((String) null).when(defaultInstalledExtension0).getType();
      WrappingLocalExtension<DefaultInstalledExtension> wrappingLocalExtension0 = new WrappingLocalExtension<DefaultInstalledExtension>(defaultInstalledExtension0);
      DefaultInstalledExtension defaultInstalledExtension1 = new DefaultInstalledExtension(wrappingLocalExtension0, (InstalledExtensionRepository) null);
  }
}
