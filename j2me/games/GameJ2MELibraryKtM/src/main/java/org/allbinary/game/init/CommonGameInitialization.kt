
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
        package org.allbinary.game.init




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.CommandListener
import org.allbinary.game.resource.ResourceInitialization
import org.allbinary.game.resource.ResourceLoadingLevelFactory
import org.allbinary.graphics.PointFactory
import org.allbinary.graphics.canvas.transition.progress.ProgressCanvas
import org.allbinary.graphics.canvas.transition.progress.ProgressCanvasFactory
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.math.AngleFactory
import org.allbinary.string.CommonStrings

open public class CommonGameInitialization : BaseGameInitialization {
        

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
protected constructor        (resourceInitializationArray: Array<ResourceInitialization?>, portion: Int)                        

                            : super(resourceInitializationArray, portion){

                    var resourceInitializationArray = resourceInitializationArray


                    var portion = portion


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            override fun init(abeClientInformation: AbeClientInformationInterface, commandListener: CommandListener, level: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var abeClientInformation = abeClientInformation


                    var commandListener = commandListener


                    var level = level
super.init(abeClientInformation, commandListener, level)

    var resourceLoadingLevelFactory: ResourceLoadingLevelFactory = ResourceLoadingLevelFactory.getInstance()!!


    
                        if(!this.isGameInitialized() && level == resourceLoadingLevelFactory!!.LOAD_ALL.getLevel())
                        
                                    {
                                    this.setGameInitialized(true)

    var progressCanvas: ProgressCanvas = ProgressCanvasFactory.getInstance()!!

SmallIntegerSingletonFactory.getInstance()!!.init()
progressCanvas!!.addPortion(50, "Integers")
PointFactory.getInstance()!!.init()
progressCanvas!!.addPortion(50, "Points")
AngleFactory.getInstance()
progressCanvas!!.addPortion(50, "Angles")
this.initGame()
this.resourceInitializationArray[GAME_RESOURCES]!!.init()

                                    }
                                
super.resourceInitialization(level)
}


                @Throws(Exception::class)
            
open fun initGame()
        //nullable = true from not(false or (false and true)) = true
{


                            throw Exception(commonStrings!!.NOT_IMPLEMENTED)
}


}
                
            

