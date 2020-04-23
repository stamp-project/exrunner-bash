/*

 * Mon Apr 20 13:07:28 UTC 2020
 */

package org.xwiki.extension.repository.internal.installed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.xwiki.extension.DefaultExtensionDependency;
import org.xwiki.extension.DefaultExtensionIssueManagement;
import org.xwiki.extension.DefaultExtensionScm;
import org.xwiki.extension.DefaultExtensionScmConnection;
import org.xwiki.extension.ExtensionAuthor;
import org.xwiki.extension.ExtensionId;
import org.xwiki.extension.ExtensionLicense;
import org.xwiki.extension.LocalExtension;
import org.xwiki.extension.repository.CoreExtensionRepository;
import org.xwiki.extension.repository.LocalExtensionRepository;
import org.xwiki.extension.repository.internal.installed.DefaultInstalledExtension;
import org.xwiki.extension.repository.internal.installed.DefaultInstalledExtensionRepository;
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
      Vector<DefaultExtensionDependency> vector0 = new Vector<DefaultExtensionDependency>();
      LinkedList<Locale.LanguageRange> linkedList1 = new LinkedList<Locale.LanguageRange>();
      ArrayDeque<String> arrayDeque0 = new ArrayDeque<String>();
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList1, (Collection<String>) arrayDeque0);
      ExtensionId extensionId0 = new ExtensionId("Invalid extension [{}] ({})", "Error creating sink '");
      DefaultExtensionIssueManagement defaultExtensionIssueManagement0 = new DefaultExtensionIssueManagement("Invalid extension [{}] ({})", "Error creating sink '");
      TreeSet<ExtensionLicense> treeSet0 = new TreeSet<ExtensionLicense>();
      PriorityQueue<ExtensionLicense> priorityQueue0 = new PriorityQueue<ExtensionLicense>((Collection<? extends ExtensionLicense>) treeSet0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      DefaultExtensionScmConnection defaultExtensionScmConnection0 = new DefaultExtensionScmConnection("Error creating sink '", "n{ya");
      DefaultExtensionScm defaultExtensionScm0 = new DefaultExtensionScm("m", defaultExtensionScmConnection0, defaultExtensionScmConnection0);
      DefaultInstalledExtension defaultInstalledExtension0 = mock(DefaultInstalledExtension.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0).when(defaultInstalledExtension0).getAuthors();
      doReturn("m").when(defaultInstalledExtension0).getCategory();
      doReturn(vector0).when(defaultInstalledExtension0).getDependencies();
      doReturn("Error creating sink '").when(defaultInstalledExtension0).getDescription();
      doReturn(list0).when(defaultInstalledExtension0).getFeatures();
      doReturn(extensionId0, extensionId0, extensionId0).when(defaultInstalledExtension0).getId();
      doReturn(defaultExtensionIssueManagement0).when(defaultInstalledExtension0).getIssueManagement();
      doReturn(priorityQueue0).when(defaultInstalledExtension0).getLicenses();
      doReturn("Invalid extension [{}] on namespace [{}]").when(defaultInstalledExtension0).getName();
      doReturn(hashMap0).when(defaultInstalledExtension0).getProperties();
      doReturn(defaultExtensionScm0).when(defaultInstalledExtension0).getScm();
      doReturn("n{ya").when(defaultInstalledExtension0).getSummary();
      doReturn("Error creating sink '").when(defaultInstalledExtension0).getType();
      doReturn("Invalid extension [{}] ({})").when(defaultInstalledExtension0).getWebSite();
      WrappingLocalExtension<DefaultInstalledExtension> wrappingLocalExtension0 = new WrappingLocalExtension<DefaultInstalledExtension>(defaultInstalledExtension0);
      LocalExtensionRepository localExtensionRepository0 = mock(LocalExtensionRepository.class, new ViolatedAssumptionAnswer());
      doReturn(wrappingLocalExtension0).when(localExtensionRepository0).getLocalExtension(any(org.xwiki.extension.ExtensionId.class));
      Injector.inject(defaultInstalledExtensionRepository0, (Class<?>) DefaultInstalledExtensionRepository.class, "localRepository", (Object) localExtensionRepository0);
      Logger logger0 = mock(Logger.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultInstalledExtensionRepository0, (Class<?>) DefaultInstalledExtensionRepository.class, "logger", (Object) logger0);
      Injector.validateBean(defaultInstalledExtensionRepository0, (Class<?>) DefaultInstalledExtensionRepository.class);
      defaultInstalledExtensionRepository0.isSortable();
      defaultInstalledExtensionRepository0.search((String) null, 1090, 3);
      DefaultVersion defaultVersion0 = new DefaultVersion((String) null);
      ExtensionId extensionId1 = new ExtensionId("1q2k_", defaultVersion0);
      // Undeclared exception!
      defaultInstalledExtensionRepository0.installExtension((LocalExtension) wrappingLocalExtension0, "1q2k_", false, (Map<String, Object>) null);
  }
}
