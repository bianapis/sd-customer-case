package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerCaseProceduresWithIdAndRoot
 */
public class CustomerCaseProceduresWithIdAndRoot   {
  private String customerCaseProcedureAmendmentRequestReference = null;

  private String customerCaseReference = null;

  private String customerCaseType = null;

  private String productInstanceReference = null;

  private Object customerCaseRecord = null;

  private String employeeBusinessUnitReference = null;

  private Object customerCaseProcedureAmendmentRequestRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: refers to the customer case procedure amendment request task 
   * @return customerCaseProcedureAmendmentRequestReference
  **/

  public String getCustomerCaseProcedureAmendmentRequestReference() {
    return customerCaseProcedureAmendmentRequestReference;
  }

  public void setCustomerCaseProcedureAmendmentRequestReference(String customerCaseProcedureAmendmentRequestReference) {
    this.customerCaseProcedureAmendmentRequestReference = customerCaseProcedureAmendmentRequestReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: unit responsible for considering procedural updates 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: defines recommended procedural changes to reduce exposure 
   * @return customerCaseProcedureAmendmentRequestRecord
  **/

  public Object getCustomerCaseProcedureAmendmentRequestRecord() {
    return customerCaseProcedureAmendmentRequestRecord;
  }

  public void setCustomerCaseProcedureAmendmentRequestRecord(Object customerCaseProcedureAmendmentRequestRecord) {
    this.customerCaseProcedureAmendmentRequestRecord = customerCaseProcedureAmendmentRequestRecord;
  }


}

