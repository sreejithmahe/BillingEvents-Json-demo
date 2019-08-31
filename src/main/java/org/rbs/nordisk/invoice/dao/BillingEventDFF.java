/**
 * 
 */
package org.rbs.nordisk.invoice.dao;

/**
 * @author sreejith.kizhakkayil
 *
 */
public class BillingEventDFF {


private int id;
private int value;

/**
 * 
 */
public BillingEventDFF() {


}

/**
 * @return the id
 */
public int getId() {
	return id;
}

/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}

/**
 * @return the value
 */
public int getValue() {
	return value;
}

/**
 * @param value the value to set
 */
public void setValue(int value) {
	this.value = value;
}

/**
 * @param id
 * @param value
 */
public BillingEventDFF(int id, int value) {
	super();
	this.id = id;
	this.value = value;
}

@Override
public String toString() {
	return "BillingEventDFF [id=" + id + ", value=" + value + "]";
}

}
