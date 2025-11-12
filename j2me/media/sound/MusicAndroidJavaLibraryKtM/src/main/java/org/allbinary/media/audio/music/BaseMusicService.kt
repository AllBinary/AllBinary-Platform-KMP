
        /* Generated Code Do Not Modify */
        package org.allbinary.media.audio.music




        import java.lang.Object        
        
        import java.lang.System
        
        import java.lang.Runnable
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import org.allbinary.android.NullAndroidCanvas
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonStateStrings
import org.allbinary.string.CommonStrings
import org.allbinary.thread.ARunnable

open public class BaseMusicService : Service {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val commonStateStrings: CommonStateStrings = CommonStateStrings.getInstance()!!

    private val ALREADY_PLAYING: String = "This is one song per music service"

    private val WAITING_FOR_MUSIC_TO_END: String = "Waiting for music to end"

    private var player: MediaPlayer = NullAndroidCanvas.NULL_MEDIA_PLAYER

    private var songId: Int =  -1

    private var leftVolume: Int =  -1

    private var rightVolume: Int =  -1

    override fun onBind(intent: Intent)
        //nullable = true from not(false or (false and false)) = true
: IBinder?{
    //var intent = intent
logUtil!!.put(commonStrings!!.START, this, commonStateStrings!!.BIND)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


    override fun onCreate()
        //nullable = true from not(false or (false and true)) = true
{
logUtil!!.put(commonStrings!!.START, this, commonStateStrings!!.CREATE)
}


    override fun onDestroy()
        //nullable = true from not(false or (false and true)) = true
{
logUtil!!.put(commonStrings!!.START, this, commonStateStrings!!.DESTROY)

    
                        if(player != NullAndroidCanvas.NULL_MEDIA_PLAYER)
                        
                                    {
                                    logUtil!!.put(commonStrings!!.START, this, commonStateStrings!!.PAUSE)
player.stop()
player.reset()
player.release()

                                    }
                                
}


    open fun pause()
        //nullable = true from not(false or (false and true)) = true
{

    
                        if(player != NullAndroidCanvas.NULL_MEDIA_PLAYER)
                        
                                    {
                                    logUtil!!.put(commonStrings!!.START, this, commonStateStrings!!.PAUSE)
player.pause()

                                    }
                                
}


    open fun resume()
        //nullable = true from not(false or (false and true)) = true
{

    
                        if(player != NullAndroidCanvas.NULL_MEDIA_PLAYER && !player.isPlaying())
                        
                                    {
                                    logUtil!!.put(commonStrings!!.START, this, commonStateStrings!!.RESUME)
player.start()

                                    }
                                
}


    open fun start()
        //nullable = true from not(false or (false and true)) = true
{
player= MediaPlayer.create(this, songId)
player.setVolume((leftVolume.toFloat()) /100.0f, (rightVolume.toFloat()) /100.0f)
player.setLooping(false)
player.start()
}


    override fun onStart(intent: Intent, startid: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var intent = intent
    //var startid = startid
onStartCommand(intent)
logUtil!!.put(commonStrings!!.START, this, commonStateStrings!!.START)
}


    override fun onStartCommand(intent: Intent, flags: Int, startId: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var intent = intent
    //var flags = flags
    //var startId = startId
onStartCommand(intent)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return START_STICKY
}


    open fun onStartCommand(intent: Intent)
        //nullable = true from not(false or (false and false)) = true
{
    //var intent = intent
logUtil!!.put(commonStrings!!.START, this, commonStateStrings!!.ON_START_COMMAND)

    var musicStrings: MusicStrings = MusicStrings.getInstance()!!


    
                        if(intent != 
                                    null
                                )
                        
                                    {
                                    
    var command: Int = intent.getIntExtra(commonStateStrings!!.ON_START_COMMAND,  -1)!!

logUtil!!.put(CommonLabels.getInstance()!!.COMMAND_LABEL +command, this, commonStateStrings!!.ON_START_COMMAND)

    
                        if(command == 1)
                        
                                    {
                                    this.pause()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                
                             else 
    
                        if(command == 2)
                        
                                    {
                                    this.resume()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                
                        else {
                            this.songId= intent.getIntExtra(musicStrings!!.SONG_EXTRA,  -1)
this.leftVolume= intent.getIntExtra(musicStrings!!.LEFT_VOLUME,  -1)
this.rightVolume= intent.getIntExtra(musicStrings!!.RIGHT_VOLUME,  -1)

                        }
                            

                                    }
                                
                        else {
                            


                            throw RuntimeException("Started service without intent")

                        }
                            

    
                        if(songId !=  -1)
                        
                                    {
                                    System.gc()

    
                        if(player != NullAndroidCanvas.NULL_MEDIA_PLAYER && player.isPlaying())
                        
                                    {
                                    
    var player: MediaPlayer = this.player

logUtil!!.put(ALREADY_PLAYING, this, commonStateStrings!!.ON_START_COMMAND)

    var runnable: Runnable = object: ARunnable()
                                {
                                
    override fun run()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            
        while(player.isPlaying())
        {
logUtil!!.put(WAITING_FOR_MUSIC_TO_END, this, commonStateStrings!!.ON_START_COMMAND)
Thread.sleep(1200)
}

onStartCommand(intent)
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStateStrings!!.ON_START_COMMAND, e)
}

}

                                }
                            


    var thread: Thread = Thread(runnable)

thread.start()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                
this.start()

                                    }
                                
}


}
                
            

