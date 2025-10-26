
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
        package org.allbinary.game.layer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import javax.microedition.lcdui.Graphics
import org.allbinary.game.input.form.RTSFormInput
import org.allbinary.game.multiplayer.layer.MultiPlayerGameLayer
import org.allbinary.animation.Animation
import org.allbinary.animation.AnimationInterfaceFactoryInterface
import org.allbinary.animation.IndexedAnimation
import org.allbinary.animation.NullAnimationFactory
import org.allbinary.animation.NullIndexedAnimationFactory
import org.allbinary.animation.ProceduralAnimationInterfaceFactoryInterface
import org.allbinary.animation.RotationAnimation
import org.allbinary.animation.caption.CaptionAnimationHelperBase
import org.allbinary.game.combat.destroy.DestroyedLayerProcessor
import org.allbinary.game.health.Health
import org.allbinary.game.identification.Group
import org.allbinary.game.identification.GroupFactory
import org.allbinary.game.input.GameInputInterface
import org.allbinary.game.input.GameInputProcessor
import org.allbinary.game.input.GameInputProcessorUtil
import org.allbinary.game.input.GameKeyEventSourceInterface
import org.allbinary.game.input.InputFactory
import org.allbinary.game.input.form.NullRTSFormInputFactory
import org.allbinary.game.layer.waypoint.Waypoint2LogHelper
import org.allbinary.game.layer.waypoint.WaypointLogHelper
import org.allbinary.game.layer.waypoint.WaypointRunnableLogHelper
import org.allbinary.game.tick.TickableInterface
import org.allbinary.game.tracking.TrackingEvent
import org.allbinary.game.view.TileLayerPositionIntoViewPosition
import org.allbinary.graphics.Rectangle
import org.allbinary.graphics.RectangleFactory
import org.allbinary.graphics.form.ScrollSelectionForm
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.time.TimeDelayHelper
import org.allbinary.view.ViewPosition
import org.allbinary.view.event.ViewPositionEventHandler
import org.allbinary.game.multiplayer.layer.RemoteInfo
import org.allbinary.logic.string.StringUtil
import org.allbinary.math.LayerDistanceUtil
import org.allbinary.media.graphics.geography.map.GeographicMapCellHistory
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.map.GeographicMapCompositeInterface
import org.allbinary.util.BasicArrayList

open public class RTSLayer : MultiPlayerGameLayer
                , TickableInterface
                , GameInputInterface
                , GameKeyEventSourceInterface
                , RTSInterface
                , PathFindingLayerInterface {
        
companion object {
            
    private val id: Int = 0

    val MAIN_INDEX: Int = 0

    val SECONDARY_INDEX: Int = 1

    open fun getMinStaticType()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 1
}


    open fun getMaxStaticType()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 4
}


    open fun isRTSLayer(layerInterface: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var layerInterface = layerInterface

    
                        if(layerInterface!!.getType() >= RTSLayer.getMinStaticType() && layerInterface!!.getType() <= RTSLayer.getMaxStaticType())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


        }
            
    val debug: Boolean = true

    val showMoreCaptionStates: Boolean = debug

    val inputProcessorArray: Array<GameInputProcessor?> = arrayOfNulls(InputFactory.getInstance()!!.MAX)

    var rtsLayer2LogHelper: RTSLayer2LogHelper = RTSLayer2LogHelper.getInstance()!!

    var waypointLogHelperP: WaypointLogHelper = WaypointLogHelper.getInstance()!!

    var waypoint2LogHelperP: Waypoint2LogHelper = Waypoint2LogHelper.getInstance()!!

    var waypointRunnableLogHelperP: WaypointRunnableLogHelper = WaypointRunnableLogHelper.getInstance()!!

    private val rtsFormInput: RTSFormInput

    private var verticleBuildAnimationInterface: IndexedAnimation

    var rangeAnimation: Animation

    var initRangeAnimation: Animation

    var sensorRangeAnimation: Animation

    var initSensorRangeAnimation: Animation

    val baseAnimationInterface: Animation

    private val buildFrameTimeHelper: TimeDelayHelper = TimeDelayHelper(50)

    private val buildAnimationInterface: Animation

    private var animationInterface: Animation

    val initAnimationInterface: IndexedAnimation

    var indexedButShouldBeRotationAnimationInterface: IndexedAnimation

    val emptyAnimationInterface: IndexedAnimation

    val destroyAnimationInterface: IndexedAnimation

    val fireTimeHelper: TimeDelayHelper = TimeDelayHelper(700)

    private val rootName: String

    val hashtable: Hashtable<Any, Any> = Hashtable<Any, Any>()

    private val BUILD_VALUE: Int = 63

    val geographicMapCellPositionAreaBase: GeographicMapCellPositionAreaBase

    private var healthInterface: Health = Health.NULL_HEALTH

    private var level: Int = 1

    private var maxLevel: Int = 1

    private var hackVerticleBuild: Int = BUILD_VALUE

    var slightAngle: Int = 0

    var percentCompleteP: Int= 0

    private var destroyed: Boolean = false

    private var selected: Boolean = false
