
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
        package org.allbinary.bounds



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.Rectangle

open public class RectangleLayerBounds : LayerBounds {
        
public constructor        (rectangle: Rectangle)                        

                            : super(rectangle){

                    var rectangle = rectangle


                            //For kotlin this is before the body of the constructor.
                    
}

override fun visit(boundsVisitorInterface: BoundsVisitorInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var boundsVisitorInterface = boundsVisitorInterface

    
                        if(boundsVisitorInterface!!.getX() > this.rectangle.getMaxX())
                        
                                    {
                                    boundsVisitorInterface!!.maxX()

                                    }
                                

    
                        if(boundsVisitorInterface!!.getY() > this.rectangle.getMaxY())
                        
                                    {
                                    boundsVisitorInterface!!.maxY()

                                    }
                                

    
                        if(boundsVisitorInterface!!.getX() < this.rectangle.getPoint()!!.getX())
                        
                                    {
                                    boundsVisitorInterface!!.minX()

                                    }
                                

    
                        if(boundsVisitorInterface!!.getY() < this.rectangle.getPoint()!!.getY())
                        
                                    {
                                    boundsVisitorInterface!!.minY()

                                    }
                                
}


}
                
            

