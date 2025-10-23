
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2003 AllBinary 
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
        package org.allbinary.game.input.form




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import org.allbinary.game.layer.RTSLayer
import org.allbinary.game.layer.RTSPlayerLayerInterface
import org.allbinary.game.layer.item.LayerInterfaceFactoryImageItem
import org.allbinary.graphics.form.item.CustomItem
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.direction.DirectionFactory
import org.allbinary.game.identification.Group
import org.allbinary.game.layer.AllBinaryGameLayerManager
import org.allbinary.game.layer.special.CollidableDestroyableDamageableLayer
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.form.ScrollSelectionForm
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.layer.LayerInterfaceFactoryInterface
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.map.SimpleGeographicMapCellPositionFactory

open public class RTSFormInput
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val hashtable: Hashtable<Any, Any> = Hashtable<Any, Any>()

    val newUnconstructedRTSLayerInterfaceArray: Array<CollidableDestroyableDamageableLayer?> = arrayOfNulls(7)

    val groupInterfaceArray: Array<Group?>

    private var selectedGeographicCellPosition: GeographicMapCellPosition = SimpleGeographicMapCellPositionFactory.NULL_GEOGRAPHIC_MAP_CELL_POSITION

    private var stickyItemSelected: Boolean= false

    private var selectedStickyItemIndex: Int= 0

    private var selectedStickyItem: CustomItem = CustomItem.NULL_CUSTOM_ITEM
