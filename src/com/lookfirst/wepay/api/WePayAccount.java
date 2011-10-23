package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * https://stage.wepay.com/developer/reference/account
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class WePayAccount extends AccountUri {

	/** The name of the account. */
	private String name;
	/** The account description. */
	private String description;
	/** The unique reference ID of the account (this is set by the application in the /account/create or /account/modify call). */
	private String referenceId;
	/** The maximum amount in dollars (including fees) that you can charge for payments to this account. */
	private String paymentLimit;
}