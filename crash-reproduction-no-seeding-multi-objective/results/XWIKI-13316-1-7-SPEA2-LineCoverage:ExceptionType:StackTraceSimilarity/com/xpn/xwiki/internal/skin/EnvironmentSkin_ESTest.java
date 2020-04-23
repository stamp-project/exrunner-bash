/*

 * Mon Apr 20 21:10:00 UTC 2020
 */

package com.xpn.xwiki.internal.skin;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.internal.skin.EnvironmentSkin;
import com.xpn.xwiki.internal.skin.InternalSkinConfiguration;
import com.xpn.xwiki.internal.skin.InternalSkinManager;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.event.SubstituteLoggingEvent;
import org.xwiki.configuration.internal.DefaultConfigurationSourceProvider;
import org.xwiki.environment.Environment;
import org.xwiki.rendering.block.MetaDataBlock;
import org.xwiki.rendering.internal.syntax.DefaultSyntaxFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class EnvironmentSkin_ESTest extends EnvironmentSkin_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InternalSkinConfiguration internalSkinConfiguration0 = new InternalSkinConfiguration();
      DefaultConfigurationSourceProvider defaultConfigurationSourceProvider0 = new DefaultConfigurationSourceProvider();
      ConcurrentHashMap<String, MetaDataBlock> concurrentHashMap0 = new ConcurrentHashMap<String, MetaDataBlock>();
      DefaultSyntaxFactory defaultSyntaxFactory0 = new DefaultSyntaxFactory();
      SubstituteLoggingEvent substituteLoggingEvent0 = new SubstituteLoggingEvent();
      substituteLoggingEvent0.getLogger();
      DefaultSyntaxFactory defaultSyntaxFactory1 = new DefaultSyntaxFactory();
      EnvironmentSkin environmentSkin0 = new EnvironmentSkin((String) null, (InternalSkinManager) null, internalSkinConfiguration0, (Logger) null, defaultSyntaxFactory1, (Environment) null, (Provider<XWikiContext>) null);
      // Undeclared exception!
      environmentSkin0.getOutputSyntaxString();
  }
}
