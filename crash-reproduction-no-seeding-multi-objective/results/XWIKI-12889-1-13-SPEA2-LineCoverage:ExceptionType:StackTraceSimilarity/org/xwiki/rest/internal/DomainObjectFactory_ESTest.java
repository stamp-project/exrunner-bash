/*

 * Wed Apr 22 01:57:07 UTC 2020
 */

package org.xwiki.rest.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.api.Document;
import com.xpn.xwiki.doc.merge.MergeResult;
import java.net.URI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.job.DefaultJobStatus;
import org.xwiki.job.DefaultRequest;
import org.xwiki.job.event.status.JobStatus;
import org.xwiki.logging.LoggerManager;
import org.xwiki.observation.ObservationManager;
import org.xwiki.rest.internal.DomainObjectFactory;
import org.xwiki.rest.model.jaxb.ObjectFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DomainObjectFactory_ESTest extends DomainObjectFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      objectFactory0.createJobStatus();
      ObjectFactory objectFactory1 = mock(ObjectFactory.class, new ViolatedAssumptionAnswer());
      Document document0 = mock(Document.class, new ViolatedAssumptionAnswer());
      MergeResult mergeResult0 = new MergeResult();
      mergeResult0.getLog();
      DefaultRequest defaultRequest0 = new DefaultRequest();
      DefaultJobStatus<DefaultRequest> defaultJobStatus0 = new DefaultJobStatus<DefaultRequest>(defaultRequest0, (JobStatus) null, (ObservationManager) null, (LoggerManager) null);
      defaultJobStatus0.getParentJobStatus();
      DefaultJobStatus<DefaultRequest> defaultJobStatus1 = new DefaultJobStatus<DefaultRequest>(defaultRequest0, (JobStatus) null, (ObservationManager) null, (LoggerManager) null);
      defaultJobStatus0.getParentJobStatus();
      // Undeclared exception!
      DomainObjectFactory.createJobStatus(objectFactory0, (URI) null, defaultJobStatus0);
  }
}
