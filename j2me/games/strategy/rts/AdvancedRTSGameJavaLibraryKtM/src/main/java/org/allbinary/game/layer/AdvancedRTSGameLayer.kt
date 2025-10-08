
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
        package org.allbinary.game.layer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Canvas
import org.allbinary.animation.transition.shake.ShakeAnimationListener
import org.allbinary.animation.transition.shake.ShakeAnimationListenerFactory
import org.allbinary.game.input.form.RTSFormInput
import org.allbinary.game.layer.building.event.BuildingEventHandler
import org.allbinary.string.CommonStrings
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.animation.AnimationInterfaceFactoryInterface
import org.allbinary.animation.ProceduralAnimationInterfaceFactoryInterface
import org.allbinary.direction.Direction
import org.allbinary.direction.DirectionFactory
import org.allbinary.game.GameTypeFactory
import org.allbinary.game.combat.destroy.event.DestroyedEvent
import org.allbinary.game.combat.destroy.event.DestroyedEventHandler
import org.allbinary.game.combat.destroy.event.DestroyedEventListenerInterface
import org.allbinary.game.configuration.GameConfigurationCentral
import org.allbinary.game.health.Health
import org.allbinary.game.identification.Group
import org.allbinary.game.input.event.GameKeyEventFactory
import org.allbinary.game.layer.unit.UnitLayer
import org.allbinary.game.layer.waypoint.Waypoint2LogHelper
import org.allbinary.game.layer.waypoint.Waypoint2SelectedLogHelper
import org.allbinary.game.layer.waypoint.WaypointBase
import org.allbinary.game.layer.waypoint.WaypointLogHelper
import org.allbinary.game.layer.waypoint.WaypointRunnableLogHelper
import org.allbinary.game.layer.waypoint.WaypointRunnableSelectedLogHelper
import org.allbinary.game.layer.waypoint.WaypointSelectedLogHelper
import org.allbinary.graphics.Rectangle
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.media.AllBinaryVibration
import org.allbinary.media.AllBinaryVibrationME
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.game.multiplayer.layer.RemoteInfo
import org.allbinary.game.view.TileLayerPositionIntoViewPosition
import org.allbinary.math.AngleInfo
import org.allbinary.math.FrameUtil
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.map.GeographicMapCompositeInterface
import org.allbinary.media.graphics.geography.map.GeographicMapDirectionUtil
import org.allbinary.util.BasicArrayList
import org.allbinary.view.ViewPosition

open public class AdvancedRTSGameLayer : RTSLayer
                , DestroyedEventListenerInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val shakeListener: ShakeAnimationListener

    val vibration: AllBinaryVibrationME

    val duration: Int

    private var parentLayer: AdvancedRTSGameLayer

    var waypointBehaviorBase: WaypointBehaviorBase
