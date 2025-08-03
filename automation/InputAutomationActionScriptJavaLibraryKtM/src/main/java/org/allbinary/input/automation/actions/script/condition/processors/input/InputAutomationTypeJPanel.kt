
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
        package org.allbinary.input.automation.actions.script.condition.processors.input



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class InputAutomationTypeJPanel : swing.JPanel {
        
public constructor        (){initComponents()
}


open fun getInputAutomationTypeJComboBox()
        //nullable = true from not(false or (false and true)) = true
: JComboBox{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inputAutomationTypeJComboBox
}


open fun setInputAutomationTypeJComboBox(inputAutomationTypeJComboBox: JComboBox)
        //nullable = true from not(false or (false and false)) = true
{

                    var inputAutomationTypeJComboBox = inputAutomationTypeJComboBox
this.inputAutomationTypeJComboBox= inputAutomationTypeJComboBox
}


open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{inputAutomationTypeJComboBox= JComboBox()
jLabel1= JLabel()
inputAutomationTypeJComboBox!!.setModel(DefaultComboBoxModel(arrayOf("DirectX","DirectX 8","Low Level","Java Robot")))
jLabel1!!.setText(
                            "Input Type:")

    var layout: GroupLayout = GroupLayout(this)

this.setLayout(layout)
layout!!.setHorizontalGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGroup(layout!!.createSequentialGroup()!!.addComponent(jLabel1)!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(inputAutomationTypeJComboBox, 0, 98, Short.MAX_VALUE)))
layout!!.setVerticalGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel1)!!.addComponent(inputAutomationTypeJComboBox, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)))
}


    private var inputAutomationTypeJComboBox: JComboBox

    private var jLabel1: JLabel

}
                
            

