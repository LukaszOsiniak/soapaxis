/**
 * CarServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package org.lukaszo;


/**
 *  CarServiceMessageReceiverInOut message receiver
 */
public class CarServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver {
    public void invokeBusinessLogic(
        org.apache.axis2.context.MessageContext msgContext,
        org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault {
        try {
            // get the implementation class for the Web Service
            Object obj = getTheImplementationObject(msgContext);

            CarServiceSkeleton skel = (CarServiceSkeleton) obj;

            //Out Envelop
            org.apache.axiom.soap.SOAPEnvelope envelope = null;

            //Find the axisOperation that has been set by the Dispatch phase.
            org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext()
                                                                      .getAxisOperation();

            if (op == null) {
                throw new org.apache.axis2.AxisFault(
                    "Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
            }

            String methodName;

            if ((op.getName() != null) &&
                    ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(
                            op.getName().getLocalPart())) != null)) {
                if ("getAllCarsByMake".equals(methodName)) {
                    org.lukaszo.GetAllCarsByMakeResponse getAllCarsByMakeResponse5 =
                        null;
                    org.lukaszo.GetAllCarsByMake wrappedParam = (org.lukaszo.GetAllCarsByMake) fromOM(msgContext.getEnvelope()
                                                                                                                .getBody()
                                                                                                                .getFirstElement(),
                            org.lukaszo.GetAllCarsByMake.class);

                    getAllCarsByMakeResponse5 = skel.getAllCarsByMake(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getAllCarsByMakeResponse5, false,
                            new javax.xml.namespace.QName(
                                "http://lukaszo.org", "getAllCarsByMakeResponse"));
                } else {
                    throw new RuntimeException("method not found");
                }

                newMsgContext.setEnvelope(envelope);
            }
        } catch (Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    //
    private org.apache.axiom.om.OMElement toOM(
        org.lukaszo.GetAllCarsByMake param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.lukaszo.GetAllCarsByMake.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.lukaszo.GetAllCarsByMakeResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.lukaszo.GetAllCarsByMakeResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.lukaszo.GetAllCarsByMakeResponse param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.lukaszo.GetAllCarsByMakeResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.lukaszo.GetAllCarsByMakeResponse wrapgetAllCarsByMake() {
        org.lukaszo.GetAllCarsByMakeResponse wrappedElement = new org.lukaszo.GetAllCarsByMakeResponse();

        return wrappedElement;
    }

    /**
     *  get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private Object fromOM(org.apache.axiom.om.OMElement param,
        Class type) throws org.apache.axis2.AxisFault {
        try {
            if (org.lukaszo.GetAllCarsByMake.class.equals(type)) {
                return org.lukaszo.GetAllCarsByMake.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.lukaszo.GetAllCarsByMakeResponse.class.equals(type)) {
                return org.lukaszo.GetAllCarsByMakeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return null;
    }

    private org.apache.axis2.AxisFault createAxisFault(Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();

        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }
} //end of class
