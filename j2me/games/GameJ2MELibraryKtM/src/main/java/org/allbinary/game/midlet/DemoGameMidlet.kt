
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
        package org.allbinary.game.midlet




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import org.allbinary.game.displayable.canvas.GameCanvasRunnableInterface
import org.allbinary.game.layer.AllBinaryGameLayerManager
import org.allbinary.graphics.canvas.transition.progress.ProgressCanvas
import org.allbinary.graphics.canvas.transition.progress.ProgressCanvasFactory
import org.allbinary.logic.NullUtil
import org.allbinary.logic.system.security.licensing.ClientInformationFactory
import org.allbinary.thread.PrimaryThreadPool

open public class DemoGameMidlet : GameMidlet {
        
public constructor        (clientInformationFactory: ClientInformationFactory)                        

                            : super(clientInformationFactory)

        Updates for KMP build        
        {
    //var clientInformationFactory = clientInformationFactory


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
open fun isContinue()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {

    var hashtable: Hashtable<Any, Any> = this.getStartStateHashtable()!!


    
                        if(hashtable != 
                                    null
                                 && hashtable.size > 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


open fun getHighestLevel()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 1
}


                @Throws(Exception::class)
            
open fun createDemoGameCanvasRunnableInterface()
        //nullable = true from not(false or (false and true)) = true
: GameCanvasRunnableInterface

        Updates for KMP build        
        {



                            throw Exception(commonStrings!!.NOT_IMPLEMENTED)
}


                @Throws(Exception::class)
            
open fun createGameCanvasRunnableInterface(allBinaryGameLayerManager: AllBinaryGameLayerManager)
        //nullable = true from not(false or (false and false)) = true
: GameCanvasRunnableInterface

        Updates for KMP build        
        {
var allBinaryGameLayerManager = allBinaryGameLayerManager



                            throw Exception(commonStrings!!.NOT_IMPLEMENTED)
}


                @Throws(Exception::class)
            
open fun createGameCanvasRunnableInterface()
        //nullable = true from not(false or (false and true)) = true
: GameCanvasRunnableInterface

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.createGameCanvasRunnableInterface(this.createGameLayerManager())
}


open fun demoSetup()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


open fun postDemoSetup()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


                @Throws(Exception::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
override fun setDemo()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
logUtil!!.put(commonStrings!!.START, this, "setDemo")

    var progressCanvas: ProgressCanvas = ProgressCanvasFactory.getInstance()!!

progressCanvas!!.start()
PrimaryThreadPool.getInstance()!!.runTask(DemoRunnable(this))
}


                @Throws(Exception::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
override fun createGame()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

    var CREATE_GAME: String = "createGame"

logUtil!!.put(commonStrings!!.START, this, CREATE_GAME)

    var progressCanvas: ProgressCanvas = ProgressCanvasFactory.getInstance()!!

progressCanvas!!.start()

    var hashtable: Hashtable<Any, Any> = this.getStartStateHashtable()!!

this.setStartStateHashtable(NullUtil.getInstance()!!.NULL_TABLE)
PrimaryThreadPool.getInstance()!!.runTask(CreateGameRunnable(this, hashtable))
logUtil!!.put(commonStrings!!.END, this, CREATE_GAME)
}


open fun isReady()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


}
                
            

