
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2002 AllBinary 
                *   
                *  By agreeing to this license you and any business entity you represent are 
                *  legally bound to the AllBinary Open License Version 1 legal agreement. 
                *   
                *  You may obtain the AllBinary Open License Version 1 legal agreement from 
                *  AllBinary or the root directory of AllBinary's AllBinary Platform repository. 
                *    Created By: Travis Berthelot  
        */
        
        /* Generated Code Do Not Modify */
        package org.allbinary.game.input.form



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.AdvancedPlayerOwnedRTSLayers
import org.allbinary.game.layer.AdvancedRTSPlayerLayerInterface
import org.allbinary.game.layer.RTSLayer
import org.allbinary.game.layer.RTSLayerEvent
import org.allbinary.game.layer.RTSPlayerLayerInterface
import org.allbinary.game.layer.building.event.BuildingEventHandler
import org.allbinary.game.layer.building.event.LocalPlayerBuildingEventHandler
import org.allbinary.game.layer.waypoint.WaypointCellPositionHistory
import org.allbinary.logic.java.bool.BooleanFactory
import org.allbinary.game.identification.Group
import org.allbinary.game.layer.AllBinaryGameLayerManager
import org.allbinary.game.layer.hud.event.GameNotificationEvent
import org.allbinary.game.layer.hud.event.GameNotificationEventHandler
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.media.audio.ErrorSound
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.GeographicMapCompositeInterface
import org.allbinary.media.graphics.geography.map.drop.DropCellPositionHistory

open public class BuildingAdvancedRTSFormInput : BuildingRTSFormInput {
        

    val atLeastOneHouseGameNotificationEvent: GameNotificationEvent
public constructor        (groupInterface: Array<Group?>, isUnitProducer: Boolean)                        

                            : super(groupInterface, isUnitProducer){

                    var groupInterface = groupInterface


                    var isUnitProducer = isUnitProducer


                            //For kotlin this is before the body of the constructor.
                    

    var basicColorFactory: BasicColorFactory = BasicColorFactory.getInstance()!!
            

this.atLeastOneHouseGameNotificationEvent= GameNotificationEvent(this, 
                            "Build At Least One House First", SmallIntegerSingletonFactory.getInstance()!!.getInstance(2), basicColorFactory!!.WHITE, BooleanFactory.getInstance()!!.FALSE)
}


                @Throws(Exception::class)
            
open fun setAllBinaryGameLayerManager(allBinaryGameLayerManager: AllBinaryGameLayerManager)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryGameLayerManager = allBinaryGameLayerManager
super.setAllBinaryGameLayerManager(allBinaryGameLayerManager)

    var geographicMapCompositeInterface: GeographicMapCompositeInterface = allBinaryGameLayerManager as GeographicMapCompositeInterface


    var geographicMapInterface: BasicGeographicMap = geographicMapCompositeInterface!!.getGeographicMapInterface()[0]!!

this.atLeastOneHouseGameNotificationEvent!!.setBasicColorP(geographicMapInterface!!.getForegroundBasicColor())
}


open fun isPositionBlocked()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    
                        if(DropCellPositionHistory.getInstance()!!.isCellPositionWithDrop(this.getSelectedGeographicCellPosition()) || WaypointCellPositionHistory.getInstance()!!.isCellPositionWithDrop(this.getSelectedGeographicCellPosition()))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


                @Throws(Exception::class)
            
open fun isBuildAttemptValid(rtsPlayerLayerInterface: RTSPlayerLayerInterface, layerInterface: RTSLayer)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var rtsPlayerLayerInterface = rtsPlayerLayerInterface


                    var layerInterface = layerInterface

    var advancedRTSPlayerLayerInterface: AdvancedRTSPlayerLayerInterface = rtsPlayerLayerInterface as AdvancedRTSPlayerLayerInterface


    var advancedPlayerOwnedRTSLayers: AdvancedPlayerOwnedRTSLayers = advancedRTSPlayerLayerInterface!!.getAdvancedPlayerOwnedRTSLayers()!!
            


    var totalHouses: Int = advancedPlayerOwnedRTSLayers!!.getHouseList()!!.size()!!
            


    
                        if(totalHouses < 1 && layerInterface!!.getName()!!.indexOf(
                            " House") < 0)
                        
                                    {
                                    rtsPlayerLayerInterface!!.add(ErrorSound.getInstance())

    
                        if(!rtsPlayerLayerInterface!!.implmentsArtificialIntelligenceCompositeInterface())
                        
                                    {
                                    GameNotificationEventHandler.getInstance()!!.fireEvent(atLeastOneHouseGameNotificationEvent)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.isBuildAttemptValid(rtsPlayerLayerInterface, layerInterface)
}


    private val BUILD_BUILDING_RTS_LAYER_EVENT: RTSLayerEvent = RTSLayerEvent(
                            null)

                @Throws(Exception::class)
            
open fun add(rtsPlayerLayerInterface: RTSPlayerLayerInterface, layerManager: AllBinaryLayerManager, layerInterface: RTSLayer)
        //nullable = true from not(false or (false and false)) = true
{

                    var rtsPlayerLayerInterface = rtsPlayerLayerInterface


                    var layerManager = layerManager


                    var layerInterface = layerInterface
BUILD_BUILDING_RTS_LAYER_EVENT.setRtsLayer(layerInterface)
BuildingEventHandler.getInstance()!!.fireEvent(BUILD_BUILDING_RTS_LAYER_EVENT)

    
                        if(
                                    (rtsPlayerLayerInterface as AdvancedRTSPlayerLayerInterface).isLocalPlayer())
                        
                                    {
                                    LocalPlayerBuildingEventHandler.getInstance()!!.fireEvent(BUILD_BUILDING_RTS_LAYER_EVENT)

                                    }
                                
super.add(rtsPlayerLayerInterface, layerManager, layerInterface)
}


}
                
            

