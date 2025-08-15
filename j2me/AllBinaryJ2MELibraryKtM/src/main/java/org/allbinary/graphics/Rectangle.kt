
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
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonSeps

open public class Rectangle
            : Object
         {
        

    private var point: GPoint

    private var width: Int

    private var height: Int
public constructor        (point: GPoint, width: Int, height: Int)
            : super()
        {

                    var point = point


                    var width = width


                    var height = height
this.point= point
this.width= width
this.height= height
}


open fun getPoint()
        //nullable = true from not(false or (false and true)) = true
: GPoint{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return point
}


open fun setPoint(point: GPoint)
        //nullable = true from not(false or (false and false)) = true
{

                    var point = point
this.point= point
}


open fun getMaxX()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.point.getX() +this.width
}


open fun getMaxY()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.point.getY() +this.height
}


open fun getWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return width
}


open fun setWidth(width: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var width = width
this.width= width
}


open fun getHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return height
}


open fun setHeight(height: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var height = height
this.height= height
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.getPoint()!!.toString())
stringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)
stringBuffer!!.append(CommonLabels.getInstance()!!.WIDTH_LABEL)
stringBuffer!!.append(this.getWidth())
stringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)
stringBuffer!!.append(CommonLabels.getInstance()!!.HEIGHT_LABEL)
stringBuffer!!.append(this.getHeight())
stringBuffer!!.append(" MaxX: ")
stringBuffer!!.append(this.getMaxX())
stringBuffer!!.append(" MaxY: ")
stringBuffer!!.append(this.getMaxY())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

