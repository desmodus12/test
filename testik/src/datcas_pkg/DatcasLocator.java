/**
 * DatcasLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package datcas_pkg;

public class DatcasLocator extends org.apache.axis.client.Service implements datcas_pkg.Datcas {

    public DatcasLocator() {
    }


    public DatcasLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DatcasLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for datcasPort
    private java.lang.String datcasPort_address = "http://wsdl.umnadoma.eu/index.php";

    public java.lang.String getdatcasPortAddress() {
        return datcasPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String datcasPortWSDDServiceName = "datcasPort";

    public java.lang.String getdatcasPortWSDDServiceName() {
        return datcasPortWSDDServiceName;
    }

    public void setdatcasPortWSDDServiceName(java.lang.String name) {
        datcasPortWSDDServiceName = name;
    }

    public datcas_pkg.DatcasPortType getdatcasPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(datcasPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getdatcasPort(endpoint);
    }

    public datcas_pkg.DatcasPortType getdatcasPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            datcas_pkg.DatcasBindingStub _stub = new datcas_pkg.DatcasBindingStub(portAddress, this);
            _stub.setPortName(getdatcasPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setdatcasPortEndpointAddress(java.lang.String address) {
        datcasPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (datcas_pkg.DatcasPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                datcas_pkg.DatcasBindingStub _stub = new datcas_pkg.DatcasBindingStub(new java.net.URL(datcasPort_address), this);
                _stub.setPortName(getdatcasPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("datcasPort".equals(inputPortName)) {
            return getdatcasPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:datcas", "datcas");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:datcas", "datcasPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("datcasPort".equals(portName)) {
            setdatcasPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
