/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CustomerCaseApiServiceImpl implements CustomerCaseApiService {

	public CustomerCaseCustomerCaseWithIdAndRoot executePost(CustomerCaseCustomerCaseBase request){
		return JsonReader.read("executePost-CustomerCaseCustomerCaseWithIdAndRoot.json",new TypeReference<CustomerCaseCustomerCaseWithIdAndRoot>(){});
	}
	
	public CustomerCaseCustomerCaseWithIdAndRoot executePut(String crReferenceId, CustomerCaseCustomerCaseBase request){
		return JsonReader.read("executePut-CustomerCaseCustomerCaseWithIdAndRoot.json",new TypeReference<CustomerCaseCustomerCaseWithIdAndRoot>(){});
	}
	
	public CustomerCaseRecordResponse record(String crReferenceId, CustomerCaseRecordRequest request){
		return JsonReader.read("record-CustomerCaseRecordResponse.json",new TypeReference<CustomerCaseRecordResponse>(){});
	}
	
	public CustomerCaseDeterminationWithIdAndRoot requestPostDetermination(String crReferenceId, CustomerCaseDeterminationBase request){
		return JsonReader.read("requestPost-CustomerCaseDeterminationWithIdAndRoot.json",new TypeReference<CustomerCaseDeterminationWithIdAndRoot>(){});
	}
	
	public CustomerCaseDeterminationWithIdAndRoot requestPutDetermination(String crReferenceId, String bqReferenceId, CustomerCaseDeterminationBase request){
		return JsonReader.read("requestPut-CustomerCaseDeterminationWithIdAndRoot.json",new TypeReference<CustomerCaseDeterminationWithIdAndRoot>(){});
	}
	
	public CustomerCaseCustomerCaseWithIdAndRoot retrieve(String crReferenceId){
		return JsonReader.read("retrieve-CustomerCaseCustomerCaseWithIdAndRoot.json",new TypeReference<CustomerCaseCustomerCaseWithIdAndRoot>(){});
	}
	
	public CustomerCaseAnalysisWithIdAndRoot retrieveAnalyses(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerCaseAnalysisWithIdAndRoot.json",new TypeReference<CustomerCaseAnalysisWithIdAndRoot>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public CustomerCaseDeterminationWithIdAndRoot retrieveDetermination(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerCaseDeterminationWithIdAndRoot.json",new TypeReference<CustomerCaseDeterminationWithIdAndRoot>(){});
	}
	
	public CustomerCaseProceduresWithIdAndRoot retrieveProcedures(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerCaseProceduresWithIdAndRoot.json",new TypeReference<CustomerCaseProceduresWithIdAndRoot>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public CustomerCaseReportingWithIdAndRoot retrieveReportings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerCaseReportingWithIdAndRoot.json",new TypeReference<CustomerCaseReportingWithIdAndRoot>(){});
	}
	
	public CustomerCaseResolutionWithIdAndRoot retrieveResolutions(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerCaseResolutionWithIdAndRoot.json",new TypeReference<CustomerCaseResolutionWithIdAndRoot>(){});
	}
	
	public CustomerCaseCustomerCaseWithIdAndRoot update(String crReferenceId, CustomerCaseCustomerCaseBase request){
		return JsonReader.read("update-CustomerCaseCustomerCaseWithIdAndRoot.json",new TypeReference<CustomerCaseCustomerCaseWithIdAndRoot>(){});
	}
	
}
