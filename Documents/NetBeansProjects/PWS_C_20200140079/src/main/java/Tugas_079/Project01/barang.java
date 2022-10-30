/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_079.Project01;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author acer
 */

@Controller
public class barang {
    
    @RequestMapping ("/lihat")
    public String jualbeli(HttpServletRequest data, Model Barang){
    
        
        String barang = data.getParameter("nama ");
        String Harga = data.getParameter("harga ");
        String Jumlah = data.getParameter("jumlah ");
        hitung lokai = new hitung();
        double v015 = lokai.total(Harga, Jumlah);
        int v016 = (int) lokai.hitungdiskon();
        Barang.addAttribute("barang", barang);
        Barang.addAttribute("harga", Harga);
        Barang.addAttribute("Jumlah", Jumlah);
        Barang.addAttribute("diskon",lokai.diskon());
        Barang.addAttribute("totalharga",v016);
        
        return "viewBarang";
    }
    
}
