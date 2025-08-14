
        /*
                * 
                *  AllBinary Open License Version 1
                *  Copyright (c) 2011 AllBinary
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
        package org.allbinary.game.ai




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Canvas
import org.allbinary.ai.ArtificialIntelligenceInterface
import org.allbinary.direction.Direction
import org.allbinary.direction.DirectionFactory
import org.allbinary.direction.DirectionalCompositeInterface
import org.allbinary.direction.DirectionalInterface
import org.allbinary.game.combat.destroy.event.DestroyedEvent
import org.allbinary.game.combat.destroy.event.DestroyedEventHandler
import org.allbinary.game.combat.destroy.event.DestroyedEventListenerInterface
import org.allbinary.game.input.GameInput
import org.allbinary.game.physics.velocity.BasicVelocityProperties
import org.allbinary.game.physics.velocity.VelocityInterfaceCompositeInterface
import org.allbinary.game.tracking.TrackingEvent
import org.allbinary.game.tracking.TrackingEventHandler
import org.allbinary.game.tracking.TrackingEventListenerInterface
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.math.MathUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventStrings
import org.allbinary.logic.util.visitor.Visitor
import org.allbinary.time.GameTickTimeDelayHelper
import org.allbinary.time.GameTickTimeDelayHelperFactory
import org.allbinary.time.TimeDelayHelper
import org.allbinary.util.BasicArrayList

open public class DiveAndDirectionalTrackingAI : BasicAI
                , TrackingEventListenerInterface
                , DestroyedEventListenerInterface {
        

        companion object {
            
    private val directionToKeyMap: IntArray = intArrayOf(Canvas.LEFT,Canvas.DOWN,Canvas.UP,Canvas.RIGHT)

        }
            
    private val mathUtil: MathUtil = MathUtil.getInstance()!!
            

    private val timeDelayHelper: TimeDelayHelper = TimeDelayHelper(500)

    private val list: BasicArrayList = BasicArrayList()

    private val directionalInterface: DirectionalInterface

    private val velocityInterface: BasicVelocityProperties

    private var initialDropped: Boolean= false

    private var dive: Boolean= false

    private var directionOfTarget: Direction = Direction.getInstance(0)!!
            

    private val MIN_DISTANCE: Int = 40

    private var lastTrackingLayerInterface: AllBinaryLayer = AllBinaryLayer.NULL_ALLBINARY_LAYER

    private val artificialIntelligenceInterface: ArtificialIntelligenceInterface

    private val aiVistor: Visitor

    private var lastDirection: Direction = DirectionFactory.getInstance()!!.NO_DIRECTION

    private val directionFactory: DirectionFactory = DirectionFactory.getInstance()!!
            

    private val gameTickTimeDelayHelper: GameTickTimeDelayHelper = GameTickTimeDelayHelperFactory.getInstance()!!
            
public constructor        (ownerLayerInterface: AllBinaryLayer, artificialIntelligenceInterface: ArtificialIntelligenceInterface, gameInput: GameInput, visitor: Visitor)                        

                            : super(ownerLayerInterface, gameInput){

                    var ownerLayerInterface = ownerLayerInterface


                    var artificialIntelligenceInterface = artificialIntelligenceInterface


                    var gameInput = gameInput


                    var visitor = visitor


                            //For kotlin this is before the body of the constructor.
                    
this.aiVistor= visitor
this.artificialIntelligenceInterface= artificialIntelligenceInterface

    var directionalCompositeInterface: DirectionalCompositeInterface = this.getOwnerLayerInterface() as DirectionalCompositeInterface

this.directionalInterface= directionalCompositeInterface!!.getDirectionalInterface()

    var velocityInterfaceCompositeInterface: VelocityInterfaceCompositeInterface = this.getOwnerLayerInterface() as VelocityInterfaceCompositeInterface

this.velocityInterface= velocityInterfaceCompositeInterface!!.getVelocityProperties()
DestroyedEventHandler.getInstance()!!.addListener(this)
this.init()
}


                @Throws(Exception::class)
            override fun processAI(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryLayerManager = allBinaryLayerManager

    
                        if(this.isBeyondTarget())
                        
                                    {
                                    this.init()
this.velocityInterface!!.zero()

                                    }
                                

    
                        if(!dive)
                        
                                    {
                                    this.target(allBinaryLayerManager)

                                    }
                                
                        else {
                            this.dive()
this.attack()

                        }
                            
this.list.clear()
}


open fun init()
        //nullable = true from not(false or (false and true)) = true
{this.dive= false
this.directionOfTarget= DirectionFactory.getInstance()!!.NOT_BORDERED_WITH
TrackingEventHandler.getInstance()!!.addListener(this)
}


                @Throws(Exception::class)
            
open fun target(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryLayerManager = allBinaryLayerManager

    
                        if(this.list.size() == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

    var lastTrackingEvent: TrackingEvent = list.remove(0) as TrackingEvent

this.lastTrackingLayerInterface= lastTrackingEvent!!.getLayerInterface()

    var layerInterface: AllBinaryLayer = this.lastTrackingLayerInterface


    var ownerLayerInterface: AllBinaryLayer = this.getOwnerLayerInterface()!!
            


    
                        if(layerInterface!!.getGroupInterface() == ownerLayerInterface!!.getGroupInterface())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

    var x: Int = this.lastTrackingLayerInterface!!.getXP()!!
            


    var y: Int = this.lastTrackingLayerInterface!!.getYP()!!
            


    var yDistance: Int = ownerLayerInterface!!.getYP() -y -ownerLayerInterface!!.getHeight()


    var xDistance: Int = ownerLayerInterface!!.getXP() -x -ownerLayerInterface!!.getWidth()


    var directionFactory: DirectionFactory = DirectionFactory.getInstance()!!
            


    
                        if(mathUtil!!.abs(yDistance) > mathUtil!!.abs(xDistance))
                        
                                    {
                                    
    
                        if(yDistance > MIN_DISTANCE)
                        
                                    {
                                    this.directionOfTarget= directionFactory!!.UP

                                    }
                                
                             else 
    
                        if(yDistance <  -MIN_DISTANCE)
                        
                                    {
                                    this.directionOfTarget= directionFactory!!.DOWN

                                    }
                                

                                    }
                                
                        else {
                            
    
                        if(xDistance > MIN_DISTANCE)
                        
                                    {
                                    this.directionOfTarget= directionFactory!!.LEFT

                                    }
                                
                             else 
    
                        if(xDistance <  -MIN_DISTANCE)
                        
                                    {
                                    this.directionOfTarget= directionFactory!!.RIGHT

                                    }
                                

                        }
                            

    
                        if(!initialDropped && this.directionOfTarget != directionFactory!!.NOT_BORDERED_WITH)
                        
                                    {
                                    this.drop()

                                    }
                                

    
                        if(initialDropped)
                        
                                    {
                                    
    
                        if(this.directionOfTarget == directionFactory!!.UP || this.directionOfTarget == directionFactory!!.DOWN)
                        
                                    {
                                    this.verticalTargeting(x)

                                    }
                                
                             else 
    
                        if(this.directionOfTarget == directionFactory!!.LEFT || this.directionOfTarget == directionFactory!!.RIGHT)
                        
                                    {
                                    this.horizontalTargeting(y)

                                    }
                                
                        else {
                            this.artificialIntelligenceInterface!!.processAI(allBinaryLayerManager)

                        }
                            

                                    }
                                
}


                @Throws(Exception::class)
            
open fun verticalTargeting(x: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var x = x

    var ownerLayerInterface: AllBinaryLayer = this.getOwnerLayerInterface()!!
            


    
                        if(ownerLayerInterface!!.getXP() < x)
                        
                                    {
                                    this.moveRight()

                                    }
                                

    
                        if(ownerLayerInterface!!.getXP() > x)
                        
                                    {
                                    this.moveLeft()

                                    }
                                

    
                        if(ownerLayerInterface!!.getXP() > x -3 && ownerLayerInterface!!.getXP() < x +3)
                        
                                    {
                                    this.setDive()

                                    }
                                
}


                @Throws(Exception::class)
            
open fun horizontalTargeting(y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var y = y

    var ownerLayerInterface: AllBinaryLayer = this.getOwnerLayerInterface()!!
            


    
                        if(ownerLayerInterface!!.getYP() < y)
                        
                                    {
                                    this.moveDown()

                                    }
                                

    
                        if(ownerLayerInterface!!.getYP() > y)
                        
                                    {
                                    this.moveUp()

                                    }
                                

    
                        if(ownerLayerInterface!!.getYP() > y -3 && ownerLayerInterface!!.getYP() < y +3)
                        
                                    {
                                    this.setDive()

                                    }
                                
}


open fun setDive()
        //nullable = true from not(false or (false and true)) = true
{this.dive= true
this.velocityInterface!!.zero()
TrackingEventHandler.getInstance()!!.removeListener(this)
}


                @Throws(Exception::class)
            
open fun moveRight()
        //nullable = true from not(false or (false and true)) = true
{this.setLastDirection(this.directionFactory!!.RIGHT)
this.directionalInterface!!.setFrame(this.lastDirection)
this.aiVistor!!.visit(this)
}


                @Throws(Exception::class)
            
open fun moveLeft()
        //nullable = true from not(false or (false and true)) = true
{this.setLastDirection(this.directionFactory!!.LEFT)
this.directionalInterface!!.setFrame(this.lastDirection)
this.aiVistor!!.visit(this)
}


                @Throws(Exception::class)
            
open fun moveDown()
        //nullable = true from not(false or (false and true)) = true
{this.setLastDirection(this.directionFactory!!.DOWN)
this.directionalInterface!!.setFrame(this.lastDirection)
this.aiVistor!!.visit(this)
}


                @Throws(Exception::class)
            
open fun moveUp()
        //nullable = true from not(false or (false and true)) = true
{this.setLastDirection(this.directionFactory!!.UP)
this.directionalInterface!!.setFrame(this.lastDirection)
this.aiVistor!!.visit(this)
}


                @Throws(Exception::class)
            
open fun dive()
        //nullable = true from not(false or (false and true)) = true
{this.directionalInterface!!.setFrame(this.directionOfTarget)
this.aiVistor!!.visit(this)
}


                @Throws(Exception::class)
            
open fun attack()
        //nullable = true from not(false or (false and true)) = true
{super.processAI(Canvas.KEY_NUM1)
}


                @Throws(Exception::class)
            
open fun drop()
        //nullable = true from not(false or (false and true)) = true
{
    
                        if(this.timeDelayHelper!!.isTime(this.gameTickTimeDelayHelper!!.startTime))
                        
                                    {
                                    initialDropped= true
this.aiVistor!!.visit(this)

                                    }
                                
}


open fun isBeyondTarget()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    
                        if(this.directionOfTarget == directionFactory!!.DOWN)
                        
                                    {
                                    
    
                        if(this.getOwnerLayerInterface()!!.getYP() > this.lastTrackingLayerInterface!!.getYP() +MIN_DISTANCE)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            

                                    }
                                
                             else 
    
                        if(this.directionOfTarget == directionFactory!!.UP)
                        
                                    {
                                    
    
                        if(this.getOwnerLayerInterface()!!.getYP() < this.lastTrackingLayerInterface!!.getYP() +MIN_DISTANCE)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            

                                    }
                                
                             else 
    
                        if(this.directionOfTarget == directionFactory!!.RIGHT)
                        
                                    {
                                    
    
                        if(this.getOwnerLayerInterface()!!.getXP() > this.lastTrackingLayerInterface!!.getXP() +MIN_DISTANCE)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            

                                    }
                                
                             else 
    
                        if(this.directionOfTarget == directionFactory!!.LEFT)
                        
                                    {
                                    
    
                        if(this.getOwnerLayerInterface()!!.getXP() < this.lastTrackingLayerInterface!!.getXP() +MIN_DISTANCE)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}

override fun onEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{

                    var eventObject = eventObject
ForcedLogUtil.log(EventStrings.getInstance()!!.PERFORMANCE_MESSAGE, this)
}

override fun onMovement(trackingEvent: TrackingEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var trackingEvent = trackingEvent
this.list.add(trackingEvent)
}

override fun onDestroyed(destroyedEvent: DestroyedEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var destroyedEvent = destroyedEvent

    
                        if(this.getOwnerLayerInterface() == destroyedEvent!!.getLayerInterface())
                        
                                    {
                                    TrackingEventHandler.getInstance()!!.removeListener(this)
DestroyedEventHandler.getInstance()!!.removeListener(this)

                                    }
                                
}


open fun setLastDirection(lastDirection: Direction)
        //nullable = true from not(false or (false and false)) = true
{

                    var lastDirection = lastDirection
this.lastDirection= lastDirection

    var value: Int = this.getLastDirection()!!.getValue()!!
            


    
                        if(value < 4)
                        
                                    {
                                    super.setLastKey(directionToKeyMap[value]!!)

                                    }
                                
}

override fun setLastKey(lastKey: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var lastKey = lastKey
super.setLastKey(lastKey)

    
                        if(this.getLastKey() == Canvas.LEFT)
                        
                                    {
                                    this.lastDirection= DirectionFactory.getInstance()!!.LEFT

                                    }
                                
                             else 
    
                        if(this.getLastKey() == Canvas.DOWN)
                        
                                    {
                                    this.lastDirection= DirectionFactory.getInstance()!!.DOWN

                                    }
                                
                             else 
    
                        if(this.getLastKey() == Canvas.UP)
                        
                                    {
                                    this.lastDirection= DirectionFactory.getInstance()!!.UP

                                    }
                                
                             else 
    
                        if(this.getLastKey() == Canvas.RIGHT)
                        
                                    {
                                    this.lastDirection= DirectionFactory.getInstance()!!.RIGHT

                                    }
                                
}


open fun getLastDirection()
        //nullable = true from not(false or (false and true)) = true
: Direction{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return lastDirection
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(super.toString())
stringBuffer!!.append(
                            " LastDirection: ")
stringBuffer!!.append(StringUtil.getInstance()!!.toString(this.getLastDirection()))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

