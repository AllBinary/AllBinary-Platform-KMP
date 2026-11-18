
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
                    
        
import javax.swing.DefaultComboBoxModel
import javax.swing.GroupLayout
import javax.swing.JComboBox
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.LayoutStyle

open public class InputAutomationTypeJPanel : JPanel {
        
public constructor (){
this.initComponents()
}


    open fun getInputAutomationTypeJComboBox()
        //nullable = true from not(false or (false and true)) = true
: JComboBox{

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.inputAutomationTypeJComboBox
}


    open fun setInputAutomationTypeJComboBox(inputAutomationTypeJComboBox: JComboBox)
        //nullable = true from not(false or (false and false)) = true
{
var inputAutomationTypeJComboBox = inputAutomationTypeJComboBox
this.inputAutomationTypeJComboBox= inputAutomationTypeJComboBox
}


    open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{
this.inputAutomationTypeJComboBox= JComboBox()
this.jLabel1= JLabel()
this.inputAutomationTypeJComboBox!!.setModel(DefaultComboBoxModel(arrayOf("DirectX","DirectX 8","Low Level","Java Robot")))
this.jLabel1!!.setText("Input Type:")

    var layout: GroupLayout = GroupLayout(this)

this.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addComponent(jLabel1)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(inputAutomationTypeJComboBox, 0, 98, Short.MAX_VALUE)))
layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel1)!!.addComponent(inputAutomationTypeJComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
}


    private var inputAutomationTypeJComboBox: JComboBox

    private var jLabel1: JLabel

}
                
            

