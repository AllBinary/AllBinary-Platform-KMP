
        /*
                * 
                *  AllBinary Open License Version 1
                *  Copyright (c) 2011 AllBinary
                *  
                *  By agreeing to this license you and any business entity you represent are
                *  legally bound to the AllBinary Open License Version 1 legal agreement.
                *  
                *  You may obtain the AllBinary Open License Version 1 legal agreement from
                *  AllBinary or the root directory of AllBinary's AllBinary Platform repository.
                *  
                *  Created By: Travis Berthelot  
        */
        
        /* Generated Code Do Not Modify */
        package org.allbinary.media.audio




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.media.Player
import org.allbinary.graphics.canvas.transition.progress.ProgressCanvas
import org.allbinary.graphics.canvas.transition.progress.ProgressCanvasFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonStrings

open public class Sounds
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private val soundStrings: SoundStrings = SoundStrings.getInstance()!!
            

    private val soundsFactoryInterface: SoundsFactoryInterface
public constructor        (soundsFactoryInterface: SoundsFactoryInterface)
            : super()
        {

                    var soundsFactoryInterface = soundsFactoryInterface
this.soundsFactoryInterface= soundsFactoryInterface
}


                @Throws(Exception::class)
            
open fun init()
        //nullable = true from not(false or (false and true)) = true
{logUtil!!.put(commonStrings!!.START, this, commonStrings!!.INIT)

    var commonLabels: CommonLabels = CommonLabels.getInstance()!!
            


    var progressCanvas: ProgressCanvas = ProgressCanvasFactory.getInstance()!!
            

soundsFactoryInterface!!.init()

    var soundInterfaceArray: Array<Sound?> = soundsFactoryInterface!!.getSoundInterfaceArray()!!
            


    var smallIntegerSingletonFactory: SmallIntegerSingletonFactory = SmallIntegerSingletonFactory.getInstance()!!
            


    var indexInteger: Integer


    var indexString: String


    var stringBuffer: StringMaker = StringMaker()





                        for (i in 0 until soundInterfaceArray!!.size)


        {
    var soundInterface: Sound = soundInterfaceArray[i]!!


    
                        if(soundInterface != 
                                    null
                                )
                        
                                    {
                                    indexInteger= smallIntegerSingletonFactory!!.getInstance(i)
indexString= indexInteger!!.toString()
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(commonLabels!!.INDEX_LABEL)
stringBuffer!!.append(indexString)
stringBuffer!!.append(this.soundStrings!!.SOUND)
stringBuffer!!.append(soundInterface!!::class.qualifiedName!!)
logUtil!!.put(stringBuffer!!.toString(), this, commonStrings!!.INIT)
soundInterface!!.init()
progressCanvas!!.addPortion(100, StringMaker().
                            append(this.soundStrings!!.INIT_SOUND)!!.append(indexString)!!.toString())

                                    }
                                
}

soundsFactoryInterface!!.setInitialized(true)
logUtil!!.put(commonStrings!!.END, this, commonStrings!!.INIT)
}


                @Throws(Exception::class)
            
open fun stopAll()
        //nullable = true from not(false or (false and true)) = true
{logUtil!!.put(commonStrings!!.START, this, this.soundStrings!!.STOP_ALL)

    var soundInterfaceArray: Array<Sound?> = soundsFactoryInterface!!.getSoundInterfaceArray()!!
            


    var progressCanvas: ProgressCanvas = ProgressCanvasFactory.getInstance()!!
            


    var player: Player





                        for (index in 0 until soundInterfaceArray!!.size)


        {
    
                        if(soundInterfaceArray[index] != 
                                    null
                                )
                        
                                    {
                                    player= soundInterfaceArray[index]!!.getPlayerP()

    
                        if(player != 
                                    null
                                )
                        
                                    {
                                    player.stop()
progressCanvas!!.addPortion(100, this.soundStrings!!.STOPPING_SOUND, index)

                                    }
                                

                                    }
                                
}

}


                @Throws(Exception::class)
            
open fun closeAll()
        //nullable = true from not(false or (false and true)) = true
{logUtil!!.put(commonStrings!!.START, this, this.soundStrings!!.CLOSE_ALL)

    var soundInterfaceArray: Array<Sound?> = soundsFactoryInterface!!.getSoundInterfaceArray()!!
            


    var progressCanvas: ProgressCanvas = ProgressCanvasFactory.getInstance()!!
            


    var player: Player





                        for (index in 0 until soundInterfaceArray!!.size)


        {
    
                        if(soundInterfaceArray[index] != 
                                    null
                                )
                        
                                    {
                                    player= soundInterfaceArray[index]!!.getPlayerP()

    
                        if(player != 
                                    null
                                )
                        
                                    {
                                    player.close()
progressCanvas!!.addPortion(100, this.soundStrings!!.CLOSING_SOUND, index)

                                    }
                                

                                    }
                                
}

}


}
                
            

