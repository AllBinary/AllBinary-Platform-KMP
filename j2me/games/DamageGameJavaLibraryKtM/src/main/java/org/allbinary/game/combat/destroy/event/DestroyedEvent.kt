
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
        package org.allbinary.game.combat.destroy.event




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.displayable.canvas.AllBinaryGameCanvas
import org.allbinary.game.displayable.canvas.NullGameCanvas
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.util.event.AllBinaryEventObject

open public class DestroyedEvent : AllBinaryEventObject {
        

    private var allBinaryGameCanvas: AllBinaryGameCanvas = NullGameCanvas.getInstance()!!

    private var allBinaryLayerInterface: AllBinaryLayer = AllBinaryLayer.NULL_ALLBINARY_LAYER
public constructor        (combatGameCanvas: AllBinaryGameCanvas)                        

                            : super(DestroyedEventHandler.getInstance())

        Updates for KMP build        
        {
var combatGameCanvas = combatGameCanvas


                            //For kotlin this is before the body of the constructor.
                    
this.setAllBinaryGameCanvas(combatGameCanvas)
}


open fun getAllBinaryGameCanvas()
        //nullable = true from not(false or (false and true)) = true
: AllBinaryGameCanvas

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return allBinaryGameCanvas
}


open fun getLayerInterface()
        //nullable = true from not(false or (false and true)) = true
: AllBinaryLayer

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return allBinaryLayerInterface
}


open fun setAllBinaryGameCanvas(allBinaryGameCanvas: AllBinaryGameCanvas)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var allBinaryGameCanvas = allBinaryGameCanvas
this.allBinaryGameCanvas= allBinaryGameCanvas
}


open fun setLayerInterfaceForCircularStaticPool(allBinaryLayerInterface: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var allBinaryLayerInterface = allBinaryLayerInterface
this.allBinaryLayerInterface= allBinaryLayerInterface
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

        Updates for KMP build        
        {

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("DestroyedEvent: \n")
stringBuffer!!.append("AllBinaryLayerInterface: ")
stringBuffer!!.append(this.allBinaryLayerInterface!!.toString())
stringBuffer!!.append("\nAllBinaryGameCanvas: ")
stringBuffer!!.append(StringUtil.getInstance()!!.toString(this.getAllBinaryGameCanvas()))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

