package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerCaseAnalysisWithIdAndRoot
 */
public class CustomerCaseAnalysisWithIdAndRoot   {
  private String customerCaseAnalysisTaskReference = null;

  private String customerCaseReference = null;

  private String customerCaseType = null;

  private String productInstanceReference = null;

  private String customerReference = null;

  private String customerContactRecordReference = null;

  private Object customerContactRecord = null;

  private String transactionReference = null;

  private Object transactionRecord = null;

  private String caseLocation = null;

  private String dateTime = null;

  private String employeeBusinessUnitReference = null;

  private Object customerCaseRecord = null;

  private Object customerCaseRootCauseRecord = null;

  private String customerCaseResolutionSchedule = null;

  private String customerCaseStatus = null;

  private Object customerCaseAnalysisTaskRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: refers to the customer case root-cause analysis task 
   * @return customerCaseAnalysisTaskReference
  **/

  public String getCustomerCaseAnalysisTaskReference() {
    return customerCaseAnalysisTaskReference;
  }

  public void setCustomerCaseAnalysisTaskReference(String customerCaseAnalysisTaskReference) {
    this.customerCaseAnalysisTaskReference = customerCaseAnalysisTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Customer Case Reference 
   * @return customerCaseReference
  **/

  public String getCustomerCaseReference() {
    return customerCaseReference;
  }

  public void setCustomerCaseReference(String customerCaseReference) {
    this.customerCaseReference = customerCaseReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: e.g. disputed charges, suspected account fraud, stolen device, change of status 
   * @return customerCaseType
  **/

  public String getCustomerCaseType() {
    return customerCaseType;
  }

  public void setCustomerCaseType(String customerCaseType) {
    this.customerCaseType = customerCaseType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: product/service associated with case 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: customer associated with case 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: refers to contact record assembled during contact 
   * @return customerContactRecordReference
  **/

  public String getCustomerContactRecordReference() {
    return customerContactRecordReference;
  }

  public void setCustomerContactRecordReference(String customerContactRecordReference) {
    this.customerContactRecordReference = customerContactRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: master record combines listed elements 
   * @return customerContactRecord
  **/

  public Object getCustomerContactRecord() {
    return customerContactRecord;
  }

  public void setCustomerContactRecord(Object customerContactRecord) {
    this.customerContactRecord = customerContactRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: one or more product transactions associated with the case 
   * @return transactionReference
  **/

  public String getTransactionReference() {
    return transactionReference;
  }

  public void setTransactionReference(String transactionReference) {
    this.transactionReference = transactionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: all details of the transaction - not itemized here 
   * @return transactionRecord
  **/

  public Object getTransactionRecord() {
    return transactionRecord;
  }

  public void setTransactionRecord(Object transactionRecord) {
    this.transactionRecord = transactionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: physical address or electronic venue the customer case was detected 
   * @return caseLocation
  **/

  public String getCaseLocation() {
    return caseLocation;
  }

  public void setCaseLocation(String caseLocation) {
    this.caseLocation = caseLocation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: when the customer case was initiated 
   * @return dateTime
  **/

  public String getDateTime() {
    return dateTime;
  }

  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: unit where the customer case was raised 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: consolidated details of the case 
   * @return customerCaseRecord
  **/

  public Object getCustomerCaseRecord() {
    return customerCaseRecord;
  }

  public void setCustomerCaseRecord(Object customerCaseRecord) {
    this.customerCaseRecord = customerCaseRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: result of the fraud case root-cause analysis 
   * @return customerCaseRootCauseRecord
  **/

  public Object getCustomerCaseRootCauseRecord() {
    return customerCaseRootCauseRecord;
  }

  public void setCustomerCaseRootCauseRecord(Object customerCaseRootCauseRecord) {
    this.customerCaseRootCauseRecord = customerCaseRootCauseRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: target dates for processing/resolution 
   * @return customerCaseResolutionSchedule
  **/

  public String getCustomerCaseResolutionSchedule() {
    return customerCaseResolutionSchedule;
  }

  public void setCustomerCaseResolutionSchedule(String customerCaseResolutionSchedule) {
    this.customerCaseResolutionSchedule = customerCaseResolutionSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Customer Case Status 
   * @return customerCaseStatus
  **/

  public String getCustomerCaseStatus() {
    return customerCaseStatus;
  }

  public void setCustomerCaseStatus(String customerCaseStatus) {
    this.customerCaseStatus = customerCaseStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: processing record for the customer case analysis task 
   * @return customerCaseAnalysisTaskRecord
  **/

  public Object getCustomerCaseAnalysisTaskRecord() {
    return customerCaseAnalysisTaskRecord;
  }

  public void setCustomerCaseAnalysisTaskRecord(Object customerCaseAnalysisTaskRecord) {
    this.customerCaseAnalysisTaskRecord = customerCaseAnalysisTaskRecord;
  }


}

