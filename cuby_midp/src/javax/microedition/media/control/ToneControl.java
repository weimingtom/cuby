
package javax.microedition.media.control;
import javax.microedition.media.MediaException;

/**
 * This class is defined by the JSR-118 specification
 * <em>MIDP 2,
 * Version 2.1.</em>
 */
// JAVADOC COMMENT ELIDED
public interface ToneControl extends javax.microedition.media.Control {

    /** 
     * The VERSION attribute tag.
     * <p>
     * Value -2 is assigned to <code>VERSION</code>.
     */
    byte VERSION = -2;
    
    /** 
     * The TEMPO event tag.
     * <p>
     * Value -3 is assigned to <code>TEMPO</code>.
     */
    byte TEMPO = -3;
    
    /** 
     * The RESOLUTION event tag.
     * <p>
     * Value -4 is assigned to <code>RESOLUTION</code>.
     */
    byte RESOLUTION = -4;
    
    /** 
     * Defines a starting point for a block.
     * <p>
     * Value -5 is assigned to <code>BLOCK_START</code>.
     */
    byte BLOCK_START = -5;

    /** 
     * Defines an ending point for a block.
     * <p>
     * Value -6 is assigned to <code>BLOCK_END</code>.
     */
    byte BLOCK_END = -6;

    /** 
     * Play a defined block.
     * <p>
     * Value -7 is assigned to <code>PLAY_BLOCK</code>.
     */
    byte PLAY_BLOCK = -7; 

    /** 
     * The SET_VOLUME event tag.
     * <p>
     * Value -8 is assigned to <code>SET_VOLUME</code>.
     */
    byte SET_VOLUME = -8;
    
    /** 
     * The REPEAT event tag.
     * <p>
     * Value -9 is assigned to <code>REPEAT</code>.
     */
    byte REPEAT = -9;
    
    /**
     * Middle C.
     * <p>
     * Value 60 is assigned to <code>C4</code>.
     */
    byte C4 = 60;

    /**
     * Silence.
     * <p>
     * Value -1 is assigned to <code>SILENCE</code>.
     */
    byte SILENCE = -1;

    /**
     * Sets the tone sequence.<p>
     * 
     * @param sequence The sequence to set.
     * @exception IllegalArgumentException Thrown if the sequence is 
     * <code>null</code> or invalid.
     * @exception IllegalStateException Thrown if the <code>Player</code>
     * that this control belongs to is in the <i>PREFETCHED</i> or
     * <i>STARTED</i> state.
     */
    void setSequence(byte[] sequence);
}
