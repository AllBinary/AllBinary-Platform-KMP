
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
        package org.allbinary.game.input




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.input.form.AssignWaypointsUtil
import org.allbinary.game.layer.AdvancedRTSGameLayer
import org.allbinary.game.layer.RTSLayer
import org.allbinary.game.layer.building.BuildingLayer
import org.allbinary.game.layer.unit.UnitLayer
import org.allbinary.util.BasicArrayList
import org.allbinary.logic.util.visitor.Visitor

open public class SelectAdvancedRTSLayerVisitor : Visitor {
        

    private val selectedRTSLayersPlayerGameInput: SelectedRTSLayersPlayerGameInput
public constructor        (selectedRTSLayersPlayerGameInput: SelectedRTSLayersPlayerGameInput){
var selectedRTSLayersPlayerGameInput = selectedRTSLayersPlayerGameInput
this.selectedRTSLayersPlayerGameInput= selectedRTSLayersPlayerGameInput
}


open fun visit(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: Any{
var anyType = anyType

    var selectedLayer: AdvancedRTSGameLayer = anyType as AdvancedRTSGameLayer


    
                        if(selectedLayer != 
                                    null
                                 && selectedLayer!!.getType() == BuildingLayer.getStaticType())
                        
                                    {
                                    
    var list: BasicArrayList = selectedRTSLayersPlayerGameInput!!.getSelectedBasicArrayList()!!





                        for (index in list.size() -1 downTo 0)

        {

    var currentRTSLayer: RTSLayer = list.get(index) as RTSLayer


    
                        if(currentRTSLayer!!.getType() == UnitLayer.getStaticType())
                        
                                    {
                                    
    var unitLayer: UnitLayer = currentRTSLayer as UnitLayer

unitLayer!!.setParentLayer(selectedLayer)
AssignWaypointsUtil.getInstance()!!.set(unitLayer, selectedLayer)

                                    }
                                
}


                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


}
                
            