public constructor (remoteInfo: RemoteInfo, parentLayer: AdvancedRTSGameLayer, groupInterface: Array<Group?>, rootName: String, name: String, healthInterface: Health, rtsFormInput: RTSFormInput, animationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, emptyAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, baseAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, buildAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, verticleBuildAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, proceduralAnimationInterfaceFactoryInterface: ProceduralAnimationInterfaceFactoryInterface, rectangle: Rectangle, x: Int, y: Int)                        

                            : this(remoteInfo, parentLayer, groupInterface, rootName, name, healthInterface, rtsFormInput, animationInterfaceFactoryInterface, emptyAnimationInterfaceFactoryInterface, baseAnimationInterfaceFactoryInterface, buildAnimationInterfaceFactoryInterface, verticleBuildAnimationInterfaceFactoryInterface, proceduralAnimationInterfaceFactoryInterface, rectangle, x, y, TileLayerPositionIntoViewPosition()){
    //var remoteInfo = remoteInfo
    //var parentLayer = parentLayer
    //var groupInterface = groupInterface
    //var rootName = rootName
    //var name = name
    //var healthInterface = healthInterface
    //var rtsFormInput = rtsFormInput
    //var animationInterfaceFactoryInterface = animationInterfaceFactoryInterface
    //var emptyAnimationInterfaceFactoryInterface = emptyAnimationInterfaceFactoryInterface
    //var baseAnimationInterfaceFactoryInterface = baseAnimationInterfaceFactoryInterface
    //var buildAnimationInterfaceFactoryInterface = buildAnimationInterfaceFactoryInterface
    //var verticleBuildAnimationInterfaceFactoryInterface = verticleBuildAnimationInterfaceFactoryInterface
    //var proceduralAnimationInterfaceFactoryInterface = proceduralAnimationInterfaceFactoryInterface
    //var rectangle = rectangle
    //var x = x
    //var y = y


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor (remoteInfo: RemoteInfo, parentLayer: AdvancedRTSGameLayer, groupInterface: Array<Group?>, rootName: String, name: String, healthInterface: Health, rtsFormInput: RTSFormInput, animationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, emptyAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, baseAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, buildAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, verticleBuildAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, proceduralAnimationInterfaceFactoryInterface: ProceduralAnimationInterfaceFactoryInterface, rectangle: Rectangle, x: Int, y: Int, viewPosition: ViewPosition)                        

                            : super(remoteInfo, groupInterface, rootName, name, healthInterface, rtsFormInput, animationInterfaceFactoryInterface, emptyAnimationInterfaceFactoryInterface, baseAnimationInterfaceFactoryInterface, buildAnimationInterfaceFactoryInterface, verticleBuildAnimationInterfaceFactoryInterface, proceduralAnimationInterfaceFactoryInterface, rectangle, x, y, viewPosition){
    //var remoteInfo = remoteInfo
    //var parentLayer = parentLayer
    //var groupInterface = groupInterface
    //var rootName = rootName
    //var name = name
    //var healthInterface = healthInterface
    //var rtsFormInput = rtsFormInput
    //var animationInterfaceFactoryInterface = animationInterfaceFactoryInterface
    //var emptyAnimationInterfaceFactoryInterface = emptyAnimationInterfaceFactoryInterface
    //var baseAnimationInterfaceFactoryInterface = baseAnimationInterfaceFactoryInterface
    //var buildAnimationInterfaceFactoryInterface = buildAnimationInterfaceFactoryInterface
    //var verticleBuildAnimationInterfaceFactoryInterface = verticleBuildAnimationInterfaceFactoryInterface
    //var proceduralAnimationInterfaceFactoryInterface = proceduralAnimationInterfaceFactoryInterface
    //var rectangle = rectangle
    //var x = x
    //var y = y
    //var viewPosition = viewPosition


                            //For kotlin this is before the body of the constructor.
                    
this.setVisible(false)
this.setWaypointBehavior(WaypointBehaviorBase())
this.shakeListener= ShakeAnimationListenerFactory.getInstance()
this.vibration= AllBinaryVibration.getInstance()
this.duration= GameConfigurationCentral.getInstance()!!.VIBRATION.getValue()!!.toInt() *100
this.setParentLayer(parentLayer)
}

public constructor ()                        

                            : super(RemoteInfo.REMOTE_INFO){


                            //For kotlin this is before the body of the constructor.
                    
this.setWaypointBehavior(WaypointBehaviorBase())
this.shakeListener= 
                                        null
                                    
this.vibration= 
                                        null
                                    
this.duration= 0
this.setParentLayer(
                            null)
}


                @Throws(Exception::class)
            
    open fun updateWaypointBehavior(geographicMapInterface: BasicGeographicMap)
        //nullable = true from not(false or (false and false)) = true
{
    //var geographicMapInterface = geographicMapInterface
super.updateWaypointBehavior(geographicMapInterface)
this.getWaypointBehavior()!!.getWaypoint()!!.setAllBinaryGameLayerManager(this.allBinaryGameLayerManagerP)
}


    open fun initVisibility(rtsPlayerLayerInterface: RTSPlayerLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{
var rtsPlayerLayerInterface = rtsPlayerLayerInterface

    var advancedRTSPlayerLayerInterface: AdvancedRTSPlayerLayerInterface = rtsPlayerLayerInterface as AdvancedRTSPlayerLayerInterface


    
                        if(advancedRTSPlayerLayerInterface!!.isLocalPlayer() || advancedRTSPlayerLayerInterface!!.getGameType() == GameTypeFactory.getInstance()!!.BOT)
                        
                                    {
                                    this.setVisible(true)

                                    }
                                
                        else {
                            this.setVisible(false)

                        }
                            
}


                @Throws(Exception::class)
            
    open fun construct(rtsPlayerLayerInterface: RTSPlayerLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{
var rtsPlayerLayerInterface = rtsPlayerLayerInterface
super.construct(rtsPlayerLayerInterface)
this.initVisibility(rtsPlayerLayerInterface)
BuildingEventHandler.getInstance()!!.addListener(this.getWaypointBehavior()!!.getWaypoint())
}


                @Throws(Exception::class)
            
    open fun setDestroyed(destroyed: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var destroyed = destroyed
super.setDestroyed(destroyed)

    
                        if(this.isDestroyed())
                        
                                    {
                                    BuildingEventHandler.getInstance()!!.removeListener(this.getWaypointBehavior()!!.getWaypoint())
BuildingEventHandler.getInstance()!!.removeListener(this)
DestroyedEventHandler.getInstance()!!.addListener(this)
RTSLayerUtil.getInstance()!!.destroyAndClear(this.getWaypointBehavior()!!.getOwnedWaypointList())

                                    }
                                
}


    open fun getParentLayer()
        //nullable = true from not(false or (false and true)) = true
: RTSLayer{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return parentLayer
}


    open fun setParentLayer(parentLayer: AdvancedRTSGameLayer)
        //nullable = true from not(false or (false and false)) = true
{
var parentLayer = parentLayer
this.parentLayer= parentLayer
}


    open fun getWaypointBehavior()
        //nullable = true from not(false or (false and true)) = true
: WaypointBehaviorBase{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.waypointBehaviorBase
}


    open fun setWaypointBehavior(unitWaypointHelper: WaypointBehaviorBase)
        //nullable = true from not(false or (false and false)) = true
{
var unitWaypointHelper = unitWaypointHelper
this.waypointBehaviorBase= unitWaypointHelper
}


    open fun getWaypointLogHelper()
        //nullable = true from not(false or (false and true)) = true
: WaypointLogHelper{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.waypointLogHelper
}


    open fun getWaypoint2LogHelper()
        //nullable = true from not(false or (false and true)) = true
: Waypoint2LogHelper{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.waypoint2LogHelper
}


    open fun getWaypointRunnableLogHelper()
        //nullable = true from not(false or (false and true)) = true
: WaypointRunnableLogHelper{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.waypointRunnableLogHelper
}


    open fun shouldAddWaypointFromBuilding()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

    
                        if(this.parentLayer != 
                                    null
                                 && this.parentLayer!!.getType() != UnitLayer.getStaticType())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    open fun isWaypointListEmptyOrOnlyTargets()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

    
                        if(this.getType() != UnitLayer.getStaticType())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(Exception::class)
            
    open fun buildingChase(allbinaryLayer: AllBinaryLayer, cellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var allbinaryLayer = allbinaryLayer
    //var cellPosition = cellPosition

    var geographicMapCellPosition: GeographicMapCellPosition = this.getCurrentGeographicMapCellPosition()!!


    var buildingDirection: Direction = GeographicMapDirectionUtil.getInstance()!!.getDirectionFromCellPositionToAdjacentCellPosition(geographicMapCellPosition, cellPosition)!!


    var angleInfo: AngleInfo = this.getRotationAnimationInterface()!!.getAngleInfoP()!!


    var angle: Int = FrameUtil.getInstance()!!.adjustAngleToFrameAngle(angleInfo!!.getAngle() +90)!!


    var gameKeyEventFactory: GameKeyEventFactory = GameKeyEventFactory.getInstance()!!


    
                        if(buildingDirection == DirectionFactory.getInstance()!!.UP)
                        
                                    {
                                    this.rtsLayer2LogHelper!!.buildingAbove(this)

    
                        if(angle > 180 && angle < 360)
                        
                                    {
                                    this.rtsLayer2LogHelper!!.buildingChaseLeft(this, angle)
this.getGameKeyEventList()!!.add(gameKeyEventFactory!!.getInstance(this, Canvas.LEFT))

    
                        if(angle <= 190)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                

                                    }
                                
                        else {
                            this.rtsLayer2LogHelper!!.buildingChaseRight(this, angle)
this.getGameKeyEventList()!!.add(gameKeyEventFactory!!.getInstance(this, Canvas.RIGHT))

    
                        if(angle >= 170)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                

                        }
                            

                                    }
                                
                             else 
    
                        if(buildingDirection == DirectionFactory.getInstance()!!.DOWN)
                        
                                    {
                                    this.rtsLayer2LogHelper!!.buildingDown(this)

    
                        if(angle > 180 && angle < 360)
                        
                                    {
                                    this.rtsLayer2LogHelper!!.buildingChaseLeft(this, angle)
this.getGameKeyEventList()!!.add(gameKeyEventFactory!!.getInstance(this, Canvas.RIGHT))

    
                        if(angle > 315)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                

                                    }
                                
                        else {
                            this.rtsLayer2LogHelper!!.buildingChaseRight(this, angle)
this.getGameKeyEventList()!!.add(gameKeyEventFactory!!.getInstance(this, Canvas.LEFT))

    
                        if(angle < 45)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                

                        }
                            

                                    }
                                
                             else 
    
                        if(buildingDirection == DirectionFactory.getInstance()!!.LEFT)
                        
                                    {
                                    this.rtsLayer2LogHelper!!.buildingLeft()

    
                        if(angle > 90 && angle < 270)
                        
                                    {
                                    this.rtsLayer2LogHelper!!.buildingChaseDown(this, angle)
this.getGameKeyEventList()!!.add(gameKeyEventFactory!!.getInstance(this, Canvas.LEFT))

    
                        if(angle < 135)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                

                                    }
                                
                        else {
                            this.rtsLayer2LogHelper!!.buildingChaseUp(this, angle)
this.getGameKeyEventList()!!.add(gameKeyEventFactory!!.getInstance(this, Canvas.RIGHT))

    
                        if(angle > 45)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                

                        }
                            

                                    }
                                
                             else 
    
                        if(buildingDirection == DirectionFactory.getInstance()!!.RIGHT)
                        
                                    {
                                    this.rtsLayer2LogHelper!!.buildingRight()

    
                        if(angle > 90 && angle < 270)
                        
                                    {
                                    this.rtsLayer2LogHelper!!.buildingChaseDown(this, angle)
this.getGameKeyEventList()!!.add(gameKeyEventFactory!!.getInstance(this, Canvas.RIGHT))

    
                        if(angle > 225)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                

                                    }
                                
                        else {
                            this.rtsLayer2LogHelper!!.buildingChaseUp(this, angle)
this.getGameKeyEventList()!!.add(gameKeyEventFactory!!.getInstance(this, Canvas.LEFT))

    
                        if(angle < 315 && angle > 180)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                

                        }
                            

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(Exception::class)
            
    open fun getSurroundingGeographicMapCellPositionList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{

    var geographicMapCompositeInterface: GeographicMapCompositeInterface = this.allBinaryGameLayerManagerP as GeographicMapCompositeInterface


    var geographicMapInterface: BasicGeographicMap = geographicMapCompositeInterface!!.getGeographicMapInterface()[0]!!

geographicMapCellPositionArea!!.update(geographicMapInterface)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return geographicMapCellPositionArea!!.getSurroundingGeographicMapCellPositionList()
}


    override fun setSelected(selected: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var selected = selected
super.setSelected(selected)

    
                        if(this.debug)
                        
                                    {
                                    
    
                        if(selected)
                        
                                    {
                                    this.waypointLogHelper= WaypointSelectedLogHelper.getInstance()
this.waypoint2LogHelper= Waypoint2SelectedLogHelper.getInstance()
this.waypointRunnableLogHelper= WaypointRunnableSelectedLogHelper.getInstance()

                                    }
                                
                        else {
                            this.waypointLogHelper= WaypointLogHelper.getInstance()
this.waypoint2LogHelper= Waypoint2LogHelper.getInstance()
this.waypointRunnableLogHelper= WaypointRunnableLogHelper.getInstance()

                        }
                            

                                    }
                                
}


    open fun onDestroyed(destroyedEvent: DestroyedEvent)
        //nullable = true from not(false or (false and false)) = true
{
var destroyedEvent = destroyedEvent

        try {
            
    var layerInterface: AllBinaryLayer = destroyedEvent!!.getLayerInterface()!!


    
                        if(layerInterface == this)
                        
                                    {
                                    DestroyedEventHandler.getInstance()!!.removeListener(this)

    var waypoint: WaypointBase = this.getWaypointBehavior()!!.getWaypoint() as WaypointBase

waypoint.reset()

                                    }
                                
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "onDestroyed", e)
}

}


}
                
            

