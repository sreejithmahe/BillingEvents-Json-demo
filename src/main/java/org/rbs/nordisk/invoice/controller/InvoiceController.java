/**
 * 
 */
package org.rbs.nordisk.invoice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.rbs.nordisk.invoice.dao.Invoice;
import org.rbs.nordisk.invoice.service.InvoiceService;

/**
 * @author sreejith.kizhakkayil
 *
 */
@RestController
public class InvoiceController {

@Autowired
private InvoiceService invoiceService;

   @RequestMapping("/invoices")
   public List<Invoice> getAllInvoice() {
          return invoiceService.getAllInvoices();
   }
   @RequestMapping("/invoices/sourceRef/{SourceReference}")
   public Invoice getInvoice(@PathVariable String SourceReference) {
     return invoiceService.getInvoice(SourceReference);
   }
   @RequestMapping(method=RequestMethod.POST, value="/invoices")
   public void addInvoice(@RequestBody Invoice invoice) {
    invoiceService.addInvoice(invoice);
   }
   @RequestMapping(method=RequestMethod.PUT, 
      value="/invoices/sourceRef/{SourceReference}")
   public void updateInvoice(@RequestBody Invoice invoice,
       @PathVariable String SourceReference) {
    invoiceService.updateInvoice(SourceReference,invoice);
   }
   @RequestMapping(method=RequestMethod.DELETE, 
      value="/invoices/sourceRef/{SourceReference}")
   public void deleteInvoice(@RequestBody Invoice invoice,
       @PathVariable String SourceReference) {
    invoiceService.deleteInvoice(SourceReference,invoice);
   }
}
