package org.example.dayfour.dpdc;

public class TowerOfHanoi {

    public static void alter(int disks,String start,String end,String mid){
        if(disks==0)
            return;
        else{
            alter(disks-1,start,mid,end);
            System.out.println("Disk is "+disks+" start is "+start+" end is "+end);
            alter(disks-1,mid,end,start);
        }
    }

    public static void main(String[] args) {
        alter(3,"SpringBoot","Hibernate","Oracle");
    }
}
