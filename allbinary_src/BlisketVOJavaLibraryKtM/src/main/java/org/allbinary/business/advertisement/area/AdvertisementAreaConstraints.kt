
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
        package org.allbinary.business.advertisement.area




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.logic.control.contraints.display.browser.DisplayInBrowserContraints
import org.allbinary.logic.control.contraints.display.browser.DisplayInBrowserContraintsInterface
import org.allbinary.logic.control.contraints.size.TwoDimensionalConstraint
import org.allbinary.logic.control.contraints.size.TwoDimensionalConstraintInterface
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class AdvertisementAreaConstraints
            : Object
        
                , AdvertisementAreaConstraintsInterface {
        

    private var displayInBrowserContraintsInterface: DisplayInBrowserContraintsInterface

    private var twoDimensionConstraintsInterface: TwoDimensionalConstraintInterface
public constructor (document: Document)
            : super()
        {
var document = document

    var node: Node = DomSearchHelper.getNode(AdvertisementAreaData.getInstance()!!.NAME, document.getChildNodes())!!

this.displayInBrowserContraintsInterface= DisplayInBrowserContraints(node)
this.twoDimensionConstraintsInterface= TwoDimensionalConstraint(node)
}


    open fun setDisplayInBrowserContraints(displayInBrowserContraintsInterface: DisplayInBrowserContraintsInterface)
        //nullable = true from not(false or (false and false)) = true
{
var displayInBrowserContraintsInterface = displayInBrowserContraintsInterface
this.displayInBrowserContraintsInterface= displayInBrowserContraintsInterface
}


    open fun getTwoDimensionContraints(twoDimensionConstraintsInterface: TwoDimensionalConstraintInterface)
        //nullable = true from not(false or (false and false)) = true
{
var twoDimensionConstraintsInterface = twoDimensionConstraintsInterface
this.twoDimensionConstraintsInterface= twoDimensionConstraintsInterface
}


    open fun getDisplayInBrowserContraints()
        //nullable = true from not(false or (false and true)) = true
: DisplayInBrowserContraintsInterface{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.displayInBrowserContraintsInterface
}


    open fun getTwoDimensionContraints()
        //nullable = true from not(false or (false and true)) = true
: TwoDimensionalConstraintInterface{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.twoDimensionConstraintsInterface
}


}
                
            

