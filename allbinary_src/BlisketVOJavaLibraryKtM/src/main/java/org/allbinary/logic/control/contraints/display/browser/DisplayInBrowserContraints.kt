
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
        package org.allbinary.logic.control.contraints.display.browser




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.w3c.dom.Node

open public class DisplayInBrowserContraints
            : Object
        
                , DisplayInBrowserContraintsInterface {
        

    private var frameable: Boolean= false

    private var mountable: Boolean= false

    private var quickFrameable: Boolean= false

    private var mountedLink: String
public constructor (node: Node)
            : super()
        {
var node = node
}


    open fun isMountable()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return mountable
}


    open fun setMountable(mountable: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var mountable = mountable
this.mountable= mountable
}


    open fun isFrameable()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return frameable
}


    open fun setFrameable(frameable: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var frameable = frameable
this.frameable= frameable
}


    open fun isQuickFrameable()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return quickFrameable
}


    open fun setQuickFrameable(quickFrameable: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var quickFrameable = quickFrameable
this.quickFrameable= quickFrameable
}


    open fun getMountedLink()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return mountedLink
}


    open fun setMountedLink(mountedLink: String)
        //nullable = true from not(false or (false and false)) = true
{
var mountedLink = mountedLink
this.mountedLink= mountedLink
}


}
                
            

