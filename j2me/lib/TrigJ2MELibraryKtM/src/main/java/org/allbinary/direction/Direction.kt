
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
        package org.allbinary.direction



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker

open public class Direction
            : Object
         {
        

        companion object {
            
    private var directionArray: Array<Direction?> = arrayOfNulls(13)

open fun getInstance(direction: Int)
        //nullable =  from not(true or (false and false)) = 
: Direction{

                    var direction = direction



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directionArray[direction]!!
}


        }
            
    private var name: String

    private var otherName: String

    private var value: Int

    private var frameFactor: Int
 constructor        (name: String, otherName: String, value: Int, frameFactor: Int)
            : super()
        {

                    var name = name


                    var otherName = otherName


                    var value = value


                    var frameFactor = frameFactor
this.name= name
this.otherName= otherName
this.value= value
this.frameFactor= frameFactor
directionArray[value]= this
}

 constructor        (name: String, otherName: String, value: Int)
            : super()
        {

                    var name = name


                    var otherName = otherName


                    var value = value
this.name= name
this.otherName= otherName
this.value= value
this.frameFactor= 0
directionArray[value]= this
}


open fun getValue()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.value
}


open fun getFrameFactor()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.frameFactor
}


open fun getOtherName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return otherName
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return name
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "Direction: ")
stringBuffer!!.append(this.getName())
stringBuffer!!.append(
                            " Or: ")
stringBuffer!!.append(this.getOtherName())
stringBuffer!!.append(
                            " Value: ")
stringBuffer!!.append(this.value)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

