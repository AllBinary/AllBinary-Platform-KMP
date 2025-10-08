
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
        package org.allbinary.logic.math.vector




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.math.BasicDecimal
import org.allbinary.logic.string.StringMaker
import org.allbinary.math.PositionStrings
import org.allbinary.string.CommonSeps

open public class Vertex
            : Object
         {
        

    var x: BasicDecimal = BasicDecimal()

    var y: BasicDecimal = BasicDecimal()

    var z: BasicDecimal = BasicDecimal()
public constructor (x: Int, y: Int, z: Int)
            : super()
        {
var x = x
var y = y
var z = z
this.x.set(x)
this.y.set(y)
this.z.set(z)
}

public constructor (x: Int, y: Int)
            : super()
        {
var x = x
var y = y
this.x.set(x)
this.y.set(y)
}

public constructor ()
            : super()
        {
}


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var stringBuffer: StringMaker = StringMaker()


    var positionStrings: PositionStrings = PositionStrings.getInstance()!!

stringBuffer!!.append(positionStrings!!.X_LABEL)
stringBuffer!!.append(x.toString())
stringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)
stringBuffer!!.append(positionStrings!!.Y_LABEL)
stringBuffer!!.append(y.toString())
stringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)
stringBuffer!!.append(positionStrings!!.Z_LABEL)
stringBuffer!!.append(z.toString())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

