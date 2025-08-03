
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
        package org.allbinary.graphics



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class Line
            : Object
         {
        

    private var p1: GPoint

    private var p2: GPoint

    private var deltaX: Double= 0.0

    private var deltaY: Double= 0.0
public constructor        (p1: GPoint, p2: GPoint)
            : super()
        {

                    var p1 = p1


                    var p2 = p2
this.p1= PointFactory.getInstance()!!.ZERO_ZERO
this.p2= this.p1
this.setP1(p1)
this.setP2(p2)
}


open fun getGradient()
        //nullable = true from not(false or (false and true)) = true
: Double{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return getDeltaY() /getDeltaX()
}


open fun update()
        //nullable = true from not(false or (false and true)) = true
{deltaX= getP1()!!.getX().toDouble() -getP2()!!.getX()
deltaY= getP1()!!.getY().toDouble() -getP2()!!.getY()
}


open fun getDeltaX()
        //nullable = true from not(false or (false and true)) = true
: Double{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return deltaX
}


open fun getDeltaY()
        //nullable = true from not(false or (false and true)) = true
: Double{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return deltaY
}


open fun getP1()
        //nullable = true from not(false or (false and true)) = true
: GPoint{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return p1
}


open fun getP2()
        //nullable = true from not(false or (false and true)) = true
: GPoint{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return p2
}


open fun setP1(p1: GPoint)
        //nullable = true from not(false or (false and false)) = true
{

                    var p1 = p1
this.p1= p1
this.update()
}


open fun setP2(p2: GPoint)
        //nullable = true from not(false or (false and false)) = true
{

                    var p2 = p2
this.p2= p2
this.update()
}


}
                
            

