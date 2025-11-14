
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
        package org.allbinary.graphics.j2me.workarea.canvas.event




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.swing.tree.MutableTreeNode

open public class MyCanvasEvent : java.util.EventObject {
        
public constructor (source: Any)                        

                            : super(source){
var source = source


                            //For kotlin this is before the body of the constructor.
                    
}


    open fun getSource()
        //nullable = true from not(false or (false and true)) = true
: Any{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.getSource()
}


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.toString()
}


    open fun getCommand()
        //nullable = true from not(false or (false and true)) = true
: String{

    var myEventSource: MyCanvasEventSource = this.getSource() as MyCanvasEventSource




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return myEventSource!!.getCommand()
}


    open fun getTreeNode()
        //nullable = true from not(false or (false and true)) = true
: MutableTreeNode{

    var myEventSource: MyCanvasEventSource = this.getSource() as MyCanvasEventSource




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return myEventSource!!.getTreeNode()
}


    open fun getAngle()
        //nullable = true from not(false or (false and true)) = true
: Double{

    var myEventSource: MyCanvasEventSource = this.getSource() as MyCanvasEventSource




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return myEventSource!!.getAngle()
}


}
                
            

