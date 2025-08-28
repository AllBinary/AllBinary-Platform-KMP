
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
import org.allbinary.animation.FeaturedAnimationInterfaceFactoryInterfaceFactory
import org.allbinary.game.configuration.GameConfigurationCentral
import org.allbinary.game.configuration.event.ChangedGameFeatureListener
import org.allbinary.game.configuration.feature.InputFeatureFactory
import org.allbinary.game.configuration.feature.MainFeatureFactory
import org.allbinary.game.input.PlatformInputMappingFactory
import org.allbinary.game.input.event.GameKeyEventFactory
import org.allbinary.game.resource.FeaturedResourceRelativeRelationshipFactory
import org.allbinary.game.resource.ResourceInitialization
import org.allbinary.game.resource.ResourceLoadingLevelFactory
import org.allbinary.graphics.canvas.transition.progress.ProgressCanvas
import org.allbinary.graphics.canvas.transition.progress.ProgressCanvasFactory
import org.allbinary.image.GameFeatureImageCacheFactory
import org.allbinary.input.motion.CompleteMotionGestureInputToGameMotionGestureInput
import org.allbinary.input.motion.button.BasicTouchInputFactory
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface

open public class BaseGameInitialization
            : Object
        
                , GameInitializationInterface {
        

        companion object {
            
    val NULL_BASE_GAME_INITIALIZATION: BaseGameInitialization = BaseGameInitialization(arrayOfNulls(0), 0)

        }
            
    val resourceInitializationArray: Array<ResourceInitialization?>

    private val portion: Int

    private var initialized: Boolean= false

    val EARLY_RESOURCES: Int = 0

    val GAME_RESOURCES: Int = 1

    val EARLY_CHANGABLE_RESOURCES: Int = 2

    val GAME_CHANGABLE_RESOURCES: Int = 3
public constructor        (resourceInitializationArray: Array<ResourceInitialization?>, portion: Int)
            : super()
        {
    //var resourceInitializationArray = resourceInitializationArray
    //var portion = portion
this.resourceInitializationArray= resourceInitializationArray
this.portion= portion
}


                @Throws(Exception::class)
            
open fun initKey(portion: Int)
        //nullable = true from not(false or (false and false)) = true
{
var portion = portion
}


                @Throws(Exception::class)
            
open fun initKeyMapping(abeClientInformation: AbeClientInformationInterface, portion: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var abeClientInformation = abeClientInformation
var portion = portion

    
                        if(ChangedGameFeatureListener.getInstance()!!.isChanged(InputFeatureFactory.getInstance()!!.INPUT_MAPPING))
                        
                                    {
                                    PlatformInputMappingFactory.getInstance()!!.getPersistentInputMappingInstance()!!.init(abeClientInformation)
ProgressCanvasFactory.getInstance()!!.addPortion(50, "Game Keys")
ChangedGameFeatureListener.getInstance()!!.remove(InputFeatureFactory.getInstance()!!.INPUT_MAPPING)

                                    }
                                
}


                @Throws(Exception::class)
            override fun init(abeClientInformation: AbeClientInformationInterface, commandListener: CommandListener, level: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var abeClientInformation = abeClientInformation
    //var commandListener = commandListener
    //var level = level

    var resourceLoadingLevelFactory: ResourceLoadingLevelFactory = ResourceLoadingLevelFactory.getInstance()!!


    
                        if(!this.isInitialized() && (level == resourceLoadingLevelFactory!!.LOAD_ALL.getLevel() || level == resourceLoadingLevelFactory!!.LOAD_EARLY.getLevel()))
                        
                                    {
                                    
    var localPortion: Int = 40


    
                        if(level == resourceLoadingLevelFactory!!.LOAD_EARLY.getLevel())
                        
                                    {
                                    localPortion= 8

                                    }
                                
this.setInitialized(true)
this.initKey(getPortion())
this.initKeyMapping(abeClientInformation, getPortion())
GameKeyEventFactory.getInstance()!!.init()

    var progressCanvas: ProgressCanvas = ProgressCanvasFactory.getInstance()!!

progressCanvas!!.addPortion(localPortion, "Game Key Events")
BasicTouchInputFactory.getInstance()!!.init(PlatformInputMappingFactory.getInstance()!!.getPersistentInputMappingInstance()!!.getInputMapping())
progressCanvas!!.addPortion(localPortion, "Touch Input")
CompleteMotionGestureInputToGameMotionGestureInput.getInstance()!!.init()
progressCanvas!!.addPortion(localPortion, "Motion Input")
GameFeatureImageCacheFactory.init()
progressCanvas!!.addPortion(localPortion, "Image Cache")
this.resourceInitializationArray[EARLY_RESOURCES]!!.init()

                                    }
                                
}


    private var gameInitialized: Boolean= false

    private var allLoaded: Boolean= false

                @Throws(Exception::class)
            
open fun resourceInitialization(level: Int)
        //nullable = true from not(false or (false and false)) = true
{
var level = level

    var resourceLoadingLevelFactory: ResourceLoadingLevelFactory = ResourceLoadingLevelFactory.getInstance()!!


    
                        if(this.resourceAnimationChange() && level == resourceLoadingLevelFactory!!.LOAD_EARLY.getLevel())
                        
                                    {
                                    this.clearResources()
this.resourceInitializationArray[this.EARLY_CHANGABLE_RESOURCES]!!.init()

                                    }
                                

    
                        if(this.resourceAnimationChange() && level == resourceLoadingLevelFactory!!.LOAD_ALL.getLevel())
                        
                                    {
                                    
    
                        if(this.allLoaded)
                        
                                    {
                                    this.clearResources()

                                    }
                                

    
                        if(FeaturedAnimationInterfaceFactoryInterfaceFactory.getInstance()!!.getList()!!.size() == 0)
                        
                                    {
                                    this.resourceInitializationArray[this.EARLY_CHANGABLE_RESOURCES]!!.init()

                                    }
                                
this.resourceInitializationArray[this.GAME_CHANGABLE_RESOURCES]!!.init()
this.allLoaded= true

                                    }
                                
}


open fun resourceAnimationChange()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

    var changedGameFeatureListener: ChangedGameFeatureListener = ChangedGameFeatureListener.getInstance()!!


    var gameConfigurationCentral: GameConfigurationCentral = GameConfigurationCentral.getInstance()!!


    
                        if(changedGameFeatureListener!!.isChanged(gameConfigurationCentral!!.SCALE))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                

    
                        if(ChangedGameFeatureListener.getInstance()!!.isChanged(MainFeatureFactory.getInstance()!!.STATIC))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun clearResources()
        //nullable = true from not(false or (false and true)) = true
{
this.allLoaded= false
GameFeatureImageCacheFactory.releaseAll()

    var featuredAnimationInterfaceFactoryInterfaceFactory: FeaturedAnimationInterfaceFactoryInterfaceFactory = FeaturedAnimationInterfaceFactoryInterfaceFactory.getInstance()!!

featuredAnimationInterfaceFactoryInterfaceFactory!!.clear()
FeaturedResourceRelativeRelationshipFactory.getInstance()!!.clear()
}


open fun setGameInitialized(gameInitialized: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var gameInitialized = gameInitialized
this.gameInitialized= gameInitialized
}


open fun isGameInitialized()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gameInitialized
}


open fun getPortion()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return portion
}


open fun setInitialized(initialized: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var initialized = initialized
this.initialized= initialized
}


open fun isInitialized()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return initialized
}


}
                
            

