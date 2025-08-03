
        /* Generated Code Do Not Modify */
        package org.allbinary.media.audio.music



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import android.content.Intent
import org.allbinary.android.AndroidServicesUtil
import org.allbinary.data.resource.ResourceUtil
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.string.StringUtil
import org.allbinary.media.audio.Sound
import org.allbinary.string.CommonStateStrings
import org.allbinary.string.CommonStrings
import org.allbinary.time.GameTickTimeDelayHelper
import org.allbinary.time.GameTickTimeDelayHelperFactory
import org.allbinary.time.TimeDelayHelper
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListUtil

open public class MusicManager
            : Object
         {
        

    private val PLAY: String = "Play "

    private val FOR: String = " for: "

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private val musicStrings: MusicStrings = MusicStrings.getInstance()!!
            

    private val commonStateStrings: CommonStateStrings = CommonStateStrings.getInstance()!!
            

    private val basicArrayListUtil: BasicArrayListUtil = BasicArrayListUtil.getInstance()!!
            

    private val resourceUtil: ResourceUtil = ResourceUtil.getInstance()!!
            

    private val androidServicesUtil: AndroidServicesUtil = AndroidServicesUtil.getInstance()!!
            

    private val gameTickTimeDelayHelper: GameTickTimeDelayHelper = GameTickTimeDelayHelperFactory.getInstance()!!
            

    private val timeDelayHelper: TimeDelayHelper = TimeDelayHelper(0)

    private val timeDelayHelper2: TimeDelayHelper = TimeDelayHelper(1200)

    private val songList: BasicArrayList

    private var currentSongSound: Sound

    private var nextSongSound: Sound

    private var leftVolume: Int = 100

    private var rightVolume: Int = 100

    private val musicServiceClass: KClass<*>

    private val currentIntent: Intent
public constructor        (musicServiceClass: KClass<*>, songList: BasicArrayList)
            : super()
        {

                    var musicServiceClass = musicServiceClass


                    var songList = songList
PreLogUtil.put(commonStateStrings!!.CONTEXT +resourceUtil!!.getContext(), this, commonStrings!!.CONSTRUCTOR)
this.musicServiceClass= musicServiceClass
currentIntent= Intent(resourceUtil!!.getContext(), musicServiceClass)
this.songList= songList
}


open fun nextSong(nextSongSound: Sound, leftVolume: Int, rightVolume: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var nextSongSound = nextSongSound


                    var leftVolume = leftVolume


                    var rightVolume = rightVolume
this.nextSongSound= nextSongSound
this.leftVolume= leftVolume
this.rightVolume= rightVolume
this.reset()
}


open fun reset()
        //nullable = true from not(false or (false and true)) = true
{this.timeDelayHelper!!.delay= 0
}


open fun process()
        //nullable = true from not(false or (false and true)) = true
{
    
                        if(this.songList!!.size() == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

    
                        if(this.timeDelayHelper!!.isTime(gameTickTimeDelayHelper!!.startTime))
                        
                                    {
                                    this.startNewSong()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

    
                        if(timeDelayHelper2!!.isTime(this.gameTickTimeDelayHelper!!.startTime))
                        
                                    {
                                    
    
                        if(androidServicesUtil!!.isServiceRunning(this.musicServiceClass!!.getName()))
                        
                                    {
                                    
                                    }
                                
                        else {
                            this.startNewSong()

                        }
                            

                                    }
                                
}


open fun show()
        //nullable = true from not(false or (false and true)) = true
{



                        for (index in this.songList!!.size()!! downTo 0)


        {
    var sound: Sound = this.songList!!.get(index) as Sound


    var duration: Long = sound!!.getDuration()!!
            

PreLogUtil.put(StringBuilder().
                            append(PLAY)!!.append(sound!!.getResource())!!.append(FOR)!!.append(duration)!!.toString(), this, commonStrings!!.PROCESS)
}

}


open fun startNewSong()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            this.resourceUtil!!.getContext()!!.stopService(this.currentIntent)

    
                        if(this.nextSongSound == 
                                    null
                                )
                        
                                    {
                                    this.currentSongSound= basicArrayListUtil!!.getRandom(this.songList) as Sound

                                    }
                                
                        else {
                            this.currentSongSound= this.nextSongSound
this.nextSongSound= 
                                        null
                                    

                        }
                            

    var duration: Long = this.currentSongSound!!.getDuration()!!
            

PreLogUtil.put(StringBuilder().
                            append(PLAY)!!.append(this.currentSongSound!!.getResource())!!.append(FOR)!!.append(duration)!!.toString(), this, commonStrings!!.PROCESS)
this.timeDelayHelper!!.delay= duration.toInt()
this.currentIntent!!.putExtra(musicStrings!!.SONG_EXTRA, this.resourceUtil!!.getResourceId(this.currentSongSound!!.getResource())!!.toInt())
this.currentIntent!!.putExtra(musicStrings!!.LEFT_VOLUME, leftVolume)
this.currentIntent!!.putExtra(musicStrings!!.RIGHT_VOLUME, rightVolume)
this.resourceUtil!!.getContext()!!.startService(this.currentIntent)
} catch(e: Exception)
            {
    var resource: String = StringUtil.getInstance()!!.EMPTY_STRING


    
                        if(currentSongSound != 
                                    null
                                )
                        
                                    {
                                    resource= currentSongSound!!.getResource()

                                    }
                                
PreLogUtil.put(commonStrings!!.EXCEPTION_LABEL +resource, this, commonStrings!!.PROCESS, e)
}

}


                @Throws(Exception::class)
            
open fun stop()
        //nullable = true from not(false or (false and true)) = true
{this.resourceUtil!!.getContext()!!.stopService(this.currentIntent)
}


}
                
            

