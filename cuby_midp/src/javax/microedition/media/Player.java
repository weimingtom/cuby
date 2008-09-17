
package javax.microedition.media;


import java.io.IOException;



/**
 * This class is defined by the JSR-118 specification
 * <em>MIDP 2,
 * Version 2.0.</em>
 */
// JAVADOC COMMENT ELIDED


public interface Player extends Controllable {

    // JAVADOC COMMENT ELIDED
    static final int UNREALIZED = 100;

    // JAVADOC COMMENT ELIDED
    static final int REALIZED = 200;

    // JAVADOC COMMENT ELIDED
    static final int PREFETCHED = 300;

    // JAVADOC COMMENT ELIDED
    static final int STARTED = 400;

    // JAVADOC COMMENT ELIDED
    static final int CLOSED = 0;

    // JAVADOC COMMENT ELIDED
    static final long TIME_UNKNOWN = -1;
    
    // JAVADOC COMMENT ELIDED
    void realize() throws MediaException;

    // JAVADOC COMMENT ELIDED
    void prefetch() throws MediaException;

    // JAVADOC COMMENT ELIDED
    void start() throws MediaException;

    // JAVADOC COMMENT ELIDED
    void stop() throws MediaException;

    // JAVADOC COMMENT ELIDED
    void deallocate();

    // JAVADOC COMMENT ELIDED
    void close();
    

    // JAVADOC COMMENT ELIDED
    long setMediaTime(long now) throws MediaException;

    // JAVADOC COMMENT ELIDED
    long getMediaTime();

    // JAVADOC COMMENT ELIDED
    int getState();

    // JAVADOC COMMENT ELIDED
    long getDuration();

    // JAVADOC COMMENT ELIDED
    String getContentType();


    // JAVADOC COMMENT ELIDED

    void setLoopCount(int count);

    // JAVADOC COMMENT ELIDED
    void addPlayerListener(PlayerListener playerListener);

    // JAVADOC COMMENT ELIDED
    void removePlayerListener(PlayerListener playerListener);
}
