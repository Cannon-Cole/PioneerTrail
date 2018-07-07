/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.exceptions;

/**
 *
 * @author Cole
 */
public class ActorControlException extends Exception{

    public ActorControlException() {
    }

    public ActorControlException(String message) {
        super(message);
    }

    public ActorControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public ActorControlException(Throwable cause) {
        super(cause);
    }

    public ActorControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
