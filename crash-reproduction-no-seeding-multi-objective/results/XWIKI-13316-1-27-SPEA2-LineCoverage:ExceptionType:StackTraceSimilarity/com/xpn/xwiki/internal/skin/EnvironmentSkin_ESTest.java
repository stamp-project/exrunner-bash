/*

 * Mon Apr 20 21:39:02 UTC 2020
 */

package com.xpn.xwiki.internal.skin;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.qos.logback.classic.Logger;
import com.xpn.xwiki.internal.XWikiContextProvider;
import com.xpn.xwiki.internal.skin.EnvironmentSkin;
import com.xpn.xwiki.internal.skin.InternalSkinConfiguration;
import com.xpn.xwiki.internal.skin.InternalSkinManager;
import info.informatica.io.FilesystemInfo;
import java.io.File;
import java.net.URL;
import org.eclipse.jetty.util.resource.Resource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.hibernate.loader.custom.sql.SQLCustomQuery;
import org.junit.runner.RunWith;
import org.xwiki.environment.Environment;
import org.xwiki.rendering.syntax.SyntaxFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class EnvironmentSkin_ESTest extends EnvironmentSkin_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InternalSkinManager internalSkinManager0 = mock(InternalSkinManager.class, new ViolatedAssumptionAnswer());
      InternalSkinConfiguration internalSkinConfiguration0 = mock(InternalSkinConfiguration.class, new ViolatedAssumptionAnswer());
      Logger logger0 = (Logger)SQLCustomQuery.log;
      SyntaxFactory syntaxFactory0 = mock(SyntaxFactory.class, new ViolatedAssumptionAnswer());
      File file0 = FilesystemInfo.createFileInDir("parent");
      URL uRL0 = Resource.toURL(file0);
      Environment environment0 = mock(Environment.class, new ViolatedAssumptionAnswer());
      doReturn(uRL0, uRL0).when(environment0).getResource(anyString());
      XWikiContextProvider xWikiContextProvider0 = new XWikiContextProvider();
      EnvironmentSkin environmentSkin0 = new EnvironmentSkin("parent", internalSkinManager0, internalSkinConfiguration0, logger0, syntaxFactory0, environment0, xWikiContextProvider0);
      environmentSkin0.getSkinFolder();
      environmentSkin0.getResource("");
      // Undeclared exception!
      environmentSkin0.getOutputSyntaxString();
  }
}
