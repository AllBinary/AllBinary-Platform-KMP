
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
        package org.allbinary.game.layer.hud.basic




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.game.graphics.hud.BasicHud
import org.allbinary.graphics.color.BasicColor

open public class PositionWidget : BasicHud {
        

        companion object {
            
open fun toString(position: Int)
        //nullable = true from not(false or (true and false)) = true
: String{

                    var position = position

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(position.toString())

    
                        if(position == 1)
                        
                                    {
                                    stringBuffer!!.append(
                            "st")

                                    }
                                
                             else 
    
                        if(position == 2)
                        
                                    {
                                    stringBuffer!!.append(
                            "nd")

                                    }
                                
                             else 
    
                        if(position == 3)
                        
                                    {
                                    stringBuffer!!.append(
                            "rd")

                                    }
                                
                        else {
                            stringBuffer!!.append(
                            "th")

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


        }
            
    private var position: Int= 0

    private var positionString: String = StringUtil.getInstance()!!.EMPTY_STRING
public constructor        (position: Int, location: Int, direction: Int, basicColor: BasicColor)                        

                            : super(location, direction, 10, 40, 2, basicColor){

                    var position = position


                    var location = location


                    var direction = direction


                    var basicColor = basicColor


                            //For kotlin this is before the body of the constructor.
                    
}


open fun get()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.position
}


open fun set(position: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var position = position
this.position= position
this.positionString= PositionWidget.toString(this.get())
}


open fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
super.paint(graphics, positionString)
}


}
                
            

