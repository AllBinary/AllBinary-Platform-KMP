
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
        package org.allbinary.gui.dialog




        import java.lang.Object        
        
        import java.lang.Runnable
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class BasicTextJDialog : javax.swing.JDialog {
        

        companion object {
            
open fun main(args: Array<String?>)
        //nullable = true from not(false or (false and false)) = true
{
var args = args
java.awt.EventQueue.invokeLater(object: Runnable()
                                {
                                
open fun run()
        //nullable = true from not(false or (false and true)) = true
{
BasicTextJDialog(javax.swing.JFrame(), true, "Test").
                            setVisible(true)
}

                                }
                            )
}


        }
            
    private var closeListenerInterface: CloseJDialogListenerInterface
public constructor        (parent: java.awt.Frame, modal: Boolean, text: String)                        

                            : super(parent, modal){
var parent = parent
var modal = modal
var text = text


                            //For kotlin this is before the body of the constructor.
                    
initComponents()
this.setText(text)
}


open fun setText(text: String)
        //nullable = true from not(false or (false and false)) = true
{
var text = text
this.textJLabel!!.setText(text)
}


open fun addCloseListener(closeListenerInterface: CloseJDialogListenerInterface)
        //nullable = true from not(false or (false and false)) = true
{
var closeListenerInterface = closeListenerInterface
this.closeListenerInterface= closeListenerInterface
}

public constructor        (text: String){
var text = text
initComponents()
this.textJLabel!!.setText(text)
}


open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{
jButton1= javax.swing.JButton()
textJLabel= javax.swing.JLabel()
setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE)
jButton1!!.setText("OK")
jButton1!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
jButton1ActionPerformed(evt)
}

                                }
                            )
textJLabel!!.setText("No Text Set")

    var layout: javax.swing.GroupLayout = javax.swing.GroupLayout(getContentPane())

getContentPane()!!.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addGap(80, 80, 80)!!.addComponent(jButton1))!!.addGroup(layout.createSequentialGroup()!!.addContainerGap()!!.addComponent(textJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)))!!.addContainerGap()))
layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addGap(20, 20, 20)!!.addComponent(textJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addGap(30, 30, 30)!!.addComponent(jButton1)))
pack()
}


open fun jButton1ActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.setVisible(false)

    
                        if(this.closeListenerInterface != 
                                    null
                                )
                        
                                    {
                                    this.closeListenerInterface!!.onClose()

                                    }
                                
}


    private var jButton1: javax.swing.JButton

    private var textJLabel: javax.swing.JLabel

}
                
            

