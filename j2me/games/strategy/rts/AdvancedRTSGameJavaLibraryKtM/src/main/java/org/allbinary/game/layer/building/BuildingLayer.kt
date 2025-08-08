
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
        package org.allbinary.game.layer.building



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import javax.microedition.lcdui.Graphics
import org.allbinary.game.input.form.RTSFormInput
import org.allbinary.game.input.form.VisibleCellPositionsSingleton
import org.allbinary.game.layer.AdvancedRTSGameLayer
import org.allbinary.game.layer.AdvancedRTSPlayerLayerInterface
import org.allbinary.game.layer.CollidableRTSBehavior
import org.allbinary.game.layer.GeographicMapCellPositionArea
import org.allbinary.game.layer.RTSLayerUtil
import org.allbinary.game.layer.RTSPlayerLayerInterface
import org.allbinary.game.layer.SelectionHudPaintable
import org.allbinary.game.layer.waypoint.Waypoint
import org.allbinary.util.BasicArrayList
import org.allbinary.string.CommonStrings
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.animation.AnimationInterfaceFactoryInterface
import org.allbinary.animation.ProceduralAnimationInterfaceFactoryInterface
import org.allbinary.animation.RotationAnimationInterfaceCompositeInterface
import org.allbinary.direction.Direction
import org.allbinary.direction.DirectionFactory
import org.allbinary.game.combat.damage.DamageFloaters
import org.allbinary.game.combat.damage.PtsDamageFloaters
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.GameFeatureFactory
import org.allbinary.game.graphics.hud.BasicHudFactory
import org.allbinary.game.health.Health
import org.allbinary.game.health.HealthBar
import org.allbinary.game.health.HealthBarTwodAnimation
import org.allbinary.game.identification.Group
import org.allbinary.game.tracking.TrackingEvent
import org.allbinary.game.tracking.TrackingEventHandler
import org.allbinary.game.tracking.TrackingEventListenerInterface
import org.allbinary.graphics.Rectangle
import org.allbinary.graphics.paint.NullPaintable
import org.allbinary.graphics.paint.Paintable
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.media.audio.SecondaryPlayerQueueFactory
import org.allbinary.media.audio.SelectSound
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.map.GeographicMapDirectionUtil
import org.allbinary.media.graphics.geography.map.drop.DropCellPositionHistory
import org.allbinary.time.TimeDelayHelper
import org.allbinary.weapon.media.audio.ExplosionBasicSound
import org.allbinary.game.multiplayer.layer.RemoteInfo

