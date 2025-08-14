
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonPhoneStrings
import org.allbinary.string.CommonSeps

open public class DirectionFactory
            : Object
         {
        

        companion object {
            
    private val instance: DirectionFactory = DirectionFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: DirectionFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val NAME: String = "DIRECTION"

    val LEFT: Direction = Direction(CommonPhoneStrings.getInstance()!!.LEFT, 
                            "WEST", 0, 1)

    val RIGHT: Direction = Direction(CommonPhoneStrings.getInstance()!!.RIGHT, 
                            "EAST", 1, 0)

    val DOWN: Direction = Direction(CommonPhoneStrings.getInstance()!!.DOWN, 
                            "SOUTH", 2)

    val UP: Direction = Direction(CommonPhoneStrings.getInstance()!!.UP, 
                            "NORTH", 3)

    val UP_LEFT: Direction

    val UP_RIGHT: Direction

    val DOWN_LEFT: Direction

    val DOWN_RIGHT: Direction

    val NOT_BORDERED_WITH: Direction = Direction(
                            "NOT_BORDERED_WITH", 
                            "NOT_BORDERED_WITH", 8)

    val NO_DIRECTION: Direction = Direction(
                            "NO_DIRECTION", 
                            "NO_DIRECTION", 9)

    val TOP: Direction = Direction(
                            "TOP", 
                            "TOP", 10)

    val BOTTOM: Direction = Direction(
                            "BOTTOM", 
                            "BOTTOM", 11)

    val ALL_DIRECTION: Direction = Direction(
                            "ALL_DIRECTION", 
                            "ALL_DIRECTION", 12)
private constructor        ()
            : super()
        {
    var stringBuffer: StringMaker = StringMaker()


    var commonSeps: CommonSeps = CommonSeps.getInstance()!!
            

UP_LEFT= Direction(
                            "UP LEFT", stringBuffer!!.append(UP.getOtherName())!!.append(commonSeps!!.SPACE)!!.append(LEFT.getOtherName())!!.toString(), 4)
stringBuffer!!.delete(0, stringBuffer!!.length())
UP_RIGHT= Direction(
                            "UP RIGHT", stringBuffer!!.append(UP.getOtherName())!!.append(commonSeps!!.SPACE)!!.append(RIGHT.getOtherName())!!.toString(), 5)
stringBuffer!!.delete(0, stringBuffer!!.length())
DOWN_LEFT= Direction(
                            "DOWN LEFT", stringBuffer!!.append(DOWN.getOtherName())!!.append(commonSeps!!.SPACE)!!.append(LEFT.getOtherName())!!.toString(), 6)
stringBuffer!!.delete(0, stringBuffer!!.length())
DOWN_RIGHT= Direction(
                            "DOWN RIGHT", stringBuffer!!.append(DOWN.getOtherName())!!.append(commonSeps!!.SPACE)!!.append(RIGHT.getOtherName())!!.toString(), 7)
}


}
                
            