protected constructor (remoteInfo: RemoteInfo, groupInterface: Array<Group?>, rootName: String, name: String, healthInterface: Health, rtsFormInput: RTSFormInput, animationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, emptyAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, baseAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, buildAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, verticleBuildAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, proceduralAnimationInterfaceFactoryInterface: ProceduralAnimationInterfaceFactoryInterface, rectangle: Rectangle, x: Int, y: Int)                        

                            : this(remoteInfo, groupInterface, rootName, name, healthInterface, rtsFormInput, animationInterfaceFactoryInterface, emptyAnimationInterfaceFactoryInterface, baseAnimationInterfaceFactoryInterface, buildAnimationInterfaceFactoryInterface, verticleBuildAnimationInterfaceFactoryInterface, proceduralAnimationInterfaceFactoryInterface, rectangle, x, y, TileLayerPositionIntoViewPosition()){
    //var remoteInfo = remoteInfo
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

protected constructor (remoteInfo: RemoteInfo, groupInterface: Array<Group?>, rootName: String, name: String, healthInterface: Health, rtsFormInput: RTSFormInput, animationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, emptyAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, baseAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, buildAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, verticleBuildAnimationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, proceduralAnimationInterfaceFactoryInterface: ProceduralAnimationInterfaceFactoryInterface, rectangle: Rectangle, x: Int, y: Int, viewPosition: ViewPosition)                        

                            : super(remoteInfo, groupInterface, name, rectangle, viewPosition){
    //var remoteInfo = remoteInfo
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
                    
this.initInputProcessors()
this.rootName= rootName
this.healthInterface= healthInterface
this.rtsFormInput= rtsFormInput
this.setPosition(x, y, z)
this.verticleBuildAnimationInterface= verticleBuildAnimationInterfaceFactoryInterface!!.getInstance(0) as IndexedAnimation
this.buildAnimationInterface= buildAnimationInterfaceFactoryInterface!!.getInstance(0)
this.baseAnimationInterface= baseAnimationInterfaceFactoryInterface!!.getInstance(0)
this.emptyAnimationInterface= emptyAnimationInterfaceFactoryInterface!!.getInstance(0) as IndexedAnimation
this.indexedButShouldBeRotationAnimationInterface= animationInterfaceFactoryInterface!!.getInstance(0) as IndexedAnimation
this.initAnimationInterface= this.indexedButShouldBeRotationAnimationInterface
this.destroyAnimationInterface= proceduralAnimationInterfaceFactoryInterface!!.getInstance(this.indexedButShouldBeRotationAnimationInterface) as IndexedAnimation

    var animation: Animation = NullAnimationFactory.getFactoryInstance()!!.getInstance(0)!!

this.rangeAnimation= animation
this.initRangeAnimation= animation
this.sensorRangeAnimation= animation
this.initSensorRangeAnimation= animation
this.animationInterface= this.initAnimationInterface
this.geographicMapCellPositionAreaBase= GeographicMapCellPositionArea(this)
}

protected constructor (remoteInfo: RemoteInfo)                        

                            : super(remoteInfo, GroupFactory.getInstance()!!.NULL_GROUP_ARRAY, RectangleFactory.SINGLETON, TileLayerPositionIntoViewPosition()){
    //var remoteInfo = remoteInfo


                            //For kotlin this is before the body of the constructor.
                    
this.initInputProcessors()
this.rtsFormInput= NullRTSFormInputFactory.getInstance()

    var animation: Animation = NullAnimationFactory.getFactoryInstance()!!.getInstance(0)!!

this.baseAnimationInterface= animation
this.buildAnimationInterface= animation
this.rangeAnimation= animation
this.initRangeAnimation= animation
this.sensorRangeAnimation= animation
this.initSensorRangeAnimation= animation
this.animationInterface= animation

    var indexedAnimation: IndexedAnimation = NullIndexedAnimationFactory.getFactoryInstance()!!.getInstance(0) as IndexedAnimation

this.indexedButShouldBeRotationAnimationInterface= indexedAnimation
this.initAnimationInterface= indexedAnimation
this.emptyAnimationInterface= indexedAnimation
this.destroyAnimationInterface= indexedAnimation
this.verticleBuildAnimationInterface= indexedAnimation
this.rootName= StringUtil.getInstance()!!.EMPTY_STRING
this.geographicMapCellPositionAreaBase= GeographicMapCellPositionAreaBase.NULL_GEOGRPAHIC_MAP_POSITION_AREA_BASE
}


                @Throws(Exception::class)
            
    override fun setAllBinaryGameLayerManager(allBinaryGameLayerManager: AllBinaryGameLayerManager)
        //nullable = true from not(false or (false and false)) = true
{
    //var allBinaryGameLayerManager = allBinaryGameLayerManager
super.setAllBinaryGameLayerManager(allBinaryGameLayerManager)

    var geographicMapCompositeInterface: GeographicMapCompositeInterface = this.allBinaryGameLayerManagerP as GeographicMapCompositeInterface


    var geographicMapInterface: BasicGeographicMap = geographicMapCompositeInterface!!.getGeographicMapInterface()[0]!!


    var tiledLayer: AllBinaryTiledLayer = geographicMapInterface!!.getAllBinaryTiledLayer()!!


    var viewPosition2: TileLayerPositionIntoViewPosition = this.getViewPosition() as TileLayerPositionIntoViewPosition

viewPosition2!!.setTiledLayer(tiledLayer)
this.updateWaypointBehavior(geographicMapInterface)
}


                @Throws(Exception::class)
            
    open fun updateWaypointBehavior(geographicMapInterface: BasicGeographicMap)
        //nullable = true from not(false or (false and false)) = true
{
    //var geographicMapInterface = geographicMapInterface
this.geographicMapCellPositionAreaBase!!.update(geographicMapInterface)
}


                @Throws(Exception::class)
            
    open fun construct(rtsPlayerLayerInterface: RTSPlayerLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var rtsPlayerLayerInterface = rtsPlayerLayerInterface
ViewPositionEventHandler.getInstance()!!.addListener(this as AllBinaryLayer)
this.animationInterface= this.buildAnimationInterface
this.hackVerticleBuild= 0
}


    open fun select()
        //nullable = true from not(false or (false and true)) = true
{
this.rangeAnimation= this.initRangeAnimation
this.sensorRangeAnimation= this.initSensorRangeAnimation
this.setSelected(true)
}


    open fun deselect()
        //nullable = true from not(false or (false and true)) = true
{

    var animation: Animation = NullAnimationFactory.getFactoryInstance()!!.getInstance(0)!!

this.rangeAnimation= animation
this.sensorRangeAnimation= animation
this.setSelected(false)
}


    open fun setSelected(selected: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var selected = selected
this.selected= selected
}


    override fun isSelected()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.selected
}


    override fun getPercentComplete()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.percentCompleteP
}


    open fun getScrollSelectionForm()
        //nullable = true from not(false or (false and true)) = true
