package pl.sdazajec;

public enum StudentLevel {

    WZOROWY("Uczeń jest wzorowy"),
    BARDZO_DOBRY ("Uczeń jest bardzo dobry"),
    DOBRY ("Uczeń jest dobry"),
    NIEDOSTATECZNY ("Uczeń jest zagrożony");

    private final String info;


    StudentLevel(String info) {
        this.info = info;
    }

        public String getInfo() {
            return info;
        }

    }



