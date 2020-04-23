/*

 * Mon Apr 20 12:48:07 UTC 2020
 */

package org.xwiki.extension.repository.internal.installed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Vector;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.PriorityBlockingQueue;
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
import org.xwiki.extension.wrap.WrappingInstalledExtension;
import org.xwiki.extension.wrap.WrappingLocalExtension;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DefaultInstalledExtensionRepository_ESTest extends DefaultInstalledExtensionRepository_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultInstalledExtensionRepository defaultInstalledExtensionRepository0 = new DefaultInstalledExtensionRepository();
      CoreExtensionRepository coreExtensionRepository0 = mock(CoreExtensionRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultInstalledExtensionRepository0, (Class<?>) DefaultInstalledExtensionRepository.class, "coreExtensionRepository", (Object) coreExtensionRepository0);
      PriorityBlockingQueue<ExtensionAuthor> priorityBlockingQueue0 = new PriorityBlockingQueue<ExtensionAuthor>();
      String string0 = "";
      ArrayDeque<DefaultExtensionDependency> arrayDeque0 = new ArrayDeque<DefaultExtensionDependency>();
      LinkedTransferQueue<DefaultExtensionDependency> linkedTransferQueue0 = new LinkedTransferQueue<DefaultExtensionDependency>(arrayDeque0);
      ZoneId.getAvailableZoneIds();
      String string1 = "UkA";
      DefaultVersion defaultVersion0 = new DefaultVersion("");
      ExtensionId extensionId0 = new ExtensionId("UkA", defaultVersion0);
      EmptyExtension emptyExtension0 = new EmptyExtension(extensionId0, "i0@aGsY8:|6LA)ebr");
      emptyExtension0.getIssueManagement();
      Vector<ExtensionLicense> vector0 = new Vector<ExtensionLicense>();
      String string2 = null;
      WrappingInstalledExtension<DefaultInstalledExtension> wrappingInstalledExtension0 = (WrappingInstalledExtension<DefaultInstalledExtension>) mock(WrappingInstalledExtension.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null).when(wrappingInstalledExtension0).getFeatures();
      doReturn((ExtensionId) null).when(wrappingInstalledExtension0).getId();
      doReturn((String) null).when(wrappingInstalledExtension0).getType();
      WrappingLocalExtension<WrappingInstalledExtension<DefaultInstalledExtension>> wrappingLocalExtension0 = new WrappingLocalExtension<WrappingInstalledExtension<DefaultInstalledExtension>>(wrappingInstalledExtension0);
      DefaultInstalledExtension defaultInstalledExtension0 = new DefaultInstalledExtension(wrappingLocalExtension0, (InstalledExtensionRepository) null);
  }
}
