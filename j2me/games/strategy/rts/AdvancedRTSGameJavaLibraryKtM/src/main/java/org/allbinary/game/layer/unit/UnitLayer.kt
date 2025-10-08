
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
        
        import java.lang.Integer
        
        import java.lang.Math
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker
import java.util.Hashtable
import javax.microedition.lcdui.Canvas
import javax.microedition.lcdui.Graphics
import org.allbinary.game.layer.PathAnimation
import org.allbinary.game.layer.SteeringVisitor
import org.allbinary.game.layer.RTSLayer2SelectedLogHelper
import org.allbinary.game.layer.RTSLayerSelectedLogHelper
import org.allbinary.game.layer.RTSLayerLogHelper
import org.allbinary.game.input.form.VisibleCellPositionsSingleton
import org.allbinary.game.input.form.WaypointRTSFormInput
import org.allbinary.game.layer.AdvancedRTSGameLayer
import org.allbinary.game.layer.CaptionResources
import org.allbinary.game.layer.RTSLayerEvent
import org.allbinary.game.layer.RTSLayerHudPaintable
import org.allbinary.game.layer.RTSPlayerLayerInterface
import org.allbinary.game.layer.SelectionHudPaintable
import org.allbinary.game.layer.SensorActionFactory
import org.allbinary.game.layer.building.BuildingLayer
import org.allbinary.game.layer.building.event.BuildingEventHandler
import org.allbinary.game.layer.building.event.BuildingEventListenerInterface
import org.allbinary.game.layer.waypoint.event.WaypointEventHandlerFactory
import org.allbinary.media.audio.AttackSound
import org.allbinary.util.BasicArrayList
import org.allbinary.string.CommonStrings
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.animation.Animation
import org.allbinary.animation.AnimationInterfaceFactoryInterface
import org.allbinary.animation.FeaturedAnimationInterfaceFactoryInterfaceFactory
import org.allbinary.animation.IndexedAnimation
import org.allbinary.animation.NullAnimationFactory
import org.allbinary.animation.NullIndexedAnimationFactory
import org.allbinary.animation.NullRotationAnimationFactory
import org.allbinary.animation.ProceduralAnimationInterfaceFactoryInterface
import org.allbinary.animation.RotationAnimation
import org.allbinary.animation.caption.CaptionAnimationHelper
import org.allbinary.animation.caption.CaptionAnimationHelperBase
import org.allbinary.animation.vector.AdjustedCircleAnimation
import org.allbinary.direction.Direction
import org.allbinary.game.combat.damage.DamageFloaters
import org.allbinary.game.combat.damage.PtsDamageFloaters
import org.allbinary.game.combat.weapon.WeaponProperties
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.GameFeatureFactory
import org.allbinary.game.configuration.feature.HTMLFeatureFactory
import org.allbinary.game.graphics.hud.BasicHudFactory
import org.allbinary.game.health.Health
import org.allbinary.game.health.HealthBar
import org.allbinary.game.health.HealthBarTwodAnimation
import org.allbinary.game.identification.Group
import org.allbinary.game.input.event.GameKeyEvent
import org.allbinary.game.input.event.GameKeyEventFactory
import org.allbinary.game.input.event.GameKeyEventUtil
import org.allbinary.game.layer.AllBinaryGameLayerManager
import org.allbinary.game.layer.AllBinaryTiledLayer
import org.allbinary.game.layer.LinePathRelativeAnimation
import org.allbinary.game.layer.PathFindingLayerInterface
import org.allbinary.game.layer.RTSLayer2LogHelper
import org.allbinary.game.layer.TiledLayerUtil
import org.allbinary.game.layer.VehicleFrictionProperties
import org.allbinary.game.layer.VehicleProperties
import org.allbinary.game.layer.capital.event.CapitalEvent
import org.allbinary.game.layer.capital.event.CapitalEventHandlerFactory
import org.allbinary.game.layer.geographic.map.LayerPartialCellPositionsUtil
import org.allbinary.game.layer.special.SpecialDownGameInputProcessor
import org.allbinary.game.layer.special.SpecialFireGameInputProcessor
import org.allbinary.game.layer.special.SpecialLeftGameInputProcessor
import org.allbinary.game.layer.special.SpecialRightGameInputProcessor
import org.allbinary.game.layer.special.SpecialUpGameInputProcessor
import org.allbinary.game.layer.waypoint.MultipassNoCacheWaypoint
import org.allbinary.game.layer.waypoint.NoCacheWaypoint
import org.allbinary.game.layer.waypoint.WaypointBase
import org.allbinary.game.part.weapon.BasicWeaponPart
import org.allbinary.game.part.weapon.SalvoInterface
import org.allbinary.game.physics.velocity.VelocityProperties
import org.allbinary.game.tracking.TrackingEvent
import org.allbinary.game.tracking.TrackingEventHandler
import org.allbinary.game.tracking.TrackingEventListenerInterface
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.Rectangle
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.paint.NullPaintable
import org.allbinary.graphics.paint.Paintable
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.layer.Layer
import org.allbinary.layer.LayerInterfaceFactoryInterface
import org.allbinary.logic.math.BasicDecimal
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.math.AngleFactory
import org.allbinary.math.AngleInfo
import org.allbinary.math.FrameUtil
import org.allbinary.math.LayerDistanceUtil
import org.allbinary.media.audio.SecondaryPlayerQueueFactory
import org.allbinary.media.audio.Sound
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.BasicGeographicMapCellPositionFactory
import org.allbinary.media.graphics.geography.map.GeographicMapCellHistory
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.map.drop.DropCellPositionHistory
import org.allbinary.view.ViewPosition
import org.allbinary.weapon.media.audio.ExplosionBasicSound
import org.allbinary.game.multiplayer.layer.RemoteInfo
import org.allbinary.game.view.TileLayerPositionIntoViewPosition
import org.allbinary.math.NamedAngle
import org.allbinary.media.graphics.geography.map.GeographicMapCompositeInterface
import org.allbinary.media.graphics.geography.map.racetrack.RaceTrackGeographicMap
import org.allbinary.string.CommonPhoneStrings

