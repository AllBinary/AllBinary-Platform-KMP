
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
        package org.allbinary.graphics.j2me.workarea.tools.event




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.swing.tree.MutableTreeNode

open public class MyGraphicItemEventSource
            : Object
         {
        

    private var command: String

    private var treeNode: MutableTreeNode

    private var angle: Double = 0
public constructor (command: String, treeNode: MutableTreeNode)
            : super()
        {
var command = command
var treeNode = treeNode
this.command= command
this.treeNode= treeNode
}

public constructor (command: String, angle: Double, treeNode: MutableTreeNode)
            : super()
        {
var command = command
var angle = angle
var treeNode = treeNode
this.command= command
this.treeNode= treeNode
this.setAngle(angle)
}


    open fun getCommand()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.command
}


    open fun getTreeNode()
        //nullable = true from not(false or (false and true)) = true
: MutableTreeNode{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.treeNode
}


    open fun getAngle()
        //nullable = true from not(false or (false and true)) = true
: Double{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.angle
}


    open fun setAngle(angle: Double)
        //nullable = true from not(false or (false and false)) = true
{
var angle = angle
this.angle= angle
}


}
                
            

