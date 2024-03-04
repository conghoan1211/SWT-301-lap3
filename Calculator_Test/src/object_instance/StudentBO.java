/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object_instance;

/**
 *
 * @author admin
 */
public class StudentBO {

    private static StudentBO ins;

    public static StudentBO getInstance() {
        if (ins == null) {
            ins = new StudentBO();
        }
        return ins;
    }

}
