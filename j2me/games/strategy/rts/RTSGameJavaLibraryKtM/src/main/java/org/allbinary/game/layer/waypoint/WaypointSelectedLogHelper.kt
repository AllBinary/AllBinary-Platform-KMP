
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2022 AllBinary 
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
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.PathFindingLayerInterface
import org.allbinary.game.layer.WaypointBehaviorBase
import org.allbinary.game.layer.special.CollidableDestroyableDamageableLayer
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonSeps
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.util.BasicArrayList

open public class WaypointSelectedLogHelper : WaypointLogHelper {
        
companion object {
            
    private val instance: WaypointSelectedLogHelper = WaypointSelectedLogHelper()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: WaypointSelectedLogHelper{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonSeps: CommonSeps = CommonSeps.getInstance()!!

    private val stringUtil: StringUtil = StringUtil.getInstance()!!

    override fun onWaypointEvent(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, advancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
    //var advancedRTSGameLayer = advancedRTSGameLayer

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(associatedAdvancedRTSGameLayer!!.getName())
stringBuffer!!.append(" onWaypointEvent: ")
stringBuffer!!.append(advancedRTSGameLayer!!.getName())

    
                        if(advancedRTSGameLayer!!.getParentLayer() != 
                                    null
                                )
                        
                                    {
                                    stringBuffer!!.append(" With Parent: ")
stringBuffer!!.append(advancedRTSGameLayer!!.getParentLayer()!!.getName())

                                    }
                                
logUtil!!.put(stringBuffer!!.toString(), this, "onWaypointEvent")
}


    override fun addWaypointFromBuilding(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, advancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
    //var advancedRTSGameLayer = advancedRTSGameLayer

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(associatedAdvancedRTSGameLayer!!.getName())
stringBuffer!!.append(" Adding Waypoint: ")
stringBuffer!!.append(advancedRTSGameLayer!!.getName())

    
                        if(advancedRTSGameLayer!!.getParentLayer() != 
                                    null
                                )
                        
                                    {
                                    stringBuffer!!.append(" With Parent: ")
stringBuffer!!.append(advancedRTSGameLayer!!.getParentLayer()!!.getName())

                                    }
                                
logUtil!!.put(stringBuffer!!.toString(), this, "selected: onWaypointEvent")
}


    override fun addWaypointFromBuilding(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, advancedRTSGameLayer: PathFindingLayerInterface, list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
    //var advancedRTSGameLayer = advancedRTSGameLayer
    //var list = list

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(associatedAdvancedRTSGameLayer!!.getName())
stringBuffer!!.append(" Waypoints: ")
stringBuffer!!.append(stringUtil!!.toString(list))
logUtil!!.put(stringBuffer!!.toString(), this, "selected: onWaypointEvent")
}


    override fun insertWaypoint(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, index: Int, rtsLayer: CollidableDestroyableDamageableLayer, waypointName: String)
        //nullable = true from not(false or (false and false)) = true
{
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
    //var index = index
var rtsLayer = rtsLayer
    //var waypointName = waypointName

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(associatedAdvancedRTSGameLayer!!.getName())
stringBuffer!!.append(commonSeps!!.SPACE)
stringBuffer!!.append(waypointName)
stringBuffer!!.append(" Insert: ")
stringBuffer!!.append(rtsLayer!!.getName())
stringBuffer!!.append(" for Waypoint: ")
logUtil!!.put(stringBuffer!!.toString(), this, "selected: insertWaypoint")
}


    override fun insertWaypoint(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, index: Int, rtsLayer: CollidableDestroyableDamageableLayer, waypointName: String, list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
    //var index = index
    //var rtsLayer = rtsLayer
    //var waypointName = waypointName
    //var list = list

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(associatedAdvancedRTSGameLayer!!.getName())
stringBuffer!!.append(commonSeps!!.SPACE)
stringBuffer!!.append(waypointName)
stringBuffer!!.append(" Insert: ")
stringBuffer!!.append(rtsLayer!!.getName())
stringBuffer!!.append(" Waypoints: ")
stringBuffer!!.append(stringUtil!!.toString(list))
logUtil!!.put(stringBuffer!!.toString(), this, "selected: insertWaypoint")
}


    override fun setRandomGeographicMapCellHistory(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, pathsList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
    //var pathsList = pathsList

    var size: Int = pathsList!!.size()!!


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(associatedAdvancedRTSGameLayer!!.getName())
stringBuffer!!.append(commonSeps!!.SPACE)
stringBuffer!!.append(CommonLabels.getInstance()!!.START)
stringBuffer!!.append(size)
stringBuffer!!.append(" -> ")
stringBuffer!!.append(stringUtil!!.toString(pathsList))
logUtil!!.put(stringBuffer!!.toString(), this, "selected: setRandomGeographicMapCellHistory")
}


    override fun moveAwayFromBuilding(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
logUtil!!.put(StringMaker().
                            append(associatedAdvancedRTSGameLayer!!.getName())!!.append(" Trying to move away from building")!!.toString(), this, "selected: moveAwayFromBuilding")
}


    override fun needToMove(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, unitWaypointBehavior: WaypointBehaviorBase)
        //nullable = true from not(false or (false and false)) = true
{
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
    //var unitWaypointBehavior = unitWaypointBehavior
logUtil!!.put(StringMaker().
                            append(associatedAdvancedRTSGameLayer!!.getName())!!.append(unitWaypointBehavior!!.getMovementLogicAsString())!!.toString(), this, "needToMove")
}


    override fun setRandomGeographicMapCellHistory(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
logUtil!!.put(StringMaker().
                            append(associatedAdvancedRTSGameLayer!!.getName())!!.append(" pathsList is null")!!.toString(), this, "setRandomGeographicMapCellHistory")
}


    override fun setCurrentPathGeographicMapCellPosition(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, existingCurrentPathGeographicMapCellPosition: GeographicMapCellPosition, currentPathGeographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
{
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
    //var existingCurrentPathGeographicMapCellPosition = existingCurrentPathGeographicMapCellPosition
    //var currentPathGeographicMapCellPosition = currentPathGeographicMapCellPosition

    
                        if(existingCurrentPathGeographicMapCellPosition == 
                                    null
                                )
                        logUtil!!.put(StringMaker().
                            append(associatedAdvancedRTSGameLayer!!.getName())!!.append(" currentPathGeographicMapCellPosition: ")!!.append(stringUtil!!.toString(currentPathGeographicMapCellPosition))!!.toString(), this, "setCurrentPathGeographicMapCellPosition")
}


    override fun setNextUnvisitedPathGeographicMapCellPosition(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, existingNextUnvisitedPathGeographicMapCellPosition: GeographicMapCellPosition, nextUnvisitedPathGeographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
{
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
    //var existingNextUnvisitedPathGeographicMapCellPosition = existingNextUnvisitedPathGeographicMapCellPosition
    //var nextUnvisitedPathGeographicMapCellPosition = nextUnvisitedPathGeographicMapCellPosition

    
                        if(existingNextUnvisitedPathGeographicMapCellPosition != nextUnvisitedPathGeographicMapCellPosition)
                        logUtil!!.put(StringMaker().
                            append(associatedAdvancedRTSGameLayer!!.getName())!!.append(" nextUnvisitedPathGeographicMapCellPosition: ")!!.append(stringUtil!!.toString(nextUnvisitedPathGeographicMapCellPosition))!!.toString(), this, "setNextUnvisitedPathGeographicMapCellPosition")
}


}
                
            

