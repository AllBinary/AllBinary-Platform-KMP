
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2006 AllBinary 
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
        package org.allbinary.game.layer.unit




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Image
import javax.microedition.lcdui.ImageItem
import org.allbinary.game.layer.RTSGameStrings
import org.allbinary.game.layer.item.LayerInterfaceFactoryImageItem
import org.allbinary.game.layer.item.RTSLayerTextAnimation
import org.allbinary.game.layer.resources.BasicGameResources
import org.allbinary.game.layer.waypoint.FlagGameResources
import org.allbinary.graphics.form.item.CustomItem
import org.allbinary.image.GameFeatureImageCacheFactory
import org.allbinary.string.CommonSeps
import org.allbinary.animation.Animation
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.form.item.CustomItemUtil
import org.allbinary.graphics.form.item.ItemArraySingletonFactoryInterface
import org.allbinary.image.ImageCache
import org.allbinary.layer.LayerInterfaceFactoryInterface

open public class UnitItemArrayFactory
            : Object
        
                , ItemArraySingletonFactoryInterface {
        
companion object {
            
    private val ITEMS: Array<CustomItem?> = CustomItemUtil.getInstance()!!.CUSTOM_ITEM_ARRAY

        }
            
    private val commonSeps: CommonSeps = CommonSeps.getInstance()!!

    private var basicColor: BasicColor = BasicColorFactory.getInstance()!!.WHITE

    private val resources: Array<BasicGameResources?>
protected constructor (resources: Array<BasicGameResources?>)
            : super()
        {
var resources = resources
this.resources= resources
}


                @Throws(Exception::class)
            
    open fun createFlagItem(flagResources: FlagGameResources, layerInterfaceFactoryInterface: LayerInterfaceFactoryInterface)
        //nullable = true from not(false or (false and false)) = true
: CustomItem{
    //var flagResources = flagResources
    //var layerInterfaceFactoryInterface = layerInterfaceFactoryInterface

    var name: String = flagResources!!.NAME


    var index: Int = name.indexOf(commonSeps!!.SPACE)!!


    
                        if(index >= 0)
                        
                                    {
                                    name= name.substring(index)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.createFlagItem(flagResources, name, layerInterfaceFactoryInterface)
}


                @Throws(Exception::class)
            
    open fun createFlagItem(flagResources: FlagGameResources, name: String, layerInterfaceFactoryInterface: LayerInterfaceFactoryInterface)
        //nullable = true from not(false or (false and false)) = true
: CustomItem{
    //var flagResources = flagResources
    //var name = name
    //var layerInterfaceFactoryInterface = layerInterfaceFactoryInterface

    var IMAGE_CACHE: ImageCache = GameFeatureImageCacheFactory.getInstance()!!


    var image: Image = IMAGE_CACHE.get(flagResources!!.RESOURCE_ICON)!!


    var item: CustomItem = LayerInterfaceFactoryImageItem(name, image, ImageItem.LAYOUT_DEFAULT, flagResources!!.NAME, basicColor, arrayOf(RTSLayerTextAnimation(RTSGameStrings.getInstance()!!.DRAGGABLE, image)), layerInterfaceFactoryInterface)




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return item
}


                @Throws(Exception::class)
            
    override fun getItems()
        //nullable = true from not(false or (false and true)) = true
: Array<CustomItem?>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ITEMS
}


    open fun indexOf(basicGameResources: BasicGameResources)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var basicGameResources = basicGameResources




                        for (index in this.resources.size -1 downTo 0)

        {

    
                        if(this.resources[index] == basicGameResources)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return index

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1
}


}
                
            

