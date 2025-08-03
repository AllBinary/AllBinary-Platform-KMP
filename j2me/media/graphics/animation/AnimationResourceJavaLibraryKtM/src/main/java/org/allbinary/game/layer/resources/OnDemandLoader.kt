
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
        package org.allbinary.game.layer.resources



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.animation.resource.BaseResourceAnimationInterfaceFactoryInterfaceFactory
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.MainFeatureFactory
import org.allbinary.game.layer.GameLayerPlacementInterfaceBasicArrayListFactoryInterfaceFactory
import org.allbinary.game.layer.LayerPlacementInterfaceBasicArrayListFactoryInterface
import org.allbinary.game.resource.ResourceLoadingLevelFactory
import org.allbinary.image.ImageCache
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonStrings

open public class OnDemandLoader
            : Object
         {
        

    private val onDemandResourcesFactory: OnDemandResourcesFactory

    private val gameLayerPlacementInterfaceBasicArrayListFactoryInterfaceFactory: GameLayerPlacementInterfaceBasicArrayListFactoryInterfaceFactory

    private val resourceAnimationInterfaceFactoryInterfaceFactory: BaseResourceAnimationInterfaceFactoryInterfaceFactory
public constructor        (onDemandResourcesFactory: OnDemandResourcesFactory, gameLayerPlacementInterfaceBasicArrayListFactoryInterfaceFactory: GameLayerPlacementInterfaceBasicArrayListFactoryInterfaceFactory, resourceAnimationInterfaceFactoryInterfaceFactory: BaseResourceAnimationInterfaceFactoryInterfaceFactory)
            : super()
        {

                    var onDemandResourcesFactory = onDemandResourcesFactory


                    var gameLayerPlacementInterfaceBasicArrayListFactoryInterfaceFactory = gameLayerPlacementInterfaceBasicArrayListFactoryInterfaceFactory


                    var resourceAnimationInterfaceFactoryInterfaceFactory = resourceAnimationInterfaceFactoryInterfaceFactory
this.onDemandResourcesFactory= onDemandResourcesFactory
this.gameLayerPlacementInterfaceBasicArrayListFactoryInterfaceFactory= gameLayerPlacementInterfaceBasicArrayListFactoryInterfaceFactory
this.resourceAnimationInterfaceFactoryInterfaceFactory= resourceAnimationInterfaceFactoryInterfaceFactory
}


                @Throws(Exception::class)
            
open fun init(imageCache: ImageCache, level: Int, loadingString: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var imageCache = imageCache


                    var level = level


                    var loadingString = loadingString

    var resourceLoadingLevelFactory: ResourceLoadingLevelFactory = ResourceLoadingLevelFactory.getInstance()!!
            


    
                        if(Features.getInstance()!!.isFeature(MainFeatureFactory.getInstance()!!.LOAD_ALL))
                        
                                    {
                                    
    
                        if(this.resourceAnimationInterfaceFactoryInterfaceFactory!!.isInitialized())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                
this.initAll(imageCache, loadingString)

                                    }
                                
                             else 
    
                        if(level != resourceLoadingLevelFactory!!.LOAD_ALL.getLevel())
                        
                                    {
                                    
    var layerPlacementInterfaceBasicArrayListFactoryInterface: LayerPlacementInterfaceBasicArrayListFactoryInterface = this.gameLayerPlacementInterfaceBasicArrayListFactoryInterfaceFactory!!.getInstance(level)!!
            

this.initLevel(layerPlacementInterfaceBasicArrayListFactoryInterface, imageCache, level, loadingString)

                                    }
                                
}


                @Throws(Exception::class)
            
open fun initAll(imageCache: ImageCache, loadingString: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var imageCache = imageCache


                    var loadingString = loadingString

    var index: Int = 0


    var portion: Int = 120


    var onDemandResources: OnDemandResources





                        for (onDemandIndex in onDemandResourcesFactory!!.size()!! downTo 0)


        {onDemandResources= onDemandResourcesFactory!!.remove(onDemandIndex)

    
                        if(onDemandResources != 
                                    null
                                )
                        
                                    {
                                    index= onDemandResources!!.init(imageCache, this.resourceAnimationInterfaceFactoryInterfaceFactory, portion, loadingString, index)

                                    }
                                
}

}


                @Throws(Exception::class)
            
open fun initLevel(layerPlacementInterfaceBasicArrayListFactoryInterface: LayerPlacementInterfaceBasicArrayListFactoryInterface, imageCache: ImageCache, level: Int, loadingString: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var layerPlacementInterfaceBasicArrayListFactoryInterface = layerPlacementInterfaceBasicArrayListFactoryInterface


                    var imageCache = imageCache


                    var level = level


                    var loadingString = loadingString

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            


    var portion: Int = 120


    var index: Int = 0


    var onDemandArray: IntArray = layerPlacementInterfaceBasicArrayListFactoryInterface!!.getOnDemandResources()!!
            

PreLogUtil.put(StringMaker().
                            append(commonStrings!!.START)!!.append(onDemandArray!!.size)!!.toString(), this, 
                            "initLevel")

    var onDemandResources: OnDemandResources





                        for (onDemandIndex in onDemandArray!!.size downTo 0)


        {onDemandResources= onDemandResourcesFactory!!.remove(onDemandArray[onDemandIndex]!!)

    
                        if(onDemandResources != 
                                    null
                                )
                        
                                    {
                                    index= onDemandResources!!.init(imageCache, this.resourceAnimationInterfaceFactoryInterfaceFactory, portion, loadingString, index)

                                    }
                                
}

}


}
                
            

