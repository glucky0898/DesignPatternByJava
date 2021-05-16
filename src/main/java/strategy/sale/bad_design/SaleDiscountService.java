package strategy.sale.bad_design;
/**
* 共有四种策略
 * 1. 直接减
 * 2. 原价打折
 * 3. 满规定的额度才减
 * 4. n元购
* */
public class SaleDiscountService {
    public Double discount(Integer type,Double originPrice,Double discountRate, Double directReduction,Double purchasedByN,Double fullLevel) throws Exception{
        if(type == 1){
            Double resPrice = originPrice-directReduction;
            return resPrice>0?resPrice:0;
        }else if(type == 2){
            if(discountRate>=0){
                return originPrice*discountRate;
            }else{
                throw new Exception();
            }
        }else if(type == 3){
            return originPrice>fullLevel?originPrice:originPrice-fullLevel;
        }else if(type == 4){
            return purchasedByN;
        }
        throw new Exception("类型不存在");
    }
}
