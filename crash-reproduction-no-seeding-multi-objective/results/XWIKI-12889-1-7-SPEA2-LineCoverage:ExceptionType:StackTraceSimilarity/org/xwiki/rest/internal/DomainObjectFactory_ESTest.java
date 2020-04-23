/*

 * Wed Apr 22 01:55:47 UTC 2020
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
import org.xwiki.rest.model.jaxb.JobProgress;
import org.xwiki.rest.model.jaxb.ObjectFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DomainObjectFactory_ESTest extends DomainObjectFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ObjectFactory objectFactory0 = mock(ObjectFactory.class, new ViolatedAssumptionAnswer());
      ObjectFactory objectFactory1 = mock(ObjectFactory.class, new ViolatedAssumptionAnswer());
      ObjectFactory objectFactory2 = mock(ObjectFactory.class, new ViolatedAssumptionAnswer());
      ObjectFactory objectFactory3 = new ObjectFactory();
      objectFactory3.createJobStatus();
      ObjectFactory objectFactory4 = new ObjectFactory();
      JobProgress jobProgress0 = objectFactory4.createJobProgress();
      ObjectFactory objectFactory5 = mock(ObjectFactory.class, new ViolatedAssumptionAnswer());
      doReturn(jobProgress0).when(objectFactory5).createJobProgress();
      DomainObjectFactory domainObjectFactory0 = new DomainObjectFactory();
      DefaultJobProgress defaultJobProgress0 = new DefaultJobProgress();
      DomainObjectFactory.createJobProgress(objectFactory5, defaultJobProgress0);
      DefaultRequest defaultRequest0 = new DefaultRequest();
      JobStatus.State jobStatus_State0 = JobStatus.State.RUNNING;
      JobStatus jobStatus0 = mock(JobStatus.class, new ViolatedAssumptionAnswer());
      doReturn(defaultJobProgress0).when(jobStatus0).getProgress();
      doReturn(defaultRequest0).when(jobStatus0).getRequest();
      doReturn((Date) null).when(jobStatus0).getStartDate();
      doReturn(jobStatus_State0).when(jobStatus0).getState();
      // Undeclared exception!
      DomainObjectFactory.createJobStatus(objectFactory4, (URI) null, jobStatus0);
  }
}
