
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
        package org.allbinary.game.layer.waypoint




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.PathFindingLayerInterface
import org.allbinary.game.layer.RTSLayer
import org.allbinary.game.layer.geological.resources.GeologicalGeographicMapCellPosition
import org.allbinary.game.layer.geological.resources.GeologicalResource
import org.allbinary.game.layer.unit.UnitLayer
import org.allbinary.game.layer.unit.UnitWaypointBehavior
import org.allbinary.media.audio.WorkSound
import org.allbinary.util.BasicArrayList
import org.allbinary.logic.math.SmallIntegerSingletonFactory

open public class WorkWaypoint : Waypoint {
        
companion object {
            
    val ID: Integer = SmallIntegerSingletonFactory.getInstance()!!.getInstance(25)!!

        }
            public constructor (ownerLayer: PathFindingLayerInterface)                        

                            : super(ownerLayer, WorkSound.getInstance()){
    //var ownerLayer = ownerLayer


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
    open fun visit(unitLayer: UnitLayer)
        //nullable = true from not(false or (false and false)) = true
{
    //var unitLayer = unitLayer

    
                        if(unitLayer!!.getGroupInterface()[0] != this.ownerLayer!!.getGroupInterface()[0])
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

    var size: Int = this.getConnectedWaypointList()!!.size()!!


    
                        if(size > 0)
                        
                                    {
                                    
    var occupyList: BasicArrayList = this.ownerLayer!!.getGeographicMapCellPositionArea()!!.getOccupyingGeographicMapCellPositionList()!!


    var outOfResources: Boolean = true


    var geologicalGeographicMapCellPosition: GeologicalGeographicMapCellPosition


    var geologicalResource: GeologicalResource





                        for (index in occupyList!!.size()!!  - 1  downTo 0)

        {
geologicalGeographicMapCellPosition= occupyList!!.get(index) as GeologicalGeographicMapCellPosition
geologicalResource= geologicalGeographicMapCellPosition!!.getGeologicalResource()

    
                        if(geologicalResource!!.getTotal() >= 1)
                        
                                    {
                                    outOfResources= false
geologicalResource!!.remove(unitLayer!!.getMaxResourceLoad())
unitLayer!!.setLoad(unitLayer!!.getMaxResourceLoad())

                                    }
                                
}


    var waypointInfoHudPaintable: WaypointInfoHudPaintable = this.ownerLayer!!.getHudPaintable() as WaypointInfoHudPaintable


    
                        if(this.ownerLayer == waypointInfoHudPaintable!!.getRtsLayer())
                        
                                    {
                                    waypointInfoHudPaintable!!.updateSelectionInfo()

                                    }
                                

    
                        if(!outOfResources)
                        
                                    {
                                    
    var unitWaypointBehavior: UnitWaypointBehavior = unitLayer!!.getWaypointBehavior() as UnitWaypointBehavior


    var rtsLayer: RTSLayer


        while(this.getConnectedWaypointList()!!.size() > 0)
        {
rtsLayer= this.getConnectedWaypointList()!!.get(0) as RTSLayer

    
                        if(rtsLayer!!.isDestroyed())
                        
                                    {
                                    this.getConnectedWaypointList()!!.remove(rtsLayer)

                                    }
                                
                        else {
                            unitWaypointBehavior!!.insertWaypoint(0, rtsLayer)
break;

                    

                        }
                            
}


                                    }
                                

                                    }
                                
}


    open fun getType()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 2
}


}
                
            

