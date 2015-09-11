package org;

import org.minustserv.ArrayOfSubjectData;

import org.tempuri.Subjects;

// write your code here

public class Main {

    public static void main(String[] args) {

        Subjects subj = new Subjects();

        ArrayOfSubjectData ss = subj.getSubjectData(191430607);

        //ArrayOfSubjectData aosd = ss.getSubjectData(191430607);

         ArrayOfSubjectData aosd = subj.getSubjectDataName("сергей");

    }
}
