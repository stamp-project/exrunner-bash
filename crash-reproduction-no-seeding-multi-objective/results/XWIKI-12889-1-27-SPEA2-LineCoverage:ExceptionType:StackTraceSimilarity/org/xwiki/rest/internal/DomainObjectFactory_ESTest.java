/*

 * Wed Apr 22 02:03:48 UTC 2020
 */

package org.xwiki.rest.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.api.Document;
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
      ObjectFactory objectFactory0 = new ObjectFactory();
      ObjectFactory objectFactory1 = new ObjectFactory();
      URI uRI0 = null;
      Object[] objectArray0 = new Object[0];
      Document document0 = mock(Document.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = true;
      objectFactory1.createSearchResults();
      com.xpn.xwiki.api.Object object0 = mock(com.xpn.xwiki.api.Object.class, new ViolatedAssumptionAnswer());
      Document document1 = mock(Document.class, new ViolatedAssumptionAnswer());
      DefaultRequest defaultRequest0 = new DefaultRequest();
      objectFactory1.createTags();
      defaultRequest0.setRemote(true);
      JobStatus.State jobStatus_State0 = JobStatus.State.NONE;
      DefaultJobProgress defaultJobProgress0 = new DefaultJobProgress();
      JobStatus jobStatus0 = mock(JobStatus.class, new ViolatedAssumptionAnswer());
      doReturn(defaultJobProgress0).when(jobStatus0).getProgress();
      doReturn(defaultRequest0).when(jobStatus0).getRequest();
      doReturn((Date) null).when(jobStatus0).getStartDate();
      doReturn(jobStatus_State0).when(jobStatus0).getState();
      // Undeclared exception!
      DomainObjectFactory.createJobStatus(objectFactory1, (URI) null, jobStatus0);
  }
}
