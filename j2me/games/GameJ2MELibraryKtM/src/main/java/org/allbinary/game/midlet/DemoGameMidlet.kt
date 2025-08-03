
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
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

                            : super(clientInformationFactory){

                    var clientInformationFactory = clientInformationFactory


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
open fun isContinue()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    var hashtable: Hashtable<Any, Any> = this.getStartStateHashtable()!!
            


    
                        if(hashtable != 
                                    null
                                 && hashtable!!.size > 0)
                        
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
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 1
}


                @Throws(Exception::class)
            
open fun createDemoGameCanvasRunnableInterface()
        //nullable = true from not(false or (false and true)) = true
: GameCanvasRunnableInterface{


                            throw Exception(commonStrings!!.NOT_IMPLEMENTED)
}


                @Throws(Exception::class)
            
open fun createGameCanvasRunnableInterface(allBinaryGameLayerManager: AllBinaryGameLayerManager)
        //nullable = true from not(false or (false and false)) = true
: GameCanvasRunnableInterface{

                    var allBinaryGameLayerManager = allBinaryGameLayerManager



                            throw Exception(commonStrings!!.NOT_IMPLEMENTED)
}


                @Throws(Exception::class)
            
open fun createGameCanvasRunnableInterface()
        //nullable = true from not(false or (false and true)) = true
: GameCanvasRunnableInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.createGameCanvasRunnableInterface(this.createGameLayerManager())
}


open fun demoSetup()
        //nullable = true from not(false or (false and true)) = true
{}


open fun postDemoSetup()
        //nullable = true from not(false or (false and true)) = true
{}


                @Throws(Exception::class)
            override fun setDemo()
        //nullable = true from not(false or (false and true)) = true
{logUtil!!.put(commonStrings!!.START, this, 
                            "setDemo")

    var progressCanvas: ProgressCanvas = ProgressCanvasFactory.getInstance()!!
            

progressCanvas!!.start()
PrimaryThreadPool.getInstance()!!.runTask(DemoRunnable(this))
}


                @Throws(Exception::class)
            override fun createGame()
        //nullable = true from not(false or (false and true)) = true
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
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


}
                
            

