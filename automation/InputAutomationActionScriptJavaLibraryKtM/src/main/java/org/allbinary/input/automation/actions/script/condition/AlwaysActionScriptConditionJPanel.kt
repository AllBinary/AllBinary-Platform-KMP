
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
        package org.allbinary.input.automation.actions.script.condition




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class AlwaysActionScriptConditionJPanel : javax.swing.JPanel {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var alwaysActionScriptConditionInterface: AlwaysActionScriptConditionInterface
public constructor        (alwaysActionScriptConditionInterface: AlwaysActionScriptConditionInterface){

                    var alwaysActionScriptConditionInterface = alwaysActionScriptConditionInterface
logUtil!!.put(this.commonStrings!!.START, this, this.commonStrings!!.CONSTRUCTOR)
initComponents()
this.alwaysActionScriptConditionInterface= alwaysActionScriptConditionInterface
this.set()
}


open fun set()
        //nullable = true from not(false or (false and true)) = true
{
    
                        if(this.alwaysActionScriptConditionInterface!!.isIsOn())
                        
                                    {
                                    this.alwaysJComboBox!!.setSelectedIndex(0)

                                    }
                                
                        else {
                            this.alwaysJComboBox!!.setSelectedIndex(1)

                        }
                            
this.alwaysActionScriptConditionInterface!!.log()
}


open fun update()
        //nullable = true from not(false or (false and true)) = true
{
    
                        if(this.alwaysJComboBox!!.getSelectedIndex() == 0)
                        
                                    {
                                    this.alwaysActionScriptConditionInterface!!.setIsOn(true)

                                    }
                                
                        else {
                            this.alwaysActionScriptConditionInterface!!.setIsOn(false)

                        }
                            
this.alwaysActionScriptConditionInterface!!.log()
}


open fun getAlwaysActionJDialog()
        //nullable = true from not(false or (false and true)) = true
: javax.swing.JDialog{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return alwaysActionJDialog
}


open fun setAlwaysActionJDialog(alwaysActionJDialog: javax.swing.JDialog)
        //nullable = true from not(false or (false and false)) = true
{

                    var alwaysActionJDialog = alwaysActionJDialog
this.alwaysActionJDialog= alwaysActionJDialog
}


open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{alwaysActionJDialog= javax.swing.JDialog()
titleJLabel= javax.swing.JLabel()
okJButton= javax.swing.JButton()
jLabel2= javax.swing.JLabel()
alwaysJComboBox= javax.swing.JComboBox()
alwaysActionJButton= javax.swing.JButton()
jLabel1= javax.swing.JLabel()
alwaysActionJDialog!!.setMinimumSize(java.awt.Dimension(250, 150))
titleJLabel!!.setText(
                            "Always Condition Options")
okJButton!!.setText(
                            "OK")
okJButton!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
okJButtonActionPerformed(evt)
}

                                }
                            )
jLabel2!!.setText(
                            "On:")
alwaysJComboBox!!.setModel(javax.swing.DefaultComboBoxModel(arrayOf("true","false")))

    var alwaysActionJDialogLayout: javax.swing.GroupLayout = javax.swing.GroupLayout(alwaysActionJDialog!!.getContentPane())

alwaysActionJDialog!!.getContentPane()!!.setLayout(alwaysActionJDialogLayout)
alwaysActionJDialogLayout!!.setHorizontalGroup(alwaysActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(alwaysActionJDialogLayout!!.createSequentialGroup()!!.addGroup(alwaysActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(alwaysActionJDialogLayout!!.createSequentialGroup()!!.addGap(47, 47, 47)!!.addGroup(alwaysActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)!!.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alwaysActionJDialogLayout!!.createSequentialGroup()!!.addComponent(jLabel2)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.addComponent(alwaysJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))!!.addComponent(titleJLabel)))!!.addGroup(alwaysActionJDialogLayout!!.createSequentialGroup()!!.addGap(79, 79, 79)!!.addComponent(okJButton)))!!.addContainerGap(45, Short.MAX_VALUE)))
alwaysActionJDialogLayout!!.setVerticalGroup(alwaysActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(alwaysActionJDialogLayout!!.createSequentialGroup()!!.addContainerGap()!!.addComponent(titleJLabel)!!.addGap(20, 20, 20)!!.addGroup(alwaysActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(alwaysJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel2))!!.addGap(15, 15, 15)!!.addComponent(okJButton)!!.addContainerGap()))
setMinimumSize(java.awt.Dimension(100, 0))
alwaysActionJButton!!.setText(
                            "Edit")
alwaysActionJButton!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
alwaysActionJButtonActionPerformed(evt)
}

                                }
                            )
jLabel1!!.setText(
                            "Always:")

    var layout: javax.swing.GroupLayout = javax.swing.GroupLayout(this)

this.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addComponent(jLabel1)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)!!.addComponent(alwaysActionJButton)))
layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel1)!!.addComponent(alwaysActionJButton)))
}


open fun okJButtonActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
this.update()
this.getAlwaysActionJDialog()!!.setVisible(false)
}


open fun alwaysActionJButtonActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
this.getAlwaysActionJDialog()!!.setVisible(true)
}


    private var alwaysActionJButton: javax.swing.JButton

    private var alwaysActionJDialog: javax.swing.JDialog

    private var alwaysJComboBox: javax.swing.JComboBox

    private var jLabel1: javax.swing.JLabel

    private var jLabel2: javax.swing.JLabel

    private var okJButton: javax.swing.JButton

    private var titleJLabel: javax.swing.JLabel

}
                
            

