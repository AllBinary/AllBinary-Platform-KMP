
        /* Generated Code Do Not Modify */
        package org.allbinary.media.audio.music



        import java.lang.Integer
        import java.lang.Math
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
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStateStrings
import org.allbinary.string.CommonStrings

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

    private var player: MediaPlayer

    private var songId: Int =  -1

    private var leftVolume: Int =  -1

    private var rightVolume: Int =  -1

open fun onBind(intent: Intent)
        //nullable = true from not(false or (false and false)) = true
: IBinder{

                    var intent = intent
logUtil!!.put(commonStrings!!.START, this, commonStateStrings!!.BIND)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun onCreate()
        //nullable = true from not(false or (false and true)) = true
{logUtil!!.put(commonStrings!!.START, this, commonStateStrings!!.CREATE)
}


open fun onDestroy()
        //nullable = true from not(false or (false and true)) = true
{logUtil!!.put(commonStrings!!.START, this, commonStateStrings!!.DESTROY)

    
                        if(player != 
                                    null
                                )
                        
                                    {
                                    player.stop()
player.reset()
player.release()

                                    }
                                
}


open fun onStart(intent: Intent, startid: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var intent = intent


                    var startid = startid
onStartCommand(intent)
logUtil!!.put(commonStrings!!.START, this, commonStateStrings!!.START)
}


open fun onStartCommand(intent: Intent, flags: Int, startId: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var intent = intent


                    var flags = flags


                    var startId = startId
onStartCommand(intent)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return START_STICKY
}


open fun onStartCommand(intent: Intent)
        //nullable = true from not(false or (false and false)) = true
{

                    var intent = intent
logUtil!!.put(commonStrings!!.START, this, commonStateStrings!!.ON_START_COMMAND)

    var musicStrings: MusicStrings = MusicStrings.getInstance()!!
            


    
                        if(intent != 
                                    null
                                )
                        
                                    {
                                    songId= intent.getIntExtra(musicStrings!!.SONG_EXTRA,  -1)
leftVolume= intent.getIntExtra(musicStrings!!.LEFT_VOLUME,  -1)
rightVolume= intent.getIntExtra(musicStrings!!.RIGHT_VOLUME,  -1)

                                    }
                                
                        else {
                            


                            throw RuntimeException(
                            "Started service without intent")

                        }
                            

    
                        if(songId !=  -1)
                        
                                    {
                                    System.gc()

    
                        if(player != 
                                    null
                                 && player.isPlaying())
                        
                                    {
                                    
    var player: MediaPlayer = this.player

logUtil!!.put(ALREADY_PLAYING, this, commonStateStrings!!.ON_START_COMMAND)

    var runnable: Runnable = object: Runnable()
                                {
                                
open fun run()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            
        while(player.isPlaying())
        {logUtil!!.put(WAITING_FOR_MUSIC_TO_END, this, commonStateStrings!!.ON_START_COMMAND)
Thread.sleep(1200)
}

onStartCommand(intent)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStateStrings!!.ON_START_COMMAND, e)
}

}

                                }
                            


    var thread: Thread = Thread(runnable)

thread.start()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                
player= MediaPlayer.create(this, songId)
player.setVolume((leftVolume.toFloat()) /100.0f, (rightVolume.toFloat()) /100.0f)
player.setLooping(false)
player.start()

                                    }
                                
}


}
                
            

