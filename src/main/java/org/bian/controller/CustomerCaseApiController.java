/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Process;

@BianRestController
public class CustomerCaseApiController {

	@Autowired
	CustomerCaseApiService service;
	
	@Process.ExecutePost
	public BianResponse<CustomerCaseCustomerCaseWithIdAndRoot> executePost(@RequestBody BianRequest<CustomerCaseCustomerCaseBase> bianRequest) {
		return BianResponse.forSuccess(service.executePost(bianRequest.getData()));
	}
	
	@Process.ExecutePut
	public BianResponse<CustomerCaseCustomerCaseWithIdAndRoot> executePut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CustomerCaseCustomerCaseBase> bianRequest) {
		return BianResponse.forSuccess(service.executePut(crReferenceId, bianRequest.getData()));
	}
	
	@Process.Record
	public BianResponse<CustomerCaseRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CustomerCaseRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("determination")
	@Process.RequestPost
	public BianResponse<CustomerCaseDeterminationWithIdAndRoot> requestPostDetermination(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CustomerCaseDeterminationBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPostDetermination(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("determination")
	@Process.RequestPut
	public BianResponse<CustomerCaseDeterminationWithIdAndRoot> requestPutDetermination(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CustomerCaseDeterminationBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPutDetermination(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Process.Retrieve
	public BianResponse<CustomerCaseCustomerCaseWithIdAndRoot> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@BQ("analyses")
	@Process.Retrieve
	public BianResponse<CustomerCaseAnalysisWithIdAndRoot> retrieveAnalyses(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAnalyses(crReferenceId, bqReferenceId));
	}
	
	@Process.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Process.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("determination")
	@Process.Retrieve
	public BianResponse<CustomerCaseDeterminationWithIdAndRoot> retrieveDetermination(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDetermination(crReferenceId, bqReferenceId));
	}
	
	@BQ("procedures")
	@Process.Retrieve
	public BianResponse<CustomerCaseProceduresWithIdAndRoot> retrieveProcedures(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveProcedures(crReferenceId, bqReferenceId));
	}
	
	@Process.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("reportings")
	@Process.Retrieve
	public BianResponse<CustomerCaseReportingWithIdAndRoot> retrieveReportings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReportings(crReferenceId, bqReferenceId));
	}
	
	@BQ("resolutions")
	@Process.Retrieve
	public BianResponse<CustomerCaseResolutionWithIdAndRoot> retrieveResolutions(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveResolutions(crReferenceId, bqReferenceId));
	}
	
	@Process.Update
	public BianResponse<CustomerCaseCustomerCaseWithIdAndRoot> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CustomerCaseCustomerCaseBase> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
