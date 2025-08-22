
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
        
import org.allbinary.business.advertisement.GameAdStateFactory
import org.allbinary.game.GameAdState
import org.allbinary.game.configuration.feature.Features
import org.allbinary.graphics.opengles.CurrentDisplayableFactory
import org.allbinary.graphics.opengles.OpenGLFeatureFactory
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface

open public class BaseGameBehavior : DemoGameBehavior {
        

        companion object {
            
    private val instance: BaseGameBehavior = BaseGameBehavior()

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
        
                @Throws(Exception::class)
            override fun init()
        //nullable = true from not(false or (false and true)) = true
{
    var gameAdState: GameAdState = GameAdStateFactory.getInstance()!!.getCurrentInstance()!!

gameAdState!!.playingAdState()
}

override fun pause(allBinaryGameCanvas: AllBinaryGameCanvas)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryGameCanvas = allBinaryGameCanvas

    var features: Features = Features.getInstance()!!


    
                        if(features.isDefault(OpenGLFeatureFactory.getInstance()!!.OPENGL_AS_GAME_THREAD))
                        
                                    {
                                    
    var currentDisplayableFactory: CurrentDisplayableFactory = CurrentDisplayableFactory.getInstance()!!

currentDisplayableFactory!!.setRunnable(allBinaryGameCanvas!!.gamePauseRunnable)

                                    }
                                
}

override fun unPause(allBinaryGameCanvas: AllBinaryGameCanvas)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryGameCanvas = allBinaryGameCanvas

    
                        if(Features.getInstance()!!.isDefault(OpenGLFeatureFactory.getInstance()!!.OPENGL_AS_GAME_THREAD))
                        
                                    {
                                    
    var currentDisplayableFactory: CurrentDisplayableFactory = CurrentDisplayableFactory.getInstance()!!

currentDisplayableFactory!!.setRunnable(allBinaryGameCanvas!!.gameRunnable)
currentDisplayableFactory!!.setDisplayable(allBinaryGameCanvas)

                                    }
                                
}


                @Throws(Exception::class)
            override fun updateTouch(allBinaryGameCanvas: AllBinaryGameCanvas)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryGameCanvas = allBinaryGameCanvas
allBinaryGameCanvas!!.updateTouch2()
}


                @Throws(Exception::class)
            override fun updateScreenButtonPaintable(allBinaryGameCanvas: AllBinaryGameCanvas)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryGameCanvas = allBinaryGameCanvas
allBinaryGameCanvas!!.updateScreenButtonPaintable2()
}


                @Throws(Exception::class)
            override fun setGameState(allBinaryGameCanvas: AllBinaryGameCanvas)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryGameCanvas = allBinaryGameCanvas
allBinaryGameCanvas!!.setGameState()
}

override fun removeAllGameKeyInputListeners(allBinaryGameCanvas: AllBinaryGameCanvas)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryGameCanvas = allBinaryGameCanvas
allBinaryGameCanvas!!.removeAllGameKeyInputListeners2()
}


                @Throws(Exception::class)
            override fun updateEndGameProcessor(allBinaryGameCanvas: AllBinaryGameCanvas)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryGameCanvas = allBinaryGameCanvas
allBinaryGameCanvas!!.updateEndGameProcessor2()
}


                @Throws(Exception::class)
            override fun buildGame(allBinaryGameCanvas: AllBinaryGameCanvas)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryGameCanvas = allBinaryGameCanvas
allBinaryGameCanvas!!.buildGame2()
}


                @Throws(Exception::class)
            override fun run(allBinaryGameCanvas: AllBinaryGameCanvas)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryGameCanvas = allBinaryGameCanvas
allBinaryGameCanvas!!.run2()
}


                @Throws(Exception::class)
            override fun setHighScore(abeClientInformation: AbeClientInformationInterface, allBinaryGameCanvas: AllBinaryGameCanvas, name: String, score: Long, autoSubmit: Boolean, isLast: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var abeClientInformation = abeClientInformation


                    var allBinaryGameCanvas = allBinaryGameCanvas


                    var name = name


                    var score = score


                    var autoSubmit = autoSubmit


                    var isLast = isLast
allBinaryGameCanvas!!.setHighScore2(abeClientInformation, name, score, autoSubmit, isLast)
}


}
                
            