public constructor (groupInterfaceArray: Array<Group?>)
            : super()
        {
    //var groupInterfaceArray = groupInterfaceArray

    var size: Int = newUnconstructedRTSLayerInterfaceArray!!.size
                





                        for (index in 0 until size)

        {
newUnconstructedRTSLayerInterfaceArray[index]= CollidableDestroyableDamageableLayer.NULL_COLLIDABLE_DESTROYABLE_DAMAGE_LAYER
}

this.groupInterfaceArray= groupInterfaceArray
this.hashtable.put(DirectionFactory.getInstance()!!.NAME, DirectionFactory.getInstance()!!.DOWN)

    
                        if(groupInterfaceArray != 
                                    null
                                )
                        
                                    {
                                    this.hashtable.put(Group.ID, groupInterfaceArray)

                                    }
                                
}


                @Throws(Exception::class)
            
    open fun setAllBinaryGameLayerManager(allBinaryGameLayerManager: AllBinaryGameLayerManager)
        //nullable = true from not(false or (false and false)) = true
{
    //var allBinaryGameLayerManager = allBinaryGameLayerManager
}


                @Throws(Exception::class)
            
    open fun process(associatedRtsLayer: CollidableDestroyableDamageableLayer, rtsPlayerLayerInterface: RTSPlayerLayerInterface, layerManager: AllBinaryLayerManager, point: GPoint)
        //nullable = true from not(false or (false and false)) = true
{
    //var associatedRtsLayer = associatedRtsLayer
    //var rtsPlayerLayerInterface = rtsPlayerLayerInterface
    //var layerManager = layerManager
    //var point = point

    var index: Int = this.getIndexAt(rtsPlayerLayerInterface, point)!!


    
                        if(index < 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

    var scrollSelectionForm: ScrollSelectionForm = rtsPlayerLayerInterface!!.getCurrentScrollSelectionForm()!!


    var item: CustomItem = scrollSelectionForm!!.get(index)!!


    
                        if(item == 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                
this.process(associatedRtsLayer, rtsPlayerLayerInterface, layerManager, item, index)
}


                @Throws(Exception::class)
            
    open fun process(layerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{
    //var layerManager = layerManager
this.setAllBinaryGameLayerManager(layerManager as AllBinaryGameLayerManager)
}


                @Throws(Exception::class)
            
    open fun process(associatedRtsLayer: CollidableDestroyableDamageableLayer, rtsPlayerLayerInterface: RTSPlayerLayerInterface, layerManager: AllBinaryLayerManager, item: CustomItem, index: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var associatedRtsLayer = associatedRtsLayer
    //var rtsPlayerLayerInterface = rtsPlayerLayerInterface
    //var layerManager = layerManager
    //var item = item
    //var index = index
}


                @Throws(Exception::class)
            
    open fun processSticky(associatedRtsLayer: CollidableDestroyableDamageableLayer, rtsPlayerLayerInterface: RTSPlayerLayerInterface, layerManager: AllBinaryLayerManager, point: GPoint)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var associatedRtsLayer = associatedRtsLayer
    //var rtsPlayerLayerInterface = rtsPlayerLayerInterface
    //var layerManager = layerManager
    //var point = point

    var index: Int = this.getIndexAt(rtsPlayerLayerInterface, point)!!


    
                        if(index < 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                

    var scrollSelectionForm: ScrollSelectionForm = rtsPlayerLayerInterface!!.getCurrentScrollSelectionForm()!!


    var item: CustomItem = scrollSelectionForm!!.get(index)!!


    
                        if(item == 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
this.processSticky(associatedRtsLayer, rtsPlayerLayerInterface, layerManager, item, index)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


                @Throws(Exception::class)
            
    open fun processSticky(associatedRtsLayer: CollidableDestroyableDamageableLayer, rtsPlayerLayerInterface: RTSPlayerLayerInterface, layerManager: AllBinaryLayerManager, item: CustomItem, index: Int)
        //nullable = true from not(false or (false and false)) = true
{
var associatedRtsLayer = associatedRtsLayer
var rtsPlayerLayerInterface = rtsPlayerLayerInterface
var layerManager = layerManager
var item = item
var index = index
}


                @Throws(Exception::class)
            
    open fun getItemAt(rtsPlayerLayerInterface: RTSPlayerLayerInterface, point: GPoint)
        //nullable = true from not(false or (false and false)) = true
: CustomItem{
    //var rtsPlayerLayerInterface = rtsPlayerLayerInterface
    //var point = point
logUtil!!.put(StringMaker().
                            append("Point: ")!!.append(StringUtil.getInstance()!!.toString(point))!!.toString(), this, "getItemAt")

    var scrollSelectionForm: ScrollSelectionForm = rtsPlayerLayerInterface!!.getCurrentScrollSelectionForm()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return scrollSelectionForm!!.getSelectedItem(point)
}


                @Throws(Exception::class)
            
    open fun getIndexAt(rtsPlayerLayerInterface: RTSPlayerLayerInterface, point: GPoint)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var rtsPlayerLayerInterface = rtsPlayerLayerInterface
    //var point = point
logUtil!!.put(StringMaker().
                            append("Point: ")!!.append(StringUtil.getInstance()!!.toString(point))!!.toString(), this, "getItemAt")

    var scrollSelectionForm: ScrollSelectionForm = rtsPlayerLayerInterface!!.getCurrentScrollSelectionForm()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return scrollSelectionForm!!.getSelectedIndex(point)
}


                @Throws(Exception::class)
            
    open fun getInstance(layerManager: AllBinaryLayerManager, aItem: CustomItem, geographicMapCellPosition: GeographicMapCellPosition)
        //nullable =  from not(true or (false and false)) = 
: CollidableDestroyableDamageableLayer{
    //var layerManager = layerManager
    //var aItem = aItem
    //var geographicMapCellPosition = geographicMapCellPosition

    var item: LayerInterfaceFactoryImageItem = aItem as LayerInterfaceFactoryImageItem


    var layerInterfaceFactoryInterface: LayerInterfaceFactoryInterface = item.getLayerInterfaceFactoryInterface()!!


    var cellPoint: GPoint = geographicMapCellPosition!!.getPoint()!!


    
                        if(layerInterfaceFactoryInterface != 
                                    null
                                )
                        
                                    {
                                    hashtable.put(AllBinaryGameLayerManager.ID, layerManager)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return layerInterfaceFactoryInterface!!.getInstance(getHashtable(), cellPoint!!.getX(), cellPoint!!.getY(), cellPoint!!.getZ()) as RTSLayer

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return CollidableDestroyableDamageableLayer.NULL_COLLIDABLE_DESTROYABLE_DAMAGE_LAYER
}


    open fun getSelectedGeographicCellPosition()
        //nullable = true from not(false or (false and true)) = true
: GeographicMapCellPosition{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return selectedGeographicCellPosition
}


    open fun setSelectedGeographicCellPosition(selectedGeographicCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
{
var selectedGeographicCellPosition = selectedGeographicCellPosition
logUtil!!.put(StringMaker().
                            append("Selected GeographicMapCellPosition: ")!!.append(selectedGeographicCellPosition!!.toString())!!.toString(), this, "setSelectedGeographicCellPosition")
this.selectedGeographicCellPosition= selectedGeographicCellPosition
}


    open fun isStickyItemSelected()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stickyItemSelected
}


    open fun setStickyItemSelected(stickyItemSelected: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var stickyItemSelected = stickyItemSelected
this.stickyItemSelected= stickyItemSelected
}


    open fun getSelectedStickyItem()
        //nullable = true from not(false or (false and true)) = true
: CustomItem{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return selectedStickyItem
}


    open fun setSelectedStickyItem(selectedStickyItem: CustomItem)
        //nullable = true from not(false or (false and false)) = true
{
var selectedStickyItem = selectedStickyItem
this.selectedStickyItem= selectedStickyItem
}


    open fun getSelectedStickyItemIndex()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return selectedStickyItemIndex
}


    open fun setSelectedStickyItemIndex(selectedStickyItemIndex: Int)
        //nullable = true from not(false or (false and false)) = true
{
var selectedStickyItemIndex = selectedStickyItemIndex
this.selectedStickyItemIndex= selectedStickyItemIndex
}


    open fun getHashtable()
        //nullable = true from not(false or (false and true)) = true
: Hashtable<Any, Any>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashtable
}


}
                
            

