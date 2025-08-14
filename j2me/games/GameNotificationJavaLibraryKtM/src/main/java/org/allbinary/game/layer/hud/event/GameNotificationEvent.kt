
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
        package org.allbinary.game.layer.hud.event




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.util.event.AllBinaryEventObject

open public class GameNotificationEvent : AllBinaryEventObject {
        

    private var string: String = StringUtil.getInstance()!!.EMPTY_STRING

    private val seconds: Integer

    private var basicColor: BasicColor = BasicColorFactory.getInstance()!!.BLACK

    private val removeable: Boolean
public constructor        (anyType: Any, string: String, seconds: Integer, basicColor: BasicColor, permanent: Boolean)                        

                            : super(anyType){

                    var anyType = anyType


                    var string = string


                    var seconds = seconds


                    var basicColor = basicColor


                    var permanent = permanent


                            //For kotlin this is before the body of the constructor.
                    
this.setString(string)
this.seconds= seconds
this.setBasicColorP(basicColor)
this.removeable= permanent
}


open fun getString()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return string
}


open fun getSeconds()
        //nullable = true from not(false or (false and true)) = true
: Integer{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return seconds
}


open fun getBasicColorP()
        //nullable = true from not(false or (false and true)) = true
: BasicColor{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return basicColor
}


open fun getPermanent()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return removeable
}


open fun setString(string: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var string = string
this.string= string
}


open fun setBasicColorP(basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{

                    var basicColor = basicColor
this.basicColor= basicColor
}


}
                
            

