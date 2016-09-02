/**
 * DatcasPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package datcas_pkg;

public interface DatcasPortType extends java.rmi.Remote {

    /**
     * Get current server time or datetime. Default datetime, set
     * to time with format=cas parameter.
     */
    public java.lang.String getCas(java.lang.String format) throws java.rmi.RemoteException;
}
