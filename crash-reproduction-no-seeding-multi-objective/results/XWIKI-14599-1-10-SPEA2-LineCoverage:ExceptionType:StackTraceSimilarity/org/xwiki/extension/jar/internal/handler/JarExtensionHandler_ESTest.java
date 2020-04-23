/*

 * Wed Apr 22 12:45:56 UTC 2020
 */

package org.xwiki.extension.jar.internal.handler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.classloader.ClassLoaderManager;
import org.xwiki.classloader.NamespaceURLClassLoader;
import org.xwiki.component.internal.multi.ComponentManagerManager;
import org.xwiki.extension.InstalledExtension;
import org.xwiki.extension.LocalExtensionFile;
import org.xwiki.extension.handler.internal.AbstractExtensionHandler;
import org.xwiki.extension.jar.internal.handler.JarExtensionHandler;
import org.xwiki.extension.wrap.WrappingInstalledExtension;
import org.xwiki.extension.wrap.WrappingLocalExtension;
import org.xwiki.job.DefaultRequest;
import org.xwiki.job.Request;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class JarExtensionHandler_ESTest extends JarExtensionHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JarExtensionHandler jarExtensionHandler0 = new JarExtensionHandler();
      ComponentManagerManager componentManagerManager0 = mock(ComponentManagerManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(jarExtensionHandler0, (Class<?>) JarExtensionHandler.class, "componentManagerManager", (Object) componentManagerManager0);
      NamespaceURLClassLoader namespaceURLClassLoader0 = mock(NamespaceURLClassLoader.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(namespaceURLClassLoader0).getNamespace();
      ClassLoaderManager classLoaderManager0 = mock(ClassLoaderManager.class, new ViolatedAssumptionAnswer());
      doReturn(namespaceURLClassLoader0).when(classLoaderManager0).getURLClassLoader(anyString() , anyBoolean());
      Injector.inject(jarExtensionHandler0, (Class<?>) JarExtensionHandler.class, "jarExtensionClassLoader", (Object) classLoaderManager0);
      Provider<Integer> provider0 = (Provider<Integer>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Injector.inject(jarExtensionHandler0, (Class<?>) AbstractExtensionHandler.class, "defaultValidatorProvider", (Object) provider0);
      InstalledExtension installedExtension0 = mock(InstalledExtension.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null).when(installedExtension0).getManagedDependencies();
      doReturn((LocalExtensionFile) null).when(installedExtension0).getFile();
      WrappingInstalledExtension<InstalledExtension> wrappingInstalledExtension0 = new WrappingInstalledExtension<InstalledExtension>(installedExtension0);
      WrappingLocalExtension<WrappingInstalledExtension<InstalledExtension>> wrappingLocalExtension0 = new WrappingLocalExtension<WrappingInstalledExtension<InstalledExtension>>(wrappingInstalledExtension0);
      wrappingLocalExtension0.getFile();
      InstalledExtension installedExtension1 = mock(InstalledExtension.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(installedExtension1).isValid(anyString());
      wrappingLocalExtension0.getManagedDependencies();
      WrappingInstalledExtension<InstalledExtension> wrappingInstalledExtension1 = new WrappingInstalledExtension<InstalledExtension>(installedExtension1);
      String string0 = "]";
      DefaultRequest defaultRequest0 = new DefaultRequest();
      DefaultRequest defaultRequest1 = new DefaultRequest(defaultRequest0);
      // Undeclared exception!
      jarExtensionHandler0.uninstall((InstalledExtension) wrappingInstalledExtension1, "]", (Request) defaultRequest1);
  }
}
