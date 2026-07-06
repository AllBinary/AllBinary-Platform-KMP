/* Generated Code Do Not Modify */
package javax.microedition.midlet

open public class NullMIDlet : MIDlet {

    companion object {

        val NULL_MIDLET: NullMIDlet = NullMIDlet()
    }

    // Auto Generated
    public constructor() : super() {}

    @Throws(MIDletStateChangeException::class)
    override fun startApp()
        // nullable = true from not(false or (false and true)) = true
    {}

    override fun pauseApp()
        // nullable = true from not(false or (false and true)) = true
    {}

    @Throws(MIDletStateChangeException::class)
    override fun destroyApp(unconditional: Boolean)
        // nullable = true from not(false or (false and false)) = true
    {
        var unconditional = unconditional
    }
}
