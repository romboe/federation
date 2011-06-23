/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2008, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors. 
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.picketlink.identity.federation.saml.v1.protocol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.picketlink.identity.federation.saml.common.CommonResponseType;
import org.picketlink.identity.federation.saml.v1.assertion.SAML11AssertionType;

/**
 * <complexType name="ResponseType">
        <complexContent>
            <extension base="samlp:ResponseAbstractType">
                <sequence>
                    <element ref="samlp:Status"/>
                    <element ref="saml:Assertion" minOccurs="0" maxOccurs="unbounded"/>
                </sequence>
            </extension>

        </complexContent>
    </complexType>

 * @author Anil.Saldhana@redhat.com
 * @since Jun 22, 2011
 */
public class SAML11ResponseType extends CommonResponseType
{
   private static final long serialVersionUID = 1L;

   protected List<SAML11AssertionType> assertions = new ArrayList<SAML11AssertionType>();

   protected SAML11StatusType status;

   public SAML11ResponseType(String id, XMLGregorianCalendar issueInstant)
   {
      super(id, issueInstant);
   }

   public void add(SAML11AssertionType assertion)
   {
      this.assertions.add(assertion);
   }

   public boolean remove(SAML11AssertionType assertion)
   {
      return this.assertions.remove(assertion);
   }

   public List<SAML11AssertionType> get()
   {
      return Collections.unmodifiableList(assertions);
   }

   public SAML11StatusType getStatus()
   {
      return status;
   }

   public void setStatus(SAML11StatusType status)
   {
      this.status = status;
   }
}