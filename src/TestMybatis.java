import java.io.IOException;
import java.util.List;

import com.dao.GoodsDao;
import com.dao.impl.GoodsDaoImpl;
import com.pojo.Category;

public class TestMybatis {

    public static void main(String ... args) throws IOException {
        GoodsDao goodsDao = new GoodsDaoImpl();

        //添加数据
        Category category = new Category(1222,"君子",99,"人","衣物");
        goodsDao.addGoods(category);
        System.out.println("添加完成...\n");

        //根据id删除数据
        goodsDao.delete(1222);
        System.out.println("删除完成...\n");

        //根据id修改一行数据
        Category category2 = new Category(1011,"就是",80,"件","食物");
        goodsDao.update(category2);
        System.out.println("修改完成...\n");

        //根据商品id查找数据
        System.out.println(goodsDao.findById(1011));

        //查询全部表数据
        System.out.println("全部数据...\n");
        List<Category> categoryList = goodsDao.findAll();

        for(Category c : categoryList){
            System.out.println(c.toString());
        }

        //模糊查询
        System.out.println("模糊查询数据...");
        List<Category> categoryList1 = goodsDao.findByKind("%食品%");

        for(Category c : categoryList1){
            System.out.println(c.toString());
        }

    }

}
