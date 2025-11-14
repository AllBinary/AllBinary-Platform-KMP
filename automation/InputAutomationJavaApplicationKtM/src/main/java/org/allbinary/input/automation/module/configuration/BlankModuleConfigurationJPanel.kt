
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
        package org.allbinary.input.automation.module.configuration




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class BlankModuleConfigurationJPanel : javax.swing.JPanel {
        
public constructor (){
initComponents()
}


    open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{
jLabel1= javax.swing.JLabel()
jLabel1!!.setText("No Configuration Available")

    var layout: javax.swing.GroupLayout = javax.swing.GroupLayout(this)

this.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()!!.addContainerGap(231, Short.MAX_VALUE)!!.addComponent(jLabel1)!!.addGap(225, 225, 225)))
layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addContainerGap()!!.addComponent(jLabel1)!!.addContainerGap(362, Short.MAX_VALUE)))
}


    private var jLabel1: javax.swing.JLabel

}
                
            

