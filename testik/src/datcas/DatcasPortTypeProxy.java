package datcas;

public class DatcasPortTypeProxy implements datcas.DatcasPortType {
  private String _endpoint = null;
  private datcas.DatcasPortType datcasPortType = null;
  
  public DatcasPortTypeProxy() {
    _initDatcasPortTypeProxy();
  }
  
  public DatcasPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initDatcasPortTypeProxy();
  }
  
  private void _initDatcasPortTypeProxy() {
    try {
      datcasPortType = (new datcas.DatcasLocator()).getdatcasPort();
      if (datcasPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)datcasPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)datcasPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (datcasPortType != null)
      ((javax.xml.rpc.Stub)datcasPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public datcas.DatcasPortType getDatcasPortType() {
    if (datcasPortType == null)
      _initDatcasPortTypeProxy();
    return datcasPortType;
  }
  
  
}