/*

 * Mon Apr 20 12:25:19 UTC 2020
 */

package org.xwiki.extension.repository.internal.installed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.qos.logback.classic.Logger;
import java.util.Calendar;
import java.util.Collection;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.extension.DefaultExtensionScm;
import org.xwiki.extension.DefaultExtensionScmConnection;
import org.xwiki.extension.ExtensionAuthor;
import org.xwiki.extension.ExtensionId;
import org.xwiki.extension.ExtensionIssueManagement;
import org.xwiki.extension.LocalExtension;
import org.xwiki.extension.repository.CoreExtensionRepository;
import org.xwiki.extension.repository.LocalExtensionRepository;
import org.xwiki.extension.repository.internal.installed.DefaultInstalledExtension;
import org.xwiki.extension.repository.internal.installed.DefaultInstalledExtensionRepository;
import org.xwiki.extension.test.EmptyExtension;
import org.xwiki.extension.wrap.WrappingInstalledExtension;
import org.xwiki.extension.wrap.WrappingLocalExtension;
import ucar.nc2.util.net.URLStreamHandlerFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DefaultInstalledExtensionRepository_ESTest extends DefaultInstalledExtensionRepository_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocalExtensionRepository localExtensionRepository0 = mock(LocalExtensionRepository.class, new ViolatedAssumptionAnswer());
      Logger logger0 = (Logger)URLStreamHandlerFactory.log;
      ExtensionId extensionId0 = new ExtensionId("Invalid extension [{}] on namespace [{}] ({})", "Invalid extension [{}] on namespace [{}] ({})");
      LocalExtension localExtension0 = mock(LocalExtension.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null).when(localExtension0).getFeatures();
      doReturn(extensionId0).when(localExtension0).getId();
      doReturn((String) null).when(localExtension0).getType();
      DefaultInstalledExtensionRepository defaultInstalledExtensionRepository0 = new DefaultInstalledExtensionRepository();
      CoreExtensionRepository coreExtensionRepository0 = mock(CoreExtensionRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultInstalledExtensionRepository0, (Class<?>) DefaultInstalledExtensionRepository.class, "coreExtensionRepository", (Object) coreExtensionRepository0);
      Vector<ExtensionAuthor> vector0 = new Vector<ExtensionAuthor>();
      Calendar.getAvailableCalendarTypes();
      WrappingInstalledExtension<DefaultInstalledExtension> wrappingInstalledExtension0 = (WrappingInstalledExtension<DefaultInstalledExtension>) mock(WrappingInstalledExtension.class, new ViolatedAssumptionAnswer());
      doReturn((ExtensionIssueManagement) null).when(wrappingInstalledExtension0).getIssueManagement();
      WrappingInstalledExtension<WrappingInstalledExtension<DefaultInstalledExtension>> wrappingInstalledExtension1 = new WrappingInstalledExtension<WrappingInstalledExtension<DefaultInstalledExtension>>(wrappingInstalledExtension0);
      wrappingInstalledExtension1.getIssueManagement();
      EmptyExtension emptyExtension0 = new EmptyExtension(extensionId0, "");
      emptyExtension0.getLicenses();
      emptyExtension0.getProperties();
      DefaultExtensionScmConnection defaultExtensionScmConnection0 = new DefaultExtensionScmConnection("^-\"o?hya8Kxd:1,zM", "Invalid extension [{}] on namespace [{}] ({})");
      DefaultExtensionScm defaultExtensionScm0 = new DefaultExtensionScm("Invalid extension [{}] on namespace [{}] ({})", defaultExtensionScmConnection0, defaultExtensionScmConnection0);
      DefaultInstalledExtension defaultInstalledExtension0 = mock(DefaultInstalledExtension.class, new ViolatedAssumptionAnswer());
      WrappingLocalExtension<DefaultInstalledExtension> wrappingLocalExtension0 = new WrappingLocalExtension<DefaultInstalledExtension>(defaultInstalledExtension0);
      LocalExtensionRepository localExtensionRepository1 = mock(LocalExtensionRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultInstalledExtensionRepository0, (Class<?>) DefaultInstalledExtensionRepository.class, "localRepository", (Object) localExtensionRepository1);
      Logger logger1 = (Logger)URLStreamHandlerFactory.log;
      logger1.isWarnEnabled();
      String string0 = null;
      DefaultInstalledExtension defaultInstalledExtension1 = new DefaultInstalledExtension(localExtension0, defaultInstalledExtensionRepository0);
  }
}
