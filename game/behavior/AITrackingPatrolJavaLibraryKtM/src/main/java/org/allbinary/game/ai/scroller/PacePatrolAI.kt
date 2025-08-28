
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
        package org.allbinary.game.ai.scroller




        import java.lang.Object        
        
        import java.lang.Math
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import javax.microedition.lcdui.Canvas
import org.allbinary.direction.Direction
import org.allbinary.direction.DirectionCompositeInterface
import org.allbinary.direction.DirectionFactory
import org.allbinary.game.input.GameInput
import org.allbinary.game.tracking.TrackingEvent
import org.allbinary.game.tracking.TrackingEventHandler
import org.allbinary.game.tracking.TrackingEventListenerInterface
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.layer.LayerInterface
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventStrings
import org.allbinary.util.BasicArrayList

open public class PacePatrolAI : BasePatrolAI
                , TrackingEventListenerInterface {
        

    private var trackingList: BasicArrayList

    private var firingDistance: Int= 0

    var isFollowLimitedByTerrain: Boolean = false
public constructor        (hashtable: Hashtable<Any, Any>, ownerLayerInterface: AllBinaryLayer, gameInput: GameInput)                        

                            : super(hashtable, ownerLayerInterface, gameInput)

        Updates for KMP build        
        {
var hashtable = hashtable
var ownerLayerInterface = ownerLayerInterface
var gameInput = gameInput


                            //For kotlin this is before the body of the constructor.
                    
TrackingEventHandler.getInstance()!!.addListener(this)
this.trackingList= BasicArrayList()
}


                @Throws(Exception::class)
            override fun processAI(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var allBinaryLayerManager = allBinaryLayerManager
this.update()

    var direction: Direction = this.setFiringDirectionForTargetIfInRange()!!


    var directionFactory: DirectionFactory = DirectionFactory.getInstance()!!


    
                        if(direction == directionFactory!!.LEFT)
                        
                                    {
                                    
    
                        if(this.lastKeyDirection != keyDirection || !this.isFollowLimitedByTerrain)
                        
                                    {
                                    super.processAI(Canvas.LEFT)

                                    }
                                
keyDirection= Canvas.LEFT
this.lastKeyDirection= keyDirection
xTotalDistance= 0
super.processAI(Canvas.KEY_NUM1)

                                    }
                                
                             else 
    
                        if(direction == directionFactory!!.RIGHT)
                        
                                    {
                                    
    
                        if(this.lastKeyDirection != keyDirection || !this.isFollowLimitedByTerrain)
                        
                                    {
                                    super.processAI(Canvas.RIGHT)

                                    }
                                
keyDirection= Canvas.RIGHT
this.lastKeyDirection= keyDirection
xTotalDistance= 0
super.processAI(Canvas.KEY_NUM1)

                                    }
                                
                        else {
                            super.processAI(this.keyDirection)

                        }
                            
}


open fun setFiringDirectionForTargetIfInRange()
        //nullable = true from not(false or (false and true)) = true
: Direction

        Updates for KMP build        
        {

    var directionFactory: DirectionFactory = DirectionFactory.getInstance()!!


    var ownerLayerInterface: AllBinaryLayer = this.getOwnerLayerInterface()!!


    var direction: Direction = directionFactory!!.NOT_BORDERED_WITH


    var lastTrackingEvent: TrackingEvent


    var lastTrackingLayerInterface: LayerInterface


    var directionCompositeInterface: DirectionCompositeInterface


    var size: Int = this.trackingList!!.size()!!





                        for (index in 0 until size)

        

        Updates for KMP build        
        {
lastTrackingEvent= this.trackingList!!.get(0) as TrackingEvent
lastTrackingLayerInterface= lastTrackingEvent!!.getLayerInterface()

    var x: Int = lastTrackingLayerInterface!!.getXP()!!


    var y: Int = lastTrackingLayerInterface!!.getYP()!!


    var yDistance: Int = ownerLayerInterface!!.getYP() -y -ownerLayerInterface!!.getHeight()


    var xDistance: Int = ownerLayerInterface!!.getXP() -x -ownerLayerInterface!!.getWidth()


    var absXDistance: Int = Math.abs(xDistance)!!


    var absYDistance: Int = Math.abs(yDistance)!!


    
                        if(absYDistance <= 100)
                        
                                    {
                                    
    
                        if(absXDistance < getFiringDistance() /2)
                        
                                    {
                                    directionCompositeInterface= this.getOwnerLayerInterface() as DirectionCompositeInterface

    
                        if(xDistance < 0 && directionCompositeInterface!!.getDirection() == directionFactory!!.RIGHT)
                        
                                    {
                                    direction= directionFactory!!.RIGHT

                                    }
                                
                             else 
    
                        if(xDistance > 0 && directionCompositeInterface!!.getDirection() == directionFactory!!.LEFT)
                        
                                    {
                                    direction= directionFactory!!.LEFT

                                    }
                                

                                    }
                                

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return direction
}

override fun disable()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}

override fun onEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var eventObject = eventObject
ForcedLogUtil.log(EventStrings.getInstance()!!.PERFORMANCE_MESSAGE, this)
}

override fun onMovement(trackingEvent: TrackingEvent)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var trackingEvent = trackingEvent
this.trackingList!!.clear()
this.trackingList!!.add(trackingEvent)
}


open fun getFiringDistance()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.firingDistance
}


open fun setFiringDistance(firingDistance: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var firingDistance = firingDistance
this.firingDistance= firingDistance
}


}
                
            

