package com.example.ali_j.hangman;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.TableLayout;


import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public static String [] mots = {"info","cdi","montreal","clavier","computer","ali","amis","ligne"};
    public static String insmot=""; //mot qui recoit les caractere inseree par l utilisateur
    public static int score =0;
    public EditText mot;
    public ImageView head;
    public ImageView Lefthand;
    public ImageView RightHand;
    public ImageView LeftLeg;
    public ImageView RightLeg;
    public ImageView Stomach;
    public  Button A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z;
    int err=0;
    int rnd;

    String auxmot ;//le choix aleatoire de mot
   public String Affmot="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rnd= new Random().nextInt(mots.length );
        auxmot = mots[rnd];
         mot=(EditText)findViewById(R.id.Affmot);
         head=(ImageView)findViewById(R.id.Headview);
        Lefthand=(ImageView)findViewById(R.id.lefthandview);
        LeftLeg=(ImageView)findViewById(R.id.leftlegview);
        RightHand=(ImageView)findViewById(R.id.righthand);
        RightLeg=(ImageView)findViewById(R.id.rightlegview);
        Stomach=(ImageView)findViewById(R.id.VentreView);

        A=(Button)findViewById(R.id.A);
        B=(Button)findViewById(R.id.B);
        C=(Button)findViewById(R.id.C);
        D=(Button)findViewById(R.id.D);
        E=(Button)findViewById(R.id.E);
        F=(Button)findViewById(R.id.F);
        G=(Button)findViewById(R.id.G);
        H=(Button)findViewById(R.id.H);
        I=(Button)findViewById(R.id.I);
        J=(Button)findViewById(R.id.J);
        K=(Button)findViewById(R.id.K);
        L=(Button)findViewById(R.id.L);
        M=(Button)findViewById(R.id.M);
        N=(Button)findViewById(R.id.N);
        O=(Button)findViewById(R.id.O);
        P=(Button)findViewById(R.id.P);
        Q=(Button)findViewById(R.id.Q);
        r=(Button)findViewById(R.id.R);
        S=(Button)findViewById(R.id.S);
        T=(Button)findViewById(R.id.T);
        U=(Button)findViewById(R.id.U);
        V=(Button)findViewById(R.id.V);
        W=(Button)findViewById(R.id.W);
        X=(Button)findViewById(R.id.X);
        Y=(Button)findViewById(R.id.Y);
        Z=(Button)findViewById(R.id.Z);



        for (int i=0;i<auxmot.length();i++){
            Affmot=Affmot+'*';
        }
        mot.setText(Affmot);

    }

    public void a(View view){
     geuss('a');
     A.setEnabled(false);

    }
    public void b(View view){
        geuss('b');
        B.setEnabled(false);
    }
    public void c(View view){
        geuss('c');
        C.setEnabled(false);

    }
    public void d(View view){
        geuss('d');
        D.setEnabled(false);
    }

    public void e(View view){
       geuss('e');
       E.setEnabled(false);
    }
    public void f(View view){
        geuss('f');
        F.setEnabled(false);

    }
    public void g(View view){
        geuss('g');
        G.setEnabled(false);
    }
    public void h(View view){
        geuss('h');
        H.setEnabled(false);
    }
    public void i(View view){
        geuss('i');
        I.setEnabled(false);
    }
    public void j(View view){
        geuss('j');
        J.setEnabled(false);
    }
    public void k(View view){
        geuss('k');
        K.setEnabled(false);
    }
    public void l(View view){
        geuss('l');
        L.setEnabled(false);
    }
    public void m(View view){
        geuss('m');
        M.setEnabled(false);
    }
    public void n(View view){
        geuss('n');
        N.setEnabled(false);
    }
    public void o(View view){
        geuss('o');
        O.setEnabled(false);
    }
    public void p(View view){

        geuss('p');
        P.setEnabled(false);

    }
    public void q(View view){
        geuss('q');
        Q.setEnabled(false);
    }
    public void r(View view){
        geuss('r');
        r.setEnabled(false);
    }
    public void s(View view){
        geuss('s');
        S.setEnabled(false);
    }
    public void t(View view){
        geuss('n');
        N.setEnabled(false);
    }
    public void u(View view){
        geuss('u');
        U.setEnabled(false);
    }
    public void v(View view){
        geuss('v');
        V.setEnabled(false);

    }
    public void w(View view){
        geuss('w');
        W.setEnabled(false);

    }
    public void x(View view){
        geuss('x');
        X.setEnabled(false);

    }
    public void y(View view){
        geuss('y');
        Y.setEnabled(false);
    }
    public void z(View view){
        geuss('z');
        Z.setEnabled(false);
    }

    public  void geuss(char button ){



        //intitialiser le mot d affichage qui va etre afficher sur l ecran

        if ((err <=6)&&(auxmot!=Affmot))
        {
            if (auxmot.indexOf(button)>=0){
                int index= auxmot.indexOf(button);// l index de caractere trouve dans la chaine auxmot


                Affmot = Affmot.substring(0,index)+button+Affmot.substring(index+1);

            }else {
                err++;
                switch (err) {
                    case 1:
                        head.setBackgroundResource(R.drawable.head);
                        break;
                    case 2:
                     RightHand.setBackgroundResource(R.drawable.righthand);
                    case 3:
                     Lefthand.setBackgroundResource(R.drawable.lefthand);
                        break;
                    case 4:   Stomach.setBackgroundResource(R.drawable.stomach);
                        break;
                    case 5: RightLeg.setBackgroundResource(R.drawable.rightleg);
                        break;

                    case 6:  LeftLeg.setBackgroundResource(R.drawable.leftleg);

                        break;


                }

            }

        }//end while


        if (err>=6){


            Toast.makeText(this,"You LOOSE le mot est "+auxmot+" "+"score="+score,Toast.LENGTH_LONG);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("YOU LOOSE ");


            builder.setMessage("do you want to play again...")
                    .setCancelable(false)
                    .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {reset();}  })
            .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
                System.exit(1);

            }
        });


        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }


        else{
            //JOptionPane.showMessageDialog(null, "HANG MAN RESULT", " ", JOptionPane.ERROR_MESSAGE);
            mot.setText(Affmot);
        }
        if(auxmot.equals(Affmot)){
            Toast.makeText(this,"CONGRATULATION ,YOU WON"+" "+"score="+score,Toast.LENGTH_LONG);
            score++;
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("YOU WON ");


            builder.setMessage("do you want to play again...")
                    .setCancelable(false)
                    .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {reset();}  })
                    .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                            System.exit(1);

                        }
                    });


            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }

    }
    public void reset(){
        head.setBackgroundColor(Color.WHITE);
        RightHand.setBackgroundColor(Color.WHITE);
        Lefthand.setBackgroundColor(Color.WHITE);

        Stomach.setBackgroundColor(Color.WHITE);
        LeftLeg.setBackgroundColor(Color.WHITE);
        RightLeg.setBackgroundColor(Color.WHITE);
        A.setEnabled(true);
        B.setEnabled(true);
        C.setEnabled(true);
        D.setEnabled(true);
        E.setEnabled(true);
        F.setEnabled(true);
        G.setEnabled(true);
        H.setEnabled(true);
        I.setEnabled(true);
        J.setEnabled(true);
        K.setEnabled(true);
        L.setEnabled(true);
        M.setEnabled(true);
        N.setEnabled(true);
        O.setEnabled(true);
        P.setEnabled(true);
        Q.setEnabled(true);
        r.setEnabled(true);
        S.setEnabled(true);
        T.setEnabled(true);
        U.setEnabled(true);
        V.setEnabled(true);
        W.setEnabled(true);
        X.setEnabled(true);
        Y.setEnabled(true);
        Z.setEnabled(true);
        err=0;
        rnd=new Random().nextInt(mots.length );
        auxmot = mots[rnd];//le choix aleatoire de mot
        Affmot="";
        for (int i=0;i<auxmot.length();i++){
            Affmot=Affmot+'*';
        }
        mot.setText(Affmot);




    }


}
