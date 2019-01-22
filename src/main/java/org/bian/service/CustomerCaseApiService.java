/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerCaseApiService {

	CustomerCaseCustomerCaseWithIdAndRoot executePost(CustomerCaseCustomerCaseBase request);
	
	CustomerCaseCustomerCaseWithIdAndRoot executePut(String crReferenceId, CustomerCaseCustomerCaseBase request);
	
	CustomerCaseRecordResponse record(String crReferenceId, CustomerCaseRecordRequest request);
	
	CustomerCaseDeterminationWithIdAndRoot requestPostDetermination(String crReferenceId, CustomerCaseDeterminationBase request);
	
	CustomerCaseDeterminationWithIdAndRoot requestPutDetermination(String crReferenceId, String bqReferenceId, CustomerCaseDeterminationBase request);
	
	CustomerCaseCustomerCaseWithIdAndRoot retrieve(String crReferenceId);
	
	CustomerCaseAnalysisWithIdAndRoot retrieveAnalyses(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	CustomerCaseDeterminationWithIdAndRoot retrieveDetermination(String crReferenceId, String bqReferenceId);
	
	CustomerCaseProceduresWithIdAndRoot retrieveProcedures(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
	CustomerCaseReportingWithIdAndRoot retrieveReportings(String crReferenceId, String bqReferenceId);
	
	CustomerCaseResolutionWithIdAndRoot retrieveResolutions(String crReferenceId, String bqReferenceId);
	
	CustomerCaseCustomerCaseWithIdAndRoot update(String crReferenceId, CustomerCaseCustomerCaseBase request);
	
}
