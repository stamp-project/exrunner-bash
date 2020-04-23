/*

 * Mon Apr 20 12:40:02 UTC 2020
 */

package org.xwiki.extension.repository.internal.installed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
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
import org.xwiki.extension.repository.search.ExtensionQuery;
import org.xwiki.extension.wrap.WrappingInstalledExtension;

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
      WrappingInstalledExtension<WrappingInstalledExtension<DefaultInstalledExtension>> wrappingInstalledExtension1 = new WrappingInstalledExtension<WrappingInstalledExtension<DefaultInstalledExtension>>(wrappingInstalledExtension0);
      LocalExtensionRepository localExtensionRepository0 = mock(LocalExtensionRepository.class, new ViolatedAssumptionAnswer());
      doReturn(wrappingInstalledExtension1).when(localExtensionRepository0).getLocalExtension(any(org.xwiki.extension.ExtensionId.class));
      Injector.inject(defaultInstalledExtensionRepository0, (Class<?>) DefaultInstalledExtensionRepository.class, "localRepository", (Object) localExtensionRepository0);
      Logger logger0 = mock(Logger.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultInstalledExtensionRepository0, (Class<?>) DefaultInstalledExtensionRepository.class, "logger", (Object) logger0);
      Injector.validateBean(defaultInstalledExtensionRepository0, (Class<?>) DefaultInstalledExtensionRepository.class);
      ExtensionQuery extensionQuery0 = new ExtensionQuery("[:`U3e=0");
      List<ExtensionQuery.SortClause> list0 = extensionQuery0.getSortClauses();
      ExtensionQuery extensionQuery1 = mock(ExtensionQuery.class, new ViolatedAssumptionAnswer());
      doReturn((-2862)).when(extensionQuery1).getLimit();
      doReturn((-2862)).when(extensionQuery1).getOffset();
      doReturn("").when(extensionQuery1).getQuery();
      doReturn(list0).when(extensionQuery1).getSortClauses();
      defaultInstalledExtensionRepository0.search(extensionQuery1);
      ExtensionId extensionId0 = new ExtensionId("[:`U3e=0", "");
      LocalExtension localExtension0 = mock(LocalExtension.class, new ViolatedAssumptionAnswer());
      doReturn(extensionId0, extensionId0).when(localExtension0).getId();
      String string0 = "[:`U3e\\=0";
      ExtensionQuery extensionQuery2 = new ExtensionQuery("");
      extensionQuery2.getSortClauses();
      defaultInstalledExtensionRepository0.search(extensionQuery0);
      ExtensionId extensionId1 = new ExtensionId("[:`U3e=0", "");
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      // Undeclared exception!
      defaultInstalledExtensionRepository0.installExtension(localExtension0, "[:`U3e=0", false, (Map<String, Object>) null);
  }
}
