/**
 * 
 */
package org.rbs.nordisk.invoice.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.rbs.nordisk.invoice.dao.BillingEventDFF;
import org.rbs.nordisk.invoice.dao.Invoice;
import org.springframework.stereotype.Service;

/**
 * @author sreejith.kizhakkayil
 *
 */
@Service
public class InvoiceService {
    DateTimeFormatter dtPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDateTime now = LocalDateTime.now();
    final String CompletionDate = now.format(dtPattern);
private List<Invoice> invoices = new ArrayList<Invoice>(Arrays.asList( 
             new Invoice("BS12CUS01",
             "000000001",
             "8898688889",
             "(84)(3737389)",
             "EvN097_76",
             "767393937",
             CompletionDate,
             "USD",
             17837,
             new ArrayList<BillingEventDFF>(Arrays.asList( 
                     new BillingEventDFF(001,10872)))
               ) ,
             new Invoice("BS12CUS02",
                     "000000002",
                     "8898688889",
                     "(84)(3737389)",
                     "EvN097_76",
                     "767393937",
                     CompletionDate,
                     "USD",
                     12837,
                     new ArrayList<BillingEventDFF>(Arrays.asList( 
                             new BillingEventDFF(002,85752)))
                ),
             new Invoice("BS12CUS03",
                     "000000003",
                     "8898685889",
                     "(84)(3737389)",
                     "EvN097_76",
                     "767393937",
                     CompletionDate,
                     "USD",
                     19837,
                     new ArrayList<BillingEventDFF>(Arrays.asList( 
                             new BillingEventDFF(003,73638)))
                 )
             ));
/* 
 * 
 */
public List<Invoice> getAllInvoices() {
     return invoices;
 }
 /*
  * 
  */
 public Invoice getInvoice(String SourceReference) {
     return invoices.stream().filter(i -> i.getSourceReference()
    .equalsIgnoreCase(SourceReference)).findFirst().get();
 }
 /*
  * 
  */
public void addInvoice(Invoice invoice) {
  invoices.add(invoice);
}
public void updateInvoice(String sourceReference, Invoice invoice) {
  for(int i=0; i < invoices.size(); i++) {
     Invoice invo = invoices.get(i);
       if(invo.getSourceReference().equalsIgnoreCase(sourceReference)) {
           invoices.set(i, invoice);
           return;
       }
  }

}
public void deleteInvoice(String sourceReference, Invoice invoice) {
   invoices.removeIf(i -> i.getSourceReference().
             equalsIgnoreCase(sourceReference));
}
}
