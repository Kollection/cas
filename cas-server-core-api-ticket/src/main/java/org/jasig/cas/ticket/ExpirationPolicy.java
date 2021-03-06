package org.jasig.cas.ticket;

import java.io.Serializable;

/**
 * Strategy that determines if the ticket is expired. Implementations of the
 * Expiration Policy define their own rules on what they consider an expired
 * Ticket to be.
 *
 * @author Scott Battaglia
 *
 * <p>
 * This is a published and supported CAS Server 3 API.
 * </p>
 * @see org.jasig.cas.ticket.Ticket
 * @since 3.0.0
 */
public interface ExpirationPolicy extends Serializable {

    /**
     * Method to determine if a Ticket has expired or not, based on the policy.
     *
     * @param ticketState The snapshot of the current ticket state
     * @return true if the ticket is expired, false otherwise.
     */
    boolean isExpired(TicketState ticketState);

    /**
     * Describes the time duration where this policy should consider the item alive.
     * Once this time passes, the item is considered expired and dead.
     * @return alive time in seconds. A zero value indicates the time duration
     * is not supported or is inactive.
     */
    Long getTimeToLive();

    /**
     * Describes the idle time duration for the item.
     *
     * @return idle time in seconds. A zero value indicates the time duration
     * is not supported or is inactive.
     */
    Long getTimeToIdle();
}
