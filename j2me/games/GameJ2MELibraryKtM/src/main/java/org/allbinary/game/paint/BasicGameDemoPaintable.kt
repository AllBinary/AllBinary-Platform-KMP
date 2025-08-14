
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
        package org.allbinary.game.paint




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.paint.NullPaintable
import org.allbinary.graphics.paint.Paintable
import org.allbinary.graphics.paint.StatePaintable

open public class BasicGameDemoPaintable : StatePaintable {
        

    private val mainDemoStatePaintable: Paintable

    private val ownershipPaintable: Paintable

    private val helpPaintableInterface: Paintable

    private var currentStatePaintable: Paintable = NullPaintable.getInstance()!!
            
public constructor        (mainDemoStatePaintable: Paintable, ownershipPaintable: Paintable, helpPaintableInterface: Paintable){

                    var mainDemoStatePaintable = mainDemoStatePaintable


                    var ownershipPaintable = ownershipPaintable


                    var helpPaintableInterface = helpPaintableInterface
this.mainDemoStatePaintable= mainDemoStatePaintable
this.setCurrentStatePaintable(NullPaintable.getInstance())
this.ownershipPaintable= ownershipPaintable
this.helpPaintableInterface= helpPaintableInterface
}

override fun setState(state: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var state = state

    
                        if(state == 0)
                        
                                    {
                                    this.setCurrentStatePaintable(this.getMainDemoStatePaintable())

                                    }
                                
                             else 
    
                        if(state == 1)
                        
                                    {
                                    this.setCurrentStatePaintable(this.helpPaintableInterface)

                                    }
                                
                        else {
                            this.setCurrentStatePaintable(this.ownershipPaintable)

                        }
                            
}

override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
this.getCurrentStatePaintable()!!.paint(graphics)
}


open fun getHelpPaintableInterface()
        //nullable = true from not(false or (false and true)) = true
: Paintable{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return helpPaintableInterface
}


open fun setCurrentStatePaintable(currentStatePaintable: Paintable)
        //nullable = true from not(false or (false and false)) = true
{

                    var currentStatePaintable = currentStatePaintable
this.currentStatePaintable= currentStatePaintable
}


open fun getCurrentStatePaintable()
        //nullable = true from not(false or (false and true)) = true
: Paintable{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return currentStatePaintable
}


open fun getMainDemoStatePaintable()
        //nullable = true from not(false or (false and true)) = true
: Paintable{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return mainDemoStatePaintable
}


}
                
            

