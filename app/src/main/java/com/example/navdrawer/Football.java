package com.example.navdrawer;

public class Football {
        public Football(String name, String img, String desc) {
            this.name = name;
            this.img = img;
            this.desc = desc;
        }
        String name;
        String img;
        String desc;

        public String getDesc() { return desc; }
        public String getName() {
            return name;
        }

        public String getImg() {
            return img;
        }


    }