
        /* Generated Code Do Not Modify */
        package org.allbinary.game.collision




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.layer.AllBinaryLayer

open public class CollisionThreedProcessor : CollisionProcessor {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        override fun isCollision(myLayer: AllBinaryLayer, myLayer2: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var myLayer = myLayer
    //var myLayer2 = myLayer2

    
                        if(myLayer2!!.getXP() >= myLayer!!.getX2() || myLayer2!!.getYP() >= myLayer!!.getY2() || myLayer2!!.getX2() <= myLayer!!.getXP() || myLayer2!!.getY2() <= myLayer!!.getYP() || myLayer2!!.getZP() < myLayer!!.getZ2() || myLayer2!!.getZ2() > myLayer!!.getZP())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                        }
                            
}


}
                
            

