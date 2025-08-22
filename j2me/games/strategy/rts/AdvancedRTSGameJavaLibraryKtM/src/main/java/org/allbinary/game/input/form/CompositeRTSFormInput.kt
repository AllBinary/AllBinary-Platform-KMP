
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
        package org.allbinary.game.input.form




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.RTSLayer
import org.allbinary.game.layer.RTSPlayerLayerInterface
import org.allbinary.graphics.form.item.CustomItem
import org.allbinary.string.CommonStrings
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.game.identification.Group
import org.allbinary.game.layer.AllBinaryGameLayerManager
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.form.ScrollSelectionForm
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.GeographicMapCompositeInterface
import org.allbinary.string.CommonLabels

open public class CompositeRTSFormInput : RTSFormInput {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val rtsFormInputArray: Array<RTSFormInput?>

    private val itemIndex: IntArray

    private val isPrimaryWaypointCreator: Boolean
public constructor        (groupInterface: Array<Group?>, isPrimaryWaypointCreator: Boolean)                        

                            : this(groupInterface, isPrimaryWaypointCreator, intArrayOf(0)){

                    var groupInterface = groupInterface


                    var isPrimaryWaypointCreator = isPrimaryWaypointCreator


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (groupInterface: Array<Group?>, isPrimaryWaypointCreator: Boolean, itemIndex: IntArray)                        

                            : super(groupInterface){

                    var groupInterface = groupInterface


                    var isPrimaryWaypointCreator = isPrimaryWaypointCreator


                    var itemIndex = itemIndex


                            //For kotlin this is before the body of the constructor.
                    
this.itemIndex= itemIndex
this.isPrimaryWaypointCreator= isPrimaryWaypointCreator
this.rtsFormInputArray= arrayOfNulls(2)
this.rtsFormInputArray[0]= WaypointRTSFormInput(this.groupInterfaceArray, isPrimaryWaypointCreator)
this.rtsFormInputArray[1]= UnitRTSFormInput(this.groupInterfaceArray)
}


                @Throws(Exception::class)
            
open fun setAllBinaryGameLayerManager(allBinaryGameLayerManager: AllBinaryGameLayerManager)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryGameLayerManager = allBinaryGameLayerManager
super.setAllBinaryGameLayerManager(allBinaryGameLayerManager)

    var geographicMapCompositeInterface: GeographicMapCompositeInterface = allBinaryGameLayerManager as GeographicMapCompositeInterface


    var geographicMapInterface: BasicGeographicMap = geographicMapCompositeInterface!!.getGeographicMapInterface()[0]!!


    var size: Int = this.rtsFormInputArray!!.size
                





                        for (index in 0 until size)


        {this.rtsFormInputArray[index]!!.setAllBinaryGameLayerManager(allBinaryGameLayerManager)
}

}


                @Throws(Exception::class)
            
open fun process(associatedRtsLayer: RTSLayer, rtsPlayerLayerInterface: RTSPlayerLayerInterface, layerManager: AllBinaryLayerManager, point: GPoint)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedRtsLayer = associatedRtsLayer


                    var rtsPlayerLayerInterface = rtsPlayerLayerInterface


                    var layerManager = layerManager


                    var point = point

    var scrollSelectionForm: ScrollSelectionForm = rtsPlayerLayerInterface!!.getCurrentScrollSelectionForm()!!


    var index: Int = scrollSelectionForm!!.getSelectedIndex(point)!!


    
                        if(this.isStickyItemSelected() && associatedRtsLayer == 
                                    null
                                )
                        
                                    {
                                    
    
                        if(this.getSelectedStickyItemIndex() <= this.itemIndex[0])
                        
                                    {
                                    this.rtsFormInputArray[0]!!.process(associatedRtsLayer, rtsPlayerLayerInterface, layerManager, point)

                                    }
                                

                                    }
                                
                             else 
    
                        if(index > this.itemIndex[0])
                        
                                    {
                                    this.rtsFormInputArray[1]!!.process(associatedRtsLayer, rtsPlayerLayerInterface, layerManager, point)

                                    }
                                
}


                @Throws(Exception::class)
            
open fun process(associatedRtsLayer: RTSLayer, rtsPlayerLayerInterface: RTSPlayerLayerInterface, layerManager: AllBinaryLayerManager, item: CustomItem, index: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedRtsLayer = associatedRtsLayer


                    var rtsPlayerLayerInterface = rtsPlayerLayerInterface


                    var layerManager = layerManager


                    var item = item


                    var index = index

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(CommonLabels.getInstance()!!.INDEX_LABEL +index +" > " +this.itemIndex[0], this, commonStrings!!.PROCESS)

    
                        if(this.isStickyItemSelected() && associatedRtsLayer == 
                                    null
                                )
                        
                                    {
                                    
    
                        if(this.getSelectedStickyItemIndex() <= this.itemIndex[0])
                        
                                    {
                                    this.rtsFormInputArray[0]!!.process(associatedRtsLayer, rtsPlayerLayerInterface, layerManager, item, index)

                                    }
                                

                                    }
                                
                             else 
    
                        if(index > this.itemIndex[0])
                        
                                    {
                                    this.rtsFormInputArray[1]!!.process(associatedRtsLayer, rtsPlayerLayerInterface, layerManager, item, index)

                                    }
                                
}


                @Throws(Exception::class)
            
open fun processSticky(associatedRtsLayer: RTSLayer, rtsPlayerLayerInterface: RTSPlayerLayerInterface, layerManager: AllBinaryLayerManager, point: GPoint)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var associatedRtsLayer = associatedRtsLayer


                    var rtsPlayerLayerInterface = rtsPlayerLayerInterface


                    var layerManager = layerManager


                    var point = point



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.rtsFormInputArray[0]!!.processSticky(associatedRtsLayer, rtsPlayerLayerInterface, layerManager, point)
}


                @Throws(Exception::class)
            
open fun processSticky(associatedRtsLayer: RTSLayer, rtsPlayerLayerInterface: RTSPlayerLayerInterface, layerManager: AllBinaryLayerManager, item: CustomItem, index: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedRtsLayer = associatedRtsLayer


                    var rtsPlayerLayerInterface = rtsPlayerLayerInterface


                    var layerManager = layerManager


                    var item = item


                    var index = index
this.rtsFormInputArray[0]!!.processSticky(associatedRtsLayer, rtsPlayerLayerInterface, layerManager, item, index)
}


open fun getSelectedStickyItemIndex()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.rtsFormInputArray[0]!!.getSelectedStickyItemIndex()
}


open fun isStickyItemSelected()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.rtsFormInputArray[0]!!.isStickyItemSelected()
}


open fun setStickyItemSelected(stickyItemSelected: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var stickyItemSelected = stickyItemSelected
this.rtsFormInputArray[0]!!.setStickyItemSelected(stickyItemSelected)
}


open fun getSelectedStickyItem()
        //nullable = true from not(false or (false and true)) = true
: CustomItem{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.rtsFormInputArray[0]!!.getSelectedStickyItem()
}


open fun setSelectedStickyItem(selectedStickyItem: CustomItem)
        //nullable = true from not(false or (false and false)) = true
{

                    var selectedStickyItem = selectedStickyItem
this.rtsFormInputArray[0]!!.setSelectedStickyItem(selectedStickyItem)
}


}
                
            

