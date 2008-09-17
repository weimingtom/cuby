
package javax.microedition.lcdui;

/**
 * A listener type for receiving notification of commands that have been
 * invoked on {@link Item} objects.  An <code>Item</code> can have
 * <code>Commands</code> associated with
 * it.  When such a command is invoked, the application is notified by having
 * the {@link #commandAction commandAction()} method called on the
 * <code>ItemCommandListener</code> that had been set on the
 * <code>Item</code> with a call to
 * {@link Item#setItemCommandListener setItemCommandListener()}.
 *
 */
public interface ItemCommandListener {

    /**
     * Called by the system to indicate that a command has been invoked on a 
     * particular item.
     * 
     * @param c the <code>Command</code> that was invoked
     * @param item the <code>Item</code> on which the command was invoked
     */
    public void commandAction(Command c, Item item);
}