open public class BuildingLayer : AdvancedRTSGameLayer
                , RotationAnimationInterfaceCompositeInterface
                , TrackingEventListenerInterface {
        

        companion object {


open fun getStaticType()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 2
}



        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var buildingLevelCost: Int= 0

    private var productivity: Int= 0

    private var efficiency: Int

    private var efficiencyPerLevel: Int

    private val trackingEvent: TrackingEvent

    private val damageFloaters: DamageFloaters

    private val damageFloatersPaintableInterface: Paintable

    private val healthBar: Paintable

    private val pathsHashtable: Hashtable<Any, Any>
public constructor        (remoteInfo: RemoteInfo, groupInterface: Array<Group?>, rootName: String, name: String, healthInterface: Health, rtsFormInput: RTSFormInput, animationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, emptyAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, baseAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, buildAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, verticleBuildAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, proceduralAnimationInterfaceFactoryInterface: ProceduralAnimationInterfaceFactoryInterface, rectangle: Rectangle, x: Int, y: Int)                        

                            : super(remoteInfo, 
                            null, groupInterface, rootName, name, healthInterface, rtsFormInput, animationInterfaceFactoryInterface, emptyAnimationInterfaceFactoryInterface, baseAnimationInterfaceFactoryInterface, buildAnimationInterfaceFactoryInterface, verticleBuildAnimationInterfaceFactoryInterface, proceduralAnimationInterfaceFactoryInterface, rectangle, x, y){

                    var remoteInfo = remoteInfo


                    var groupInterface = groupInterface


                    var rootName = rootName


                    var name = name


                    var healthInterface = healthInterface


                    var rtsFormInput = rtsFormInput


                    var animationInterfaceFactoryInterface = animationInterfaceFactoryInterface


                    var emptyAnimationInterfaceFactoryInterface = emptyAnimationInterfaceFactoryInterface


                    var baseAnimationInterfaceFactoryInterface = baseAnimationInterfaceFactoryInterface


                    var buildAnimationInterfaceFactoryInterface = buildAnimationInterfaceFactoryInterface


                    var verticleBuildAnimationInterfaceFactoryInterface = verticleBuildAnimationInterfaceFactoryInterface


                    var proceduralAnimationInterfaceFactoryInterface = proceduralAnimationInterfaceFactoryInterface


                    var rectangle = rectangle


                    var x = x


                    var y = y


                            //For kotlin this is before the body of the constructor.
                    
this.setCollidableInferface(CollidableRTSBehavior(this, true))
this.getWaypointBehavior()!!.setWaypoint(Waypoint(this, SelectSound.getInstance()))

    
                        if(Features.getInstance()!!.isFeature(GameFeatureFactory.getInstance()!!.DAMAGE_FLOATERS))
                        
                                    {
                                    this.damageFloatersPaintableInterface= this.damageFloaters= PtsDamageFloaters(this)

                                    }
                                
                        else {
                            this.damageFloatersPaintableInterface= NullPaintable.getInstance()
this.damageFloaters= DamageFloaters()

                        }
                            

    
                        if(Features.getInstance()!!.isFeature(GameFeatureFactory.getInstance()!!.HEALTH_BARS))
                        
                                    {
                                    this.healthBar= HealthBar(this, this.getHealthInterface(), HealthBarTwodAnimation(this as AllBinaryLayer, BasicHudFactory.getInstance()!!.BOTTOMLEFT),  -1)

                                    }
                                
                        else {
                            this.healthBar= NullPaintable.getInstance()

                        }
                            
this.pathsHashtable= Hashtable<Any, Any>()
this.setMaxLevel(30)
this.setProductivity(1)
this.setEfficiency(this.calculateEfficiency())
this.efficiencyPerLevel= 10000 /this.getMaxLevel() +10000 % this.getMaxLevel()
this.efficiency= this.efficiencyPerLevel
this.generateMoveOutOfBuildAreaPaths()
this.trackingEvent= TrackingEvent(this)
}

public constructor        ()                        

                            : super(){

                            //For kotlin this is before the body of the constructor.
                    
this.setCollidableInferface(CollidableRTSBehavior(this, true))
this.getWaypointBehavior()!!.setWaypoint(Waypoint(this, SelectSound.getInstance()))
this.trackingEvent= 
                                        null
                                    
this.damageFloaters= 
                                        null
                                    
this.damageFloatersPaintableInterface= 
                                        null
                                    
this.healthBar= 
                                        null
                                    
this.pathsHashtable= 
                                        null
                                    
}


    var local: Boolean= false

open fun initVisibility(rtsPlayerLayerInterface: RTSPlayerLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var rtsPlayerLayerInterface = rtsPlayerLayerInterface

    var advancedRTSPlayerLayerInterface: AdvancedRTSPlayerLayerInterface = rtsPlayerLayerInterface as AdvancedRTSPlayerLayerInterface


    
                        if(advancedRTSPlayerLayerInterface!!.isLocalPlayer())
                        
                                    {
                                    this.local= true
this.addVisibility()

                                    }
                                
                        else {
                            this.local= false

                        }
                            
super.initVisibility(rtsPlayerLayerInterface)
}


                @Throws(Exception::class)
            
open fun construct(rtsPlayerLayerInterface: RTSPlayerLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var rtsPlayerLayerInterface = rtsPlayerLayerInterface
super.construct(rtsPlayerLayerInterface)
TrackingEventHandler.getInstance()!!.addListener(this)
}


open fun onMovement(trackingEvent: TrackingEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var trackingEvent = trackingEvent

        try {
            
    var layerInterface: AdvancedRTSGameLayer = trackingEvent!!.getLayerInterface() as AdvancedRTSGameLayer


    
                        if(layerInterface!!.getGroupInterface()[0] != this.getGroupInterface()[0])
                        
                                    {
                                    layerInterface!!.onMovementFound(this.trackingEvent)

                                    }
                                
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "onMovement", e)
}

}


    val timeDelayHelper: TimeDelayHelper = TimeDelayHelper(3000)

                @Throws(Exception::class)
            
open fun processBuiltTick(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryLayerManager = allBinaryLayerManager

    
                        if(this.getHealthInterface()!!.isDamaged())
                        
                                    {
                                    this.setAnimationInterface(this.destroyAnimationInterface)

                                    }
                                

    
                        if(!this.getHealthInterface()!!.isAlive())
                        
                                    {
                                    
    
                        if(this.isReadyForExplosion())
                        
                                    {
                                    
    var currentFrame: Int = this.destroyAnimationInterface!!.getFrame()!!
            


    var size: Int = this.destroyAnimationInterface!!.getSize() -1


    
                        if(currentFrame == size && !this.timeDelayHelper!!.isTime())
                        
                                    {
                                    
    
                        if(!this.getHealthInterface()!!.isAlive())
                        
                                    {
                                    this.setDestroyed(true)

                                    }
                                

                                    }
                                
                        else {
                            this.destroyAnimationInterface!!.nextFrame()

                        }
                            

                                    }
                                
                        else {
                            this.setAnimationInterface(this.destroyAnimationInterface)
SecondaryPlayerQueueFactory.getInstance()!!.add(ExplosionBasicSound.getInstance())
this.shakeListener!!.onSmallShakeEvent()
vibration.vibrate(duration, 0, 0)
this.timeDelayHelper!!.setStartTime()
this.setReadyForExplosion(true)

                        }
                            

                                    }
                                
                        else {
                            super.processBuiltTick(allBinaryLayerManager)

                        }
                            
this.indexedButShouldBeRotationAnimationInterface!!.nextFrame()
}


