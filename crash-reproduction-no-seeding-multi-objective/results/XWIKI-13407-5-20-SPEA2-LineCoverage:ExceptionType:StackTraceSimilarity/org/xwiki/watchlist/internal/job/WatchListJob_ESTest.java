/*

 * Wed Apr 22 06:06:45 GMT+00:00 2020
 */

package org.xwiki.watchlist.internal.job;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class WatchListJob_ESTest extends WatchListJob_ESTest_scaffolding {
  @Test
  public void notGeneratedAnyTest() {
    // EvoSuite did not generate any tests
  }
}
