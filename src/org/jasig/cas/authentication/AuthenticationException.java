/* Copyright 2004 The JA-SIG Collaborative.  All rights reserved.
 * See license distributed with this file and
 * available online at http://www.uportal.org/license.html
 */
package org.jasig.cas.authentication;


/**
 * @author Scott Battaglia
 * @version $Id$
 *
 */
public class AuthenticationException extends Exception {
    private String code;

    private String description;

    /**
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 3906648604830611762L;
    /**
     * 
     */
    public AuthenticationException() {
        super();
    }
    /**
     * @param arg0
     */
    public AuthenticationException(String arg0) {
        super(arg0);
    }
    /**
     * @param arg0
     * @param arg1
     */
    public AuthenticationException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }
    /**
     * @param arg0
     */
    public AuthenticationException(Throwable arg0) {
        super(arg0);
    }
    
    public AuthenticationException(String arg0, String code, String description) {
        super (arg0);
        this.code = code;
        this.description = description;
    }
    
    public AuthenticationException(String arg0, Throwable arg1, String code, String description) {
        super(arg0, arg1);
        this.code = code;
        this.description = description;
    }

    /**
     * @return Returns the code.
     */
    public String getCode() {
        return code;
    }
    /**
     * @return Returns the description.
     */
    public String getDescription() {
        return description;
    }
}
