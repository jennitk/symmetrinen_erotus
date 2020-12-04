/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trai_20_t24_jenni;

// TRAI_20_t23_24.java SJ

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class TRAI_20_t24_jenni {

    public static void main(String[] args) {

        int N = 7;
        if (args.length > 0)
            N = Integer.parseInt(args[0]);

        Set<Set<Integer>> SS = new HashSet<>();

        Random r = new Random(N + 1);
        System.out.println("SyÃ¶tejoukot:");
        for (int i = 0; i < N; i++) {
            Set<Integer> S = new HashSet<>();
            for (int j = 0; j < N; j++) {
                S.add(r.nextInt(N * 2));
            }
            SS.add(S);
            System.out.println("S" + i + ": " + S);
        }

        Set<Integer> tulos = yhdiste(SS);
        //System.out.println("\nKaikkien yhdiste: " + tulos);
        //System.out.println();

        tulos = vainYhdessa(SS);
        System.out.println("Vain yhdessÃ¤: " + tulos);
        System.out.println();

    } // main()


    /**
     * 23. Kirjoita algoritmi joka saa parametrinaan joukkojen joukon (Set<Set<E>>) ja joka pa-
     * lauttaa joukkona (Set<E>) kaikki ne alkiot jossakin (tai joissakin) syÃ¶tejoukoissa. Siis
     * yhdisteen. Vihje: iteraattori ja joukko-operaatiot. MikÃ¤ on algoritmisi aikavaativuus?
     *
     * @param SS  joukkojen joukko
     * @param <E> joukkojen alkioiden tyyppi
     * @return kaikki jossain joukossa esiintyneet alkiot
     */
    public static <E> Set<E> yhdiste(Set<Set<E>> SS) {
        Set<E> tulos = new HashSet<>();

        // TODO

        return tulos;
    }

    /**
     * 24. Kirjoita algoritmi joka saa parametrinaan joukkojen joukon (Set<Set<E>>) ja joka pa-
     * lauttaa joukkona (Set<E>) kaikki ne alkiot jotka ovat tasan yhdessÃ¤ syÃ¶tejoukoista. Ne
     * alkiot jotka ovat useammassa kuin yhdessÃ¤ syÃ¶tejoukoista eivÃ¤t tule tulokseen. Ã„lÃ¤ muuta
     * syÃ¶tejoukkoja. Vihje: iteraattori ja joukko-operaatiot. MikÃ¤ on algoritmisi aikavaativuus?
     *
     * @param SS  joukkojen joukko
     * @param <E> joukkojen alkioiden tyyppi
     * @return kaikki ne alkiot jotka esiintyvÃ¤t vain yhdessÃ¤ joukossa
     */
    public static <E> Set<E> vainYhdessa(Set<Set<E>> SS) {
        //palautettava tulosjoukko
        Set<E> tulos = new HashSet<>();
        //apujoukko, johon talletetaan leikkaukset
        Set<E> apuLeikkaus = new HashSet<>();
        
        //käydään for loopissa läpi joukon joukot
        for (Set<E> x: SS){
            //loopista saadaan joukko, jolle luodaan iteraattori
            Iterator<E> i = x.iterator();
            //kun joukossa jäljellä alkioita
            while (i.hasNext()){
                //alustetaan muuttujaan y seuraava alkio
                E y = i.next();
                
                //jos tulosjoukossa ei y
                if(!tulos.contains(y)){
                    //lisätään y tulosjoukkoon
                    tulos.add(y);
                }
                //jos y on jo tulosjoukossa
                else{
                    //lisätään y leikkauksien joukkoon
                    apuLeikkaus.add(y);
                    
                }
            }    
        }
        
        //poistetaan tulosjoukosta kaikki apuLeikkaus joukon alkiot
        tulos.removeAll(apuLeikkaus);
        
        //palautetaan tulos
        return tulos;
    } // vainYhdessa()


} // class