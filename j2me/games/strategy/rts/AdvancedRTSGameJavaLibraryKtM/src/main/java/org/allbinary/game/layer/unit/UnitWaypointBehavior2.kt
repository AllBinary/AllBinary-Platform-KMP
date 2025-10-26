
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
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.HTMLFeatureFactory
import org.allbinary.game.layer.SteeringVisitor
import org.allbinary.game.layer.AdvancedRTSGameLayer
import org.allbinary.game.layer.MultipassWaypointPathRunnable
import org.allbinary.game.layer.RTSLayer
import org.allbinary.game.layer.WaypointPathRunnable
import org.allbinary.util.BasicArrayList
import org.allbinary.string.CommonStrings
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.game.layer.PathFindingLayerInterface
import org.allbinary.game.layer.WaypointPathRunnableBase
import org.allbinary.game.layer.special.CollidableDestroyableDamageableLayer
import org.allbinary.game.layer.waypoint.WaypointBase
import org.allbinary.game.tracking.TrackingEventHandler
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.logic.NullUtil
import org.allbinary.math.LayerDistanceUtil
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.thread.PathFindingThreadPool
import org.allbinary.thread.ThreadPool
import org.allbinary.time.TimeDelayHelper

open public class UnitWaypointBehavior2 : UnitWaypointBehavior {
        
companion object {
            
    private val WANDERING: String = "Order?"

    private val THINKING: String = "Thinking"

    private val THINKING_ABOUT_TARGET: String = "Hmmm"

    private val TARGET: String = "Target"

    private val KILL: String = "Kill!"

    private val STOP: String = "Stop"

    private val WAYPOINT_DESTROYED_SHORT: String = "Uh Oh"

    private val WAYPOINT_DESTROYED: String = "Waypoint Destroyed"

    private val ALL_VISITED_SHORT: String = "Arrived"

    private val ALL_VISITED: String = "All Visited"

    private val ALREADY_THERE_SHORT: String = "Again?"

    private val ALREADY_THERE: String = "Already There"

    private val NEXT_PATH_NODE: String = "Next Path Node"

    private val runningWaypointPathList: BasicArrayList = BasicArrayList()

    private val TARGET_DISTANCE: String = "Target Distance"

    private val TARGET_LAYER: String = "Target Layer"

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val basicColorFactory: BasicColorFactory = BasicColorFactory.getInstance()!!

    private val layerDistanceUtil: LayerDistanceUtil = LayerDistanceUtil.getInstance()!!

    private val pathFindingThreadPool: ThreadPool = PathFindingThreadPool.getInstance()!!

    private var sensorRange: Int = 0

    private var closeRange: Int = 0

    private val progressTimeDelayHelper: TimeDelayHelper

    var nextUnvisitedPathGeographicMapCellPosition: GeographicMapCellPosition

    private var afterNextUnvisitedPathGeographicMapCellPosition: GeographicMapCellPosition

    private val wanderPathsList: BasicArrayList

    private val waypointPathRunnable: WaypointPathRunnableBase

    private var waitingOnTargetPath: Boolean= false

    private var waitingOnWaypointPath: Boolean= false

    private var targetWithoutCachedPathLayerInterface: CollidableDestroyableDamageableLayer
protected constructor (ownerAdvancedRTSGameLayer: UnitLayer, fakeWaypoint: AdvancedRTSGameLayer)                        

                            : super(ownerAdvancedRTSGameLayer, fakeWaypoint){
var ownerAdvancedRTSGameLayer = ownerAdvancedRTSGameLayer
var fakeWaypoint = fakeWaypoint


                            //For kotlin this is before the body of the constructor.
                    
this.progressTimeDelayHelper= TimeDelayHelper(5000)
this.wanderPathsList= BasicArrayList()

    var features: Features = Features.getInstance()!!


    var isHTML: Boolean = features.isDefault(HTMLFeatureFactory.getInstance()!!.HTML)!!

this.waypointPathRunnable= if(isHTML) {
                            
                            MultipassWaypointPathRunnable()
                        
                            } else {
                            WaypointPathRunnable()
                            }
    
}


    override fun initRange(weaponRange: Int)
        //nullable = true from not(false or (false and false)) = true
{
var weaponRange = weaponRange
super.initRange(weaponRange)
this.closeRange= weaponRange
this.sensorRange= weaponRange *4
this.associatedAdvancedRTSGameLayer!!.waypoint2LogHelperP!!.initRange(this.associatedAdvancedRTSGameLayer, this.closeRange, this.sensorRange)
}


    override fun getNextUnvisitedPathGeographicMapCellPosition()
        //nullable = true from not(false or (false and true)) = true
: GeographicMapCellPosition{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return nextUnvisitedPathGeographicMapCellPosition
}


    override fun isRunning()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

    
                        if(this.waypointPathRunnable!!.isRunning())
                        
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
            
    override fun processTick(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{
var allBinaryLayerManager = allBinaryLayerManager

    
                        if(this.waypointPathRunnable!!.isRunning())
                        
                                    {
                                    
    
                        if(waypointPathsList != runningWaypointPathList)
                        
                                    {
                                    this.waypointPathRunnable!!.setRunning(false)

    
                        if(this.waitingOnTargetPath)
                        
                                    {
                                    this.setTargetPath()

                                    }
                                
                             else 
    
                        if(this.waitingOnWaypointPath)
                        
                                    {
                                    this.setWaypointPath(this.waypointPathRunnable!!.getTargetLayer() as AdvancedRTSGameLayer)

                                    }
                                
                        else {
                            


                            throw Exception("Should not happen")

                        }
                            

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                        }
                            

                                    }
                                
this.processTargetList()

    
                        if(!this.waypointPathRunnable!!.isRunning())
                        
                                    {
                                    this.processWaypoint()

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                        }
                            

    
                        if(!this.waypointPathRunnable!!.isRunning())
                        
                                    {
                                    this.processTargeting()

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                        }
                            

    
                        if(!this.waypointPathRunnable!!.isRunning())
                        
                                    {
                                    this.teleportIfNoProgress()

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                        }
                            
}


                @Throws(Exception::class)
            
    open fun onEnemyMovement(layerInterface: AdvancedRTSGameLayer)
        //nullable = true from not(false or (false and false)) = true
{
var layerInterface = layerInterface

    var anotherTargetDistance: Int = layerDistanceUtil!!.getDistance(this.associatedAdvancedRTSGameLayer, layerInterface)!!


    
                        if(layerInterface == this.currentTargetLayerInterface)
                        
                                    {
                                    this.setCurrentTargetDistance(anotherTargetDistance)

                                    }
                                
                        else {
                            this.processPossibleTarget(layerInterface, anotherTargetDistance)

                        }
                            
}


                @Throws(Exception::class)
            
    open fun processPossibleTarget(layerInterface: AdvancedRTSGameLayer, anotherTargetDistance: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var layerInterface = layerInterface
    //var anotherTargetDistance = anotherTargetDistance

    var isShorterThanCurrentTargetDistance: Boolean = this.getCurrentTargetDistance() > anotherTargetDistance


    var isCurrentTargetDestroyed: Boolean = this.currentTargetLayerInterface != 
                                    null
                                 && this.currentTargetLayerInterface!!.isDestroyed()

this.associatedAdvancedRTSGameLayer!!.waypoint2LogHelperP!!.processPossibleTarget(this.associatedAdvancedRTSGameLayer, this, layerInterface, anotherTargetDistance, isShorterThanCurrentTargetDistance, isCurrentTargetDestroyed)

    
                        if(this.isWaypointListEmptyOrOnlyTargets() && this.isInSensorRange(layerInterface, anotherTargetDistance) && (isShorterThanCurrentTargetDistance || isCurrentTargetDestroyed))
                        
                                    {
                                    this.associatedAdvancedRTSGameLayer!!.waypoint2LogHelperP!!.processPossibleTarget(this.associatedAdvancedRTSGameLayer, this, layerInterface, anotherTargetDistance)
this.setTarget(layerInterface, anotherTargetDistance)

                                    }
                                
                             else 
    
                        if(this.isCloseRange(layerInterface, anotherTargetDistance) && (isShorterThanCurrentTargetDistance || isCurrentTargetDestroyed))
                        
                                    {
                                    this.associatedAdvancedRTSGameLayer!!.waypoint2LogHelperP!!.processPossibleTargetCloser(this.associatedAdvancedRTSGameLayer, this, layerInterface, anotherTargetDistance)
this.setTarget(layerInterface, anotherTargetDistance)

                                    }
                                
}


                @Throws(Exception::class)
            
    open fun teleportIfNoProgress()
        //nullable = true from not(false or (false and true)) = true
{

    
                        if(this.isTrackingWaypoint() || this.associatedAdvancedRTSGameLayer!!.getParentLayer()!!.isDestroyed())
                        
                                    {
                                    
    
                        if(this.progressTimeDelayHelper!!.isTime() && this.nextUnvisitedPathGeographicMapCellPosition != 
                                    null
                                )
                        
                                    {
                                    this.associatedAdvancedRTSGameLayer!!.teleportTo(this.nextUnvisitedPathGeographicMapCellPosition)

                                    }
                                

    
                        if(this.getCompleteTimeDelayHelper()!!.isTime())
                        
                                    {
                                    
    var geographicMapCellPosition: GeographicMapCellPosition = this.currentGeographicMapCellHistory!!.getTracked()!!.get(this.currentGeographicMapCellHistory!!.getSize() -1) as GeographicMapCellPosition

this.associatedAdvancedRTSGameLayer!!.teleportTo(geographicMapCellPosition)

                                    }
                                

                                    }
                                
}


                @Throws(Exception::class)
            
    open fun setTarget(layerInterface: AdvancedRTSGameLayer, anotherTargetDistance: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var layerInterface = layerInterface
    //var anotherTargetDistance = anotherTargetDistance
this.associatedAdvancedRTSGameLayer!!.waypoint2LogHelperP!!.setTarget(this.associatedAdvancedRTSGameLayer, this, layerInterface, anotherTargetDistance)
this.associatedAdvancedRTSGameLayer!!.getCaptionAnimationHelper()!!.update(TARGET, BasicColorFactory.getInstance()!!.GREEN)
this.associatedAdvancedRTSGameLayer!!.setLoad(0.toShort())
this.setCurrentTargetDistance(anotherTargetDistance)
this.setCurrentTargetLayerInterface(layerInterface)
this.setTrackingWaypoint(false)
this.targetList!!.clear()

    
                        if(!this.isCloseRange(layerInterface, anotherTargetDistance) && this.canInsertWaypoint(0, this.currentTargetLayerInterface))
                        
                                    {
                                    
    var geographicMapCellPosition: GeographicMapCellPosition = associatedAdvancedRTSGameLayer!!.getCurrentGeographicMapCellPosition()!!


    var waypoint: WaypointBase = currentTargetLayerInterface = this.currentTargetLayerInterfacecurrentTargetLayerInterface as PathFindingLayerInterface
currentTargetLayerInterface.
                    getWaypointBehavior()!!.getWaypoint()!!


    var list: BasicArrayList = waypoint.getPathsListFromCacheOnly(geographicMapCellPosition)!!

this.setWaypointPathsList(list)

    
                        if(this.waypointPathsList == 
                                    null
                                )
                        
                                    {
                                    this.targetWithoutCachedPathLayerInterface= this.currentTargetLayerInterface

                                    }
                                
                             else 
    
                        if(this.waypointPathsList!!.size() != 0)
                        
                                    {
                                    this.setTargetPath()

                                    }
                                

                                    }
                                
}


                @Throws(Exception::class)
            
    open fun setTargetPath()
        //nullable = true from not(false or (false and true)) = true
{

    
                        if(this.currentTargetLayerInterface != 
                                    null
                                )
                        
                                    {
                                    
    
                        if(this.currentTargetLayerInterface!!.isDestroyed())
                        
                                    {
                                    this.associatedAdvancedRTSGameLayer!!.waypoint2LogHelperP!!.setTargetPath(this.associatedAdvancedRTSGameLayer)
this.associatedAdvancedRTSGameLayer!!.getCaptionAnimationHelper()!!.update(KILL, this.basicColorFactory!!.ORANGE)
this.clearTarget()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

    
                        if(this.currentTargetLayerInterface == this.waypointPathRunnable!!.getTargetLayer())
                        
                                    {
                                    this.associatedAdvancedRTSGameLayer!!.waypoint2LogHelperP!!.setTargetPath(this.associatedAdvancedRTSGameLayer, this)
this.insertWaypoint(0, this.currentTargetLayerInterface)
this.setRandomGeographicMapCellHistory(this.waypointPathsList)

                                    }
                                

                                    }
                                
}


                @Throws(Exception::class)
            
    override fun setGeographicMapCellHistoryPath(geographicMapCellPositionBasicArrayList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{
    //var geographicMapCellPositionBasicArrayList = geographicMapCellPositionBasicArrayList
this.setCurrentPathGeographicMapCellPosition(
                            null)
this.nextUnvisitedPathGeographicMapCellPosition= 
                                        null
                                    
super.setGeographicMapCellHistoryPath(geographicMapCellPositionBasicArrayList)
}


                @Throws(Exception::class)
            
    open fun processWaypoint()
        //nullable = true from not(false or (false and true)) = true
{

    var size: Int = this.targetList!!.size()!!


    
                        if(size > 0)
                        
                                    {
                                    
    var targetLayer: AdvancedRTSGameLayer = this.targetList!!.get(0) as AdvancedRTSGameLayer

this.associatedAdvancedRTSGameLayer!!.waypoint2LogHelperP!!.processWaypoint(this.associatedAdvancedRTSGameLayer, this, targetLayer, size)

    
                        if(targetLayer!!.isDestroyed())
                        
                                    {
                                    this.associatedAdvancedRTSGameLayer!!.getCaptionAnimationHelper()!!.update(WAYPOINT_DESTROYED_SHORT, this.basicColorFactory!!.YELLOW)
this.removeWaypoint(targetLayer, WAYPOINT_DESTROYED)

                                    }
                                
                        else {
                            
    var geographicMapCellPosition: GeographicMapCellPosition = associatedAdvancedRTSGameLayer!!.getCurrentGeographicMapCellPosition()!!


    
                        if(this.isTrackingWaypoint())
                        
                                    {
                                    this.associatedAdvancedRTSGameLayer!!.waypoint2LogHelperP!!.processWaypointTracked(this.associatedAdvancedRTSGameLayer, this)

    
                        if(this.visitIfAtMidPoint(geographicMapCellPosition))
                        
                                    {
                                    this.associatedAdvancedRTSGameLayer!!.waypoint2LogHelperP!!.processWaypointTracked(this.associatedAdvancedRTSGameLayer, geographicMapCellPosition)

                                    }
                                

    
                        if(this.currentGeographicMapCellHistory!!.isAllVisited2() && this.currentTargetLayerInterface != 
                                    null
                                )
                        
                                    {
                                    
    var oldWaypointLayer: AdvancedRTSGameLayer = this.currentTargetLayerInterface as AdvancedRTSGameLayer

oldWaypointLayer!!.getWaypointBehavior()!!.getWaypoint()!!.visit(this.associatedAdvancedRTSGameLayer)
this.associatedAdvancedRTSGameLayer!!.getCaptionAnimationHelper()!!.update(ALL_VISITED_SHORT, this.basicColorFactory!!.GREEN)
this.removeWaypoint(this.currentTargetLayerInterface as AdvancedRTSGameLayer, ALL_VISITED)

                                    }
                                

                                    }
                                
                             else 
    
                        if(this.currentTargetLayerInterface == 
                                    null
                                 || this.waypointOverridesAttacking)
                        
                                    {
                                    
    var list: BasicArrayList = targetLayer!!.getWaypointBehavior()!!.getWaypoint()!!.getPathsListFromCacheOnly(geographicMapCellPosition)!!

this.setWaypointPathsList(list)

    
                        if(this.waypointPathsList == 
                                    null
                                )
                        
                                    {
                                    this.waitingOnWaypointPath= true
this.associatedAdvancedRTSGameLayer!!.getCaptionAnimationHelper()!!.update(THINKING, this.basicColorFactory!!.GREEN)
this.runWaypointPathTask(targetLayer)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                
this.setWaypointPath(targetLayer)

                                    }
                                

                        }
                            

                                    }
                                
}


                @Throws(Exception::class)
            
    open fun wander()
        //nullable = true from not(false or (false and true)) = true
{

    
                        if(this.currentGeographicMapCellHistory!!.isAllVisited2())
                        
                                    {
                                    this.associatedAdvancedRTSGameLayer!!.waypoint2LogHelperP!!.wander(this.associatedAdvancedRTSGameLayer)
this.associatedAdvancedRTSGameLayer!!.getCaptionAnimationHelper()!!.update(WANDERING, this.basicColorFactory!!.RED)
wanderPathsList!!.clear()
wanderPathsList!!.add(this.associatedAdvancedRTSGameLayer!!.getSurroundingGeographicMapCellPositionList())
this.setRandomGeographicMapCellHistory(wanderPathsList)

                                    }
                                
this.visitIfAtMidPoint(this.getCurrentPathGeographicMapCellPosition())
this.updateCurrentPathGeographicMapCellPosition()
this.associatedAdvancedRTSGameLayer!!.trackTo(NEXT_PATH_NODE)
}


    open fun visitIfAtMidPoint(geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var geographicMapCellPosition = geographicMapCellPosition

    var unitLayer: UnitLayer = this.associatedAdvancedRTSGameLayer


    
                        if(geographicMapCellPosition != 
                                    null
                                 && this.nextUnvisitedPathGeographicMapCellPosition == geographicMapCellPosition)
                        
                                    {
                                    
    var point: GPoint = geographicMapCellPosition!!.getMidPoint()!!


    var afterNextPoint: GPoint = this.afterNextUnvisitedPathGeographicMapCellPosition!!.getMidPoint()!!


    var beyondMidPoint: Boolean = true


    
                        if(geographicMapCellPosition!!.getColumn() == this.afterNextUnvisitedPathGeographicMapCellPosition!!.getColumn())
                        
                                    {
                                    
                                    }
                                
                             else 
    
                        if(point.getX() < afterNextPoint!!.getX())
                        
                                    {
                                    
    
                        if(unitLayer!!.getXP() +unitLayer!!.getHalfWidth() < point.getX())
                        
                                    {
                                    beyondMidPoint= false

                                    }
                                

                                    }
                                
                        else {
                            
    
                        if(unitLayer!!.getXP() +unitLayer!!.getHalfWidth() > point.getX())
                        
                                    {
                                    beyondMidPoint= false

                                    }
                                

                        }
                            

    
                        if(geographicMapCellPosition!!.getRow() == this.afterNextUnvisitedPathGeographicMapCellPosition!!.getRow())
                        
                                    {
                                    
                                    }
                                
                             else 
    
                        if(point.getY() < afterNextPoint!!.getY())
                        
                                    {
                                    
    
                        if(unitLayer!!.getYP() +unitLayer!!.getHalfHeight() < point.getY())
                        
                                    {
                                    beyondMidPoint= false

                                    }
                                

                                    }
                                
                        else {
                            
    
                        if(unitLayer!!.getYP() +unitLayer!!.getHalfHeight() > point.getY())
                        
                                    {
                                    beyondMidPoint= false

                                    }
                                

                        }
                            

    
                        if(beyondMidPoint)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.currentGeographicMapCellHistory!!.visit(geographicMapCellPosition)

                                    }
                                

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(Exception::class)
            
    open fun processTargetList()
        //nullable = true from not(false or (false and true)) = true
{
this.targetWithoutCachedPathLayerInterface= 
                                        null
                                    




                        for (index in this.getPossibleTargetList()!!.size() -1 downTo 0)

        {

    var layerInterface: AdvancedRTSGameLayer = this.getPossibleTargetList()!!.get(index) as AdvancedRTSGameLayer


    
                        if(layerInterface!!.isDestroyed())
                        
                                    {
                                    this.getPossibleTargetList()!!.remove(layerInterface)

                                    }
                                
                        else {
                            this.onEnemyMovement(layerInterface)

                        }
                            
}


    
                        if(this.targetWithoutCachedPathLayerInterface != 
                                    null
                                )
                        
                                    {
                                    this.waitingOnTargetPath= true
this.associatedAdvancedRTSGameLayer!!.getCaptionAnimationHelper()!!.update(THINKING_ABOUT_TARGET, this.basicColorFactory!!.GREEN)
this.runWaypointPathTask(this.currentTargetLayerInterface as AdvancedRTSGameLayer)

                                    }
                                
this.getPossibleTargetList()!!.clear()
}


                @Throws(Exception::class)
            
    open fun processTargeting()
        //nullable = true from not(false or (false and true)) = true
{

    
                        if(this.currentTargetLayerInterface != 
                                    null
                                 && (this.isInSensorRange(this.currentTargetLayerInterface, this.getCurrentTargetDistance()) || this.isTrackingWaypoint()))
                        
                                    {
                                    
    
                        if(this.currentTargetLayerInterface!!.isDestroyed())
                        
                                    {
                                    this.associatedAdvancedRTSGameLayer!!.waypoint2LogHelperP!!.targetDestroyed(this.associatedAdvancedRTSGameLayer)
this.associatedAdvancedRTSGameLayer!!.getCaptionAnimationHelper()!!.update(KILL, this.basicColorFactory!!.ORANGE)
this.clearTarget()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

    var dx: Int = 0


    var dy: Int = 0


    
                        if(this.isTrackingWaypoint())
                        
                                    {
                                    this.updateCurrentPathGeographicMapCellPosition()

    var point: GPoint = this.nextUnvisitedPathGeographicMapCellPosition!!.getMidPoint()!!

dx= associatedAdvancedRTSGameLayer!!.getXP() +associatedAdvancedRTSGameLayer!!.getHalfWidth() -point.getX()
dy= associatedAdvancedRTSGameLayer!!.getYP() +associatedAdvancedRTSGameLayer!!.getHalfHeight() -point.getY()
this.associatedAdvancedRTSGameLayer!!.waypoint2LogHelperP!!.processTargeting(this.associatedAdvancedRTSGameLayer, dx, dy)

                                    }
                                
                        else {
                            this.associatedAdvancedRTSGameLayer!!.waypoint2LogHelperP!!.processTargetingNonWayPoint(this.associatedAdvancedRTSGameLayer, dx, dy)
dx= (this.associatedAdvancedRTSGameLayer!!.getXP() +this.associatedAdvancedRTSGameLayer!!.getHalfWidth()) -(this.currentTargetLayerInterface!!.getXP() +this.currentTargetLayerInterface!!.getHalfWidth())
dy= (this.associatedAdvancedRTSGameLayer!!.getYP() +this.associatedAdvancedRTSGameLayer!!.getHalfHeight()) -(this.currentTargetLayerInterface!!.getYP() +this.currentTargetLayerInterface!!.getHalfHeight())

                        }
                            
this.associatedAdvancedRTSGameLayer!!.trackTo(dx, dy)

                                    }
                                
                        else {
                            
    
                        if(this.associatedAdvancedRTSGameLayer!!.getParentLayer()!!.isDestroyed())
                        
                                    {
                                    this.wander()

                                    }
                                
                        else {
                            
    
                        if(this.associatedAdvancedRTSGameLayer!!.showMoreCaptionStates)
                        
                                    {
                                    this.associatedAdvancedRTSGameLayer!!.getCaptionAnimationHelper()!!.update(STOP, this.basicColorFactory!!.YELLOW)

                                    }
                                
this.associatedAdvancedRTSGameLayer!!.allStop()

                        }
                            

                        }
                            
}


    open fun updateCurrentPathGeographicMapCellPosition()
        //nullable = true from not(false or (false and true)) = true
{
this.setLastPathGeographicMapCellPosition(this.getCurrentPathGeographicMapCellPosition())
this.setCurrentPathGeographicMapCellPosition(this.nextUnvisitedPathGeographicMapCellPosition)
this.nextUnvisitedPathGeographicMapCellPosition= this.currentGeographicMapCellHistory!!.getFirstUnvisited()
this.afterNextUnvisitedPathGeographicMapCellPosition= this.currentGeographicMapCellHistory!!.getAfterIfNotLast(this.nextUnvisitedPathGeographicMapCellPosition)

    
                        if(this.getCurrentPathGeographicMapCellPosition() != this.nextUnvisitedPathGeographicMapCellPosition)
                        
                                    {
                                    this.progressTimeDelayHelper!!.setStartTime()

                                    }
                                
}


                @Throws(Exception::class)
            
    open fun setWaypointPath(waypointLayer: AdvancedRTSGameLayer)
        //nullable = true from not(false or (false and false)) = true
{
    //var waypointLayer = waypointLayer

    
                        if(waypointPathsList!!.size() != 0)
                        
                                    {
                                    this.setCurrentTargetLayerInterface(waypointLayer)
this.setCurrentTargetDistance(.MAX_VALUE())
this.setRandomGeographicMapCellHistory(waypointPathsList)

                                    }
                                
                        else {
                            waypointLayer!!.getWaypointBehavior()!!.getWaypoint()!!.visit(this.associatedAdvancedRTSGameLayer)
this.associatedAdvancedRTSGameLayer!!.getCaptionAnimationHelper()!!.update(ALREADY_THERE_SHORT, this.basicColorFactory!!.YELLOW)
this.removeWaypoint(waypointLayer, ALREADY_THERE)

                        }
                            
}


                @Throws(Exception::class)
            
    open fun runWaypointPathTask(waypointLayer: AdvancedRTSGameLayer)
        //nullable = true from not(false or (false and false)) = true
{
    //var waypointLayer = waypointLayer
setWaypointPathsList(runningWaypointPathList)

    
                        if(this.waypointPathRunnable!!.isRunning())
                        
                                    {
                                    


                            throw Exception("Should never be running here")

                                    }
                                
this.waypointPathRunnable!!.setRunning(true)
this.waypointPathRunnable!!.setUnitLayer(this.associatedAdvancedRTSGameLayer)
this.waypointPathRunnable!!.setTargetLayer(waypointLayer)
this.pathFindingThreadPool!!.runTask(this.waypointPathRunnable)
}


                @Throws(Exception::class)
            
    open fun removeWaypoint(waypointLayer: RTSLayer, reason: String)
        //nullable = true from not(false or (false and false)) = true
{
    //var waypointLayer = waypointLayer
    //var reason = reason
this.associatedAdvancedRTSGameLayer!!.waypoint2LogHelperP!!.removeWaypoint(this.associatedAdvancedRTSGameLayer, this, waypointLayer, reason)
this.targetList!!.remove(waypointLayer)
this.associatedAdvancedRTSGameLayer!!.waypoint2LogHelperP!!.removeWaypoint(this.associatedAdvancedRTSGameLayer, this, this.targetList)

    
                        if(this.currentTargetLayerInterface == waypointLayer)
                        
                                    {
                                    this.associatedAdvancedRTSGameLayer!!.waypoint2LogHelperP!!.removeWaypointClear(this.associatedAdvancedRTSGameLayer)
this.clearTarget()

                                    }
                                
}


                @Throws(Exception::class)
            
    override fun clearTarget()
        //nullable = true from not(false or (false and true)) = true
{
this.associatedAdvancedRTSGameLayer!!.waypoint2LogHelperP!!.clearTarget(this.associatedAdvancedRTSGameLayer)
this.setCurrentTargetLayerInterface(
                            null)
this.setTrackingWaypoint(false)
this.setCurrentTargetDistance(.MAX_VALUE())
TrackingEventHandler.getInstance()!!.fireEvent(this.associatedAdvancedRTSGameLayer!!.getTrackingEvent())
}


    override fun isWaypointListEmptyOrOnlyTargets()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

    var list: BasicArrayList = this.targetList


    
                        if(list.size() == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                




                        for (index in list.size() -1 downTo 0)

        {

    var layerInterface: AdvancedRTSGameLayer = list.get(index) as AdvancedRTSGameLayer


    
                        if(layerInterface!!.isWaypointListEmptyOrOnlyTargets())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


    open fun isCloseRange(layerInterface: AdvancedRTSGameLayer, targetDistance: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var layerInterface = layerInterface
    //var targetDistance = targetDistance



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return targetDistance < this.closeRange +layerInterface!!.getHalfHeight()
}


    override fun isInSensorRange(layerInterface: CollidableDestroyableDamageableLayer, targetDistance: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var layerInterface = layerInterface
    //var targetDistance = targetDistance



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return targetDistance < this.sensorRange +layerInterface!!.getHalfHeight()
}


    override fun getCurrentTargetingStateString()
        //nullable = true from not(false or (false and true)) = true
: String{

    var stringBuffer: StringMaker = StringMaker()


    
                        if(this.currentTargetLayerInterface != 
                                    null
                                )
                        
                                    {
                                    stringBuffer!!.append(TARGET_LAYER)
stringBuffer!!.append(commonSeps!!.SPACE)
stringBuffer!!.append(this.currentTargetLayerInterface!!.getName())
stringBuffer!!.append(" with ")
stringBuffer!!.append(TARGET_DISTANCE)
stringBuffer!!.append(commonSeps!!.SPACE)
stringBuffer!!.append(getCurrentTargetDistance())

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


                @Throws(Exception::class)
            
    override fun addWaypointFromUser(advancedRTSGameLayer: AdvancedRTSGameLayer)
        //nullable = true from not(false or (false and false)) = true
{
    //var advancedRTSGameLayer = advancedRTSGameLayer

    
                        if(advancedRTSGameLayer!!.isDestroyed())
                        
                                    {
                                    


                            throw Exception("Trying to add a dead: " +advancedRTSGameLayer)

                                    }
                                
this.associatedAdvancedRTSGameLayer!!.waypoint2LogHelperP!!.addWaypointFromUser(this.associatedAdvancedRTSGameLayer, advancedRTSGameLayer)
this.targetList!!.clear()
this.targetList!!.add(advancedRTSGameLayer)
this.clearTarget()
}


open public inner class BuildingSteeringVisitor : SteeringVisitor {
        
/*Static stuff is not allowed for Kotlin inner classescompanion object {
            *//*
        }
            */


            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val positionList: BasicArrayList = BasicArrayList()

    override fun visit(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: Any{
var anyType = anyType

        try {
            
    
                        if(this.getList()!!.size() > 0)
                        
                                    {
                                    
    var allbinaryLayer: AllBinaryLayer = this.getList()!!.get(0) as AllBinaryLayer


    var cellPosition: GeographicMapCellPosition = this.getPositionList()!!.get(0) as GeographicMapCellPosition


    var clear: Boolean = this@UnitWaypointBehavior2.buildingChase(allbinaryLayer, cellPosition)!!


    
                        if(clear)
                        
                                    {
                                    this.getList()!!.clear()
this.positionList!!.clear()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullUtil.getInstance()!!.NULL_OBJECT

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullUtil.getInstance()!!.NULL_OBJECT
} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, "visit", e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullUtil.getInstance()!!.NULL_OBJECT
}

}


    open fun getPositionList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return positionList
}


}
                
            
    private val buildingSteeringVisitor: BuildingSteeringVisitor = BuildingSteeringVisitor()

                @Throws(Exception::class)
            
    override fun addBuildingChase(allbinaryLayer: AllBinaryLayer, cellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
{
    //var allbinaryLayer = allbinaryLayer
    //var cellPosition = cellPosition

    
                        if(!this.buildingSteeringVisitor!!.getList()!!.contains(allbinaryLayer))
                        
                                    {
                                    this.buildingSteeringVisitor!!.getList()!!.add(allbinaryLayer)
this.buildingSteeringVisitor!!.getPositionList()!!.add(cellPosition)

                                    }
                                

    
                        if(!this.getSteeringVisitorList()!!.contains(this.buildingSteeringVisitor))
                        
                                    {
                                    this.getSteeringVisitorList()!!.add(this.buildingSteeringVisitor)

                                    }
                                
}


                @Throws(Exception::class)
            
    open fun buildingChase(allbinaryLayer: AllBinaryLayer, cellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var allbinaryLayer = allbinaryLayer
    //var cellPosition = cellPosition



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.associatedAdvancedRTSGameLayer!!.buildingChase(allbinaryLayer, cellPosition)
}


}
                
            

