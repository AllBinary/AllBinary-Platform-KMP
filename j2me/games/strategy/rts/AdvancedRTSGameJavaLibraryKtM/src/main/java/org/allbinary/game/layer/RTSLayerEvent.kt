
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2002 AllBinary 
                *   
                *  By agreeing to this license you and any business entity you represent are 
                *  legally bound to the AllBinary Open License Version 1 legal agreement. 
                *   
                *  You may obtain the AllBinary Open License Version 1 legal agreement from 
                *  AllBinary or the root directory of AllBinary's AllBinary Platform repository. 
                *    Created By: Travis Berthelot  
        */
        
        /* Generated Code Do Not Modify */
        package org.allbinary.game.layer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.util.event.AllBinaryEventObject

open public class RTSLayerEvent : AllBinaryEventObject {
        

    private var rtsLayer: PathFindingLayerInterface = NullPathFindingLayer.NULL_PATH_FINDING_LAYER
public constructor (rtsLayer: PathFindingLayerInterface)                        

                            : super(rtsLayer){
var rtsLayer = rtsLayer


                            //For kotlin this is before the body of the constructor.
                    
}


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("RTSLayerEvent: \n")
stringBuffer!!.append("RTSLayer: ")
stringBuffer!!.append(this.getRtsLayer()!!.toString())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


    open fun getRtsLayer()
        //nullable = true from not(false or (false and true)) = true
: PathFindingLayerInterface{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rtsLayer
}


    open fun setRtsLayer(rtsLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{
var rtsLayer = rtsLayer
this.rtsLayer= rtsLayer
}


}
                
            

