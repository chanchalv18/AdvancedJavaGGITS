/**
 * CalculatorService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package google.chanchal.WebService;

public interface CalculatorService extends javax.xml.rpc.Service {
    public java.lang.String getcalculatorAddress();

    public google.chanchal.WebService.Calculator getcalculator() throws javax.xml.rpc.ServiceException;

    public google.chanchal.WebService.Calculator getcalculator(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
