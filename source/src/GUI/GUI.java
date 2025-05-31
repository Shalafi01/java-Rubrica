package GUI;

import java.awt.Desktop;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author 78187656
 */
public class GUI extends javax.swing.JFrame {

    public GUI() throws ParserConfigurationException {
        initComponents();
        jInserisci.requestFocus();
        new File(System.getProperty("user.home") + "/Desktop/Rubrica").mkdir();
        
        documentFactory = DocumentBuilderFactory.newInstance();
        documentBuilder = documentFactory.newDocumentBuilder();
        document = documentBuilder.newDocument();

        root = document.createElement("rubrica");
        document.appendChild(root);    
    }    
    
    String xmlFilePath=System.getProperty("user.home") + "/Desktop/Rubrica/";
    
    DocumentBuilderFactory documentFactory ;
    DocumentBuilder documentBuilder;
    Document document;
    Element root;
    Element[] persona=new Element[10000];
    Element[] persona2=new Element[10000];

    String[] nome=new String[10000];
    String[] cognome=new String[10000];
    String[] email=new String[10000];
    String[] numero=new String[10000];
    
    int id=0;
    String rubrica;
    String XML;
    String toFound="";
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jInserisci = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jAnteprima = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmNuovaRubrica = new javax.swing.JMenuItem();
        Salva = new javax.swing.JMenuItem();
        jmImporta = new javax.swing.JMenuItem();
        jnDocumentazione = new javax.swing.JMenuItem();
        jmEsci = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmCerca = new javax.swing.JMenuItem();
        jmRimuovi = new javax.swing.JMenuItem();
        jnVisualizza = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jInserisci.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jInserisci.setText("Inserisci");
        jInserisci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInserisciActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField1.setText("Inserisci il nome");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField2.setText("Inserisci il cognome");
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField3.setText("Inserisci l'email");
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField4.setText("Inserisci il numero di telefono");
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RUBRICA");

        jAnteprima.setEditable(false);
        jAnteprima.setColumns(20);
        jAnteprima.setRows(5);
        jScrollPane1.setViewportView(jAnteprima);

        jMenu1.setText("File");

