package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Php extends JFrame implements ActionListener {

    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String useranswers[][] = new String[10][1];
    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupoptions;
    JButton next, submit, lifeline;

    public static int timer = 15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;

    String name;
    public Php(String name){

        this.name = name;
        setBounds(50, 0, 1440, 850);
        getContentPane().setBackground(Color.WHITE);
        setUndecorated(true);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1440, 392);
        add(image);

        qno = new JLabel();
        qno.setBounds(100, 450, 50, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(qno);

        question = new JLabel();
        question.setBounds(150, 450, 900, 30);
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(question);

        questions[0][0] = "PHP stands for?";
        questions[0][1] = "Hypertext Preprocessor";
        questions[0][2] = "Pretext Hypertext Preprocessor";
        questions[0][3] = "Personal home Processor";
        questions[0][4] = "None of the above";

        questions[1][0] = "Who is known as father of PHP?";
        questions[1][1] = "Derk Kolkevi";
        questions[1][2] = "List Barely";
        questions[1][3] = "Rasmus Lerdorf";
        questions[1][4] = "None of the above";

        questions[2][0] = "Variable name in PHP starts with?";
        questions[2][1] = "!";
        questions[2][2] = "$";
        questions[2][3] = "&";
        questions[2][4] = "#";

        questions[3][0] = "Which of the following is default file extension of PHP?";
        questions[3][1] = ".php";
        questions[3][2] = ".hphp";
        questions[3][3] = ".xml";
        questions[3][4] = ".html";

        questions[4][0] = "Which of the Following is used to display the output in PHP?";
        questions[4][1] = "echo";
        questions[4][2] = "write";
        questions[4][3] = "print";
        questions[4][4] = "Both(a) and (b)";

        questions[5][0] = "What does PEAR stands for?";
        questions[5][1] = "PHP extension and application repository";
        questions[5][2] = "PHP enhancement and application repository";
        questions[5][3] = "PHP event and application repository";
        questions[5][4] = "None of the above";

        questions[6][0] = "What is the use of fopen()function in PHP?";
        questions[6][1] = "The fopen()function is used to open folders in PHP";
        questions[6][2] = "The fopen()function is used to open remote server";
        questions[6][3] = "The fopen()function is used to open files in PHP";
        questions[6][4] = "None of these";

        questions[7][0] = "Which of the following is correct way to defining a variable in PHP?";
        questions[7][1] = "$variable name=value;";
        questions[7][2] = "$variable_name=value;";
        questions[7][3] = "$variable name=value";
        questions[7][4] = "$variable name as value;";

        questions[8][0] = "Which of the following function is uesd to find files in PHP?";
        questions[8][1] = "glob()";
        questions[8][2] = "fold()";
        questions[8][3] = "file()";
        questions[8][4] = "None of the above";

        questions[9][0] = "Which of the following function is used to set cookie in PHP?";
        questions[9][1] = "createcookie()";
        questions[9][2] = "makecookie()";
        questions[9][3] = "setcookie()";
        questions[9][4] = "None of these";

        answers[0][1] = "Hypertext Preprocessor";
        answers[1][1] = "Rasmus Lerdorf";
        answers[2][1] = "$";
        answers[3][1] = ".php";
        answers[4][1] = "Both(a) and (b)";
        answers[5][1] = "PHP extension and application repository";
        answers[6][1] = "The fopen()function is used to open files in PHP";
        answers[7][1] = "$variable_name=value;";
        answers[8][1] = "glob()";
        answers[9][1] = "setcookie()";

        opt1 = new JRadioButton();
        opt1.setBounds(170, 520, 700, 30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt1);

        opt2 = new JRadioButton();
        opt2.setBounds(170, 560, 700, 30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt2);

        opt3 = new JRadioButton();
        opt3.setBounds(170, 600, 700, 30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt3);

        opt4 = new JRadioButton();
        opt4.setBounds(170, 640, 700, 30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt4);

        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);

        next = new JButton("Next");
        next.setBounds(700, 750, 200, 30);
        next.setFont(new Font("Tahoma", Font.PLAIN, 18));
        next.setBackground(new Color(22, 99, 54));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        lifeline = new JButton("Help");
        lifeline.setBounds(930, 750, 200, 30);
        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lifeline.setBackground(new Color(22, 99, 54));
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        add(lifeline);

        submit = new JButton("Submit");
        submit.setBounds(1150, 750, 200, 30);
        submit.setForeground(Color.BLACK);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 18));
        submit.setBackground(new Color(255, 215, 0));

        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);

        start(count);

        setVisible(true);


    }





    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }

            count++;
            start(count);
        } else if (ae.getSource() == lifeline) {
            if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            } else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        } else if (ae.getSource() == submit) {
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }

            for (int i = 0; i < useranswers.length; i++) {
                if (useranswers[i][0].equals(answers[i][1])) {
                    score += 10;
                } else {
                    score += 0;
                }
            }
            setVisible(false);
            new quiz.app.Score(name, score);
        }
    }

    public void paint(Graphics g) {
        super.paint(g);

        String time = "Time left - " + timer + " seconds"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));

        if (timer > 0) {
            g.drawString(time, 1100, 500);
        } else {
            g.drawString("Times up!!", 1100, 500);
        }

        timer--; // 14

        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (ans_given == 1) {
            ans_given = 0;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) { // submit button
                if (groupoptions.getSelection() == null) {
                    useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }

                for (int i = 0; i < useranswers.length; i++) {
                    if (useranswers[i][0].equals(answers[i][1])) {
                        score += 10;
                    } else {
                        score += 0;
                    }
                }
                setVisible(false);
                new quiz.app.Score(name, score);
            } else { // next button
                if (groupoptions.getSelection() == null) {
                    useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                count++; // 0 // 1
                start(count);
            }
        }

    }

    public void start(int count) {
        qno.setText("" + (count + 1) + ". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);

        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);

        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);

        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);

        groupoptions.clearSelection();
    }


    public static void main(String[]args){

        new Php("User");
    }
}
