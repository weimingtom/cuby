
package javax.microedition.lcdui;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * A <code>DateField</code> is an editable component for presenting
 * date and time (calendar)
 * information that may be placed into a <code>Form</code>. Value for
 * this field can be
 * initially set or left unset. If value is not set then the UI for the field
 * shows this clearly. The field value for &quot;not initialized
 * state&quot; is not valid
 * value and <code>getDate()</code> for this state returns <code>null</code>.
 * <p>
 * Instance of a <code>DateField</code> can be configured to accept
 * date or time information
 * or both of them. This input mode configuration is done by
 * <code>DATE</code>, <code>TIME</code> or
 * <code>DATE_TIME</code> static fields of this
 * class. <code>DATE</code> input mode allows to set only
 * date information and <code>TIME</code> only time information
 * (hours, minutes). <code>DATE_TIME</code>
 * allows to set both clock time and date values.
 * <p>
 * In <code>TIME</code> input mode the date components of
 * <code>Date</code> object
 * must be set to the &quot;zero epoch&quot; value of January 1, 1970.
 * <p>
 * Calendar calculations in this field are based on default locale and defined
 * time zone. Because of the calculations and different input modes date object
 * may not contain same millisecond value when set to this field and get back
 * from this field.
 * @since MIDP 1.0
 */
public class DateField extends Item {

    /**
     * Input mode for date information (day, month, year). With this mode this
     * <code>DateField</code> presents and allows only to modify date
     * value. The time
     * information of date object is ignored.
     *
     * <P>Value <code>1</code> is assigned to <code>DATE</code>.</P>
     */
    public static final int DATE = 1;

    /**
     * Input mode for time information (hours and minutes). With this mode this
     * <code>DateField</code> presents and allows only to modify
     * time. The date components
     * should be set to the &quot;zero epoch&quot; value of January 1, 1970 and
     * should not be accessed.
     *
     * <P>Value <code>2</code> is assigned to <code>TIME</code>.</P>
     */
    public static final int TIME = 2;

    /**
     * Input mode for date (day, month, year) and time (minutes, hours)
     * information. With this mode this <code>DateField</code>
     * presents and allows to modify
     * both time and date information.
     *
     * <P>Value <code>3</code> is assigned to <code>DATE_TIME</code>.</P>
     */
    public static final int DATE_TIME = 3;

    /**
     * Creates a <code>DateField</code> object with the specified
     * label and mode. This call
     * is identical to <code>DateField(label, mode, null)</code>.
     *
     * @param label item label
     * @param mode the input mode, one of <code>DATE</code>, <code>TIME</code>
     * or <code>DATE_TIME</code>
     * @throws IllegalArgumentException if the input <code>mode's</code>
     * value is invalid
     */
    public DateField(String label, int mode) {
        this(label, mode, null);
    }

    /**
     * Creates a date field in which calendar calculations are based
     * on specific
     * <code>TimeZone</code> object and the default calendaring system for the
     * current locale.
     * The value of the <code>DateField</code> is initially in the
     * &quot;uninitialized&quot; state.
     * If <code>timeZone</code> is <code>null</code>, the system's
     * default time zone is used.
     *
     * @param label item label
     * @param mode the input mode, one of <code>DATE</code>, <code>TIME</code>
     * or <code>DATE_TIME</code>
     * @param timeZone a specific time zone, or <code>null</code> for the
     * default time zone
     * @throws IllegalArgumentException if the input <code>mode's</code> value
     * is invalid
     */
    public DateField(String label, int mode, java.util.TimeZone timeZone) {

   
    }

    /**
     * Returns date value of this field. Returned value is
     * <code>null</code> if field
     * value is
     * not initialized. The date object is constructed according the rules of
     * locale specific calendaring system and defined time zone.
     *
     * In <code>TIME</code> mode field the date components are set to
     * the &quot;zero
     * epoch&quot; value of January 1, 1970. If a date object that presents 
     * time beyond one day from this &quot;zero epoch&quot; then this field
     * is in &quot;not
     * initialized&quot; state and this method returns <code>null</code>.
     *
     * In <code>DATE</code> mode field the time component of the calendar is 
     * set to zero when constructing the date object.
     *
     * @return date object representing time or date depending on input mode
     * @see #setDate
     */
    public java.util.Date getDate() {
     
    	return null;
    }

    /**
     * Sets a new value for this field. <code>null</code> can be
     * passed to set the field
     * state to &quot;not initialized&quot; state. The input mode of
     * this field defines
     * what components of passed <code>Date</code> object is used.<p>
     *
     * In <code>TIME</code> input mode the date components must be set
     * to the &quot;zero
     * epoch&quot; value of January 1, 1970. If a date object that presents 
     * time
     * beyond one day then this field is in &quot;not initialized&quot; state.
     * In <code>TIME</code> input mode the date component of
     * <code>Date</code> object is ignored and time
     * component is used to precision of minutes.<p>
     *
     * In <code>DATE</code> input mode the time component of
     * <code>Date</code> object is ignored.<p>
     *
     * In <code>DATE_TIME</code> input mode the date and time
     * component of <code>Date</code> are used but
     * only to precision of minutes.
     *
     * @param date new value for this field
     * @see #getDate
     */
    public void setDate(java.util.Date date) {
       
    }

    /**
     * Gets input mode for this date field. Valid input modes are
     * <code>DATE</code>, <code>TIME</code> and <code>DATE_TIME</code>.
     *
     * @return input mode of this field
     * @see #setInputMode
     */
    public int getInputMode() {

        return 0;
    }

    /**
     * Set input mode for this date field. Valid input modes are
     * <code>DATE</code>, <code>TIME</code> and <code>DATE_TIME</code>.
     *
     * @param mode the input mode, must be one of <code>DATE</code>,
     * <code>TIME</code> or <code>DATE_TIME</code>
     * @throws IllegalArgumentException if an invalid value is specified
     * @see #getInputMode
     */
    public void setInputMode(int mode) {
        if ((mode != DATE) && (mode != TIME) && (mode != DATE_TIME)) {
            throw new IllegalArgumentException("Invalid input mode");
        }

    
    }

   

 

}
