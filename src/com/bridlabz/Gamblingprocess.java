package com.bridlabz;

import java.util.Random;

public class Gamblingprocess {

    //uc1
    public static final int STAKE=100;
    public static final int BET=1;
    public static final float STAKE_VALUE = 0.5F;
    public int wining_value,stake,loosing_value;
//uc2
    public void winOrLoss(){
        Random random= new Random();
        int value = random.nextInt(2);
        if(value == 1){
            System.out.println("****gambler won******");
            stake++;
        }else{
            System.out.println("*****gambler loss****");
            stake--;
        }
    }
    public int resignStake(){
        loosing_value = (int)Math.round(STAKE*STAKE_VALUE);
        wining_value=(int)Math.round(STAKE+(STAKE*STAKE_VALUE));
        boolean stop=true;
        stake=STAKE;
        while (stop == true){
            winOrLoss();
            if(stake == loosing_value){
                stop=false;
            }
            if(stake == wining_value){
                stop=false;
            }
        }
        return stake;
    }
    public static void main(String[] args) {
        System.out.println("welcome to gambler");
        Gamblingprocess gambler=new Gamblingprocess();
        gambler.winOrLoss();
        gambler.resignStake();
        }
    }

