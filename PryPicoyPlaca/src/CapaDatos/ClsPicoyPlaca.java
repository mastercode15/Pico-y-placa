
package CapaDatos;

import javax.swing.JOptionPane;


public class ClsPicoyPlaca {
    private String placa;
    private String fecha;
    private String hora;
    private int digito;
    private int x=0;
    private String[] D={"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
    private String[] N={"1-2","3-4","5-6","7-8","9-0","Libre","Libre"};

    public ClsPicoyPlaca(String placa, String fecha, String hora) {
        this.placa = placa;
        this.fecha = fecha;
        this.hora = hora;
    }

    

    
    public void confirmacion(){
        JOptionPane.showMessageDialog(null, "Su automovil puede transitar con normalidad");
    }
    
    public void anulacion(){
        JOptionPane.showMessageDialog(null, "Su automovil no puede transitar");
    }
    
    public void numplaca(String placa){
        String letp=placa.split("-")[0];
        int nump=Integer.parseInt(placa.split("-")[1]);
        
        if ((nump<9999 && nump>99) && (letp.length()==3)){
            if(nump>=1000)
                digito=((nump%1000)%100)%10;
            else if(nump>=100)
                digito=((nump%100)%10);
        }
        
         else
            JOptionPane.showMessageDialog(null,"Ingrese un numero de placa valido");
        
    }
    
    public void fecha(String fecha){
        int dia= Integer.parseInt(fecha.split("/")[0]);
        int mes= Integer.parseInt(fecha.split("/")[1]);
        int año= Integer.parseInt(fecha.split("/")[2]);
        
        
        switch(mes){
            case 1:
                if(dia>0 && dia<=31){
                    x=dia;
                }
                else
                    JOptionPane.showMessageDialog(null,"Ingrese una fecha valida");
                break;
                
            case 2:
                if(dia>0 && dia<=28){
                    x=dia+31;
                }    
                else
                    JOptionPane.showMessageDialog(null,"Ingrese una fecha valida");
                break;
            
            case 3:
                if(dia>0 && dia<=31){
                    x=dia+59;
                }    
                else
                    JOptionPane.showMessageDialog(null,"Ingrese una fecha valida");
                break;
            
            case 4:
                if(dia>0 && dia<=30){
                    x=dia+90;
                }    
                else
                    JOptionPane.showMessageDialog(null,"Ingrese una fecha valida");
                break;
            
            case 5:
                if(dia>0 && dia<=31){
                    x=dia+120;
                }    
                else
                    JOptionPane.showMessageDialog(null,"Ingrese una fecha valida");
                break;
                
            case 6:
                if(dia>0 && dia<=30){
                    x=dia+151;
                }    
                else
                    JOptionPane.showMessageDialog(null,"Ingrese una fecha valida");
                break;
                
            case 7:
                if(dia>0 && dia<=31){
                    x=dia+181;
                }    
                else
                    JOptionPane.showMessageDialog(null,"Ingrese una fecha valida");
                break;
            
            case 8:
                if(dia>0 && dia<=31){
                    x=dia+212;
                }    
                else
                    JOptionPane.showMessageDialog(null,"Ingrese una fecha valida");
                break;
            
            case 9:
                if(dia>0 && dia<=30){
                    x=dia+243;
                }    
                else
                    JOptionPane.showMessageDialog(null,"Ingrese una fecha valida");
                break;
            
            case 10:
                if(dia>0 && dia<=31){
                    x=dia+273;
                }    
                else
                    JOptionPane.showMessageDialog(null,"Ingrese una fecha valida");
                break;
            
            case 11:
                if(dia>0 && dia<=30){
                    x=dia+304;
                }    
                else
                    JOptionPane.showMessageDialog(null,"Ingrese una fecha valida");
                break;
            
            case 12:
                if(dia>0 && dia<=31){
                    x=dia+334;
                }    
                else
                    JOptionPane.showMessageDialog(null,"Ingrese una fecha valida");
                break;
            
            default:
                JOptionPane.showMessageDialog(null,"Ingrese una fecha valida");        
        }
        
        
    }
    public void hora(String hora){
        int hor=Integer.parseInt(hora.split(":")[0]);
        int min=Integer.parseInt(hora.split(":")[1]);
        if (hor<=24 && hor>=1 && (min<=59 && min>=0))
        {
            
            
            
            if(x>0&&x<366){
                if (x<7)
                    if (D[x]=="Lunes" && (digito==1 || digito==2)&& (hor>=7 && (hor<=9 && min<=30) || hor>=16 && (hor<=19 && min<=30)))
                        anulacion();
                    else if (D[x]=="Martes" && (digito==3 || digito==4)&& (hor>=7 && (hor<=9 && min<=30) || hor>=16 && (hor<=19 && min<=30)))
                        anulacion();
                    else if (D[x]=="Miercoles" && (digito==5 || digito==6)&& (hor>=7 && (hor<=9 && min<=30) || hor>=16 && (hor<=19 && min<=30)))
                        anulacion();
                    else if (D[x]=="Jueves" && (digito==7 || digito==8)&& (hor>=7 && (hor<=9 && min<=30) || hor>=16 && (hor<=19 && min<=30)))
                        anulacion();
                    else if (D[x]=="Viernes" && (digito==9 && digito==0)&& (hor>=7 && (hor<=9 && min<=30) || hor>=16 && (hor<=19 && min<=30)))
                        anulacion();
                     else
                        confirmacion();
                    
                else if ((x%7)==0)
                    if (D[0]=="Lunes" && (digito==1 || digito==2)&& (hor>=7 && (hor<=9 && min<=30) || hor>=16 && (hor<=19 && min<=30)))
                        anulacion();
                    else if (D[0]=="Martes" && (digito==3 || digito==4)&& (hor>=7 && (hor<=9 && min<=30) || hor>=16 && (hor<=19 && min<=30)))
                        anulacion();
                    else if (D[0]=="Miercoles" && (digito==5 || digito==6)&& (hor>=7 && (hor<=9 && min<=30) || hor>=16 && (hor<=19 && min<=30)))
                        anulacion();
                    else if (D[0]=="Jueves" && (digito==7 || digito==8)&& (hor>=7 && (hor<=9 && min<=30) || hor>=16 && (hor<=19 && min<=30)))
                        anulacion();
                    else if (D[0]=="Viernes" && (digito==9 || digito==0)&& (hor>=7 && (hor<=9 && min<=30) || hor>=16 && (hor<=19 && min<=30)))
                        anulacion();
                     else
                        confirmacion();
                
                else
                    if (D[x%7]=="Lunes" && (digito==1 || digito==2)&& (hor>=7 && (hor<=9 && min<=30) || hor>=16 && (hor<=19 && min<=30)))
                        anulacion();
                    else if (D[x%7]=="Martes" && (digito==3 || digito==4)&& (hor>=7 && (hor<=9 && min<=30) || hor>=16 && (hor<=19 && min<=30)))
                        anulacion();
                    else if (D[x%7]=="Miercoles" && (digito==5 || digito==6)&& (hor>=7 && (hor<=9 && min<=30) || hor>=16 && (hor<=19 && min<=30)))
                        anulacion();
                    else if (D[x%7]=="Jueves" && (digito==7 || digito==8)&& (hor>=7 && (hor<=9 && min<=30) || hor>=16 && (hor<=19 && min<=30)))
                        anulacion();
                    else if (D[x%7]=="Viernes" && (digito==9 || digito==0)&& (hor>=7 && (hor<=9 && min<=30) || hor>=16 && (hor<=19 && min<=30)))
                        anulacion();
                    else
                        confirmacion();
                
        }
            
        }
        else
            JOptionPane.showMessageDialog(null,"Ingrese una hora valida");  
    }

}
