/*

 * Wed Apr 22 16:36:12 UTC 2020
 */

package com.xpn.xwiki.store;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWiki;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.XWikiException;
import com.xpn.xwiki.doc.XWikiDocument;
import com.xpn.xwiki.objects.DateProperty;
import com.xpn.xwiki.objects.IntegerProperty;
import com.xpn.xwiki.store.XWikiHibernateStore;
import org.apache.commons.dbcp2.PoolableConnection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.hibernate.type.DoubleType;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.DocumentReference;
import org.xwiki.model.reference.DocumentReferenceResolver;
import org.xwiki.model.reference.EntityReferenceSerializer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XWikiHibernateStore_ESTest extends XWikiHibernateStore_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XWiki xWiki0 = mock(XWiki.class, new ViolatedAssumptionAnswer());
      doReturn("M>7K)n}uk'MKZ").when(xWiki0).Param(anyString() , anyString());
      XWikiContext xWikiContext0 = new XWikiContext();
      XWikiHibernateStore xWikiHibernateStore0 = new XWikiHibernateStore(xWiki0, xWikiContext0);
      EntityReferenceSerializer<IntegerProperty> entityReferenceSerializer0 = (EntityReferenceSerializer<IntegerProperty>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Injector.inject(xWikiHibernateStore0, (Class<?>) XWikiHibernateStore.class, "compactWikiEntityReferenceSerializer", (Object) entityReferenceSerializer0);
      DocumentReferenceResolver<DateProperty> documentReferenceResolver0 = (DocumentReferenceResolver<DateProperty>) mock(DocumentReferenceResolver.class, new ViolatedAssumptionAnswer());
      Injector.inject(xWikiHibernateStore0, (Class<?>) XWikiHibernateStore.class, "currentMixedDocumentReferenceResolver", (Object) documentReferenceResolver0);
      DocumentReferenceResolver<Object> documentReferenceResolver1 = (DocumentReferenceResolver<Object>) mock(DocumentReferenceResolver.class, new ViolatedAssumptionAnswer());
      Injector.inject(xWikiHibernateStore0, (Class<?>) XWikiHibernateStore.class, "defaultDocumentReferenceResolver", (Object) documentReferenceResolver1);
      Double double0 = DoubleType.ZERO;
      EntityReferenceSerializer<Double> entityReferenceSerializer1 = (EntityReferenceSerializer<Double>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      doReturn(double0).when(entityReferenceSerializer1).serialize(any(org.xwiki.model.reference.EntityReference.class) , any(java.lang.Object[].class));
      Injector.inject(xWikiHibernateStore0, (Class<?>) XWikiHibernateStore.class, "defaultEntityReferenceSerializer", (Object) entityReferenceSerializer1);
      EntityReferenceSerializer<PoolableConnection> entityReferenceSerializer2 = (EntityReferenceSerializer<PoolableConnection>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      String string0 = "selec";
      DocumentReference documentReference0 = new DocumentReference("selec", " n)", "select attach.id from XWikiAttachment as attach where attach.id = :id");
      XWikiDocument xWikiDocument0 = new XWikiDocument(documentReference0);
      xWikiDocument0.duplicate(documentReference0);
      boolean boolean0 = true;
      try { 
        xWikiHibernateStore0.saveXWikiDoc(xWikiDocument0, xWikiContext0, true);
        fail("Expecting exception: XWikiException");
      
      } catch(XWikiException e) {
         //
         // Error number 3201 in 3: Exception while saving document null
         //
         verifyException("com.xpn.xwiki.store.XWikiHibernateStore", e);
      }
  }
}