open fun calculateEfficiency()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.efficiencyPerLevel
}


open fun getCost()
        //nullable = true from not(false or (false and true)) = true
: Int{
    var total: Int = RTSLayerUtil.getInstance()!!.getCostExponential(this.getLevel() *this.getBuildingLevelCost())!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return total
}


open fun getDowngradeCost()
        //nullable = true from not(false or (false and true)) = true
: Int{
    var downgradeCost: Int = RTSLayerUtil.getInstance()!!.getCostExponential((this.getLevel() -1) *getBuildingLevelCost())!!
            

logUtil!!.put("Cost: " +downgradeCost, this, 
                            "getDowngradeCost")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return downgradeCost *9 /10
}


open fun getUpgradeCost()
        //nullable = true from not(false or (false and true)) = true
: Int{
    var upgradeCost: Int = RTSLayerUtil.getInstance()!!.getCostExponential((this.getLevel() +1) *getBuildingLevelCost())!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return upgradeCost
}


open fun downgrade()
        //nullable = true from not(false or (false and true)) = true
{super.downgrade()
this.setProductivity(this.getProductivity() -1)
this.setEfficiency(this.getEfficiency() -this.calculateEfficiency())
this.getHealthInterface()!!.setMaxHealth(this.getHealthInterface()!!.getMaxHealth() -((this.getLevel() +1) *100))
}


open fun upgrade()
        //nullable = true from not(false or (false and true)) = true
{super.upgrade()
this.setProductivity(this.getProductivity() +1)
this.setEfficiency(this.getEfficiency() +this.calculateEfficiency())
this.getHealthInterface()!!.setMaxHealth(this.getHealthInterface()!!.getMaxHealth() +(this.getLevel() *100))
}


open fun getBuildingLevelCost()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return buildingLevelCost
}


open fun setBuildingLevelCost(buildingLevelCost: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var buildingLevelCost = buildingLevelCost
this.buildingLevelCost= buildingLevelCost
}


open fun getProductivity()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return productivity
}


open fun setProductivity(productivity: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var productivity = productivity
this.productivity= productivity
}


open fun getEfficiency()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return efficiency
}


open fun setEfficiency(efficiency: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var efficiency = efficiency
this.efficiency= efficiency
}


                @Throws(Exception::class)
            
open fun generateMoveOutOfBuildAreaPaths()
        //nullable = true from not(false or (false and true)) = true
{
    var occupyList: BasicArrayList = this.geographicMapCellPositionArea!!.getOccupyingGeographicMapCellPositionList()!!
            


    var surroundList: BasicArrayList = this.geographicMapCellPositionArea!!.getSurroundingGeographicMapCellPositionList()!!
            


    var NO_DIRECTION: Direction = DirectionFactory.getInstance()!!.NO_DIRECTION


    var geographicMapDirectionUtil: GeographicMapDirectionUtil = GeographicMapDirectionUtil.getInstance()!!
            


    var pathsList: BasicArrayList


    var occupyGeographicMapCellPosition: GeographicMapCellPosition


    var surroundGeographicMapCellPosition: GeographicMapCellPosition


    var list: BasicArrayList





                        for (index2 in occupyList!!.size() -1 downTo 0)


        {pathsList= BasicArrayList()
occupyGeographicMapCellPosition= occupyList!!.get(index2) as GeographicMapCellPosition




                        for (index in surroundList!!.size() -1 downTo 0)


        {surroundGeographicMapCellPosition= surroundList!!.get(index) as GeographicMapCellPosition

    
                        if(geographicMapDirectionUtil!!.getEightDirectionFromCellPositionToAdjacentCellPosition(surroundGeographicMapCellPosition, occupyGeographicMapCellPosition) != NO_DIRECTION)
                        
                                    {
                                    list= BasicArrayList(1)
list.add(surroundGeographicMapCellPosition)
pathsList!!.add(list)

                                    }
                                
}

this.pathsHashtable!!.put(occupyGeographicMapCellPosition, pathsList)
}

}


