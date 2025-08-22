
        /* Generated Code Do Not Modify */
        package org.allbinary.media.audio.music




        import java.lang.Object        
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.media.Player
import javax.microedition.media.PlayerListener
import org.allbinary.AvianUtil
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.media.audio.NoSound
import org.allbinary.media.audio.PlayerStateUtil
import org.allbinary.media.audio.Sound
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings
import org.allbinary.time.GameTickTimeDelayHelper
import org.allbinary.time.GameTickTimeDelayHelperFactory
import org.allbinary.time.TimeDelayHelper
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListUtil

open public class MusicManager
            : Object
         {
        

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val commonSeps: CommonSeps = CommonSeps.getInstance()!!

    private val basicArrayListUtil: BasicArrayListUtil = BasicArrayListUtil.getInstance()!!

    private val gameTickTimeDelayHelper: GameTickTimeDelayHelper = GameTickTimeDelayHelperFactory.getInstance()!!

    private val playerStateUtil: PlayerStateUtil = PlayerStateUtil.getInstance()!!

    private val timeDelayHelper: TimeDelayHelper = TimeDelayHelper(0)

    private val playerListener: PlayerListener = object: PlayerListener()
                                {
                                
open override fun playerUpdate(player: Player, event: String, eventData: Any)
        //nullable = true from not(false or (false and false)) = true
{

                    var player = player


                    var event = event


                    var eventData = eventData
PreLogUtil.put(event, this, commonStrings!!.PROCESS)

    
                        if(event == PlayerListener.END_OF_MEDIA || event == PlayerListener.STOPPED || event == PlayerListener.CLOSED)
                        
                                    {
                                    reset()

                                    }
                                
}

                                }
                            

    private val PLAY: String = "Play "

    private val SONG: String = " for: "

    private val NEXT_SONG: String = "Next Song: "

    private val STOPPING: String = "Stopping Current Song: "

    private val ENDING: String = "Ending Current Song: "

    private val WAITING_FOR_MEDIA_TO_END: String = "Waiting for media to end"

    private val ALREADY_PLAYING: String = "Already Playing: "

    private val ALREADY_ENDED: String = "Last Song already ended: "

    private val songList: BasicArrayList

    private var currentSongSound: Sound = NoSound.getInstance()!!

    private var nextSongSound: Sound = NoSound.getInstance()!!

    private var reset: Boolean= false

    private var noDuration: Boolean= false

    private var stopped: Boolean = true
public constructor        (musicServiceClass: KClass<*>, songList: BasicArrayList)
            : super()
        {

                    var musicServiceClass = musicServiceClass


                    var songList = songList
this.songList= songList
}


open fun startNewSong()
        //nullable = true from not(false or (false and true)) = true
{
    
                        if(this.nextSongSound == NoSound.getInstance())
                        
                                    {
                                    
    var randomSongSound: Sound = basicArrayListUtil!!.getRandom(this.songList) as Sound

this.nextSong(randomSongSound, 0, 0)

                                    }
                                
this.process()
}


open fun nextSong(nextSongSound: Sound, leftVolume: Int, rightVolume: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var nextSongSound = nextSongSound


                    var leftVolume = leftVolume


                    var rightVolume = rightVolume
PreLogUtil.put(StringMaker().
                            append(NEXT_SONG)!!.append(nextSongSound!!.getResource())!!.toString(), this, commonStrings!!.PROCESS)
this.nextSongSound= nextSongSound
this.reset()
this.stopped= false
}


open fun reset()
        //nullable = true from not(false or (false and true)) = true
{this.reset= true
}


open fun process()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            
    
                        if(stopped)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

    
                        if(this.songList!!.size() == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

    
                        if((this.timeDelayHelper!!.isTime(gameTickTimeDelayHelper!!.startTime) && !this.noDuration) || this.reset)
                        
                                    {
                                    this.reset= false
this.noDuration= false

    var endingCurrentSongSound: Sound = this.currentSongSound


    var nextSongSound: Sound = this.nextSongSound

this.nextSongSound= NoSound.getInstance()

    
                        if(nextSongSound == NoSound.getInstance())
                        
                                    {
                                    this.currentSongSound= BasicArrayListUtil.getInstance()!!.getRandom(this.songList) as Sound

                                    }
                                
                        else {
                            this.currentSongSound= nextSongSound

                        }
                            

    var startingCurrentSongSound: Sound = this.currentSongSound


    var duration: Long = this.currentSongSound!!.getDuration()!!

this.timeDelayHelper!!.delay= duration.toInt()

    
                        if(duration <= 0)
                        
                                    {
                                    
    var NO_DURATION_FOR: String = "No Duration for: "

PreLogUtil.put(StringMaker().
                            append(NO_DURATION_FOR)!!.append(this.currentSongSound!!.getResource())!!.toString(), this, commonStrings!!.PROCESS)
this.currentSongSound!!.getPlayerP()!!.addPlayerListener(playerListener)
this.noDuration= true

                                    }
                                

    
                        if(endingCurrentSongSound != NoSound.getInstance())
                        
                                    {
                                    
    
                        if(endingCurrentSongSound == startingCurrentSongSound && endingCurrentSongSound!!.getPlayerP()!!.getState() == Player.STARTED)
                        
                                    {
                                    PreLogUtil.put(StringMaker().
                            append(ALREADY_PLAYING)!!.append(endingCurrentSongSound!!.getResource())!!.toString(), this, commonStrings!!.PROCESS)
PreLogUtil.put(StringMaker().
                            append(STOPPING)!!.append(endingCurrentSongSound!!.getResource())!!.append(SONG)!!.append(duration)!!.toString(), this, commonStrings!!.PROCESS)
endingCurrentSongSound!!.getPlayerP()!!.stop()
this.waitForStateChange(endingCurrentSongSound, startingCurrentSongSound)

                                    }
                                
                        else {
                            
    
                        if(endingCurrentSongSound!!.getPlayerP()!!.getState() == Player.STARTED)
                        
                                    {
                                    PreLogUtil.put(StringMaker().
                            append(STOPPING)!!.append(endingCurrentSongSound!!.getResource())!!.append(SONG)!!.append(duration)!!.toString(), this, commonStrings!!.PROCESS)
endingCurrentSongSound!!.getPlayerP()!!.stop()
this.waitForStateChange(endingCurrentSongSound, startingCurrentSongSound)

                                    }
                                
                        else {
                            PreLogUtil.put(StringMaker().
                            append(ALREADY_ENDED)!!.append(PLAY)!!.append(startingCurrentSongSound!!.getResource())!!.toString(), this, commonStrings!!.PROCESS)

    
                        if(AvianUtil.isAvian())
                        
                                    {
                                    endingCurrentSongSound!!.getPlayerP()!!.stop()
startingCurrentSongSound!!.getPlayerP()!!.stop()

                                    }
                                
startingCurrentSongSound!!.getPlayerP()!!.start()

                        }
                            

                        }
                            

                                    }
                                
                        else {
                            PreLogUtil.put(StringMaker().
                            append(PLAY)!!.append(this.currentSongSound!!.getResource())!!.append(SONG)!!.append(duration)!!.toString(), this, commonStrings!!.PROCESS)
this.currentSongSound!!.getPlayerP()!!.start()

                        }
                            

                                    }
                                
} catch(e: Exception)
            {
    var resource: String = StringUtil.getInstance()!!.EMPTY_STRING


    
                        if(currentSongSound != NoSound.getInstance())
                        
                                    {
                                    resource= currentSongSound!!.getResource()

                                    }
                                
PreLogUtil.put(commonStrings!!.EXCEPTION_LABEL +resource, this, commonStrings!!.PROCESS, e)
}

}


                @Throws(Exception::class)
            
