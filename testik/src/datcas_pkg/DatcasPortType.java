/**
 * DatcasPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package datcas_pkg;

public interface DatcasPortType extends java.rmi.Remote {

    /**
     * Get a listing of products by category
     */
    public java.lang.String getProd(java.lang.String category) throws java.rmi.RemoteException;
}
