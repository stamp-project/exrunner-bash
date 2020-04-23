/*

 * Wed Apr 22 01:54:22 UTC 2020
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
import org.xwiki.job.internal.DefaultJobProgress;
import org.xwiki.logging.event.LogEvent;
import org.xwiki.rest.internal.DomainObjectFactory;
import org.xwiki.rest.model.jaxb.JobProgress;
import org.xwiki.rest.model.jaxb.JobStatus;
import org.xwiki.rest.model.jaxb.ObjectFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DomainObjectFactory_ESTest extends DomainObjectFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JobStatus jobStatus0 = objectFactory0.createJobStatus();
      DefaultJobProgress defaultJobProgress0 = new DefaultJobProgress("Apache Tika");
      JobProgress jobProgress0 = DomainObjectFactory.createJobProgress(objectFactory0, defaultJobProgress0);
      ObjectFactory objectFactory1 = mock(ObjectFactory.class, new ViolatedAssumptionAnswer());
      doReturn(jobProgress0).when(objectFactory1).createJobProgress();
      doReturn(jobStatus0).when(objectFactory1).createJobStatus();
      DefaultRequest defaultRequest0 = new DefaultRequest();
      org.xwiki.job.event.status.JobStatus.State jobStatus_State0 = org.xwiki.job.event.status.JobStatus.State.FINISHED;
      LogEvent logEvent0 = new LogEvent();
      defaultJobProgress0.onEvent(logEvent0, jobProgress0, defaultRequest0);
      org.xwiki.job.event.status.JobStatus jobStatus1 = mock(org.xwiki.job.event.status.JobStatus.class, new ViolatedAssumptionAnswer());
      doReturn(defaultJobProgress0).when(jobStatus1).getProgress();
      doReturn(defaultRequest0).when(jobStatus1).getRequest();
      doReturn((Date) null).when(jobStatus1).getStartDate();
      doReturn(jobStatus_State0).when(jobStatus1).getState();
      // Undeclared exception!
      DomainObjectFactory.createJobStatus(objectFactory1, (URI) null, jobStatus1);
  }
}
