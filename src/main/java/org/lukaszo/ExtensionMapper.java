/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package org.lukaszo;


/**
 *  ExtensionMapper class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class ExtensionMapper {
    public static Object getTypeObject(
        String namespaceURI, String typeName,
        javax.xml.stream.XMLStreamReader reader) throws Exception {
        if ("http://lukaszo.org/xsd".equals(namespaceURI) &&
                "Car".equals(typeName)) {
            return org.lukaszo.xsd.Car.Factory.parse(reader);
        }

        throw new org.apache.axis2.databinding.ADBException("Unsupported type " +
            namespaceURI + " " + typeName);
    }
}