        jmNuovaRubrica.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jmNuovaRubrica.setText("Nuova rubrica");
        jmNuovaRubrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmNuovaRubricaActionPerformed(evt);
            }
        });
        jMenu1.add(jmNuovaRubrica);

        Salva.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        Salva.setText("Salva");
        Salva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvaActionPerformed(evt);
            }
        });
        jMenu1.add(Salva);

        jmImporta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmImporta.setText("Importa rubrica...");
        jmImporta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmImportaActionPerformed(evt);
            }
        });
        jMenu1.add(jmImporta);

        jnDocumentazione.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_SPACE, java.awt.event.InputEvent.CTRL_MASK));
        jnDocumentazione.setText("Documentazione");
        jnDocumentazione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnDocumentazioneActionPerformed(evt);
            }
        });
        jMenu1.add(jnDocumentazione);

        jmEsci.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jmEsci.setText("Esci");
        jmEsci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEsciActionPerformed(evt);
            }
        });
        jMenu1.add(jmEsci);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Azioni");

        jmCerca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jmCerca.setText("Cerca...");
        jmCerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCercaActionPerformed(evt);
            }
        });
        jMenu2.add(jmCerca);

        jmRimuovi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jmRimuovi.setText("Rimuovi voci...");
        jmRimuovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRimuoviActionPerformed(evt);
            }
        });
        jMenu2.add(jmRimuovi);

        jnVisualizza.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jnVisualizza.setText("Visualizza XML");
        jnVisualizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnVisualizzaActionPerformed(evt);
            }
        });
        jMenu2.add(jnVisualizza);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jInserisci)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3)
                    .addComponent(jTextField4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jInserisci)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jInserisciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInserisciActionPerformed
               
        try {
            nome[id] = jTextField1.getText();
            if (nome[id].startsWith("Inserisci")) {
                nome[id] = "";
            }
            cognome[id] = jTextField2.getText();
            if (cognome[id].startsWith("Inserisci")) {
                cognome[id] = "";
            }
            email[id] = jTextField3.getText();
            if (email[id].startsWith("Inserisci")) {
                email[id] = "";
            }
            numero[id] = jTextField4.getText();
            if (numero[id].startsWith("Inserisci")) {
                numero[id] = "";
            }
            
            boolean num=true;
            boolean ema=true;
            int p=0, c=0;
            for(int i=0; i<numero[id].length(); i++)
            {
                if((numero[id].charAt(i)!='0')&&(numero[id].charAt(i)!='1')&&(numero[id].charAt(i)!='2')&&(numero[id].charAt(i)!='3')&&
                (numero[id].charAt(i)!='4')&&(numero[id].charAt(i)!='5')&&(numero[id].charAt(i)!='6')&&(numero[id].charAt(i)!='7')&&
                (numero[id].charAt(i)!='8')&&(numero[id].charAt(i)!='9')&&(numero[id].charAt(i)!='+'))num=false;
            }
            
            if(num==false) {JOptionPane.showMessageDialog(null, "Numero non valido."); jTextField4.setText(""); jTextField4.setText("Inserisci il numero di telefono");}            
            else if ((nome[id].equals("")) || (cognome[id].equals("")) || (email[id].equals("")) || (numero[id].equals(""))) {
                JOptionPane.showMessageDialog(null, "Compilare tutti i campi"); 
            } 
            else 
            {
                persona[id] = document.createElement("persona");

                root.appendChild(persona[id]);

                Node ID = document.createElement("id");
                ID.appendChild(document.createTextNode(String.valueOf(id)));
                persona[id].appendChild(ID);

                Node firstname = document.createElement("nome");
                firstname.appendChild(document.createTextNode(nome[id]));
                persona[id].appendChild(firstname);

                Node lastname = document.createElement("cognome");
                lastname.appendChild(document.createTextNode(cognome[id]));
                persona[id].appendChild(lastname);

                Node mail = document.createElement("email");
                mail.appendChild(document.createTextNode(email[id]));
                persona[id].appendChild(mail);

                Node number = document.createElement("numero");
                number.appendChild(document.createTextNode(numero[id]));
                persona[id].appendChild(number);

                id++;

                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField1.requestFocus();
                jTextField2.requestFocus();
                jTextField3.requestFocus();
                jTextField4.requestFocus();
                jInserisci.requestFocus();

                anteprima();
            }
        } catch (HeadlessException | DOMException e) {}
    }//GEN-LAST:event_jInserisciActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        if(jTextField1.getText().startsWith("Inserisci")) jTextField1.setText("");
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        if(jTextField1.getText().equals("")) jTextField1.setText("Inserisci il nome");
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        if(jTextField2.getText().startsWith("Inserisci")) jTextField2.setText("");
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        if(jTextField2.getText().equals("")) jTextField2.setText("Inserisci il cognome");
    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        if(jTextField3.getText().startsWith("Inserisci")) jTextField3.setText("");
    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        if(jTextField3.getText().equals("")) jTextField3.setText("Inserisci l'email");
    }//GEN-LAST:event_jTextField3FocusLost

    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusGained
        if(jTextField4.getText().startsWith("Inserisci")) jTextField4.setText("");
    }//GEN-LAST:event_jTextField4FocusGained

    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
        if(jTextField4.getText().equals("")) jTextField4.setText("Inserisci il numero di telefono");
    }//GEN-LAST:event_jTextField4FocusLost

    private void jmRimuoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRimuoviActionPerformed
        if (id == 0) {
            JOptionPane.showMessageDialog(null, "Nessuna voce in rubrica");
        } else {
            try {
                
                String[] persone=new String[id];
                for(int i=0;i<id;i++)
                    persone[i]=i+" "+nome[i]+" "+cognome[i];
                
                Object selezione=JOptionPane.showInputDialog(null, "Seleziona la persona da eliminare", null, JOptionPane.QUESTION_MESSAGE, null, persone, persone[0]);
                Scanner s=new Scanner((String) selezione);
                int n=s.nextInt();
          
                if (n >= id) {
                    JOptionPane.showMessageDialog(null, "Indice non valido.");
                } else 
                {
                    root.removeChild(persona[n]);
                    persona[n]=null; nome[n]=null; cognome[n]=null; email[n]=null; numero[n]=null;
                    id--;
                    riassegnaID();   
                    anteprima();
                }
            } catch (HeadlessException | NumberFormatException | NullPointerException e) {}
        }
    }//GEN-LAST:event_jmRimuoviActionPerformed

    private void jmImportaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmImportaActionPerformed
        
        int k=0;
        if(!jAnteprima.getText().equals(""))
        {
            
            int n=JOptionPane.showConfirmDialog(null, "Vuoi salvare la rubrica corrente?", null, 0);
            if(n==0) k=salva();             
        }
        if(k==0){
        
        JFileChooser f = new JFileChooser();
        f.setCurrentDirectory(new File(System.getProperty("user.home")+"/Desktop/rubrica"));
        f.setFileFilter(new FileNameExtensionFilter(".xml", "xml", "xml"));
        int n = f.showOpenDialog(this);
        if (n == 0)
        {
            try {
                File file = f.getSelectedFile();
                jAnteprima.setText("");
                document=null;   
                root=null;
                persona=new Element[10000];
                nome=new String[10000]; cognome=new String[10000]; email=new String[10000]; numero=new String[10000];
                
                documentFactory = DocumentBuilderFactory.newInstance();
                documentBuilder = documentFactory.newDocumentBuilder();
                document = documentBuilder.parse(file);
                document.getDocumentElement().normalize();
                
                root=(Element) document.getFirstChild();
                NodeList nList = document.getElementsByTagName("persona");
                id=nList.getLength();
                for(int i=0;i<id;i++)
                    persona[i] = (Element) nList.item(i);

                for (int i = 0; i < id; i++) 
                {                    
                    nome[i] = persona[i].getElementsByTagName("nome").item(0).getTextContent();
                    cognome[i] = persona[i].getElementsByTagName("cognome").item(0).getTextContent();
                    email[i] = persona[i].getElementsByTagName("email").item(0).getTextContent();
                    numero[i] = persona[i].getElementsByTagName("numero").item(0).getTextContent();
                }
                
                anteprima();
            } catch (IOException | ParserConfigurationException | DOMException | SAXException e) {}
        }}
    }//GEN-LAST:event_jmImportaActionPerformed

    private void jmEsciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEsciActionPerformed
        if (id != 0) {
            int n = JOptionPane.showConfirmDialog(null, "Salvare la rubrica corrente?");
            int k=0;
            if (n == 0) k = salva();    
            if (n != 2 && k==0) System.exit(0);
        } else System.exit(0);
    }//GEN-LAST:event_jmEsciActionPerformed

    private void jnVisualizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnVisualizzaActionPerformed
        if(jnVisualizza.getText().equals("Visualizza XML"))
        {            
            try {                
                jnVisualizza.setText("Visualizza rubrica");
                anteprima();                
            } catch (Exception e) {}
        }
        else if(jnVisualizza.getText().equals("Visualizza rubrica"))
        {                        
            jnVisualizza.setText("Visualizza XML");
            anteprima();            
        }    
    }//GEN-LAST:event_jnVisualizzaActionPerformed

    private void jnDocumentazioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnDocumentazioneActionPerformed
        try {
            File file=new File("documentazione.txt");
            Desktop.getDesktop().edit(file);
        } catch (IOException ex) {}
    }//GEN-LAST:event_jnDocumentazioneActionPerformed

    private void jmNuovaRubricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmNuovaRubricaActionPerformed
        
        int n=2;
        if(!jAnteprima.getText().equals(""))
        {
            n=JOptionPane.showConfirmDialog(null, "Vuoi salvare la rubrica corrente?");
            if(n==0) salva(); 
            jAnteprima.setText(""); document=null;
        }        
        if (n != 2) {
            jTextField1.setText("Inserisci il nome");
            jTextField2.setText("Inserisci il cognome");
            jTextField3.setText("Inserisci l'email");
            jTextField4.setText("Inserisci il numero di telefono");
        }
    }//GEN-LAST:event_jmNuovaRubricaActionPerformed

    private void SalvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvaActionPerformed
        if(!jAnteprima.getText().equals("")) salva();
        else JOptionPane.showMessageDialog(null, "La rubrica è vuota.");
    }//GEN-LAST:event_SalvaActionPerformed

    private void jmCercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCercaActionPerformed
        try 
        {    
            if (toFound.equals("")) toFound=JOptionPane.showInputDialog(null, "Inserisci un elemento da cercare");
            else toFound=JOptionPane.showInputDialog(null, "Inserisci un elemento da cercare", toFound);
            
            cerca();     
            if(toFound.equals("")) anteprima();
            
        } catch (HeadlessException | NullPointerException e) {toFound=""; anteprima();}          
    }//GEN-LAST:event_jmCercaActionPerformed
  
    public boolean contiene(String line)
    {
        if (jnVisualizza.getText().equals("Visualizza XML")) line = line.replace(")", "");
        
        Scanner s=new Scanner(line);
        Scanner t=new Scanner(toFound);
        
        Set<String> line0=new HashSet<>();
        Collection<String> toFound0 = new ArrayList<>();
        
        while(s.hasNext()) line0.add(s.next());
        while(t.hasNext()) toFound0.add(t.next());
        
        t.close();
        s.close();
        
        return line0.containsAll(toFound0);
    }       
    
    public void anteprima() 
    {
        int n = id - 1;
        if (jnVisualizza.getText().equals("Visualizza XML")) 
        {
            jAnteprima.setText("");
            for (int i = 0; i <= n; i++) jAnteprima.setText(jAnteprima.getText() + i + ")  " + nome[i] + "  |  " + cognome[i] + "  |  " + email[i] + "  |  " + numero[i] + "\n");            
            cerca();
        } 
        else 
        {
            for (int i = 0; i <= n; i++) rubrica = rubrica + i + ")  " + nome[i] + "  |  " + cognome[i] + "  |  " + email[i] + "  |  " + numero[i] + "\n";            
            anteprimaXML();
        }
    }  
    
    public void anteprimaXML() 
    {
        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

            StreamResult result = new StreamResult(new StringWriter());
            DOMSource source = new DOMSource(document);
            transformer.transform(source, result);
            String line = result.getWriter().toString();
            line = line.replaceAll("<", " <");
            line = line.replaceAll(">", "> ");
            jAnteprima.setText(line);
            cerca();
            
        } catch (IllegalArgumentException | TransformerException e) {}
    }
    
    public int salva() 
    {
        try {            
            Date date =new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            String d = formatter.format(date).replaceAll(":", ".");
            String f="";
            
            int k = JOptionPane.showConfirmDialog(null, "Vuoi dare un nome alla rubrica?\n(Premendo \"No\" verrà assegnato un nome standard)", null, 0);
            if (k == 0) f = JOptionPane.showInputDialog(null, "Inserisci il nome desiderato: ");            
            
            if (f.equals("")) xmlFilePath +="rubrica "+d+".xml";
            else  xmlFilePath += f+".xml";
            
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File(xmlFilePath));            
            transformer.transform(domSource, streamResult);
            JOptionPane.showMessageDialog(null, "Rubrica salvata.\nPercorso assoluto: "+xmlFilePath.replace("/","\\"));
            xmlFilePath=System.getProperty("user.home") + "/Desktop/Rubrica/";
        } catch (HeadlessException | TransformerException e) {JOptionPane.showMessageDialog(null, "Il nome contine un carattere non valido."); return 1;}
        catch (NullPointerException e){return 1;}
        return 0;
    }      
    
    public void riassegnaID()
    {
        for(int i=0;i<id;i++)
        {
            Node p = document.getElementsByTagName("persona").item(i);
            NodeList list=p.getChildNodes();
            Node node = list.item(0);
            node.setTextContent(String.valueOf(i));
        }
        
        // Se elimino la voce n, graficamente n+1 prende il suo posto, ma persona[n], de facto, è null.
        
        for(int i=0;i<=id;i++)
        {
            if(persona[i]==null) {persona[i]=persona[i+1]; persona[i+1]=null;}
            if(nome[i]==null) {nome[i]=nome[i+1]; nome[i+1]=null;}
            if(cognome[i]==null) {cognome[i]=cognome[i+1]; cognome[i+1]=null;}
            if(email[i]==null) {email[i]=email[i+1]; email[i+1]=null;}
            if(numero[i]==null) {numero[i]=numero[i+1]; numero[i+1]=null;}
        }
    }
    
    public void cerca() {
        try 
        {            
            Scanner s = new Scanner(jAnteprima.getText());            
            
            if (!toFound.equals("")) 
            {
                jAnteprima.setText("");
                if (jnVisualizza.getText().equals("Visualizza XML")) 
                {
                    while (s.hasNextLine()) 
                    {
                        String line = s.nextLine();
                        if (contiene(line) == true) jAnteprima.setText(jAnteprima.getText() + line + "\n");                        
                    }
                } 
                else 
                {
                    s.nextLine(); s.nextLine();
                    for (int i = 0; i < id; i++) 
                    {
                        String line = "";
                        for (int j = 0; j < 7; j++) 
                            line += s.nextLine();                        

                        if (contiene(line) == true) jAnteprima.setText(jAnteprima.getText() + line.replaceAll("    ", "\n").replaceFirst("   ", "") + "\n");                        
                    }
                }

                s.close();
            } 

        } catch (NullPointerException e) {toFound = "";}
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new GUI().setVisible(true);
            } catch (ParserConfigurationException ex) {}
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Salva;
    private javax.swing.JTextArea jAnteprima;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jInserisci;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JMenuItem jmCerca;
    private javax.swing.JMenuItem jmEsci;
    private javax.swing.JMenuItem jmImporta;
    private javax.swing.JMenuItem jmNuovaRubrica;
    private javax.swing.JMenuItem jmRimuovi;
    private javax.swing.JMenuItem jnDocumentazione;
    private javax.swing.JMenuItem jnVisualizza;
    // End of variables declaration//GEN-END:variables
}

//quando cerchi e tofound è gia definito quando cerca richiama anteprima si fa casino perché quelli cercano a sua volta
//serve detrutturare in più metodi