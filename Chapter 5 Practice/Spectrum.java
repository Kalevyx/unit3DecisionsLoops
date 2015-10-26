import java.util.Scanner;

public class Spectrum
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a wavelength value: ");
        double value = s.nextDouble();
        
        if(value<1e-11){
            System.out.println("Type: Gamma Rays\nFrequency: >3e19");}
        else if(value<1e-8){
            System.out.println("Type: X-Rays\nFrequency: 3e16-3e19 Hz");}
        else if(value<4e-7){
            System.out.println("Type: Ultraviolet\nFrequency: 7.5e14-3e16 Hz");}
        else if(value<7e-7){
            System.out.println("Type: Visible Light\nFrequency: 4e14-7.5e14 Hz");}
        else if(value<1e-3){
            System.out.println("Type: Infrared\nFrequency: 3e11-4e14 Hz");}
        else if(value<1e-1){
            System.out.println("Type: Microwaves\nFrequency: 3e9-3e11 Hz");}
        else{
            System.out.println("Type: Radio Waves\nFrequency: <3e9 Hz");}
        }
    }