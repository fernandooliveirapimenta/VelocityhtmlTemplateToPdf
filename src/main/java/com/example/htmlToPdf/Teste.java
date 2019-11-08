package com.example.htmlToPdf;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Teste {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://sensoriamento-frontend.hml-cld.brasilseg.com.br/static/media/sad-icon.4be913cb.svg");
        System.out.println(url.getContent());
    }
}
