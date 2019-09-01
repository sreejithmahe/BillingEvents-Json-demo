/**
 * 
 */
package org.rbs.nordisk.invoice.controller;

import static org.junit.Assert.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.rbs.nordisk.invoice.dao.BillingEventDFF;
import org.rbs.nordisk.invoice.dao.Invoice;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

/**
 * @author sreejith.kizhakkayil
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class InvoiceControllerTest {

	@LocalServerPort
    int randomServerPort;
	/**
	 * @throws java.lang.Exception
	 */
	///////@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	//////@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link org.rbs.nordisk.invoice.controller.InvoiceController#getAllInvoice()}.
	 * @throws URISyntaxException 
	 */
	@Test
	public void testGetAllInvoice() throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
		final String baseUrl = "http://localhost:" + randomServerPort + "/invoices";
	    URI uri = new URI(baseUrl);
	    ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
	    Assert.assertEquals(200, result.getStatusCodeValue());
	    Assert.assertEquals(true, result.getBody().contains("767393937"));
	}
	
	/**
	 * Test method for {@link org.rbs.nordisk.invoice.controller.InvoiceController#getInvoice(java.lang.String)}.
	 */
	//////@Test
	public void testGetInvoice() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.rbs.nordisk.invoice.controller.InvoiceController#addInvoice(org.rbs.nordisk.invoice.dao.Invoice)}.
	 */
	///////@Test
	public void testAddInvoice() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.rbs.nordisk.invoice.controller.InvoiceController#updateInvoice(org.rbs.nordisk.invoice.dao.Invoice, java.lang.String)}.
	 */
	//////@Test
	public void testUpdateInvoice() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.rbs.nordisk.invoice.controller.InvoiceController#deleteInvoice(org.rbs.nordisk.invoice.dao.Invoice, java.lang.String)}.
	 */
	///////@Test
	public void testDeleteInvoice() {
		fail("Not yet implemented");
	}

}
