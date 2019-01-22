package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerCaseDeterminationWithIdAndRoot
 */
public class CustomerCaseDeterminationWithIdAndRoot   {
  private String customerCaseDeterminationTaskReference = null;

  private String customerCaseReference = null;

  private String customerCaseType = null;

  private String productInstanceReference = null;

  private String customerReference = null;

  private String customerAgreementReference = null;

  private String customerAgreement = null;

  private Object customerCaseRootCauseRecord = null;

  private Object customerCaseDeterminationRecord = null;

  private Object customerCaseRecord = null;

  private String customerCaseResolutionSchedule = null;

  private String customerCaseStatus = null;

  private Object customerCaseDeterminationTaskRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: refers to the customer case determination task 
   * @return customerCaseDeterminationTaskReference
  **/

  public String getCustomerCaseDeterminationTaskReference() {
    return customerCaseDeterminationTaskReference;
  }

  public void setCustomerCaseDeterminationTaskReference(String customerCaseDeterminationTaskReference) {
    this.customerCaseDeterminationTaskReference = customerCaseDeterminationTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: rules and guidelines are applied to determine customer case resolution 
   * @return customerCaseDeterminationRecord
  **/

  public Object getCustomerCaseDeterminationRecord() {
    return customerCaseDeterminationRecord;
  }

  public void setCustomerCaseDeterminationRecord(Object customerCaseDeterminationRecord) {
    this.customerCaseDeterminationRecord = customerCaseDeterminationRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: processing record of the customer case determination task 
   * @return customerCaseDeterminationTaskRecord
  **/

  public Object getCustomerCaseDeterminationTaskRecord() {
    return customerCaseDeterminationTaskRecord;
  }

  public void setCustomerCaseDeterminationTaskRecord(Object customerCaseDeterminationTaskRecord) {
    this.customerCaseDeterminationTaskRecord = customerCaseDeterminationTaskRecord;
  }


}

