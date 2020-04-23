/*

 * Mon Apr 20 21:34:50 UTC 2020
 */

package com.xpn.xwiki.internal.skin;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.internal.skin.EnvironmentSkin;
import com.xpn.xwiki.internal.skin.InternalSkinConfiguration;
import com.xpn.xwiki.internal.skin.InternalSkinManager;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.hibernate.loader.custom.sql.SQLCustomQuery;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.xwiki.environment.Environment;
import org.xwiki.rendering.internal.syntax.DefaultSyntaxFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class EnvironmentSkin_ESTest extends EnvironmentSkin_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Logger logger0 = mock(Logger.class, new ViolatedAssumptionAnswer());
      DefaultSyntaxFactory defaultSyntaxFactory0 = new DefaultSyntaxFactory();
      EnvironmentSkin environmentSkin0 = new EnvironmentSkin("", (InternalSkinManager) null, (InternalSkinConfiguration) null, logger0, defaultSyntaxFactory0, (Environment) null, (Provider<XWikiContext>) null);
      ch.qos.logback.classic.Logger logger1 = (ch.qos.logback.classic.Logger)SQLCustomQuery.log;
      EnvironmentSkin environmentSkin1 = new EnvironmentSkin("", (InternalSkinManager) null, (InternalSkinConfiguration) null, logger1, defaultSyntaxFactory0, (Environment) null, (Provider<XWikiContext>) null);
      environmentSkin1.getSkinFolder();
      // Undeclared exception!
      environmentSkin0.getOutputSyntaxString();
  }
}
