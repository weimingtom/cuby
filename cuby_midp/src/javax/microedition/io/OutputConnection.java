package javax.microedition.io;

import java.io.*;

/**
 * This interface defines the capabilities that an output 
 * stream connection must have.
 *
 * @version 12/17/01 (CLDC 1.1)
 * @since   CLDC 1.0
 */
public interface OutputConnection extends Connection {

    /**
     * Open and return an output stream for a connection.
     *
     * @return                 An output stream
     * @exception IOException  If an I/O error occurs
     */
    public OutputStream openOutputStream() throws IOException;

    /**
     * Open and return a data output stream for a connection.
     *
     * @return                 An output stream
     * @exception IOException  If an I/O error occurs
     */
    public DataOutputStream openDataOutputStream() throws IOException;
}
