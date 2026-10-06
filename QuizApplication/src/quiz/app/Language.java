package quiz.app;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Language extends JFrame implements ActionListener {

    JButton java,python,php,html;

    String name;
    public Language(String name){

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        this.name= name;

        JLabel heading = new JLabel("Please select a language");
        heading.setBounds(140,60,300,45);
        heading.setFont(new Font("Calibri ",Font.BOLD,20));
        heading.setForeground(new Color(22,99,54));
        add(heading);

        java=new JButton("JAVA");
        java.setBounds(100,150,100,30);
        java.setBackground(new Color(22,99,54));
        java.setForeground(Color.WHITE);
        java.addActionListener(this);
        add(java);

        python=new JButton("Python");
        python.setBounds(300,150,100,30);
        python.setBackground(new Color(22,99,54));
        python.setForeground(Color.WHITE);
        python.addActionListener(this);
        add(python);

        php=new JButton("PHP");
        php.setBounds(100,250,100,30);
        php.setBackground(new Color(22,99,54));
        php.setForeground(Color.WHITE);
        php.addActionListener(this);
        add(php);

        html=new JButton("Html");
        html.setBounds(300,250,100,30);
        html.setBackground(new Color(22,99,54));
        html.setForeground(Color.WHITE);
        html.addActionListener(this);
        add(html);




        setSize(500,500);
        setLocation(200,150);
        setUndecorated(true);
        setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==java){

            setVisible(false);
            new quiz.app.Quiz(name);

        } else if (e.getSource()==python){

            setVisible(false);
            new quiz.app.Python(name);

        } else if (e.getSource() ==php) {

            setVisible(false);
            new quiz.app.Php(name);

        }else if(e.getSource()==html){

            setVisible(false);
            new quiz.app.Html(name);

        } else {
            setVisible(false);
            new quiz.app.Language(name);
        }

    }

    public static void main (String[] args){
        new Language("User");


    }
}
