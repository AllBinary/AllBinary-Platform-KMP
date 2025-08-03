
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
        package org.allbinary.input.automation



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt
import javax.help.HelpSet
import org.allbinary.logic.communication.log.LogUtil

open public class AbstractInputRobot
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var helpSet: HelpSet
public constructor        (helpSet: HelpSet)
            : super()
        {

                    var helpSet = helpSet
this.setHelpSet(helpSet)
}


open fun getHelpSet()
        //nullable = true from not(false or (false and true)) = true
: HelpSet{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.helpSet
}


open fun mouseMove(point: Point)
        //nullable = true from not(false or (false and false)) = true
{

                    var point = point
this.mouseMove(point!!.x, point!!.y)
logUtil!!.put("Moved Mouse To: x: " +point!!.x +" y: " +point!!.y, this, 
                            "moveMouse")
}


                @Throws(Exception::class)
            
open fun mouseMoveToTarget(rectangle: Rectangle, x: Integer, y: Integer)
        //nullable = true from not(false or (false and false)) = true
{

                    var rectangle = rectangle


                    var x = x


                    var y = y

    var point: Point = PointHelper.getCenterPoint(rectangle)!!
            

this.mouseMove(point!!.x +x, point!!.y +y)
logUtil!!.put("Moved Mouse To: x: " +point!!.x +" y: " +point!!.y +" in the middle of: " +rectangle, this, 
                            "moveMouseToTarget")
}


                @Throws(Exception::class)
            
open fun mouseMoveToTarget(rectangle: Rectangle)
        //nullable = true from not(false or (false and false)) = true
{

                    var rectangle = rectangle
this.mouseMoveToTarget(rectangle, 0, 0)
}


open fun mouseMove(x: Integer, y: Integer)
        //nullable = true from not(false or (false and false)) = true
{

                    var x = x


                    var y = y



                            throw RuntimeException()
}


open fun setHelpSet(helpSet: HelpSet)
        //nullable = true from not(false or (false and false)) = true
{

                    var helpSet = helpSet
this.helpSet= helpSet
}


}
                
            

