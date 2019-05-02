package service;

import java.lang.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ComparerService {

    final static Log log = LogFactory.getLog(ComparerService.class);


    public String compareWords(String firstWord, String secondWord) {
        //get length of 2nd Parameter

        String test;
        int secondWordLength = secondWord.length();
        int positionFirstWord = secondWordLength + 1;
        StringBuilder result = new StringBuilder();

        log.info("Postion im ersten Wort: "+firstWord.charAt(positionFirstWord));

        log.info("Länge des firstWord: " + firstWord.length());
        log.debug("Debug - Länge des firstWord: " + firstWord.length());

        for (int i = 0; i < secondWordLength; i++) {
            result.append(firstWord.charAt(positionFirstWord)).toString();
            positionFirstWord++;
        }

        log.info ("result: "+result);

        //z. B. essa
        return result.toString();
    }
}
