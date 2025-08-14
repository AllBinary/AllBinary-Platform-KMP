
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
        package org.allbinary.view




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.GPoint
import org.allbinary.layer.AllBinaryLayer

open public class ViewPosition : GPoint {
        

        companion object {
            
    val NULL_VIEW_POSITION: ViewPosition = ViewPosition()

        }
            
    private var allbinaryLayer: AllBinaryLayer = AllBinaryLayer.NULL_ALLBINARY_LAYER
public constructor        ()                        

                            : super(0, 0, 0){

                            //For kotlin this is before the body of the constructor.
                    
}

protected constructor        (x: Int, y: Int)                        

                            : super(x, y, 0){

                    var x = x


                    var y = y


                            //For kotlin this is before the body of the constructor.
                    
}

protected constructor        (x: Int, y: Int, z: Int)                        

                            : super(x, y, z){

                    var x = x


                    var y = y


                    var z = z


                            //For kotlin this is before the body of the constructor.
                    
}

override fun getX()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.allbinaryLayer!!.getXP()
}

override fun getY()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.allbinaryLayer!!.getYP()
}

override fun getZ()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.allbinaryLayer!!.getZP()
}


open fun getX2()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getX() +this.allbinaryLayer!!.getWidth()
}


open fun getY2()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getY() +this.allbinaryLayer!!.getHeight()
}


open fun getZ2()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return (this.getZ() +this.allbinaryLayer!!.getDepth()).toInt()
}


open fun setAllbinaryLayer(allbinaryLayer: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
{

                    var allbinaryLayer = allbinaryLayer
this.allbinaryLayer= allbinaryLayer
}


}
                
            

