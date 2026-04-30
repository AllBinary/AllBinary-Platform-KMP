
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class CustomGPoint : GPoint {
        
companion object {
            
    val NULL_CUSTOM_POINT: CustomGPoint = CustomGPoint(0, 0, 0)

    open fun getInstance(point: GPoint)
        //nullable =  from not(true or (false and false)) = 
: CustomGPoint{
    //var point = point



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return CustomGPoint(point.getX(), point.getY(), point.getZ())
}


    open fun getInstance3(x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
: CustomGPoint{
    //var x = x
    //var y = y



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return CustomGPoint(x, y, 3)
}


        }
            
    private var x: Int= 0

    private var y: Int= 0

    private var z: Int= 0
public constructor (x: Int, y: Int, z: Int)                        

                            : super(x, y, z){
var x = x
var y = y
var z = z


                            //For kotlin this is before the body of the constructor.
                    
}


    open fun setX(x: Int)
        //nullable = true from not(false or (false and false)) = true
{
var x = x
this.x= x
}


    override fun getX()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.x
}


    open fun setY(y: Int)
        //nullable = true from not(false or (false and false)) = true
{
var y = y
this.y= y
}


    override fun getY()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.y
}


    open fun setZ(z: Int)
        //nullable = true from not(false or (false and false)) = true
{
var z = z
this.z= z
}


    override fun getZ()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.z
}


}
                
            