: ScrollSelectionForm{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ScrollSelectionForm.NULL_SCROLL_SELECTION_FORM
}


    override fun initInputProcessors()
        //nullable = true from not(false or (false and true)) = true
{
GameInputProcessorUtil.init(this.inputProcessorArray)
}


                @Throws(Exception::class)
            
    open fun processBuiltTick(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{
    //var allBinaryLayerManager = allBinaryLayerManager
this.animationInterface= this.indexedButShouldBeRotationAnimationInterface
}


    override fun processTick(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{
    //var allBinaryLayerManager = allBinaryLayerManager

        try {
            
    
                        if(this.isCompleted())
                        
                                    {
                                    this.processBuiltTick(allBinaryLayerManager)

                                    }
                                
                        else {
                            this.build()

                        }
                            
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "processTick", e)
}

}


                @Throws(Exception::class)
            
    override fun processInput(layerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{
    //var layerManager = layerManager
}


    open fun reload()
        //nullable = true from not(false or (false and true)) = true
{
}


    open fun onMovement(trackingEvent: TrackingEvent)
        //nullable = true from not(false or (false and false)) = true
{
    //var trackingEvent = trackingEvent
}


                @Throws(Exception::class)
            
    open fun onMovementFound(trackingEvent: TrackingEvent)
        //nullable = true from not(false or (false and false)) = true
{
    //var trackingEvent = trackingEvent
}


    override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics
super.paintFirst(graphics)

    var viewPosition: ViewPosition = this.getViewPosition()!!


    var viewX: Int = viewPosition!!.getX()!!


    var viewY: Int = viewPosition!!.getY()!!

this.getAnimationInterface()!!.paint(graphics, viewX, viewY)
}


                @Throws(Exception::class)
            
    override fun damage(damage: Int, damageType: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var damage = damage
    //var damageType = damageType
}


    override fun getSourceId()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return id
}


    private val rtsLayerUtil: RTSLayerUtil = RTSLayerUtil.getInstance()!!

    override fun downgrade()
        //nullable = true from not(false or (false and true)) = true
{
rtsLayerUtil!!.downgrade(this)
}


    override fun upgrade()
        //nullable = true from not(false or (false and true)) = true
{
rtsLayerUtil!!.upgrade(this)
}


    override fun isCompleted()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

    
                        if(this.hackVerticleBuild < BUILD_VALUE)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                        }
                            
}


                @Throws(Exception::class)
            
    open fun build()
        //nullable = true from not(false or (false and true)) = true
{

    
                        if(this.buildFrameTimeHelper!!.isTime())
                        
                                    {
                                    this.animationInterface= this.buildAnimationInterface
this.verticleBuildAnimationInterface!!.nextFrame()
this.hackVerticleBuild++

                                    }
                                
this.percentCompleteP= 100 *this.hackVerticleBuild /BUILD_VALUE
this.getHudPaintable()!!.updateInfo()
}


    override fun isSelfUpgradeable()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


    override fun getCost()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rtsLayerUtil!!.getCost(this)
}


    override fun getDowngradeCost()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rtsLayerUtil!!.getDowngradeCost(this)
}


    override fun getUpgradeCost()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rtsLayerUtil!!.getUpgradeCost(this)
}


    override fun isUpgradeable()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

    
                        if(this.getLevel() < this.getMaxLevel())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


    override fun isDowngradeable()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

    
                        if(this.getLevel() > 1)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


    override fun getLevel()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return level
}


    open fun setLevel(level: Int)
        //nullable = true from not(false or (false and false)) = true
{
var level = level
this.level= level
}


    open fun getVerticleBuildAnimationInterface()
        //nullable = true from not(false or (false and true)) = true
