
package ee.ttu.idu0075._2015.ws.dormitory;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "dormitoryPortType", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/dormitory")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DormitoryPortType {


    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._2015.ws.dormitory.TenantType
     */
    @WebMethod
    @WebResult(name = "getTenantResponse", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/dormitory", partName = "parameter")
    public TenantType getTenant(
        @WebParam(name = "getTenantRequest", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/dormitory", partName = "parameter")
        GetTenantRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._2015.ws.dormitory.AddTenantResponse
     */
    @WebMethod
    @WebResult(name = "addTenantResponse", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/dormitory", partName = "parameter")
    public AddTenantResponse addTenant(
        @WebParam(name = "addTenantRequest", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/dormitory", partName = "parameter")
        AddTenantRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._2015.ws.dormitory.GetTenantListResponse
     */
    @WebMethod
    @WebResult(name = "getTenantListResponse", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/dormitory", partName = "parameter")
    public GetTenantListResponse getTenantList(
        @WebParam(name = "getTenantListRequest", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/dormitory", partName = "parameter")
        GetTenantListRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._2015.ws.dormitory.DormitoryType
     */
    @WebMethod
    @WebResult(name = "getDormitoryResponse", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/dormitory", partName = "parameter")
    public DormitoryType getDormitory(
        @WebParam(name = "getDormitoryRequest", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/dormitory", partName = "parameter")
        GetDormitoryRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._2015.ws.dormitory.AddDormitoryResponse
     */
    @WebMethod
    @WebResult(name = "addDormitoryResponse", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/dormitory", partName = "parameter")
    public AddDormitoryResponse addDormitory(
        @WebParam(name = "addDormitoryRequest", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/dormitory", partName = "parameter")
        AddDormitoryRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._2015.ws.dormitory.GetDormitoryListResponse
     */
    @WebMethod
    @WebResult(name = "getDormitoryListResponse", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/dormitory", partName = "parameter")
    public GetDormitoryListResponse getDormitoryList(
        @WebParam(name = "getDormitoryListRequest", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/dormitory", partName = "parameter")
        GetDormitoryListRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._2015.ws.dormitory.DormitoryTenantListType
     */
    @WebMethod
    @WebResult(name = "getDormitoryTenantListResponse", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/dormitory", partName = "parameter")
    public DormitoryTenantListType getDormitoryTenantList(
        @WebParam(name = "getDormitoryTenantListRequest", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/dormitory", partName = "parameter")
        GetDormitoryTenantListRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._2015.ws.dormitory.AddDormitoryTenantResponse
     */
    @WebMethod
    @WebResult(name = "addDormitoryTenantResponse", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/dormitory", partName = "parameter")
    public AddDormitoryTenantResponse addDormitoryTenant(
        @WebParam(name = "addDormitoryTenantRequest", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/dormitory", partName = "parameter")
        AddDormitoryTenantRequest parameter);

}