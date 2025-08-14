
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
        
import org.allbinary.game.configuration.event.ChangedGameFeatureListener
import org.allbinary.game.configuration.event.GameInitializedEvent
import org.allbinary.game.configuration.event.GameInitializedEventHandler
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.MainFeatureFactory
import org.allbinary.game.resource.ResourceLoadingLevelFactory
import org.allbinary.graphics.displayable.MyCanvas
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface

open public class GameInitializationUtil
            : Object
         {
        

        companion object {
            
    private val instance: GameInitializationUtil = GameInitializationUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GameInitializationUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val EVENT: GameInitializedEvent = GameInitializedEvent(this)

                @Throws(Exception::class)
            
open fun initDemo(abeClientInformation: AbeClientInformationInterface, canvas: MyCanvas, gameInitializationInterfaceFactoryInterface: BasicBuildGameInitializerFactory)
        //nullable = true from not(false or (false and false)) = true
{

                    var abeClientInformation = abeClientInformation


                    var canvas = canvas


                    var gameInitializationInterfaceFactoryInterface = gameInitializationInterfaceFactoryInterface

    var mainFeatureFactory: MainFeatureFactory = MainFeatureFactory.getInstance()!!
            


    
                        if(ChangedGameFeatureListener.getInstance()!!.isChanged(mainFeatureFactory!!.STATIC))
                        
                                    {
                                    
    var gameInitializationInterface: GameInitializationInterface = gameInitializationInterfaceFactoryInterface!!.getInstance()!!
            


    var features: Features = Features.getInstance()!!
            


    
                        if(features.isFeature(mainFeatureFactory!!.LOAD_ALL))
                        
                                    {
                                    this.initGame(abeClientInformation, canvas, gameInitializationInterfaceFactoryInterface)

                                    }
                                
                             else 
    
                        if(features.isFeature(mainFeatureFactory!!.LOAD_ONDEMAND))
                        
                                    {
                                    
    var resourceLoadingLevelFactory: ResourceLoadingLevelFactory = ResourceLoadingLevelFactory.getInstance()!!
            

gameInitializationInterface!!.init(abeClientInformation, canvas.getCustomCommandListener(), resourceLoadingLevelFactory!!.LOAD_EARLY.getLevel())
this.EVENT.setResourceLoadingLevel(resourceLoadingLevelFactory!!.LOAD_EARLY)

                                    }
                                
                        else {
                            


                            throw Exception(
                            "No Loading Feature Available")

                        }
                            
GameInitializedEventHandler.getInstance()!!.fireEvent(EVENT)

                                    }
                                
}


                @Throws(Exception::class)
            
open fun initGame(abeClientInformation: AbeClientInformationInterface, canvas: MyCanvas, gameInitializationInterfaceFactoryInterface: BasicBuildGameInitializerFactory)
        //nullable = true from not(false or (false and false)) = true
{

                    var abeClientInformation = abeClientInformation


                    var canvas = canvas


                    var gameInitializationInterfaceFactoryInterface = gameInitializationInterfaceFactoryInterface

    
                        if(ChangedGameFeatureListener.getInstance()!!.isChanged(MainFeatureFactory.getInstance()!!.STATIC))
                        
                                    {
                                    
    var gameInitializationInterface: GameInitializationInterface = gameInitializationInterfaceFactoryInterface!!.getInstance()!!
            


    var resourceLoadingLevelFactory: ResourceLoadingLevelFactory = ResourceLoadingLevelFactory.getInstance()!!
            

gameInitializationInterface!!.init(abeClientInformation, canvas.getCustomCommandListener(), resourceLoadingLevelFactory!!.LOAD_ALL.getLevel())
this.EVENT.setResourceLoadingLevel(resourceLoadingLevelFactory!!.LOAD_ALL)
GameInitializedEventHandler.getInstance()!!.fireEvent(EVENT)
ChangedGameFeatureListener.getInstance()!!.remove(MainFeatureFactory.getInstance()!!.STATIC)

                                    }
                                
}


}
                
            

