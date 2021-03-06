package com.hwc.loan.sdk.admin.request;

import com.hwc.base.sdk.core.RequestBase;
import com.hwc.loan.sdk.admin.response.MenuGetOneResponse;

public class MenuGetOneRequest extends RequestBase<MenuGetOneResponse> {

    public static final String METHOD = "/api/admin/sys/menu/getOne";

    public MenuGetOneRequest() {
        super(METHOD);
    }

    /**
     * 主键id
     */
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
