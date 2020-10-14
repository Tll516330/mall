package cn.tll.mall01.service;

import cn.tll.mall01.mbg.model.PmsBrand;

import java.util.List;

/**
 * @author tll
 * @create 2020/10/14 16:12
 */
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
