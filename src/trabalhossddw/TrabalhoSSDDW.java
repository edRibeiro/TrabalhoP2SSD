/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhossddw;

import java.util.List;
import javax.swing.JOptionPane;
import model.Cliente;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author AMD-FX
 */
public class TrabalhoSSDDW {

    static List<Cliente> lista;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //dwdao.DwDao.carregarCliente();
        //dwdao.DwDao.carregarFilmes();
        //dwdao.DwDao.carregarLOJA();
        // TODO code application logic here
        //listar();
//        Random r = new Random();
        String[] escolaridade = {
            "Fundamental - Incompleto",
            "Fundamental - Completo",
            "Médio - Incompleto",
            "Médio - Completo",
            "Superior - Incompleto",
            "Superior - Completo",
            "Pós-graduação - Incompleto",
            "Pós-graduação  - Completo",
            "Mestrado - Incompleto",
            "Mestrado - Completo",
            "Doutorado - Incompleto",
            "Doutorado - Completo"};
       // for (Cliente c : lista) {
//            Double renda = 1.0f+(r.nextDouble()*20)*10000;
//            c.setRenda(BigDecimal.valueOf(renda));
//            //int i = r.nextInt(escolaridade.length);
//            //c.setEscolaridade(escolaridade[i]);
//            System.out.println(c.getClienteId());
//            upadate(c);
        //}
        //JOptionPane.showMessageDialog(null, "Clientes alterados na base de Dados!");
    }

    private static void listar() {
        try {
            Session s = HibernateUtil.getSessionFactory().getCurrentSession();

            s.beginTransaction();
            lista = s.createQuery("from Cliente c order by  c.primeiroNome").list();

            //s.update();
            s.getTransaction().commit();
            //JOptionPane.showMessageDialog(null, "Cliente foi alterado na base de Dados!");
        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "Cliente não pode ser alterado na base de Dados!\n Error:" + e.toString());
        }
    }

    private static void upadate(Cliente c) {
        try {
            Session s = HibernateUtil.getSessionFactory().getCurrentSession();

            s.beginTransaction();
            //lista = s.createQuery("from Cliente").list();

            s.update(c);
            s.getTransaction().commit();
            //JOptionPane.showMessageDialog(null, "Cliente foi alterado na base de Dados!");
        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "Cliente não pode ser alterado na base de Dados!\n Error:" + e.toString());
        }
    }
}
