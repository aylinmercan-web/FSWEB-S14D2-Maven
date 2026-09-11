package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Wall northWall = new Wall("NORTH");
        Wall southWall = new Wall("SOUTH");
        Wall eastWall = new Wall("EAST");
        Wall westWall = new Wall("WEST");
        Ceiling ceiling = new Ceiling(3, PaintColor.WHITE);
        Bed bed = new Bed("Çift Kişilik", 4, 1, 2, 2);
        Lamp lamp = new Lamp(LampType.NORMAL, true, 80);
        Wardrobe wardrobe = new Wardrobe(2, 4, 40);
        Carpet carpet = new Carpet(3, 5, PaintColor.RED);

        Bedroom bedroom = new Bedroom("Ana Yatak Odası", northWall, southWall, eastWall, westWall,
                ceiling, bed, lamp, wardrobe, carpet);

        System.out.println("Bedroom: " + bedroom.getName());
        System.out.println("Walls: " + bedroom.getWall1().getDirection() + ", " + bedroom.getWall2().getDirection()
                + ", " + bedroom.getWall3().getDirection() + ", " + bedroom.getWall4().getDirection());

        bedroom.getWall1().create();
        bedroom.getCeiling().create();
        bedroom.getBed().make();
        bedroom.getLamp().turnOn();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();

        System.out.println("Lamp style: " + bedroom.getLamp().getStyle());
        System.out.println("Lamp battery: " + bedroom.getLamp().isBattery());
        System.out.println("Lamp global rating: " + bedroom.getLamp().getGlobRating());
        System.out.println("Ceiling color: " + bedroom.getCeiling().getColor());
        System.out.println("Carpet color: " + bedroom.getCarpet().getColor());
    }
}