open public class UnitLayer : AdvancedRTSGameLayer
                , BuildingEventListenerInterface
                , TrackingEventListenerInterface {
        
companion object {
            
    private val partialPositionList: BasicArrayList = BasicArrayList(4)

    private val SENSOR_RANGE_MULTIPLIER: Int = 6

    private val MOVE: String = "Moving"

    open fun getStaticType()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 1
}


    open fun getPartialpositionlist()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return partialPositionList
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val basicColorFactory: BasicColorFactory = BasicColorFactory.getInstance()!!

    private val layerPartialCellPositionsUtil: LayerPartialCellPositionsUtil = LayerPartialCellPositionsUtil.getInstance()!!

    private val layerDistanceUtil: LayerDistanceUtil = LayerDistanceUtil.getInstance()!!

    private val angleFactory: AngleFactory = AngleFactory.getInstance()!!

    private val maxResourceLoad: Short

    private val vehicleProperties: VehicleProperties

    var accelerationBasicDecimal: BasicDecimal = BasicDecimal(1600)

    var decelerationBasicDecimal: BasicDecimal = BasicDecimal( -1000)

    private val trackingEvent: TrackingEvent

    private val damageFloaters: DamageFloaters

    private val damageFloatersPaintableInterface: Paintable

    private val healthBar: Paintable

    private val moveSoundInterface: Sound

    private val initResourceAnimation: RotationAnimation

    private var resourceAnimation: IndexedAnimation = NullIndexedAnimationFactory.getFactoryInstance()!!.getInstance(0) as IndexedAnimation

    private val initPathAnimation: PathAnimation

    private var pathAnimation: Animation = NullAnimationFactory.getFactoryInstance()!!.getInstance(0)!!

    private val captionAnimationHelper: CaptionAnimationHelperBase = CaptionAnimationHelper(FeaturedAnimationInterfaceFactoryInterfaceFactory.getInstance()!!.get(CaptionResources.getInstance()!!.RESOURCE)!!.getInstance(0),  -23,  -25, 6, 0)

    private val decalAnimation: RotationAnimation

    private val waypointLayerInterfaceFactoryInterface: LayerInterfaceFactoryInterface

    private var resourceLoad: Short = 0

    private var weaponRange: Int= 0

    var rtsLogHelper: RTSLayerLogHelper = RTSLayerLogHelper.getInstance()!!

    var rotationAnimationInterface: RotationAnimation

    private var movementAngle: NamedAngle = this.angleFactory!!.NOT_ANGLE

    private var steeringInsideGeographicMapCellPosition: GeographicMapCellPosition
protected constructor (remoteInfo: RemoteInfo, parentLayer: AdvancedRTSGameLayer, groupInterface: Array<Group?>, rootName: String, name: String, vehicleProperties: VehicleProperties, healthInterface: Health, maxLoad: Integer, moveSoundInterface: Sound, waypointLayerInterfaceFactoryInterface: LayerInterfaceFactoryInterface, animationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, emptyAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, baseAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, buildAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, verticleBuildAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, decalAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, proceduralAnimationInterfaceFactoryInterface: ProceduralAnimationInterfaceFactoryInterface, rectangle: Rectangle, direction: Direction, x: Int, y: Int, z: Int)                        

                            : this(remoteInfo, parentLayer, groupInterface, rootName, name, vehicleProperties, healthInterface, maxLoad, moveSoundInterface, waypointLayerInterfaceFactoryInterface, animationInterfaceFactoryInterface, emptyAnimationInterfaceFactoryInterface, baseAnimationInterfaceFactoryInterface, buildAnimationInterfaceFactoryInterface, verticleBuildAnimationInterfaceFactoryInterface, decalAnimationInterfaceFactoryInterface, proceduralAnimationInterfaceFactoryInterface, rectangle, direction, x, y, z, TileLayerPositionIntoViewPosition()){
    //var remoteInfo = remoteInfo
    //var parentLayer = parentLayer
    //var groupInterface = groupInterface
    //var rootName = rootName
    //var name = name
    //var vehicleProperties = vehicleProperties
    //var healthInterface = healthInterface
    //var maxLoad = maxLoad
    //var moveSoundInterface = moveSoundInterface
    //var waypointLayerInterfaceFactoryInterface = waypointLayerInterfaceFactoryInterface
    //var animationInterfaceFactoryInterface = animationInterfaceFactoryInterface
    //var emptyAnimationInterfaceFactoryInterface = emptyAnimationInterfaceFactoryInterface
    //var baseAnimationInterfaceFactoryInterface = baseAnimationInterfaceFactoryInterface
    //var buildAnimationInterfaceFactoryInterface = buildAnimationInterfaceFactoryInterface
    //var verticleBuildAnimationInterfaceFactoryInterface = verticleBuildAnimationInterfaceFactoryInterface
    //var decalAnimationInterfaceFactoryInterface = decalAnimationInterfaceFactoryInterface
    //var proceduralAnimationInterfaceFactoryInterface = proceduralAnimationInterfaceFactoryInterface
    //var rectangle = rectangle
    //var direction = direction
    //var x = x
    //var y = y
    //var z = z


                            //For kotlin this is before the body of the constructor.
                    
}

protected constructor (remoteInfo: RemoteInfo, parentLayer: AdvancedRTSGameLayer, groupInterface: Array<Group?>, rootName: String, name: String, vehicleProperties: VehicleProperties, healthInterface: Health, maxLoad: Integer, moveSoundInterface: Sound, waypointLayerInterfaceFactoryInterface: LayerInterfaceFactoryInterface, animationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, emptyAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, baseAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, buildAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, verticleBuildAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, decalAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, proceduralAnimationInterfaceFactoryInterface: ProceduralAnimationInterfaceFactoryInterface, rectangle: Rectangle, direction: Direction, x: Int, y: Int, z: Int, viewPosition: ViewPosition)                        

                            : this(remoteInfo, parentLayer, groupInterface, rootName, name, vehicleProperties, healthInterface, maxLoad, moveSoundInterface, waypointLayerInterfaceFactoryInterface, animationInterfaceFactoryInterface, emptyAnimationInterfaceFactoryInterface, baseAnimationInterfaceFactoryInterface, buildAnimationInterfaceFactoryInterface, verticleBuildAnimationInterfaceFactoryInterface, decalAnimationInterfaceFactoryInterface, NullRotationAnimationFactory.getFactoryInstance(), proceduralAnimationInterfaceFactoryInterface, rectangle, direction, x, y, z, viewPosition){
    //var remoteInfo = remoteInfo
    //var parentLayer = parentLayer
    //var groupInterface = groupInterface
    //var rootName = rootName
    //var name = name
    //var vehicleProperties = vehicleProperties
    //var healthInterface = healthInterface
    //var maxLoad = maxLoad
    //var moveSoundInterface = moveSoundInterface
    //var waypointLayerInterfaceFactoryInterface = waypointLayerInterfaceFactoryInterface
    //var animationInterfaceFactoryInterface = animationInterfaceFactoryInterface
    //var emptyAnimationInterfaceFactoryInterface = emptyAnimationInterfaceFactoryInterface
    //var baseAnimationInterfaceFactoryInterface = baseAnimationInterfaceFactoryInterface
    //var buildAnimationInterfaceFactoryInterface = buildAnimationInterfaceFactoryInterface
    //var verticleBuildAnimationInterfaceFactoryInterface = verticleBuildAnimationInterfaceFactoryInterface
    //var decalAnimationInterfaceFactoryInterface = decalAnimationInterfaceFactoryInterface
    //var proceduralAnimationInterfaceFactoryInterface = proceduralAnimationInterfaceFactoryInterface
    //var rectangle = rectangle
    //var direction = direction
    //var x = x
    //var y = y
    //var z = z
    //var viewPosition = viewPosition


                            //For kotlin this is before the body of the constructor.
                    
}

protected constructor (remoteInfo: RemoteInfo, parentLayer: AdvancedRTSGameLayer, groupInterface: Array<Group?>, rootName: String, name: String, vehicleProperties: VehicleProperties, healthInterface: Health, maxLoad: Integer, moveSoundInterface: Sound, waypointLayerInterfaceFactoryInterface: LayerInterfaceFactoryInterface, animationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, emptyAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, baseAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, buildAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, verticleBuildAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, decalAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, resourceAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, proceduralAnimationInterfaceFactoryInterface: ProceduralAnimationInterfaceFactoryInterface, rectangle: Rectangle, direction: Direction, x: Int, y: Int, z: Int)                        

                            : this(remoteInfo, parentLayer, groupInterface, rootName, name, vehicleProperties, healthInterface, maxLoad, moveSoundInterface, waypointLayerInterfaceFactoryInterface, animationInterfaceFactoryInterface, emptyAnimationInterfaceFactoryInterface, baseAnimationInterfaceFactoryInterface, buildAnimationInterfaceFactoryInterface, verticleBuildAnimationInterfaceFactoryInterface, decalAnimationInterfaceFactoryInterface, resourceAnimationInterfaceFactoryInterface, proceduralAnimationInterfaceFactoryInterface, rectangle, direction, x, y, z, TileLayerPositionIntoViewPosition()){
    //var remoteInfo = remoteInfo
    //var parentLayer = parentLayer
    //var groupInterface = groupInterface
    //var rootName = rootName
    //var name = name
    //var vehicleProperties = vehicleProperties
    //var healthInterface = healthInterface
    //var maxLoad = maxLoad
    //var moveSoundInterface = moveSoundInterface
    //var waypointLayerInterfaceFactoryInterface = waypointLayerInterfaceFactoryInterface
    //var animationInterfaceFactoryInterface = animationInterfaceFactoryInterface
    //var emptyAnimationInterfaceFactoryInterface = emptyAnimationInterfaceFactoryInterface
    //var baseAnimationInterfaceFactoryInterface = baseAnimationInterfaceFactoryInterface
    //var buildAnimationInterfaceFactoryInterface = buildAnimationInterfaceFactoryInterface
    //var verticleBuildAnimationInterfaceFactoryInterface = verticleBuildAnimationInterfaceFactoryInterface
    //var decalAnimationInterfaceFactoryInterface = decalAnimationInterfaceFactoryInterface
    //var resourceAnimationInterfaceFactoryInterface = resourceAnimationInterfaceFactoryInterface
    //var proceduralAnimationInterfaceFactoryInterface = proceduralAnimationInterfaceFactoryInterface
    //var rectangle = rectangle
    //var direction = direction
    //var x = x
    //var y = y
    //var z = z


                            //For kotlin this is before the body of the constructor.
                    
}

protected constructor (remoteInfo: RemoteInfo, parentLayer: AdvancedRTSGameLayer, groupInterface: Array<Group?>, rootName: String, name: String, vehicleProperties: VehicleProperties, healthInterface: Health, maxResourceLoad: Integer, moveSoundInterface: Sound, waypointLayerInterfaceFactoryInterface: LayerInterfaceFactoryInterface, animationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, emptyAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, baseAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, buildAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, verticleBuildAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, decalAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, resourceAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, proceduralAnimationInterfaceFactoryInterface: ProceduralAnimationInterfaceFactoryInterface, rectangle: Rectangle, direction: Direction, x: Int, y: Int, z: Int, viewPosition: ViewPosition)                        

                            : super(remoteInfo, parentLayer, groupInterface, rootName, name, healthInterface, WaypointRTSFormInput(groupInterface, true), animationInterfaceFactoryInterface, emptyAnimationInterfaceFactoryInterface, baseAnimationInterfaceFactoryInterface, buildAnimationInterfaceFactoryInterface, verticleBuildAnimationInterfaceFactoryInterface, proceduralAnimationInterfaceFactoryInterface, rectangle, x, y, viewPosition){
    //var remoteInfo = remoteInfo
    //var parentLayer = parentLayer
    //var groupInterface = groupInterface
    //var rootName = rootName
    //var name = name
    //var vehicleProperties = vehicleProperties
    //var healthInterface = healthInterface
    //var maxResourceLoad = maxResourceLoad
    //var moveSoundInterface = moveSoundInterface
    //var waypointLayerInterfaceFactoryInterface = waypointLayerInterfaceFactoryInterface
    //var animationInterfaceFactoryInterface = animationInterfaceFactoryInterface
    //var emptyAnimationInterfaceFactoryInterface = emptyAnimationInterfaceFactoryInterface
    //var baseAnimationInterfaceFactoryInterface = baseAnimationInterfaceFactoryInterface
    //var buildAnimationInterfaceFactoryInterface = buildAnimationInterfaceFactoryInterface
    //var verticleBuildAnimationInterfaceFactoryInterface = verticleBuildAnimationInterfaceFactoryInterface
    //var decalAnimationInterfaceFactoryInterface = decalAnimationInterfaceFactoryInterface
    //var resourceAnimationInterfaceFactoryInterface = resourceAnimationInterfaceFactoryInterface
    //var proceduralAnimationInterfaceFactoryInterface = proceduralAnimationInterfaceFactoryInterface
    //var rectangle = rectangle
    //var direction = direction
    //var x = x
    //var y = y
    //var z = z
    //var viewPosition = viewPosition


                            //For kotlin this is before the body of the constructor.
                    
this.setCollidableInferface(CollidableUnitBehavior(this, true))
this.waypointLayerInterfaceFactoryInterface= waypointLayerInterfaceFactoryInterface
this.maxResourceLoad= maxResourceLoad!!.shortValue()
this.moveSoundInterface= moveSoundInterface

    
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
                            
this.decalAnimation= decalAnimationInterfaceFactoryInterface!!.getInstance(0) as RotationAnimation
this.initResourceAnimation= resourceAnimationInterfaceFactoryInterface!!.getInstance(0) as RotationAnimation
this.initResourceAnimation!!.setFrame(direction)
this.decalAnimation!!.setFrame(direction)
this.rotationAnimationInterface= this.indexedButShouldBeRotationAnimationInterface as RotationAnimation
this.rotationAnimationInterface!!.setFrame(direction)
this.setMaxLevel(12)
this.vehicleProperties= vehicleProperties
this.trackingEvent= TrackingEvent(this)
this.initPathAnimation= PathAnimation(this, LinePathRelativeAnimation.getInstance())
}


                @Throws(Exception::class)
            
    open fun setAllBinaryGameLayerManager(allBinaryGameLayerManager: AllBinaryGameLayerManager)
        //nullable = true from not(false or (false and false)) = true
{
    //var allBinaryGameLayerManager = allBinaryGameLayerManager
super.setAllBinaryGameLayerManager(allBinaryGameLayerManager)
this.initPathAnimation!!.setAllBinaryGameLayerManager(allBinaryGameLayerManager)
}


                @Throws(Exception::class)
            
    open fun updateWaypointBehavior(geographicMapInterface: BasicGeographicMap)
        //nullable = true from not(false or (false and false)) = true
{
    //var geographicMapInterface = geographicMapInterface

    var hashtable: Hashtable<Any, Any> = Hashtable<Any, Any>()

hashtable.put(Group.ID, this.getGroupInterface())
hashtable.put(Layer.ID, this)
hashtable.put(AllBinaryGameLayerManager.ID, allBinaryGameLayerManagerP)
this.setWaypointBehavior(UnitWaypointBehavior2(this, waypointLayerInterfaceFactoryInterface!!.getInstance(hashtable, x, y, z) as AdvancedRTSGameLayer))

    var features: Features = Features.getInstance()!!


    var isHTML: Boolean = features.isDefault(HTMLFeatureFactory.getInstance()!!.HTML)!!


    var waypoint: WaypointBase = if(isHTML) {
                            
                            MultipassNoCacheWaypoint(this, AttackSound.getInstance())
                        
                            } else {
                            
                                        //Otherwise - expression - elseExpr - ObjectCreationExpr

                            }
    

this.getWaypointBehavior()!!.setWaypoint(waypoint)
super.updateWaypointBehavior(geographicMapInterface)
this.initRangeHack()
}


                @Throws(Exception::class)
            
    open fun construct(rtsPlayerLayerInterface: RTSPlayerLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{
var rtsPlayerLayerInterface = rtsPlayerLayerInterface
super.construct(rtsPlayerLayerInterface)
TrackingEventHandler.getInstance()!!.addListener(this)
WaypointEventHandlerFactory.getInstance(this.getGroupInterface()[0]!!)!!.addListener(this.getUnitWaypointBehavior())
BuildingEventHandler.getInstance()!!.addListener(this)
this.getUnitWaypointBehavior()!!.setCurrentPathGeographicMapCellPosition(this.getCurrentGeographicMapCellPosition())
this.updateSensorGeographicMapCellPositionList()
this.getUnitWaypointBehavior()!!.setLastPathGeographicMapCellPosition(this.getUnitWaypointBehavior()!!.getCurrentPathGeographicMapCellPosition())
}


    private val sensorGeographicMapCellPositionList: BasicArrayList = BasicArrayList()

                @Throws(Exception::class)
            
    open fun updateSensorGeographicMapCellPositionList()
        //nullable = true from not(false or (false and true)) = true
{

    
                        if(VisibleCellPositionsSingleton.getInstance()!!.shouldProcess())
                        
                                    {
                                    
    var currentGeographicMapCellPosition: GeographicMapCellPosition = this.getCurrentGeographicMapCellPosition()!!

this.sensorGeographicMapCellPositionList!!.clear()
this.sensorGeographicMapCellPositionList!!.add(currentGeographicMapCellPosition)

    var sensorRange: Int = weaponRange *SENSOR_RANGE_MULTIPLIER


    var geographicMapCompositeInterface: GeographicMapCompositeInterface = this.allBinaryGameLayerManagerP as GeographicMapCompositeInterface


    var geographicMapInterface: BasicGeographicMap = geographicMapCompositeInterface!!.getGeographicMapInterface()[0]!!


    var tiledLayer: AllBinaryTiledLayer = geographicMapInterface!!.getAllBinaryTiledLayer()!!


    var totalCells: Int = (sensorRange /tiledLayer!!.getCellHeight()) /2


    var geographicMapCellPositionFactory: BasicGeographicMapCellPositionFactory = geographicMapInterface!!.getGeographicMapCellPositionFactory()!!


    var column: Int = currentGeographicMapCellPosition!!.getColumn()!!


    var row: Int = currentGeographicMapCellPosition!!.getRow()!!


    var lastColumn: Int = column +totalCells


    var lastRow: Int = row +totalCells


    
                        if(lastColumn > tiledLayer!!.getColumns())
                        
                                    {
                                    lastColumn= tiledLayer!!.getColumns()

                                    }
                                

    
                        if(lastRow > tiledLayer!!.getRows())
                        
                                    {
                                    lastRow= tiledLayer!!.getRows()

                                    }
                                

    var firstColumn: Int = column -totalCells


    var firstRow: Int = row -totalCells


    
                        if(firstColumn < 0)
                        
                                    {
                                    firstColumn= 0

                                    }
                                

    
                        if(firstRow < 0)
                        
                                    {
                                    firstRow= 0

                                    }
                                




                        for (index in lastColumn -1 downTo firstColumn)

        {




                        for (index2 in lastRow -1 downTo firstRow)

        {

    var geographicMapCellPosition: GeographicMapCellPosition = geographicMapCellPositionFactory!!.getInstance(index, index2)!!


    
                        if(!this.sensorGeographicMapCellPositionList!!.contains(geographicMapCellPosition))
                        
                                    {
                                    this.sensorGeographicMapCellPositionList!!.add(geographicMapCellPosition)

                                    }
                                
}

}


                                    }
                                
}


    open fun getSensorGeographicMapCellPositionList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.sensorGeographicMapCellPositionList
}


    open fun select()
        //nullable = true from not(false or (false and true)) = true
{
this.pathAnimation= this.initPathAnimation
super.select()
}


    open fun deselect()
        //nullable = true from not(false or (false and true)) = true
{
this.pathAnimation= NullAnimationFactory.getFactoryInstance()!!.getInstance(0)
super.deselect()
}


    override fun setSelected(selected: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var selected = selected
super.setSelected(selected)

    
                        if(selected)
                        
                                    {
                                    
    
                        if(this.debug)
                        
                                    {
                                    this.rtsLogHelper= RTSLayerSelectedLogHelper.getInstance()

                                    }
                                
this.rtsLayer2LogHelper= RTSLayer2SelectedLogHelper.getInstance()

                                    }
                                
                        else {
                            
    
                        if(this.debug)
                        
                                    {
                                    this.rtsLogHelper= RTSLayerLogHelper.getInstance()

                                    }
                                
this.rtsLayer2LogHelper= RTSLayer2LogHelper.getInstance()

                        }
                            
}


                @Throws(Exception::class)
            
    open fun setClosestGeographicMapCellHistory(pathsList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{
    //var pathsList = pathsList
this.rtsLogHelper!!.setClosestGeographicMapCellHistory(this, pathsList)

    var closestIndex: Int =  -1


    var shortestDistance: Int = Integer.MAX_VALUE


    var currentDistance: Int = Integer.MAX_VALUE





                        for (index in pathsList!!.size() -1 downTo 0)

        {

    var geographicMapCellPositionBasicArrayList: BasicArrayList = pathsList!!.get(index) as BasicArrayList


    var geographicMapCellPosition: GeographicMapCellPosition = geographicMapCellPositionBasicArrayList!!.get(geographicMapCellPositionBasicArrayList!!.size() -1) as GeographicMapCellPosition

currentDistance= layerDistanceUtil!!.getDistance(this, geographicMapCellPosition!!.getMidPoint())

    
                        if(currentDistance < shortestDistance)
                        
                                    {
                                    shortestDistance= currentDistance
closestIndex= index

                                    }
                                
}


    
                        if(closestIndex >= 0)
                        
                                    {
                                    
    var geographicMapCellPositionBasicArrayList: BasicArrayList = pathsList!!.get(closestIndex) as BasicArrayList


    var geographicMapCellPosition: GeographicMapCellPosition = geographicMapCellPositionBasicArrayList!!.get(0) as GeographicMapCellPosition

this.teleportTo(geographicMapCellPosition)

                                    }
                                
}


                @Throws(Exception::class)
            
    open fun init(geographicMapCellHistory: GeographicMapCellHistory, geographicMapCellPositionBasicArrayList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{
    //var geographicMapCellHistory = geographicMapCellHistory
    //var geographicMapCellPositionBasicArrayList = geographicMapCellPositionBasicArrayList
geographicMapCellHistory!!.track(geographicMapCellPositionBasicArrayList)
}


    open fun onMovement(trackingEvent: TrackingEvent)
        //nullable = true from not(false or (false and false)) = true
{
    //var trackingEvent = trackingEvent

        try {
            
    var layerInterface: AdvancedRTSGameLayer = trackingEvent!!.getLayerInterface() as AdvancedRTSGameLayer


    
                        if(layerInterface!!.getGroupInterface()[0] != this.getGroupInterface()[0])
                        
                                    {
                                    this.getUnitWaypointBehavior()!!.getPossibleTargetList()!!.add(layerInterface)
layerInterface!!.onMovementFound(this.getTrackingEvent())

                                    }
                                
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "onMovement", e)
}

}


                @Throws(Exception::class)
            
    open fun onMovementFound(trackingEvent: TrackingEvent)
        //nullable = true from not(false or (false and false)) = true
{
    //var trackingEvent = trackingEvent

    var layerInterface: AdvancedRTSGameLayer = trackingEvent!!.getLayerInterface() as AdvancedRTSGameLayer


    
                        if(layerInterface!!.getGroupInterface()[0] != this.getGroupInterface()[0])
                        
                                    {
                                    this.getUnitWaypointBehavior()!!.getPossibleTargetList()!!.add(layerInterface)

                                    }
                                
}


    open fun initRangeHack()
        //nullable = true from not(false or (false and true)) = true
{

    var basicWeaponPart: BasicWeaponPart = this.getPartInterfaceArray()[0]!! as BasicWeaponPart


    var weaponProperties: WeaponProperties = basicWeaponPart!!.getWeaponProperties()!!

this.weaponRange= weaponProperties!!.getRange()
this.initRangeAnimation= AdjustedCircleAnimation(weaponRange, weaponRange, this.getWidth(), this.basicColorFactory!!.GREEN)

    var sensorRange: Int = weaponRange *SENSOR_RANGE_MULTIPLIER

this.initSensorRangeAnimation= AdjustedCircleAnimation(sensorRange, sensorRange, this.getWidth(), this.basicColorFactory!!.RED)
this.getUnitWaypointBehavior()!!.initRange(weaponRange)
this.fireTimeHelper!!.delay= (weaponProperties!!.getReloadTime().toInt())
}


                @Throws(Exception::class)
            
    open fun processBuiltTick(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{
    //var allBinaryLayerManager = allBinaryLayerManager

    
                        if(!this.getHealthInterface()!!.isAlive())
                        
                                    {
                                    
    
                        if(this.isReadyForExplosion())
                        
                                    {
                                    
    var currentFrame: Int = this.destroyAnimationInterface!!.getFrame()!!


    var size: Int = this.destroyAnimationInterface!!.getSize() -1


    
                        if(currentFrame == size)
                        
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
this.setReadyForExplosion(true)

                        }
                            

                                    }
                                
                        else {
                            super.processBuiltTick(allBinaryLayerManager)

                        }
                            
this.captionAnimationHelper!!.tick()
this.getUnitWaypointBehavior()!!.processTick(allBinaryLayerManager)
}


    open fun teleportTo(geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
{
    //var geographicMapCellPosition = geographicMapCellPosition

    var point: GPoint = geographicMapCellPosition!!.getMidPoint()!!

this.setPosition(point.getX() -this.getHalfWidth(), point.getY() -this.getHalfHeight(), this.z)
}


                @Throws(Exception::class)
            
    open fun getCurrentGeographicMapCellPosition()
        //nullable = true from not(false or (false and true)) = true
: GeographicMapCellPosition{

    var geographicMapCompositeInterface: GeographicMapCompositeInterface = this.allBinaryGameLayerManagerP as GeographicMapCompositeInterface


    var geographicMapInterface: BasicGeographicMap = geographicMapCompositeInterface!!.getGeographicMapInterface()[0]!!


    var geographicMapCellPosition: GeographicMapCellPosition = geographicMapInterface!!.getCellPositionAt(this.x +this.getHalfWidth(), this.y +this.getHalfHeight())!!


    var raceTrackGeographicMap: RaceTrackGeographicMap = geographicMapInterface as RaceTrackGeographicMap


    
                        if(!raceTrackGeographicMap!!.isValid(geographicMapCellPosition))
                        
                                    {
                                    


                            throw Exception("Position is not really on the map: " +geographicMapCellPosition)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return geographicMapCellPosition
}


                @Throws(Exception::class)
            
    open fun fire(layerManager: AllBinaryLayerManager, gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true
{
    //var layerManager = layerManager
    //var gameKeyEvent = gameKeyEvent

    
                        if(this.fireTimeHelper!!.isTime())
                        
                                    {
                                    this.fireAll(layerManager)

                                    }
                                
                        else {
                            this.reload()

                        }
                            
}


                @Throws(Exception::class)
            
    open fun left()
        //nullable = true from not(false or (false and true)) = true
{
this.initResourceAnimation!!.previousRotation()
this.decalAnimation!!.previousRotation()
this.rotationAnimationInterface!!.previousRotation()
}


                @Throws(Exception::class)
            
    open fun right()
        //nullable = true from not(false or (false and true)) = true
{
this.initResourceAnimation!!.nextRotation()
this.decalAnimation!!.nextRotation()
this.rotationAnimationInterface!!.nextRotation()
}


    open fun down()
        //nullable = true from not(false or (false and true)) = true
{

    var velocityProperties: VelocityProperties = this.getVehicleProperties()!!.getVelocityProperties()!!


    
                        if(!velocityProperties!!.isOverXYMaxForwardVelocity())
                        
                                    {
                                    this.accelerate(this.decelerationBasicDecimal)

                                    }
                                
}


    open fun up()
        //nullable = true from not(false or (false and true)) = true
{

    var velocityProperties: VelocityProperties = this.getVehicleProperties()!!.getVelocityProperties()!!


    
                        if(!velocityProperties!!.isOverXYMaxForwardVelocity())
                        
                                    {
                                    this.accelerate(this.accelerationBasicDecimal)

                                    }
                                
}


    open fun initInputProcessors()
        //nullable = true from not(false or (false and true)) = true
{
this.inputProcessorArray[Canvas.RIGHT]= SpecialRightGameInputProcessor(this)
this.inputProcessorArray[Canvas.LEFT]= SpecialLeftGameInputProcessor(this)
this.inputProcessorArray[Canvas.KEY_NUM0]= SpecialFireGameInputProcessor(this)
this.inputProcessorArray[Canvas.KEY_POUND]= this.inputProcessorArray[Canvas.KEY_NUM0]!!
this.inputProcessorArray[Canvas.DOWN]= SpecialDownGameInputProcessor(this)
this.inputProcessorArray[Canvas.UP]= SpecialUpGameInputProcessor(this)
super.initInputProcessors()
}


                @Throws(Exception::class)
            
    open fun processInput(layerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{
var layerManager = layerManager

    var list: BasicArrayList = this.getGameKeyEventList()!!


    var size: Int = list.size()!!





                        for (index in 0 until size)

        {

    var anyType: Any = list.get(index)!!


    var key: Int = GameKeyEventUtil.getKey(anyType)!!

this.inputProcessorArray[key]!!.process(layerManager, null as GameKeyEvent)
}

list.clear()
this.groundFriction()
this.move()
}


    open fun accelerate(accelerate: BasicDecimal)
        //nullable = true from not(false or (false and false)) = true
{
    //var accelerate = accelerate
this.getVehicleProperties()!!.getVelocityProperties()!!.addVelocity(accelerate.getUnscaled(), this.rotationAnimationInterface!!.getAngleInfoP()!!.getAngle(), 90.toShort())
}


                @Throws(Exception::class)
            
    open fun fireAll(layerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{
    //var layerManager = layerManager

    var angleInfo: AngleInfo = this.rotationAnimationInterface!!.getAngleInfoP()!!


    var angle: Short = (angleInfo!!.getAngle() +this.slightAngle).toShort()

hashtable.put(SmallIntegerSingletonFactory.getInstance()!!.getInstance(1), SmallIntegerSingletonFactory.getInstance()!!.getInstance(AngleFactory.getInstance()!!.getInstance(angle)!!.getValue()))
 = this.getPartInterfaceArray()[0]!! as SalvoInterface
.
                    process(layerManager, angle, 90.toShort())
}


    open fun downgrade()
        //nullable = true from not(false or (false and true)) = true
{

    
                        if(getLevel() > 1)
                        
                                    {
                                    super.downgrade()

                                    }
                                
}


    open fun upgrade()
        //nullable = true from not(false or (false and true)) = true
{
super.upgrade()
this.initRangeHack()
}


    open fun groundFriction()
        //nullable = true from not(false or (false and true)) = true
{

    var vehicleFrictionProperties: VehicleFrictionProperties = this.getVehicleProperties()!!.getVehicleFrictionProperties()!!

this.getVehicleProperties()!!.getVehicleFrictionProperties()!!.friction(this.getVehicleProperties()!!.getVelocityProperties(), vehicleFrictionProperties!!.getTireFrictionNominator())
}


                @Throws(Exception::class)
            
    override fun trackTo(reason: String)
        //nullable = true from not(false or (false and false)) = true
{
    //var reason = reason

    var nextUnvisitedPathGeographicMapCellPosition: GeographicMapCellPosition = this.waypointBehaviorBase!!.getNextUnvisitedPathGeographicMapCellPosition()!!


    var point: GPoint = nextUnvisitedPathGeographicMapCellPosition!!.getMidPoint()!!


    var dx: Int = (this.getXP() +this.getHalfWidth()) -point.getX()


    var dy: Int = (this.getYP() +this.getHalfHeight()) -point.getY()

this.rtsLogHelper!!.trackTo(this, nextUnvisitedPathGeographicMapCellPosition, dx, dy, reason)
this.trackTo(dx, dy)
}


                @Throws(Exception::class)
            
    override fun trackTo(dx: Int, dy: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var dx = dx
    //var dy = dy

    var angleOfTarget: Int = 0

this.trackTo(dx, dy, angleOfTarget)
}


                @Throws(Exception::class)
            
    open fun turnTo(dx: Int, dy: Int, targetAngle: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var dx = dx
    //var dy = dy
var targetAngle = targetAngle

    var nextUnvisitedPathGeographicMapCellPosition: GeographicMapCellPosition = this.waypointBehaviorBase!!.getNextUnvisitedPathGeographicMapCellPosition()!!


    var evading: Boolean = false


    
                        if(this.getUnitWaypointBehavior()!!.getSensorAction() == SensorActionFactory.getInstance()!!.EVADE)
                        
                                    {
                                    this.rtsLogHelper!!.evade(this)
evading= true
targetAngle += 180

                                    }
                                

    var angleInfo: AngleInfo = this.rotationAnimationInterface!!.getAngleInfoP()!!


    var angle: Int = FrameUtil.getInstance()!!.adjustAngleToFrameAngle(angleInfo!!.getAngle() -270)!!

this.rtsLogHelper!!.turnTo(this, dx, dy, angleInfo, angle, movementAngle, evading, targetAngle)

    var gameKeyEventFactory: GameKeyEventFactory = GameKeyEventFactory.getInstance()!!


    
                        if(dx == 0 && dy == 0)
                        
                                    {
                                    this.rtsLogHelper!!.doneMoving(this)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                             else 
    
                        if(this.movementAngle!!.getValue() == angle)
                        
                                    {
                                    
    
                        if(dx > 0 && this.movementAngle == this.angleFactory!!.LEFT)
                        
                                    {
                                    this.rtsLogHelper!!.movingLeft(this)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                

    
                        if(dx < 0 && this.movementAngle == this.angleFactory!!.RIGHT)
                        
                                    {
                                    this.rtsLogHelper!!.movingRight(this)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                

    
                        if(dy > 0 && this.movementAngle == this.angleFactory!!.UP)
                        
                                    {
                                    this.rtsLogHelper!!.movingUp(this)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                

    
                        if(dy < 0 && this.movementAngle == this.angleFactory!!.DOWN)
                        
                                    {
                                    this.rtsLogHelper!!.movingDown(this)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
this.rtsLogHelper!!.currentMoveEnded(this)

    
                        if(this.movementAngle == this.angleFactory!!.LEFT || this.movementAngle == this.angleFactory!!.RIGHT)
                        
                                    {
                                    this.handleDeltalY(dx, dy)

                                    }
                                
                             else 
    
                        if(this.movementAngle == this.angleFactory!!.UP || this.movementAngle == this.angleFactory!!.DOWN)
                        
                                    {
                                    this.handleDeltalX(dx, dy)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            
    
                        if(nextUnvisitedPathGeographicMapCellPosition != 
                                    null
                                )
                        
                                    {
                                    
    
                        if(this.steeringInsideGeographicMapCellPosition != nextUnvisitedPathGeographicMapCellPosition)
                        
                                    {
                                    
    
                        if(Math.abs(dx) > Math.abs(dy) && dy != 0)
                        
                                    {
                                    this.handleDeltalY(dx, dy)

                                    }
                                
                             else 
    
                        if(dx != 0)
                        
                                    {
                                    this.handleDeltalX(dx, dy)

                                    }
                                
                        else {
                            this.handleDeltalY(dx, dy)

                        }
                            

                                    }
                                

    var deltaAngle2: Int = this.movementAngle!!.getValue() -angle


    
                        if(deltaAngle2 > 0)
                        
                                    {
                                    this.rtsLogHelper!!.rotateRight(this)
this.getGameKeyEventList()!!.add(gameKeyEventFactory!!.getInstance(this, Canvas.RIGHT))

                                    }
                                
                        else {
                            this.rtsLogHelper!!.rotateLeft(this)
this.getGameKeyEventList()!!.add(gameKeyEventFactory!!.getInstance(this, Canvas.LEFT))

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            this.rtsLogHelper!!.noRotation(this)

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


    open fun handleDeltalX(dx: Int, dy: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var dx = dx
    //var dy = dy

    var nextUnvisitedPathGeographicMapCellPosition: GeographicMapCellPosition = this.waypointBehaviorBase!!.getNextUnvisitedPathGeographicMapCellPosition()!!


    
                        if(dx > 0)
                        
                                    {
                                    this.movementAngle= this.angleFactory!!.LEFT
this.steeringInsideGeographicMapCellPosition= nextUnvisitedPathGeographicMapCellPosition

                                    }
                                
                        else {
                            this.movementAngle= this.angleFactory!!.RIGHT
this.steeringInsideGeographicMapCellPosition= nextUnvisitedPathGeographicMapCellPosition

                        }
                            
this.rtsLogHelper!!.handle(this, this.movementAngle)
}


    open fun handleDeltalY(dx: Int, dy: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var dx = dx
    //var dy = dy

    var nextUnvisitedPathGeographicMapCellPosition: GeographicMapCellPosition = this.waypointBehaviorBase!!.getNextUnvisitedPathGeographicMapCellPosition()!!


    
                        if(dy > 0)
                        
                                    {
                                    this.movementAngle= this.angleFactory!!.UP
this.steeringInsideGeographicMapCellPosition= nextUnvisitedPathGeographicMapCellPosition

                                    }
                                
                        else {
                            this.movementAngle= this.angleFactory!!.DOWN
this.steeringInsideGeographicMapCellPosition= nextUnvisitedPathGeographicMapCellPosition

                        }
                            
this.rtsLogHelper!!.handle(this, this.movementAngle)
}


                @Throws(Exception::class)
            
    open fun trackTo(dx: Int, dy: Int, targetAngle: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var dx = dx
    //var dy = dy
    //var targetAngle = targetAngle

    var list: BasicArrayList = this.getUnitWaypointBehavior()!!.getSteeringVisitorList()!!


    
                        if(list.size() > 0)
                        
                                    {
                                    



                        for (index in list.size() -1 downTo 0)

        {

    var steeringVisitor: SteeringVisitor = list.get(index) as SteeringVisitor


    var anyType: Any = steeringVisitor!!.visit(
                            null)!!


    
                        if(anyType == 
                                    null
                                )
                        
                                    {
                                    list.remove(index)

                                    }
                                
}

this.fireOrMove()

                                    }
                                
                             else 
    
                        if(!this.turnTo(dx, dy, targetAngle))
                        
                                    {
                                    this.fireOrMove()

                                    }
                                
}


                @Throws(Exception::class)
            
    open fun fireOrMove()
        //nullable = true from not(false or (false and true)) = true
{

    var gameKeyEventFactory: GameKeyEventFactory = GameKeyEventFactory.getInstance()!!


    
                        if(this.getUnitWaypointBehavior()!!.needToMove())
                        
                                    {
                                    this.rtsLayer2LogHelper!!.steeringUp(this)

    
                        if(this.showMoreCaptionStates && !this.captionAnimationHelper!!.isShowing())
                        
                                    {
                                    this.captionAnimationHelper!!.update(MOVE, this.basicColorFactory!!.GREEN)

                                    }
                                
this.getGameKeyEventList()!!.add(gameKeyEventFactory!!.getInstance(this, Canvas.UP))

                                    }
                                
                        else {
                            this.captionAnimationHelper!!.update(CommonPhoneStrings.getInstance()!!.FIRE, this.basicColorFactory!!.RED)
this.rtsLayer2LogHelper!!.steeringFireOrStop(this)
this.allStop()
this.getGameKeyEventList()!!.add(gameKeyEventFactory!!.getInstance(this, Canvas.KEY_NUM0))
TrackingEventHandler.getInstance()!!.fireEvent(this.getTrackingEvent())

                        }
                            
}


    open fun move()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            
    var velocityProperties: VelocityProperties = this.getVehicleProperties()!!.getVelocityProperties()!!


    var velocityXScaled: Long = velocityProperties!!.getVelocityXBasicDecimalP()!!.getScaled()!!


    var velocityYScaled: Long = velocityProperties!!.getVelocityYBasicDecimalP()!!.getScaled()!!

this.getUnitWaypointBehavior()!!.move()

    
                        if(velocityXScaled != 0 || velocityYScaled != 0)
                        
                                    {
                                    this.getUnitWaypointBehavior()!!.setMoving(true)

    var geographicMapCompositeInterface: GeographicMapCompositeInterface = this.allBinaryGameLayerManagerP as GeographicMapCompositeInterface


    var geographicMapInterface: BasicGeographicMap = geographicMapCompositeInterface!!.getGeographicMapInterface()[0]!!

layerPartialCellPositionsUtil!!.getAll(geographicMapInterface, this, velocityXScaled.toInt(), velocityYScaled.toInt(), getPartialpositionlist())

    var cellPosition: GeographicMapCellPosition = DropCellPositionHistory.getInstance()!!.getCellPositionWithDrop(getPartialpositionlist()) as GeographicMapCellPosition


    
                        if(cellPosition == 
                                    null
                                )
                        
                                    {
                                    
    var tiledLayer: AllBinaryTiledLayer = geographicMapInterface!!.getAllBinaryTiledLayer()!!


    var tiledLayerUtil: TiledLayerUtil = TiledLayerUtil.getInstance()!!


    var x: Int = this.x +velocityXScaled.toInt()


    var y: Int = this.y +velocityYScaled.toInt()

x= tiledLayerUtil!!.keepOnMapX(tiledLayer, x, this.getWidth())
y= tiledLayerUtil!!.keepOnMapY(tiledLayer, y, this.getHeight())
this.setPosition(x, y, this.z)

                                    }
                                
                        else {
                            
    var allbinaryLayer: AllBinaryLayer = DropCellPositionHistory.getInstance()!!.getLayerInterface(cellPosition)!!

this.getUnitWaypointBehavior()!!.setMovingFromStopped(false)
this.getUnitWaypointBehavior()!!.addBuildingChase(allbinaryLayer, cellPosition)

                        }
                            

                                    }
                                

    
                        if(this.getUnitWaypointBehavior()!!.isMoving())
                        
                                    {
                                    TrackingEventHandler.getInstance()!!.fireEvent(this.getTrackingEvent())

                                    }
                                
                        else {
                            this.getUnitWaypointBehavior()!!.setMovingFromStopped(false)

                        }
                            

    
                        if(this.getUnitWaypointBehavior()!!.isMovingFromStopped() && this.isVisible())
                        
                                    {
                                    SecondaryPlayerQueueFactory.getInstance()!!.add(this.moveSoundInterface)

                                    }
                                
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "move", e)
}

}


    open fun allStop()
        //nullable = true from not(false or (false and true)) = true
{

    var velocityProperties: VelocityProperties = this.getVehicleProperties()!!.getVelocityProperties()!!

velocityProperties!!.getVelocityXBasicDecimalP()!!.set(0)
velocityProperties!!.getVelocityYBasicDecimalP()!!.set(0)
}


    open fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics

    
                        if(this.isVisible())
                        
                                    {
                                    super.paint(graphics)

    var viewPosition: ViewPosition = this.getViewPosition()!!


    var viewX: Int = viewPosition!!.getX()!!


    var viewY: Int = viewPosition!!.getY()!!

this.decalAnimation!!.paint(graphics, viewX, viewY)
this.rangeAnimation!!.paint(graphics, viewX, viewY)
this.sensorRangeAnimation!!.paint(graphics, viewX, viewY)
this.damageFloatersPaintableInterface!!.paint(graphics)
this.healthBar!!.paint(graphics)
this.captionAnimationHelper!!.paint(graphics, viewX, viewY)
this.pathAnimation!!.paint(graphics, viewX, viewY)
this.resourceAnimation!!.paint(graphics, viewX, viewY)

                                    }
                                
}


                @Throws(Exception::class)
            
    open fun onBuildingEvent(event: RTSLayerEvent)
        //nullable = true from not(false or (false and false)) = true
{
var event = event

    var buildingLayer: BuildingLayer = event.getRtsLayer() as BuildingLayer

this.getUnitWaypointBehavior()!!.moveAwayFromBuilding(buildingLayer)
}


    open fun getVehicleProperties()
        //nullable = true from not(false or (false and true)) = true
: VehicleProperties{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return vehicleProperties
}


                @Throws(Exception::class)
            
    open fun damage(damage: Int, damageType: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var damage = damage
    //var damageType = damageType
super.damage(damage, damageType)
this.damageFloaters!!.add(damage)

    
                        if(damage > 0)
                        
                                    {
                                    this.getHealthInterface()!!.damage(damage)

                                    }
                                
}


                @Throws(Exception::class)
            
    open fun getDamage(damageType: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var damageType = damageType



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


                @Throws(Exception::class)
            
    open fun setDestroyed(destroyed: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
    //var destroyed = destroyed
logUtil!!.put(commonStrings!!.START, this, "setDestroyed")
super.setDestroyed(destroyed)

    
                        if(this.isDestroyed())
                        
                                    {
                                    WaypointEventHandlerFactory.getInstance(this.getGroupInterface()[0]!!)!!.removeListener(this.getUnitWaypointBehavior())
TrackingEventHandler.getInstance()!!.removeListener(this)
BuildingEventHandler.getInstance()!!.removeListener(this)

    
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


    open fun getLoad()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return resourceLoad
}


                @Throws(Exception::class)
            
    open fun clearResourceAnimation()
        //nullable = true from not(false or (false and true)) = true
{
this.resourceAnimation= NullIndexedAnimationFactory.getFactoryInstance()!!.getInstance(0) as IndexedAnimation
}


                @Throws(Exception::class)
            
    open fun setLoad(resource: Short)
        //nullable = true from not(false or (false and false)) = true
{
var resource = resource

    
                        if(resource > 0)
                        
                                    {
                                    this.resourceAnimation= this.initResourceAnimation

                                    }
                                
                        else {
                            this.clearResourceAnimation()

                        }
                            
this.resourceLoad= resource
}


    open fun addLoad(resource: Int)
        //nullable = true from not(false or (false and false)) = true
{
var resource = resource
this.resourceLoad += resource
}


    private val CAPITAL_EVENT: CapitalEvent = CapitalEvent(this)

                @Throws(Exception::class)
            
    open fun handleCost(ownerLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{
var ownerLayer = ownerLayer

    
                        if(this.getLoad() > 0)
                        
                                    {
                                    CAPITAL_EVENT.setValue(this.getLoad())
CapitalEventHandlerFactory.getInstance(ownerLayer!!.getGroupInterface()[0]!!)!!.fireEvent(CAPITAL_EVENT)
this.setLoad(0.toShort())

                                    }
                                
}


    open fun createHudPaintable()
        //nullable = true from not(false or (false and true)) = true
: SelectionHudPaintable{

    var rtsLayerHudPaintable: RTSLayerHudPaintable = RTSLayerHudPaintable.getInstance()!!

rtsLayerHudPaintable!!.setBasicColorP(this.allBinaryGameLayerManagerP!!.getForegroundBasicColor())
rtsLayerHudPaintable!!.setRtsLayer(this)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rtsLayerHudPaintable
}


    open fun getHudPaintable()
        //nullable = true from not(false or (false and true)) = true
: SelectionHudPaintable{

    var rtsLayerHudPaintable: RTSLayerHudPaintable = RTSLayerHudPaintable.getInstance()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rtsLayerHudPaintable
}


    open fun getType()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return getStaticType()
}


    open fun getUnitWaypointBehavior()
        //nullable = true from not(false or (false and true)) = true
: UnitWaypointBehavior{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getWaypointBehavior() as UnitWaypointBehavior
}


    open fun getTrackingEvent()
        //nullable = true from not(false or (false and true)) = true
: TrackingEvent{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return trackingEvent
}


    open fun getCaptionAnimationHelper()
        //nullable = true from not(false or (false and true)) = true
: CaptionAnimationHelperBase{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return captionAnimationHelper
}


    open fun isSelfUpgradeable()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    open fun getMaxResourceLoad()
        //nullable = true from not(false or (false and true)) = true
: Short{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return maxResourceLoad
}


}
                
            

