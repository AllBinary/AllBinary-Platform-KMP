
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
        package org.allbinary.game.layer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Enumeration
import java.util.Hashtable
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.PointFactory
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.LayerInterfaceFactory
import org.allbinary.layer.LayerInterfaceVisitor
import org.allbinary.util.BasicArrayList

open public class LayerPlacer
            : Object
         {
        

    val layerInterfaceVisitor: LayerInterfaceVisitor

    private val dimension: GPoint
public constructor        (layerInterfaceVisitor: LayerInterfaceVisitor, dimension: GPoint)
            : super()
        {

                    var layerInterfaceVisitor = layerInterfaceVisitor


                    var dimension = dimension
this.layerInterfaceVisitor= layerInterfaceVisitor
this.dimension= dimension
}


                @Throws(Exception::class)
            
open fun process(list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{

                    var list = list

    var size: Int = list.size()!!
            


    var layerPlacementInterface: LayerPlacementInterface





                        for (index in 0 until size)


        {layerPlacementInterface= list.objectArray[index]!! as LayerPlacementInterface
this.process(layerPlacementInterface)
}

}


                @Throws(Exception::class)
            
open fun process(layerPlacementInterface: LayerPlacementInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var layerPlacementInterface = layerPlacementInterface

    var relativePoint: GPoint = this.getPoint(layerPlacementInterface)!!
            


    var layerInterfaceFactory: LayerInterfaceFactory = LayerInterfaceFactory.getInstance()!!
            


    var hashtable: Hashtable<Any, Any> = layerPlacementInterface!!.getInstance()!!
            


    var enumeration: Enumeration<Any?> = hashtable.keys()!!
            


    var point: GPoint


    var layerHashtable: Hashtable<Any, Any>


    var x: Int= 0


    var y: Int= 0


    var z: Int= 0


    var layerInterface: AllBinaryLayer


        while(enumeration.hasMoreElements())
        {point= enumeration.nextElement()!! as GPoint
layerHashtable= hashtable.get(point as Object?) as Hashtable<Any, Any>
x= point.getX() +relativePoint!!.getX()
y= point.getY() +relativePoint!!.getY()
z= point.getZ() +relativePoint!!.getZ()
layerInterface= layerInterfaceFactory!!.getInstance(layerHashtable, x, y, z)
layerInterfaceVisitor!!.visit(layerInterface)
}

}


                @Throws(Exception::class)
            
open fun getPoint(layerPlacementInterface: LayerPlacementInterface)
        //nullable = true from not(false or (false and false)) = true
: GPoint{

                    var layerPlacementInterface = layerPlacementInterface

    var layerPlacementType: LayerPlacementType = layerPlacementInterface!!.getLayerType()!!
            


    
                        if(layerPlacementType == LayerPlacementTypeFactory.getInstance()!!.MAP)
                        
                                    {
                                    
    var width: Int = layerPlacementInterface!!.getWidth()!!
            


    var height: Int = layerPlacementInterface!!.getHeight()!!
            


    var x: Int = ((dimension.getX() -width) /2)


    var y: Int = ((dimension.getY() -height) /2)




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return PointFactory.getInstance()!!.getInstance(x, y)

                                    }
                                
                             else 
    
                        if(layerPlacementType == LayerPlacementTypeFactory.getInstance()!!.UP)
                        
                                    {
                                    
    var width: Int = layerPlacementInterface!!.getWidth()!!
            


    var height: Int = layerPlacementInterface!!.getHeight()!!
            


    var x: Int = ((dimension.getX() -width) /2)


    var y: Int =  -height




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return PointFactory.getInstance()!!.getInstance(x, y)

                                    }
                                
                        else {
                            


                            throw Exception(
                            "PlacementType Not Recognized")

                        }
                            
}


}
                
            

