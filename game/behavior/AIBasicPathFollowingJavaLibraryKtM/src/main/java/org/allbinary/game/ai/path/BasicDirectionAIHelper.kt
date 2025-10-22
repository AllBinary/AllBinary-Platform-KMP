
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
        package org.allbinary.game.ai.path




        import java.lang.Object        
        
        import java.lang.Integer
        
        import java.lang.Math
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Canvas
import org.allbinary.direction.Direction
import org.allbinary.direction.DirectionFactory
import org.allbinary.math.AngleIncrementInfo
import org.allbinary.math.AngleInfo

open public class BasicDirectionAIHelper
            : Object
         {
        

    private var name: String

    private var angleInfo: AngleInfo
public constructor (name: String, angleInfo: AngleInfo)
            : super()
        {
    //var name = name
    //var angleInfo = angleInfo
this.name= name
this.angleInfo= angleInfo
}


    open fun turnAI(frame: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
var frame = frame

    var keyDirection: Int =  -1


    var directionAngle: Int = this.angleInfo!!.getAngleIncrementInfo()!!.getFrameAngle(frame)!!


    var angle: Short = this.angleInfo!!.getAngle()!!


    var degrees: Int = Math.abs(directionAngle -angle)!!


    
                        if(degrees < 180)
                        
                                    {
                                    
    
                        if(angle > directionAngle)
                        
                                    {
                                    keyDirection= Canvas.LEFT

                                    }
                                
                             else 
    
                        if(angle < directionAngle)
                        
                                    {
                                    keyDirection= Canvas.RIGHT

                                    }
                                

                                    }
                                
                        else {
                            
    
                        if(angle > directionAngle)
                        
                                    {
                                    keyDirection= Canvas.RIGHT

                                    }
                                
                             else 
    
                        if(angle < directionAngle)
                        
                                    {
                                    keyDirection= Canvas.LEFT

                                    }
                                

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return keyDirection
}


    open fun getAIKeyPressed(frame: Integer)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var frame = frame

    var angle: Short = this.angleInfo!!.getAngleIncrementInfo()!!.getFrameAngle(frame.toInt()).toShort()


    
                        if(this.angleInfo!!.getAngle() != angle)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.turnAI(frame.toInt())

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Canvas.UP

                        }
                            
}


    open fun getAIKeyPressedFromDirection(geographicMapDirectionData: Direction)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var geographicMapDirectionData = geographicMapDirectionData

    var keyDirection: Int =  -1


    var angleIncrementInfo: AngleIncrementInfo = this.angleInfo!!.getAngleIncrementInfo()!!


    var directionFactory: DirectionFactory = DirectionFactory.getInstance()!!


    
                        if(geographicMapDirectionData == directionFactory!!.DOWN)
                        
                                    {
                                    keyDirection= this.getAIKeyPressed(angleIncrementInfo!!.DOWN_FRAME)

                                    }
                                
                             else 
    
                        if(geographicMapDirectionData == directionFactory!!.UP)
                        
                                    {
                                    keyDirection= this.getAIKeyPressed(angleIncrementInfo!!.UP_FRAME)

                                    }
                                
                             else 
    
                        if(geographicMapDirectionData == directionFactory!!.LEFT)
                        
                                    {
                                    keyDirection= this.getAIKeyPressed(angleIncrementInfo!!.LEFT_FRAME)

                                    }
                                
                             else 
    
                        if(geographicMapDirectionData == directionFactory!!.RIGHT)
                        
                                    {
                                    keyDirection= this.getAIKeyPressed(angleIncrementInfo!!.RIGHT_FRAME)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return keyDirection
}


    open fun getAngleInfoP()
        //nullable = true from not(false or (false and true)) = true
: AngleInfo{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return angleInfo
}


    open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return name
}


}
                
            

