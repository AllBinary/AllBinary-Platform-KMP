
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
        package org.allbinary.game.tracking




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.util.event.AllBinaryEventObject

open public class TrackingEvent : AllBinaryEventObject {
        

    private var layerInterface: AllBinaryLayer = AllBinaryLayer.NULL_ALLBINARY_LAYER
public constructor        ()                        

                            : super(TrackingEventHandler.getInstance()){


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (allBinaryLayerInterface: AllBinaryLayer)                        

                            : super(allBinaryLayerInterface){
var allBinaryLayerInterface = allBinaryLayerInterface


                            //For kotlin this is before the body of the constructor.
                    
this.setLayerInterface(allBinaryLayerInterface)
}


open fun init(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
{
var anyType = anyType
this.setSource(anyType)
}


open fun getLayerInterface()
        //nullable = true from not(false or (false and true)) = true
: AllBinaryLayer{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return layerInterface
}


open fun setLayerInterface(layerInterface: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
{
var layerInterface = layerInterface
this.layerInterface= layerInterface
}


open fun setLayerInterfaceForCircularStaticPool(layerInterface: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
{
var layerInterface = layerInterface
this.layerInterface= layerInterface
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("TrackingEvent: \n")
stringBuffer!!.append("LayerInterface: ")
stringBuffer!!.append(this.layerInterface!!.toString())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

