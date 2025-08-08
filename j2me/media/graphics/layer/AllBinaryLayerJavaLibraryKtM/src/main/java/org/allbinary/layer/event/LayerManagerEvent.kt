
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
        package org.allbinary.layer.event



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.LayerManager
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.util.event.AllBinaryEventObject

open public class LayerManagerEvent : AllBinaryEventObject {
        

    private var layerInterface: AllBinaryLayer = AllBinaryLayer.NULL_ALLBINARY_LAYER

    private val crud: String
public constructor        (layerManager: LayerManager, crud: String)                        

                            : super(layerManager){

                    var layerManager = layerManager


                    var crud = crud


                            //For kotlin this is before the body of the constructor.
                    
this.crud= crud
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

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "LayerManagerEvent: \n")
stringBuffer!!.append(
                            "LayerInterface: ")
stringBuffer!!.append(this.getLayerInterface()!!.toString())
stringBuffer!!.append(
                            "\nCRUD: ")
stringBuffer!!.append(this.crud.toString())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