: Animation{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return verticleBuildAnimationInterface
}


    open fun getAnimationInterface()
        //nullable = true from not(false or (false and true)) = true
: Animation{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return animationInterface
}


    open fun setAnimationInterface(animationInterface: Animation)
        //nullable = true from not(false or (false and false)) = true
{
    //var animationInterface = animationInterface
this.animationInterface= animationInterface
}


    private val layerDistanceUtil: LayerDistanceUtil = LayerDistanceUtil.getInstance()!!

                @Throws(Exception::class)
            
    override fun setTarget(targetGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var targetGameLayer = targetGameLayer

    var anotherTargetDistance: Int = layerDistanceUtil!!.getDistance(this as AllBinaryLayer, targetGameLayer as AllBinaryLayer)!!


    var waypointBehaviorBase: WaypointBehaviorBase = this.getWaypointBehavior()!!

waypointBehaviorBase!!.setTarget(targetGameLayer as PathFindingLayerInterface, anotherTargetDistance)
}


    open fun createHudPaintable()
        //nullable = true from not(false or (false and true)) = true
: SelectionHudPaintable{



                            throw RuntimeException()
}


    override fun getHudPaintable()
        //nullable = true from not(false or (false and true)) = true
: SelectionHudPaintable{



                            throw RuntimeException()
}


    override fun getMaxLevel()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return maxLevel
}


    open fun setMaxLevel(maxLevel: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var maxLevel = maxLevel
this.maxLevel= maxLevel
}


    open fun getHealthInterface()
        //nullable = true from not(false or (false and true)) = true
: Health{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return healthInterface
}


    open fun setHealthInterface(healthInterface: Health)
        //nullable = true from not(false or (false and false)) = true
{
    //var healthInterface = healthInterface
this.healthInterface= healthInterface
}


    open fun getRTSFormInput()
        //nullable = true from not(false or (false and true)) = true
: RTSFormInput{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.rtsFormInput
}


                @Throws(Exception::class)
            
    override fun isDestroyed()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.destroyed
}


                @Throws(Exception::class)
            
    open fun setDestroyed(destroyed: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
    //var destroyed = destroyed
this.destroyed= destroyed

    
                        if(this.isDestroyed())
                        
                                    {
                                    DestroyedLayerProcessor.getInstance()!!.add(this)
ViewPositionEventHandler.getInstance()!!.removeListener(this)

                                    }
                                
}


    override fun getEndGeographicMapCellPositionList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.geographicMapCellPositionAreaBase!!.getOccupyingGeographicMapCellPositionList()
}


    override fun getGeographicMapCellPositionArea()
        //nullable = true from not(false or (false and true)) = true
