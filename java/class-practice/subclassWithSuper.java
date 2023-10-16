class Parent {
    int x;
    int y;
    Parent(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void display() {
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}

class Child extends Parent {
    int z;
    Child(int x, int y, int z) {
        super(x, y); 
        this.z = z;
    }
    @Override public void display() {
        System.out.println("x: " + x+z);
        System.out.println("y: " + y+z);
    }
}

public class subclassWithSuper {
    public static void main(String[] args) {
        Parent parent = new Parent(4,19);
        parent.display();
        System.out.println();
        Child child = new Child(4,19,0);
        child.display();
        System.out.println(child);
    }
}


// class Parent {
//     int x;
//     int y;
//     Parent(int x, int y) {
//         this.x = x;
//         this.y = y;
//     }
//     public void display() {
//         System.out.println("x: " + x);
//         System.out.println("y: " + y);
//     }
// }

// class Child extends Parent {
//     int z;
//     Child(int x, int y, int z) {
//         super(x, y); 
//         this.z = z;
//     }
//     public void display() {
//         super.display(); 
//         System.out.println("z: " + z);
//     }
// }

// public class subclassWithSuper {
//     public static void main(String[] args) {
//         Child child = new Child(10, 20, 30);
//         child.display();
//         System.out.println(child);
//     }
// }