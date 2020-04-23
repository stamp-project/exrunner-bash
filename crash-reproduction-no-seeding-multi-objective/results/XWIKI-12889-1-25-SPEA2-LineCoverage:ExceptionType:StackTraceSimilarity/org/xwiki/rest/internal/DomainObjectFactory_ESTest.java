/*

 * Wed Apr 22 02:02:01 UTC 2020
 */

package org.xwiki.rest.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.URI;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.job.DefaultRequest;
import org.xwiki.job.event.status.JobStatus;
import org.xwiki.job.internal.DefaultJobProgress;
import org.xwiki.rest.internal.DomainObjectFactory;
import org.xwiki.rest.model.jaxb.ObjectFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DomainObjectFactory_ESTest extends DomainObjectFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DomainObjectFactory domainObjectFactory0 = new DomainObjectFactory();
      URI uRI0 = URI.create("");
      uRI0.getUserInfo();
      DefaultRequest defaultRequest0 = new DefaultRequest();
      ObjectFactory objectFactory0 = new ObjectFactory();
      JobStatus.State jobStatus_State0 = JobStatus.State.NONE;
      DefaultJobProgress defaultJobProgress0 = new DefaultJobProgress();
      JobStatus jobStatus0 = mock(JobStatus.class, new ViolatedAssumptionAnswer());
      doReturn(defaultJobProgress0).when(jobStatus0).getProgress();
      doReturn(defaultRequest0).when(jobStatus0).getRequest();
      doReturn((Date) null).when(jobStatus0).getStartDate();
      doReturn(jobStatus_State0).when(jobStatus0).getState();
      // Undeclared exception!
      DomainObjectFactory.createJobStatus(objectFactory0, uRI0, jobStatus0);
  }
}
