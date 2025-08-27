
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
        package org.allbinary.game.combat.canvas




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.CommandListener
import org.allbinary.game.combat.destroy.DestroyedLayerProcessor
import org.allbinary.game.combat.destroy.event.DestroyEventCircularStaticPool
import org.allbinary.game.combat.destroy.event.DestroyedEventHandler
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.GameFeatureFactory
import org.allbinary.game.displayable.canvas.AllBinaryGameCanvas
import org.allbinary.game.init.BasicBuildGameInitializerFactory
import org.allbinary.game.layer.AllBinaryGameLayerManager
import org.allbinary.game.layer.drop.DropLayerProcessor
import org.allbinary.game.layer.identification.GroupLayerManagerListener
import org.allbinary.game.score.HighScoresFactoryInterface
import org.allbinary.graphics.canvas.transition.progress.ProgressCanvasFactory
import org.allbinary.layer.BasicLayerProcessor
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface

open public class CombatGameCanvas : AllBinaryGameCanvas {
        

        companion object {
            
    var basicLayerProcessor: Array<BasicLayerProcessor?> = arrayOfNulls(0)

        }
            public constructor        (cmdListener: CommandListener, gameLayerManager: AllBinaryGameLayerManager, highScoresFactoryInterface: HighScoresFactoryInterface, gameInitializationInterfaceFactoryInterface: BasicBuildGameInitializerFactory, buffered: Boolean)                        

                            : super(cmdListener, gameLayerManager, highScoresFactoryInterface, gameInitializationInterfaceFactoryInterface, buffered){

                    var cmdListener = cmdListener


                    var gameLayerManager = gameLayerManager


                    var highScoresFactoryInterface = highScoresFactoryInterface


                    var gameInitializationInterfaceFactoryInterface = gameInitializationInterfaceFactoryInterface


                    var buffered = buffered


                            //For kotlin this is before the body of the constructor.
                    
}


open fun CombatGameCanvas_init()
        //nullable = true from not(false or (false and true)) = true
{DestroyEventCircularStaticPool.getInstance()!!.init(this)
ProgressCanvasFactory.getInstance()!!.addPortion(50, "Destroy Events")
}


                @Throws(Exception::class)
            override fun init(abeClientInformation: AbeClientInformationInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var abeClientInformation = abeClientInformation
this.CombatGameCanvas_init()
super.init(abeClientInformation)
}


open fun initConfigurable(portion: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var portion = portion
DestroyedLayerProcessor.init()
ProgressCanvasFactory.getInstance()!!.addPortion(portion, "Basic Processors")

    var features: Features = Features.getInstance()!!


    var gameFeatureFactory: GameFeatureFactory = GameFeatureFactory.getInstance()!!


    
                        if(features.isFeature(gameFeatureFactory!!.DROPPED_ITEMS) && features.isFeature(gameFeatureFactory!!.DROPPED_ITEMS_FROM_DEATH))
                        
                                    {
                                    basicLayerProcessor= arrayOfNulls(2)
basicLayerProcessor[0]= DestroyedLayerProcessor.getInstance()
basicLayerProcessor[1]= DropLayerProcessor.getInstance()

                                    }
                                
                        else {
                            basicLayerProcessor= arrayOfNulls(1)
basicLayerProcessor[0]= DestroyedLayerProcessor.getInstance()

                        }
                            
}


                @Throws(Exception::class)
            override fun processPlayingGame()
        //nullable = true from not(false or (false and true)) = true
{super.processPlayingGame()




                        for (index in basicLayerProcessor!!.size  - 1  downTo 0)

        {basicLayerProcessor[index]!!.process(this.gameLayerManager)
}

}


                @Throws(Exception::class)
            override fun cleanupGame()
        //nullable = true from not(false or (false and true)) = true
{super.cleanupGame()




                        for (index in basicLayerProcessor!!.size  - 1  downTo 0)

        {basicLayerProcessor[index]!!.getList()!!.clear()
}

GroupLayerManagerListener.getInstance()!!.clear()
GroupLayerManagerListener.getInstance()!!.log()
DestroyedEventHandler.getInstance()!!.removeAllListeners()
this.cleanupManager()
}


                @Throws(Exception::class)
            
open fun cleanupManager()
        //nullable = true from not(false or (false and true)) = true
{this.gameLayerManager!!.cleanup()
}


}
                
            