open fun waitForStateChange(endingCurrentSongSound: Sound, startingCurrentSongSound: Sound)
        //nullable = true from not(false or (false and false)) = true
{

                    var endingCurrentSongSound = endingCurrentSongSound


                    var startingCurrentSongSound = startingCurrentSongSound

        while(endingCurrentSongSound!!.getPlayerP()!!.getState() == Player.STARTED)
        {PreLogUtil.put(WAITING_FOR_MEDIA_TO_END, this, commonStrings!!.PROCESS)
Thread.sleep(100)
}

PreLogUtil.put(StringMaker().
                            append(playerStateUtil!!.convert(endingCurrentSongSound!!.getPlayerP()!!.getState()))!!.append(commonSeps!!.SPACE)!!.append(PLAY)!!.append(startingCurrentSongSound!!.getResource())!!.toString(), this, commonStrings!!.PROCESS)
startingCurrentSongSound!!.getPlayerP()!!.start()
}


                @Throws(Exception::class)
            
open fun stop()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            
    var currentSongSound: Sound = this.currentSongSound


    
                        if(currentSongSound != NoSound.getInstance())
                        
                                    {
                                    stopped= true
PreLogUtil.put(StringMaker().
                            append(ENDING)!!.append(currentSongSound!!.getResource())!!.toString(), this, commonStrings!!.PROCESS)
currentSongSound!!.getPlayerP()!!.stop()

                                    }
                                
this.timeDelayHelper!!.setStartTime(0)
PreLogUtil.put(StringMaker().
                            append(commonStrings!!.END)!!.append(StringUtil.getInstance()!!.toString(currentSongSound))!!.toString(), this, commonStrings!!.END)
} catch(e: Exception)
            {
    var resource: String = StringUtil.getInstance()!!.EMPTY_STRING


    
                        if(currentSongSound != NoSound.getInstance())
                        
                                    {
                                    resource= currentSongSound!!.getResource()

                                    }
                                
PreLogUtil.put(commonStrings!!.EXCEPTION_LABEL +resource, this, commonStrings!!.END, e)
}

}


}
                
            

