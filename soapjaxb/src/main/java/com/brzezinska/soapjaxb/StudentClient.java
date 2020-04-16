package com.brzezinska.soapjaxb;
import com.brzezinska.soapgenjaxb.RegisterCallRequest;
import com.brzezinska.soapgenjaxb.RegisterCallResponse;
import com.brzezinska.soapgenjaxb.ResultsRequest;
import com.brzezinska.soapgenjaxb.ResultsResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class StudentClient extends WebServiceGatewaySupport {

    public RegisterCallResponse getRegisterCall(String value){
        RegisterCallRequest request = new RegisterCallRequest();
        request.setStudent(value);
        return (RegisterCallResponse) getWebServiceTemplate().marshalSendAndReceive("http://localhost:8088/mockApiPortSoap11", request);
    }
    public ResultsResponse getResults(String value){
        ResultsRequest request = new ResultsRequest();
        request.setStudent(value);
        return (ResultsResponse) getWebServiceTemplate().marshalSendAndReceive("http://localhost:8088/mockApiPortSoap11", request);
    }


}