: GeographicMapCellPositionAreaBase{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return geographicMapCellPositionAreaBase
}


    override fun shouldHandleStartSameAsEnd()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


                @Throws(Exception::class)
            
    override fun handleCost(ownerLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{
var ownerLayer = ownerLayer
}


    override fun getWaypointBehavior()
        //nullable = true from not(false or (false and true)) = true
: WaypointBehaviorBase{



                            throw RuntimeException()
}


    override fun getParentLayer()
        //nullable = true from not(false or (false and true)) = true
: PathFindingLayerInterface{



                            throw RuntimeException()
}


    override fun getRTSLayer2LogHelper()
        //nullable = true from not(false or (false and true)) = true
: RTSLayer2LogHelper{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.rtsLayer2LogHelper
}


    override fun getWaypointLogHelper()
        //nullable = true from not(false or (false and true)) = true
: WaypointLogHelper{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.waypointLogHelperP
}


    override fun getWaypoint2LogHelper()
        //nullable = true from not(false or (false and true)) = true
: Waypoint2LogHelper{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.waypoint2LogHelperP
}


    override fun getWaypointRunnableLogHelper()
        //nullable = true from not(false or (false and true)) = true
: WaypointRunnableLogHelper{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.waypointRunnableLogHelperP
}


    override fun shouldAddWaypointFromBuilding()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    override fun getCaptionAnimationHelper()
        //nullable = true from not(false or (false and true)) = true
: CaptionAnimationHelperBase{



                            throw RuntimeException()
}


    override fun isShowMoreCaptionStates()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.showMoreCaptionStates
}


                @Throws(Exception::class)
            
    override fun init(geographicMapCellHistory: GeographicMapCellHistory, geographicMapCellPositionBasicArrayList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{
    //var geographicMapCellHistory = geographicMapCellHistory
    //var geographicMapCellPositionBasicArrayList = geographicMapCellPositionBasicArrayList
}


                @Throws(Exception::class)
            
    override fun getCurrentGeographicMapCellPosition()
        //nullable = true from not(false or (false and true)) = true
: GeographicMapCellPosition{



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
    override fun getTopLeftGeographicMapCellPosition()
        //nullable = true from not(false or (false and true)) = true
: GeographicMapCellPosition{



                            throw RuntimeException()
}


    override fun getMoveOutOfBuildAreaPath(geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{
    //var geographicMapCellPosition = geographicMapCellPosition



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
    override fun setClosestGeographicMapCellHistory(pathsList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{
    //var pathsList = pathsList
}


    override fun teleportTo(geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
{
    //var geographicMapCellPosition = geographicMapCellPosition
}


                @Throws(Exception::class)
            
    override fun setLoad(resource: Int)
        //nullable = true from not(false or (false and false)) = true
{
var resource = resource
}


                @Throws(Exception::class)
            
    override fun getSurroundingGeographicMapCellPositionList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
    override fun trackTo(reason: String)
        //nullable = true from not(false or (false and false)) = true
{
    //var reason = reason
}


                @Throws(Exception::class)
            
    override fun trackTo(dx: Int, dy: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var dx = dx
    //var dy = dy
}


    override fun isWaypointListEmptyOrOnlyTargets()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    override fun getTrackingEvent()
        //nullable = true from not(false or (false and true)) = true
: TrackingEvent{



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
    override fun buildingChase(allbinaryLayer: AllBinaryLayer, cellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var allbinaryLayer = allbinaryLayer
    //var cellPosition = cellPosition



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    override fun allStop()
        //nullable = true from not(false or (false and true)) = true
{
}


    override fun implmentsTickableInterface()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


    override fun implmentsGameInputInterface()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


    open fun getRootName()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rootName
}


    open fun getRotationAnimationInterface()
        //nullable = true from not(false or (false and true)) = true
: RotationAnimation{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return indexedButShouldBeRotationAnimationInterface as RotationAnimation
}


    open fun setFrame(index: Int)
        //nullable = true from not(false or (false and false)) = true
{
var index = index
this.getRotationAnimationInterface()!!.setFrame(index)
}


    open fun setRotationAnimationInterface(rotationAnimationInterface: RotationAnimation)
        //nullable = true from not(false or (false and false)) = true
{
    //var rotationAnimationInterface = rotationAnimationInterface
this.indexedButShouldBeRotationAnimationInterface= rotationAnimationInterface
}


}
                
            

