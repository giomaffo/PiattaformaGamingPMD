/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
package com.mycompany.piattaformagaming_2024.utilita;



/**
 *
 * @author gian
 */
/*
public class Ordinatore 
{
    
    public static void scambia(int[] a, int pos1, int pos2)
    {
        int s;
        s=a[pos1];
        a[pos1]=a[pos2];
        a[pos2]=s;
    }
    
    
     
    public static void scambia(String[] a, int pos1, int pos2)
    {
        String s;
        s=a[pos1];
        a[pos1]=a[pos2];
        a[pos2]=s;
    }
    
    
    
    public static void scambiaLibri(Libro[] a, int pos1, int pos2)
    {
        Libro s;
        s=a[pos1];
        a[pos1]=a[pos2];
        a[pos2]=s;
    }
    
    
    public static int[] selectionSortCrescente (int[] a)
    {
        int v[]= new int[a.length];
        int lunghezza=v.length;
        //creo una copia di a
        for(int i=0;i<v.length;i++)
        {
            v[i]=a[i];
        }
        
        for (int i=0;i<lunghezza-1;i++)
        {
            for(int j=i+1;j<lunghezza;j++)
            {
                if (v[j]<v[i])
                    scambia(v, i, j);
            }
        }       
        return v;    
    }
    
    
    
    public static int[] selectionSortDecrescente (int[] a)
    {
        int v[]= new int[a.length];
        int lunghezza=v.length;
        //creo una copia di a
        for(int i=0;i<v.length;i++)
        {
            v[i]=a[i];
        }
        
        for (int i=0;i<lunghezza-1;i++)
        {
            for(int j=i+1;j<lunghezza;j++)
            {
                if (v[j]>v[i])
                    scambia(v, i, j);
            }
        }       
        return v;    
    }
   
     
    public static String[] selectionSortCrescente (String[] a)
    {
        String v[]= new String[a.length];
        int lunghezza=v.length;
        //creo una copia di a
        for(int i=0;i<v.length;i++)
        {
            v[i]=a[i];
        }
        
        for (int i=0;i<lunghezza-1;i++)
        {
            for(int j=i+1;j<lunghezza;j++)
            {
                if (v[j].compareTo(v[i])<0)
                    scambia(v, i, j);
            }
        }       
        return v;    
    }
    
    
    
    public static String[] selectionSortDecrescente (String[] a)
    {
        String v[]= new String[a.length];
        int lunghezza=v.length;
        //creo una copia di a
        for(int i=0;i<v.length;i++)
        {
            v[i]=a[i];
        }
        
        for (int i=0;i<lunghezza-1;i++)
        {
            for(int j=i+1;j<lunghezza;j++)
            {
                if (v[j].compareTo(v[i])>0)
                    scambia(v, i, j);
            }
        }       
        return v;    
    }
    
    
    public static int[] bubbleSortCrescente(int[] a)
    {
        int v[]= new int[a.length];
        int lunghezza=v.length;
        boolean scambioAvvenuto;
        //creo una copia di a
        for(int i=0;i<v.length;i++)
        {
            v[i]=a[i];
        }
        
        do
        {
            scambioAvvenuto=false;
            for(int i=0;i<lunghezza-1;i++)
            {
                if (v[i]>v[i+1])
                {
                    scambia(v, i, i+1);
                    scambioAvvenuto=true;
                }
            }
        }while (scambioAvvenuto);
        return v;
    }
    
     public static int[] bubbleSortDecrescente(int[] a)
    {
        int v[]= new int[a.length];
        int lunghezza=v.length;
        boolean scambioAvvenuto;
        
        //creo una copia di a
        for(int i=0;i<v.length;i++)
        {
            v[i]=a[i];
        }
        
        do
        {
            scambioAvvenuto=false;
            for(int i=0;i<lunghezza-1;i++)
            {
                if (v[i]>v[i+1])
                {
                    scambia(v, i, i+1);
                    scambioAvvenuto=true;
                }
            }
        }while (scambioAvvenuto);
        return v;
    }
     
     
     
     
     
    public static Libro[] selectionSortCrescenteLibri (Libro[] a)
    {
        Libro v[]= new Libro[a.length];
        int lunghezza=v.length;
        //creo una copia di a
        for(int i=0;i<v.length;i++)
        {
            v[i]= new Libro(a[i]);      
        }
        
        for (int i=0;i<lunghezza-1;i++)
        {
            for(int j=i+1;j<lunghezza;j++)
            {
                if (v[j].getTitolo().compareToIgnoreCase(v[i].getTitolo())<0)
                    scambiaLibri(v, i, j);
            }
        }       
        return v;    
    } 
    
}
*/