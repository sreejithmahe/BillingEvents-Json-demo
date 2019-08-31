/**
 * 
 */
package org.rbs.nordisk.invoice.dao;

import java.util.Date;
import java.util.List;

/**
 * @author sreejith.kizhakkayil
 *
 */
public class Invoice {
    private String SourceName;
    private String SourceReference;
    private String ContractNumber;
    private String ContractLineNumber;
    private String EventTypeName;
    private String EventDescription;
    private String CompletionDate;
    private String BillTrnsCurrency;
    private int BillTransAmount;
    private List<BillingEventDFF> billingEventDFF;

/**
 * 
 */
public Invoice() {
    }





/**
 * @param sourceName
 * @param sourceReference
 * @param contractNumber
 * @param contractLineNumber
 * @param eventTypeName
 * @param eventDescription
 * @param completionDate
 * @param billTrnsCurrency
 * @param billTransAmount
 * @param billingEventDFF
 */
public Invoice(String sourceName, String sourceReference, String contractNumber, String contractLineNumber,
String eventTypeName, String eventDescription, String completionDate, String billTrnsCurrency,
int billTransAmount, List<BillingEventDFF> billingEventDFF) {
super();
this.SourceName = sourceName;
this.SourceReference = sourceReference;
this.ContractNumber = contractNumber;
this.ContractLineNumber = contractLineNumber;
this.EventTypeName = eventTypeName;
this.EventDescription = eventDescription;
this.CompletionDate = completionDate;
this.BillTrnsCurrency = billTrnsCurrency;
this.BillTransAmount = billTransAmount;
this.billingEventDFF = billingEventDFF;
}





/**
 * @return the sourceName
 */
public String getSourceName() {
return SourceName;
}


/**
 * @param sourceName the sourceName to set
 */
public void setSourceName(String sourceName) {
SourceName = sourceName;
}


/**
 * @return the sourceReference
 */
public String getSourceReference() {
return SourceReference;
}


/**
 * @param sourceReference the sourceReference to set
 */
public void setSourceReference(String sourceReference) {
SourceReference = sourceReference;
}


/**
 * @return the contractNumber
 */
public String getContractNumber() {
return ContractNumber;
}


/**
 * @param contractNumber the contractNumber to set
 */
public void setContractNumber(String contractNumber) {
ContractNumber = contractNumber;
}


/**
 * @return the contractLineNumber
 */
public String getContractLineNumber() {
return ContractLineNumber;
}


/**
 * @param contractLineNumber the contractLineNumber to set
 */
public void setContractLineNumber(String contractLineNumber) {
ContractLineNumber = contractLineNumber;
}


/**
 * @return the eventTypeName
 */
public String getEventTypeName() {
return EventTypeName;
}


/**
 * @param eventTypeName the eventTypeName to set
 */
public void setEventTypeName(String eventTypeName) {
EventTypeName = eventTypeName;
}


/**
 * @return the eventDescription
 */
public String getEventDescription() {
return EventDescription;
}


/**
 * @param eventDescription the eventDescription to set
 */
public void setEventDescription(String eventDescription) {
EventDescription = eventDescription;
}


/**
 * @return the completionDate
 */
public String getCompletionDate() {
return CompletionDate;
}


/**
 * @param completionDate the completionDate to set
 */
public void setCompletionDate(String completionDate) {
CompletionDate = completionDate;
}


/**
 * @return the billTrnsCurrency
 */
public String getBillTrnsCurrency() {
return BillTrnsCurrency;
}


/**
 * @param billTrnsCurrency the billTrnsCurrency to set
 */
public void setBillTrnsCurrency(String billTrnsCurrency) {
BillTrnsCurrency = billTrnsCurrency;
}


/**
 * @return the billTransAmount
 */
public int getBillTransAmount() {
return BillTransAmount;
}


/**
 * @param billTransAmount the billTransAmount to set
 */
public void setBillTransAmount(int billTransAmount) {
BillTransAmount = billTransAmount;
}


/**
 * @return the billingEventDFF
 */
public List<BillingEventDFF> getBillingEventDFF() {
	return billingEventDFF;
}

/**
 * @param billingEventDFF the billingEventDFF to set
 */
public void setBillingEventDFF(List<BillingEventDFF> billingEventDFF) {
	this.billingEventDFF = billingEventDFF;
}





@Override
public String toString() {
	return "Invoice [SourceName=" + SourceName + ", SourceReference=" + SourceReference + ", ContractNumber="
			+ ContractNumber + ", ContractLineNumber=" + ContractLineNumber + ", EventTypeName=" + EventTypeName
			+ ", EventDescription=" + EventDescription + ", CompletionDate=" + CompletionDate + ", BillTrnsCurrency="
			+ BillTrnsCurrency + ", BillTransAmount=" + BillTransAmount + ", billingEventDFF=" + billingEventDFF + "]";
}

}