open fun getMoveOutOfBuildAreaPath(geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var geographicMapCellPosition = geographicMapCellPosition

    var pathsList: BasicArrayList = this.pathsHashtable!!.get(geographicMapCellPosition as Object?) as BasicArrayList




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return pathsList
}


open fun getEndGeographicMapCellPositionList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.geographicMapCellPositionArea!!.getSurroundingGeographicMapCellPositionList()
}


open fun shouldHandleStartSameAsEnd()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics

    
                        if(this.isVisible())
                        
                                    {
                                    super.paint(graphics)
this.damageFloatersPaintableInterface!!.paint(graphics)
this.healthBar!!.paint(graphics)

                                    }
                                
}


                @Throws(Exception::class)
            
open fun damage(damage: Int, damageType: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var damage = damage


                    var damageType = damageType
super.damage(damage, damageType)
this.damageFloaters!!.add(damage)

    
                        if(damage > 0)
                        this.getHealthInterface()!!.damage(damage)
}


                @Throws(Exception::class)
            
open fun getDamage(damageType: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var damageType = damageType



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


open fun addVisibility()
        //nullable = true from not(false or (false and true)) = true
{
    var geographicMapCellPositionArea: GeographicMapCellPositionArea = this.geographicMapCellPositionArea


    var occupyList: BasicArrayList = geographicMapCellPositionArea!!.getOccupyingGeographicMapCellPositionList()!!
            

VisibleCellPositionsSingleton.getInstance()!!.addStationaryCellPositions(occupyList)

    var surroundList: BasicArrayList = geographicMapCellPositionArea!!.getSurroundingGeographicMapCellPositionList()!!
            

VisibleCellPositionsSingleton.getInstance()!!.addStationaryCellPositions(surroundList)
}


open fun removeVisibility()
        //nullable = true from not(false or (false and true)) = true
{
    var occupyList: BasicArrayList = this.geographicMapCellPositionArea!!.getOccupyingGeographicMapCellPositionList()!!
            

VisibleCellPositionsSingleton.getInstance()!!.removeStationaryCellPositions(occupyList)

    var surroundList: BasicArrayList = this.geographicMapCellPositionArea!!.getSurroundingGeographicMapCellPositionList()!!
            

VisibleCellPositionsSingleton.getInstance()!!.removeStationaryCellPositions(surroundList)
}


                @Throws(Exception::class)
            
open fun setDestroyed(destroyed: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var destroyed = destroyed
super.setDestroyed(destroyed)

    
                        if(this.isDestroyed())
                        
                                    {
                                    DropCellPositionHistory.getInstance()!!.remove(this)
TrackingEventHandler.getInstance()!!.removeListener(this)

    
                        if(this.local)
                        
                                    {
                                    this.removeVisibility()

                                    }
                                

    
                        if(!this.getHealthInterface()!!.isAlive())
                        
                                    {
                                    
    var damage: Int = this.getHealthInterface()!!.getMaxHealth()!!
            


    
                        if(damage > 10)
                        
                                    {
                                    SecondaryPlayerQueueFactory.getInstance()!!.add(ExplosionBasicSound.getInstance())

    
                        if(damage < 100)
                        
                                    {
                                    this.shakeListener!!.onSmallShakeEvent()
vibration.vibrate(duration, 0, 0)

                                    }
                                
                             else 
    
                        if(damage < 1000)
                        
                                    {
                                    this.shakeListener!!.onMediumShakeEvent()
vibration.vibrate(duration *2, 0, 0)

                                    }
                                
                             else 
    
                        if(damage < 3000)
                        
                                    {
                                    this.shakeListener!!.onLargeShakeEvent()
vibration.vibrate(duration *4, 0, 0)

                                    }
                                

                                    }
                                

                                    }
                                

                                    }
                                
}


open fun createHudPaintable()
        //nullable = true from not(false or (false and true)) = true
: SelectionHudPaintable{
    var buildingInfoHudPaintable: BuildingInfoHudPaintable = BuildingInfoHudPaintable.getInstance()!!
            

buildingInfoHudPaintable!!.setBasicColorP(this.allBinaryGameLayerManagerP!!.getForegroundBasicColor())
buildingInfoHudPaintable!!.setRtsLayer(this)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return buildingInfoHudPaintable
}


open fun getHudPaintable()
        //nullable = true from not(false or (false and true)) = true
: SelectionHudPaintable{
    var buildingInfoHudPaintable: BuildingInfoHudPaintable = BuildingInfoHudPaintable.getInstance()!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return buildingInfoHudPaintable
}


open fun getType()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BuildingLayer.getStaticType()
}


}
                
            

