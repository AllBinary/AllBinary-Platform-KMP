
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
        package org.allbinary.input.motion.gesture.observer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.PointFactory
import org.allbinary.input.motion.gesture.MotionGestureInput
import org.allbinary.input.motion.gesture.TouchMotionGestureFactory
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.string.CommonLabels

open public class MotionGestureEvent : AllBinaryEventObject {
        

        companion object {
            
    private val CURRENT: String = CommonLabels.getInstance()!!.CURRENT

    private val PREVIOUS: String = " Previous: "

    private val HASHCODE: String = " hashcode: "

        }
            
    private var motionGesture: MotionGestureInput = TouchMotionGestureFactory.getInstance()!!.NO_MOTION

    private val id: Int

    private var previousPoint: GPoint = PointFactory.getInstance()!!.ZERO_ZERO

    private var currentPoint: GPoint = PointFactory.getInstance()!!.ZERO_ZERO
public constructor        (source: Any, id: Int, motionGesture: MotionGestureInput)                        

                            : super(source){
var source = source
var id = id
var motionGesture = motionGesture


                            //For kotlin this is before the body of the constructor.
                    
this.id= id
this.setMotionGesture(motionGesture)
}


open fun getMotionGesture()
        //nullable = true from not(false or (false and true)) = true
: MotionGestureInput{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return motionGesture
}


open fun setMotionGesture(motionGesture: MotionGestureInput)
        //nullable = true from not(false or (false and false)) = true
{
var motionGesture = motionGesture
this.motionGesture= motionGesture
}


open fun getPreviousPoint()
        //nullable = true from not(false or (false and true)) = true
: GPoint{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return previousPoint
}


open fun setPreviousPoint(previousPoint: GPoint)
        //nullable = true from not(false or (false and false)) = true
{
var previousPoint = previousPoint
this.previousPoint= previousPoint
}


open fun getCurrentPoint()
        //nullable = true from not(false or (false and true)) = true
: GPoint{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return currentPoint
}


open fun setCurrentPoint(currentPoint: GPoint)
        //nullable = true from not(false or (false and false)) = true
{
var currentPoint = currentPoint
this.currentPoint= currentPoint
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var stringBuffer: StringMaker = StringMaker()


    var stringUtil: StringUtil = StringUtil.getInstance()!!

stringBuffer!!.append(stringUtil!!.toString(this.motionGesture))
stringBuffer!!.append(CURRENT)
stringBuffer!!.append(stringUtil!!.toString(this.currentPoint))
stringBuffer!!.append(PREVIOUS)
stringBuffer!!.append(stringUtil!!.toString(this.previousPoint))
stringBuffer!!.append(HASHCODE)
stringBuffer!!.append(this.hashCode())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun getId()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return id
}


}
                
            

