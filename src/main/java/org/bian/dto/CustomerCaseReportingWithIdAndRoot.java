package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerCaseReportingWithIdAndRoot
 */
public class CustomerCaseReportingWithIdAndRoot   {
  private String customerCaseReportingTaskReference = null;

  private String customerCaseReference = null;

  private String customerCaseType = null;

  private String productInstanceReference = null;

  private String customerReference = null;

  private String customerAgreementReference = null;

  private String customerAgreement = null;

  private Object customerCaseRootCauseRecord = null;

  private Object customerCaseDeterminationRecord = null;

  private Object customerCaseResolutionRecord = null;

  private String correspondenceReference = null;

  private String documentReference = null;

  private String employeeBusinessUnitReference = null;

  private String paymentOrderReference = null;

  private Object customerCaseRecord = null;

  private String customerCaseResolutionSchedule = null;

  private String customerCaseStatus = null;

  private Object customerCaseReportingTaskRecord = null;

  private String customerCaseReportingRecordReference = null;

  private Object customerCaseReportingRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: refers to the customer case reporting task 
   * @return customerCaseReportingTaskReference
  **/

  public String getCustomerCaseReportingTaskReference() {
    return customerCaseReportingTaskReference;
  }

  public void setCustomerCaseReportingTaskReference(String customerCaseReportingTaskReference) {
    this.customerCaseReportingTaskReference = customerCaseReportingTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: refers to the in-force customer master agreement 
   * @return customerAgreementReference
  **/

  public String getCustomerAgreementReference() {
    return customerAgreementReference;
  }

  public void setCustomerAgreementReference(String customerAgreementReference) {
    this.customerAgreementReference = customerAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: accessed to determine resolution approach 
   * @return customerAgreement
  **/

  public String getCustomerAgreement() {
    return customerAgreement;
  }

  public void setCustomerAgreement(String customerAgreement) {
    this.customerAgreement = customerAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Customer Case RootCause Record 
   * @return customerCaseRootCauseRecord
  **/

  public Object getCustomerCaseRootCauseRecord() {
    return customerCaseRootCauseRecord;
  }

  public void setCustomerCaseRootCauseRecord(Object customerCaseRootCauseRecord) {
    this.customerCaseRootCauseRecord = customerCaseRootCauseRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Customer Case Determination Record 
   * @return customerCaseDeterminationRecord
  **/

  public Object getCustomerCaseDeterminationRecord() {
    return customerCaseDeterminationRecord;
  }

  public void setCustomerCaseDeterminationRecord(Object customerCaseDeterminationRecord) {
    this.customerCaseDeterminationRecord = customerCaseDeterminationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: details resolution actions and execution responsibilities 
   * @return customerCaseResolutionRecord
  **/

  public Object getCustomerCaseResolutionRecord() {
    return customerCaseResolutionRecord;
  }

  public void setCustomerCaseResolutionRecord(Object customerCaseResolutionRecord) {
    this.customerCaseResolutionRecord = customerCaseResolutionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: confirmation messages sent to involved parties 
   * @return correspondenceReference
  **/

  public String getCorrespondenceReference() {
    return correspondenceReference;
  }

  public void setCorrespondenceReference(String correspondenceReference) {
    this.correspondenceReference = correspondenceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: case related documents catalogued 
   * @return documentReference
  **/

  public String getDocumentReference() {
    return documentReference;
  }

  public void setDocumentReference(String documentReference) {
    this.documentReference = documentReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: unit responsible for the customer case resolution actions 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: if financial adjustments are required to resolve the customer case 
   * @return paymentOrderReference
  **/

  public String getPaymentOrderReference() {
    return paymentOrderReference;
  }

  public void setPaymentOrderReference(String paymentOrderReference) {
    this.paymentOrderReference = paymentOrderReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: processing record of the customer case reporting task 
   * @return customerCaseReportingTaskRecord
  **/

  public Object getCustomerCaseReportingTaskRecord() {
    return customerCaseReportingTaskRecord;
  }

  public void setCustomerCaseReportingTaskRecord(Object customerCaseReportingTaskRecord) {
    this.customerCaseReportingTaskRecord = customerCaseReportingTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: reference to the customer case report 
   * @return customerCaseReportingRecordReference
  **/

  public String getCustomerCaseReportingRecordReference() {
    return customerCaseReportingRecordReference;
  }

  public void setCustomerCaseReportingRecordReference(String customerCaseReportingRecordReference) {
    this.customerCaseReportingRecordReference = customerCaseReportingRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: the customer case report consolidating all attributes/details 
   * @return customerCaseReportingRecord
  **/

  public Object getCustomerCaseReportingRecord() {
    return customerCaseReportingRecord;
  }

  public void setCustomerCaseReportingRecord(Object customerCaseReportingRecord) {
    this.customerCaseReportingRecord = customerCaseReportingRecord;
  }


}

