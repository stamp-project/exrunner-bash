/*

 * Mon Apr 20 13:55:30 UTC 2020
 */

package org.xwiki.mail.internal.configuration;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.mail.internal.configuration.SendMailConfigClassDocumentConfigurationSource;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class SendMailConfigClassDocumentConfigurationSource_ESTest extends SendMailConfigClassDocumentConfigurationSource_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SendMailConfigClassDocumentConfigurationSource sendMailConfigClassDocumentConfigurationSource0 = new SendMailConfigClassDocumentConfigurationSource();
  }
}
