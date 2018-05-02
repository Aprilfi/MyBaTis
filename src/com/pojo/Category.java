package com.pojo;
 
public class Category {
        /*
         * 商品id
         */
        private int gid;

        /*
         * 商品名称
         */
        private String gname;

        /*
         * 商品价格
         */
        private float gpraice;

        /*
         * 商品规格
         */
        private String gsize;

        /*
         * 商品类型
         */
        private String gkind;

        /**
         * 无参构造器
         */
        public Category() {
        }

        /**
         * 带参构造器
         * @param gid id
         * @param gname 名称
         * @param gpraice 价格
         * @param gsize 规格
         * @param gkind 类型
         */
        public Category(int gid, String gname, float gpraice, String gsize, String gkind) {
            this.gid = gid;
            this.gname = gname;
            this.gpraice = gpraice;
            this.gsize = gsize;
            this.gkind = gkind;
        }

    public Category(String gname, float gpraice, String gsize, String gkind) {
        this.gname = gname;
        this.gpraice = gpraice;
        this.gsize = gsize;
        this.gkind = gkind;
    }

    /**
         * 自动生成set get方法
         */
        public int getGid() {
            return gid;
        }

        public void setGid(int gid) {
            this.gid = gid;
        }

        public String getGname() {
            return gname;
        }

        public void setGname(String gname) {
            this.gname = gname;
        }

        public float getGpraice() {
            return gpraice;
        }

        public void setGpraice(float gpraice) {
            this.gpraice = gpraice;
        }

        public String getGsize() {
            return gsize;
        }

        public void setGsize(String gsize) {
            this.gsize = gsize;
        }

        public String getGkind() {
            return gkind;
        }

        public void setGkind(String gkind) {
            this.gkind = gkind;
        }

        @Override
        public String toString() {
            return "Goods{" +
                    "gid=" + gid +
                    ", gname='" + gname + '\'' +
                    ", gpraice=" + gpraice +
                    ", gsize='" + gsize + '\'' +
                    ", gkind='" + gkind + '\'' +
                    '}';
        }
}


