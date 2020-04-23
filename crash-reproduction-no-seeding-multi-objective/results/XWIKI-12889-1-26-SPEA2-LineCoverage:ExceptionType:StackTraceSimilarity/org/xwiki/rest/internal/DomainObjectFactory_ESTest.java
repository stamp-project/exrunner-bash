/*

 * Wed Apr 22 02:03:39 UTC 2020
 */

package org.xwiki.rest.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.api.Document;
import java.net.URI;
import java.util.Date;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.job.Request;
import org.xwiki.job.internal.DefaultJobProgress;
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
      JobProgress jobProgress0 = objectFactory0.createJobProgress();
      ObjectFactory objectFactory1 = mock(ObjectFactory.class, new ViolatedAssumptionAnswer());
      doReturn(jobProgress0).when(objectFactory1).createJobProgress();
      doReturn(jobStatus0).when(objectFactory1).createJobStatus();
      ObjectFactory objectFactory2 = mock(ObjectFactory.class, new ViolatedAssumptionAnswer());
      URI uRI0 = null;
      Document document0 = mock(Document.class, new ViolatedAssumptionAnswer());
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn((List<String>) null).when(request0).getId();
      org.xwiki.job.event.status.JobStatus.State jobStatus_State0 = org.xwiki.job.event.status.JobStatus.State.RUNNING;
      DefaultJobProgress defaultJobProgress0 = new DefaultJobProgress();
      org.xwiki.job.event.status.JobStatus jobStatus1 = mock(org.xwiki.job.event.status.JobStatus.class, new ViolatedAssumptionAnswer());
      doReturn(defaultJobProgress0).when(jobStatus1).getProgress();
      doReturn(request0).when(jobStatus1).getRequest();
      doReturn((Date) null).when(jobStatus1).getStartDate();
      doReturn(jobStatus_State0).when(jobStatus1).getState();
      // Undeclared exception!
      DomainObjectFactory.createJobStatus(objectFactory1, (URI) null, jobStatus1);
  }
}
