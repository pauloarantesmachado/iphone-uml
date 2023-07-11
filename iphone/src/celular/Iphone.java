package celular;

import aplicativos.Internet;
import aplicativos.Ipod;
import aplicativos.Telefone;

public class Iphone implements Ipod, Internet, Telefone {
 private boolean acessoIpod;
 private boolean acessoInternet;
 private boolean acessoTelefone;
 private boolean tocarMusica;

@Override
public void acessarIpod() {
   acessoIpod = true;
   System.out.println("Acesso Ipod");
  
}

@Override
public void acessarInternet() {
  acessoInternet = true;
   System.out.println("Acesso Internet");
}

@Override
public void acessarTelefone() {
  acessoTelefone = true;
   System.out.println("Acesso Telefone");
}

@Override
public void tocarMusica() {
  if(acessoIpod){
    tocarMusica = true;
    System.out.println("Tocando Música");
  }
  System.out.println("Acesse o Ipod ");
  
}

@Override
public void pararMusica() {
  if(tocarMusica){
    tocarMusica = false;
    System.out.println("Parando a Musica");
  }
  System.out.println("nenhuma música tocando");
  
  
}

@Override
public void sairIpod() {
  if(acessoIpod){
    acessoIpod = false;
    System.out.println("Saindo Ipod");
  }
  System.out.println("Acesse o Ipod");
  
  
}
@Override
public void sairInternet() {
  if(acessoInternet){
    acessoInternet = false;
    System.out.println("Saindo Internet");
  }
  System.out.println("Acesse o Internet");
  
}

@Override
public void sairTelefone() {
  if(acessoTelefone){
    acessoTelefone = false;
    System.out.println("Saindo Telefone");
  }
  System.out.println("Acesse o Telefone");
  
}
  
}
