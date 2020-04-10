package is2trabajopatrones;

import EstrategiaClientes.Cliente;
import EstrategiaClientes.ClienteSocio;
import Fachada.Multinacional;
import TiendaProducto.Producto;
import TiendaProducto.ProductoImpl;
import TiendaProducto.Tienda;
import is2trabajopatrones.GUI.ClienteFranquiciado_GUI;
import is2trabajopatrones.GUI.ClienteNormal_GUI;
import is2trabajopatrones.GUI.ClienteSocio_GUI;
import is2trabajopatrones.GUI.Compra_GUI;
import is2trabajopatrones.GUI.CreaClienteNormal_GUI;
import is2trabajopatrones.GUI.CreaClienteSocio_GUI;
import is2trabajopatrones.GUI.CreaFranquicia_GUI;
import is2trabajopatrones.GUI.RegistroCuenta_GUI;
import is2trabajopatrones.GUI.InicioSesion_GUI;
import is2trabajopatrones.GUI.PantallaInicio_GUI;
import is2trabajopatrones.GUI.InicioSesionAdministrador_GUI;
import is2trabajopatrones.GUI.SesionAdministrador_GUI;
import java.util.ArrayList;
import java.util.List;

public class IS2TrabajoPatrones {
    
    public static PantallaInicio_GUI pantIni = new PantallaInicio_GUI();
    public static InicioSesion_GUI iniSes = new InicioSesion_GUI();
    public static RegistroCuenta_GUI regCuen = new RegistroCuenta_GUI();
    public static CreaFranquicia_GUI creaFranq = new CreaFranquicia_GUI();
    public static InicioSesionAdministrador_GUI iniSesAdmin = new InicioSesionAdministrador_GUI();
    public static CreaClienteNormal_GUI creaClNorm = new CreaClienteNormal_GUI();
    public static CreaClienteSocio_GUI creaCliSos = new CreaClienteSocio_GUI();
    public static ClienteNormal_GUI clNorm = new ClienteNormal_GUI();
    public static ClienteFranquiciado_GUI clFranq = new ClienteFranquiciado_GUI();
    public static ClienteSocio_GUI clSoc = new ClienteSocio_GUI();
    public static Compra_GUI compra = new Compra_GUI();
    public static SesionAdministrador_GUI sesAdm= new SesionAdministrador_GUI();
    public static Multinacional trabajo = new Multinacional("Trabajo", "000");
    public static Cliente sesionActual;
    

    public static void ProductosElectronicos(List<Producto> listaEjemploProductos){
        listaEjemploProductos.add(new ProductoImpl("TarjetaGraficaGTX1050", 100));
        listaEjemploProductos.add(new ProductoImpl("ProcesadorI7", 90));
        listaEjemploProductos.add(new ProductoImpl("ProcesadorI5", 70));
        listaEjemploProductos.add(new ProductoImpl("PlacaBase", 60));
        listaEjemploProductos.add(new ProductoImpl("MemoriaRam", 20));
        listaEjemploProductos.add(new ProductoImpl("OrdenadorAcer", 800));
        listaEjemploProductos.add(new ProductoImpl("RatonLogitec", 25));
        listaEjemploProductos.add(new ProductoImpl("TecladoGaming", 25));
        listaEjemploProductos.add(new ProductoImpl("CascosAstroA50", 125));
        listaEjemploProductos.add(new ProductoImpl("Pantalla4KSony", 130));
    }
    
    public static void main(String[] args) {
        List<Producto> listaEjemploProductos = new ArrayList<>();
        listaEjemploProductos.add(new ProductoImpl("TarjetaGraficaGTX1050", 100));
        listaEjemploProductos.add(new ProductoImpl("ProcesadorI7", 90));
        listaEjemploProductos.add(new ProductoImpl("ProcesadorI5", 70));
        listaEjemploProductos.add(new ProductoImpl("PlacaBase", 60));
        listaEjemploProductos.add(new ProductoImpl("MemoriaRam", 20));
        listaEjemploProductos.add(new ProductoImpl("OrdenadorAcer", 800));
        listaEjemploProductos.add(new ProductoImpl("RatonLogitec", 25));
        listaEjemploProductos.add(new ProductoImpl("TecladoGaming", 25));
        listaEjemploProductos.add(new ProductoImpl("CascosAstroA50", 125));
        listaEjemploProductos.add(new ProductoImpl("Pantalla4KSony", 130));
        
       /* Multinacional trabajo = new Multinacional("Trabajo", "1111");
        
        trabajo.creaClienteNormal("111", "Pedro", 19, "000", 1200);
        trabajo.creaClienteFranquiciado("1234", "Adrian", 20, "1111", 2000, "9999", "MediaMarket", "Sevilla");
        trabajo.creaClienteFranquiciado("1235", "Adria", 20, "1111", 2000, "9998", "MediaMarket", "Sevilla");
        Cliente c1 = trabajo.BuscarCliente("111");
        Cliente c2 = trabajo.BuscarCliente("1234");
        Cliente c3 = trabajo.BuscarCliente("1235");
        Tienda t = trabajo.BuscarTienda("9999");
        Tienda t2 = trabajo.BuscarTienda("9998");
        t.getLdp().addAll(listaEjemploProductos);
        t2.getLdp().addAll(listaEjemploProductos);
        Producto p = t.getLdp().get(0);
        
        System.out.println("Cliente que compra: "+c1.getCuentabancaria().getBalance());
        System.out.println("Cliente que vende: "+c2.getCuentabancaria().getBalance());
        System.out.println("---------");
        
        c1.Comprar(p, t);
        System.out.println("Cliente que compra: "+c1.getCuentabancaria().getBalance());
        System.out.println("Cliente que vende: "+c2.getCuentabancaria().getBalance());
        System.out.println("---------");
        
        trabajo.asciendeASocio(c1);
        
        c1.Comprar(p, t);
        System.out.println("Cliente que compra: "+c1.getCuentabancaria().getBalance());
        System.out.println("Cliente que vende: "+c2.getCuentabancaria().getBalance());
        System.out.println("Dinero multinacional: "+trabajo.getSaldoMultinacional());
        System.out.println("---------");
        
        c2.Comprar(p, t2);
        System.out.println("Cliente que compra: "+c2.getCuentabancaria().getBalance());
        System.out.println("Cliente que vende: "+c3.getCuentabancaria().getBalance());
        System.out.println("Dinero multinacional: "+trabajo.getSaldoMultinacional());
        System.out.println("---------");
*/
    }
    
}
