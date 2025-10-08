
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2022 AllBinary 
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
        package org.allbinary.game.displayable.canvas




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.GameTypeFactory
import org.allbinary.graphics.paint.NullPaintable
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.string.CommonStrings

open public class DemoGameBehavior
            : Object
         {
        
companion object {
            
    private val instance: DemoGameBehavior = DemoGameBehavior()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: DemoGameBehavior{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

                @Throws(Exception::class)
            
    open fun init()
        //nullable = true from not(false or (false and true)) = true
{
}


    open fun pause(allBinaryGameCanvas: AllBinaryGameCanvas)
        //nullable = true from not(false or (false and false)) = true
{
    //var allBinaryGameCanvas = allBinaryGameCanvas
}


    open fun unPause(allBinaryGameCanvas: AllBinaryGameCanvas)
        //nullable = true from not(false or (false and false)) = true
{
    //var allBinaryGameCanvas = allBinaryGameCanvas
}


                @Throws(Exception::class)
            
    open fun updateTouch(allBinaryGameCanvas: AllBinaryGameCanvas)
        //nullable = true from not(false or (false and false)) = true
{
    //var allBinaryGameCanvas = allBinaryGameCanvas
}


                @Throws(Exception::class)
            
    open fun updateScreenButtonPaintable(allBinaryGameCanvas: AllBinaryGameCanvas)
        //nullable = true from not(false or (false and false)) = true
{
    //var allBinaryGameCanvas = allBinaryGameCanvas
allBinaryGameCanvas!!.setTouchPaintableP(NullPaintable.getInstance())
}


                @Throws(Exception::class)
            
    open fun setGameState(allBinaryGameCanvas: AllBinaryGameCanvas)
        //nullable = true from not(false or (false and false)) = true
{
    //var allBinaryGameCanvas = allBinaryGameCanvas
}


    open fun removeAllGameKeyInputListeners(allBinaryGameCanvas: AllBinaryGameCanvas)
        //nullable = true from not(false or (false and false)) = true
{
    //var allBinaryGameCanvas = allBinaryGameCanvas
}


                @Throws(Exception::class)
            
    open fun updateEndGameProcessor(allBinaryGameCanvas: AllBinaryGameCanvas)
        //nullable = true from not(false or (false and false)) = true
{
    //var allBinaryGameCanvas = allBinaryGameCanvas
}


                @Throws(Exception::class)
            
    open fun buildGame(allBinaryGameCanvas: AllBinaryGameCanvas)
        //nullable = true from not(false or (false and false)) = true
{
    //var allBinaryGameCanvas = allBinaryGameCanvas
}


                @Throws(Exception::class)
            
    open fun run(allBinaryGameCanvas: AllBinaryGameCanvas)
        //nullable = true from not(false or (false and false)) = true
{
    //var allBinaryGameCanvas = allBinaryGameCanvas

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(GameTypeFactory.getInstance()!!.BOT.toString(), this, commonStrings!!.RUN)
}


                @Throws(Exception::class)
            
    open fun setHighScore(abeClientInformation: AbeClientInformationInterface, allBinaryGameCanvas: AllBinaryGameCanvas, name: String, score: Long, autoSubmit: Boolean, isLast: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
    //var abeClientInformation = abeClientInformation
    //var allBinaryGameCanvas = allBinaryGameCanvas
    //var name = name
    //var score = score
    //var autoSubmit = autoSubmit
    //var isLast = isLast
}


}
                
            

